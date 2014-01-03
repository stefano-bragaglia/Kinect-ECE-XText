package tracker;

import static constants.TrackerHumanValues.*;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.awt.*;
import java.awt.image.*;

import org.openni.*;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import classifier.Classifier;

import com.primesense.nite.*;
import com.primesense.nite.Point3D;

public class UserViewer extends Component implements
		UserTracker.NewFrameListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	float mHistogram[];
	int[] mDepthPixels;
	UserTracker mTracker;
	UserTrackerFrameRef mLastFrame;
	BufferedImage mBufferedImage;
	int[] mColors;

	public UserViewer() {

	}

	public void setTracker(UserTracker tracker) {
		mTracker = tracker;
	}

	public void init() {
		mTracker.addNewFrameListener(this);
		mColors = new int[] { 0xFFFF0000, 0xFF00FF00, 0xFF0000FF, 0xFFFFFF00,
				0xFFFF00FF, 0xFF00FFFF };
	}

	public void remove() {
		mTracker.removeNewFrameListener(this);
	}

	public void setClassifier(Classifier classifier) {
		this.classifier = classifier;
	}

	public synchronized void paint(Graphics g) {
		if (mLastFrame == null) {
			return;
		}

		int framePosX = 0;
		int framePosY = 0;

		VideoFrameRef depthFrame = mLastFrame.getDepthFrame();
		if (depthFrame != null) {
			int width = depthFrame.getWidth();
			int height = depthFrame.getHeight();

			// make sure we have enough room
			if (mBufferedImage == null || mBufferedImage.getWidth() != width
					|| mBufferedImage.getHeight() != height) {
				mBufferedImage = new BufferedImage(width, height,
						BufferedImage.TYPE_INT_RGB);
			}

			mBufferedImage.setRGB(0, 0, width, height, mDepthPixels, 0, width);

			framePosX = (getWidth() - width) / 2;
			framePosY = (getHeight() - height) / 2;

			g.drawImage(mBufferedImage, framePosX, framePosY, null);
		}

		for (UserData user : mLastFrame.getUsers()) {
			if (user.getSkeleton().getState() == SkeletonState.TRACKED) {
				drawSkeleton(g, framePosX, framePosY, user);

				// spatial joint's coordinates
//				giveMeSpatialCoordinateJoints(user);
				
				try {
					createSkeletonInstances(user);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			}

			if (user.getSkeleton().getState() == SkeletonState.TRACKED
					&& startedTest) {
				try {
					createSkeletonInstances(user);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				// System.out.println("send");
			}
		}
	}

	private void drawSkeleton(Graphics g, int framePosX, int framePosY,
			UserData user) {
		drawLimb(g, framePosX, framePosY, user, JointType.HEAD, JointType.NECK);

		drawLimb(g, framePosX, framePosY, user, JointType.LEFT_SHOULDER,
				JointType.LEFT_ELBOW);
		drawLimb(g, framePosX, framePosY, user, JointType.LEFT_ELBOW,
				JointType.LEFT_HAND);

		drawLimb(g, framePosX, framePosY, user, JointType.RIGHT_SHOULDER,
				JointType.RIGHT_ELBOW);
		drawLimb(g, framePosX, framePosY, user, JointType.RIGHT_ELBOW,
				JointType.RIGHT_HAND);

		drawLimb(g, framePosX, framePosY, user, JointType.LEFT_SHOULDER,
				JointType.RIGHT_SHOULDER);

		drawLimb(g, framePosX, framePosY, user, JointType.LEFT_SHOULDER,
				JointType.TORSO);
		drawLimb(g, framePosX, framePosY, user, JointType.RIGHT_SHOULDER,
				JointType.TORSO);

		drawLimb(g, framePosX, framePosY, user, JointType.LEFT_HIP,
				JointType.TORSO);
		drawLimb(g, framePosX, framePosY, user, JointType.RIGHT_HIP,
				JointType.TORSO);
		drawLimb(g, framePosX, framePosY, user, JointType.LEFT_HIP,
				JointType.RIGHT_HIP);

		drawLimb(g, framePosX, framePosY, user, JointType.LEFT_HIP,
				JointType.LEFT_KNEE);
		drawLimb(g, framePosX, framePosY, user, JointType.LEFT_KNEE,
				JointType.LEFT_FOOT);

		drawLimb(g, framePosX, framePosY, user, JointType.RIGHT_HIP,
				JointType.RIGHT_KNEE);
		drawLimb(g, framePosX, framePosY, user, JointType.RIGHT_KNEE,
				JointType.RIGHT_FOOT);
	}

	private void drawLimb(Graphics g, int x, int y, UserData user,
			JointType from, JointType to) {
		com.primesense.nite.SkeletonJoint fromJoint = user.getSkeleton()
				.getJoint(from);
		com.primesense.nite.SkeletonJoint toJoint = user.getSkeleton()
				.getJoint(to);

		if (fromJoint.getPositionConfidence() == 0.0
				|| toJoint.getPositionConfidence() == 0.0) {
			return;
		}

		com.primesense.nite.Point2D<Float> fromPos = mTracker
				.convertJointCoordinatesToDepth(fromJoint.getPosition());
		com.primesense.nite.Point2D<Float> toPos = mTracker
				.convertJointCoordinatesToDepth(toJoint.getPosition());

		// draw it in another color than the use color
		g.setColor(new Color(mColors[(user.getId() + 1) % mColors.length]));
		g.drawLine(x + fromPos.getX().intValue(),
				y + fromPos.getY().intValue(), x + toPos.getX().intValue(), y
						+ toPos.getY().intValue());
	}

//	private void giveMeSpatialCoordinateJoints(UserData user) {
//		JointType[] jointTypes = JointType.values(); // all joints
//		for (JointType j : jointTypes) {
//			com.primesense.nite.SkeletonJoint joint = user.getSkeleton()
//					.getJoint(j);
//			System.out.println("joint = " + joint.getJointType().name()
//					+ "\nX = " + joint.getPosition().getX() + "\tY = "
//					+ joint.getPosition().getY() + "\tZ = "
//					+ joint.getPosition().getZ());
//		}
//	}

	public synchronized void onNewFrame(UserTracker tracker) {
		if (mLastFrame != null) {
			mLastFrame.release();
			mLastFrame = null;
		}

		mLastFrame = mTracker.readFrame();

		// check if any new user detected
		for (UserData user : mLastFrame.getUsers()) {
			if (user.isNew()) {
				// start skeleton tracking
				mTracker.startSkeletonTracking(user.getId());
			}
		}

		VideoFrameRef depthFrame = mLastFrame.getDepthFrame();

		if (depthFrame != null) {
			ByteBuffer frameData = depthFrame.getData().order(
					ByteOrder.LITTLE_ENDIAN);
			ByteBuffer usersFrame = mLastFrame.getUserMap().getPixels()
					.order(ByteOrder.LITTLE_ENDIAN);

			// make sure we have enough room
			if (mDepthPixels == null
					|| mDepthPixels.length < depthFrame.getWidth()
							* depthFrame.getHeight()) {
				mDepthPixels = new int[depthFrame.getWidth()
						* depthFrame.getHeight()];
			}

			calcHist(frameData);
			frameData.rewind();

			int pos = 0;
			while (frameData.remaining() > 0) {
				short depth = frameData.getShort();
				short userId = usersFrame.getShort();
				short pixel = (short) mHistogram[depth];
				int color = 0xFFFFFFFF;
				if (userId > 0) {
					color = mColors[userId % mColors.length];
				}

				mDepthPixels[pos] = color
						& (0xFF000000 | (pixel << 16) | (pixel << 8) | pixel);
				pos++;
			}
		}

		repaint();
	}

	private void calcHist(ByteBuffer depthBuffer) {
		// make sure we have enough room
		if (mHistogram == null) {
			mHistogram = new float[10000];
		}

		// reset
		for (int i = 0; i < mHistogram.length; ++i)
			mHistogram[i] = 0;

		int points = 0;
		while (depthBuffer.remaining() > 0) {
			int depth = depthBuffer.getShort() & 0xFFFF;
			if (depth != 0) {
				mHistogram[depth]++;
				points++;
			}
		}

		for (int i = 1; i < mHistogram.length; i++) {
			mHistogram[i] += mHistogram[i - 1];
		}

		if (points > 0) {
			for (int i = 1; i < mHistogram.length; i++) {
				mHistogram[i] = (int) (256 * (1.0f - (mHistogram[i] / (float) points)));
			}
		}
	}

	// ----------------------------------------------------------------------------------------
	// ----------------------------------------------------------------------------------------

	private boolean startedTest = false;
	int width, height;
	private float x_torso = 0;
	private float y_torso = 0;
	private float z_torso = 0;
	private Classifier classifier;

	private double TORSO_CONF = 0.0;
	private ArrayList<Instance> skeletonIstances;
	private List<Attribute> head_att, body_upright_att, body_stan_slanting_att,
			body_sit_slanting_att, left_arm_att, right_arm_att, left_leg_att,
			right_leg_att;

	public void setTorsoConfidence(double d) {
		TORSO_CONF = d;
	}

	private void createSkeletonInstances(UserData user) throws Exception {

		skeletonIstances = new ArrayList<Instance>();

		Skeleton skeleton = user.getSkeleton();
		double torso_conf = skeleton.getJoint(JointType.TORSO)
				.getPositionConfidence();

		if (torso_conf >= TORSO_CONF) {
			// se TORSO rilevato correttamente : IMPORTANTE per la correttezza
			// delle distanze dei vari limb

			Point3D<Float> torso_pos = skeleton.getJoint(JointType.TORSO)
					.getPosition();

			// save origin's coordinates
			x_torso = (Float) torso_pos.getX();
			y_torso = (Float) torso_pos.getY();
			z_torso = (Float) torso_pos.getZ();

			createLimbInstance(skeleton, TRACKER_HEAD_LIMB, HEAD_ABOUT,
					head_att);

			createLimbInstance(skeleton, TRACKER_BODY_UPRIGHT_LIMB,
					BODY_UPRIGHT_ABOUT, body_upright_att);
			createLimbInstance(skeleton, TRACKER_BODY_STAN_SLANTING_LIMB,
					BODY_STAN_SLANTING_ABOUT, body_stan_slanting_att);
			createLimbInstance(skeleton, TRACKER_BODY_SIT_SLANTING_LIMB,
					BODY_SIT_SLANTING_ABOUT, body_sit_slanting_att);

			createLimbInstance(skeleton, TRACKER_LEFT_ARM_LIMB, LEFT_ARM_ABOUT,
					left_arm_att);
			createLimbInstance(skeleton, TRACKER_RIGHT_ARM_LIMB,
					RIGHT_ARM_ABOUT, right_arm_att);
			createLimbInstance(skeleton, TRACKER_LEFT_LEG_LIMB, LEFT_LEG_ABOUT,
					left_leg_att);
			createLimbInstance(skeleton, TRACKER_RIGHT_LEG_LIMB,
					RIGHT_LEG_ABOUT, right_leg_att);

			sendInstance();
		}
	}

	private void createLimbInstance(Skeleton skeleton, int limb,
			int[] limb_about, List<Attribute> limb_att) {
		int att = 1;
		Instance ist = new DenseInstance(
				(SPATIAL_COORD * limb_about.length) + 1);

		limb_att = classifier.getLimbFeatureDataSet(limb);

		for (int i = 0; i < limb_about.length; i++) {
			if (limb_about[i] != TORSO) {
				/*
				 * il punto di riferimento per tutti i joint (meno che per il
				 * TORSO), ossia il centro degli assi che descrivono lo spazio
				 * in cui si possono muovere è il TORSO stesso.
				 */
				Point3D<Float> joint = skeleton.getJoint(
						SKELETON_JOINT(limb_about[i])).getPosition();

				ist.setValue((Attribute) limb_att.get(att),
						(joint.getX() - x_torso));
				ist.setValue((Attribute) limb_att.get(att + 1),
						(joint.getY() - y_torso));
				ist.setValue((Attribute) limb_att.get(att + 2),
						(joint.getZ() - z_torso));

				att += 3;
			} else {
				/*
				 * il punto di riferimento per il BODY invece è il punto con
				 * coordinate (0, -Ytorso, 0), e cioè, il punto sul pavimento
				 * esattamente perpendicolare al TORSO stesso
				 */
				Point3D<Float> left_foot = skeleton.getJoint(
						JointType.LEFT_FOOT).getPosition();
				Point3D<Float> right_foot = skeleton.getJoint(
						JointType.RIGHT_FOOT).getPosition();

				// save the two probably torso's new coordinates
				float torso_footSX = y_torso - left_foot.getY();
				float torso_footDX = y_torso - right_foot.getY();

				float y_torso_rifFoot = (torso_footSX > torso_footDX) ? torso_footSX
						: torso_footDX;

				ist.setValue((Attribute) limb_att.get(att), 0);
				ist.setValue((Attribute) limb_att.get(att + 1), y_torso_rifFoot);
				ist.setValue((Attribute) limb_att.get(att + 2), 0);

				att += 3;
			}
		}

		skeletonIstances.add(ist);
	}

	private void sendInstance() throws Exception {

		classifier.testingONLINE(skeletonIstances, System.currentTimeMillis());

	}

	public void setStartedTest(boolean b) {
		startedTest = b;
	}
}
