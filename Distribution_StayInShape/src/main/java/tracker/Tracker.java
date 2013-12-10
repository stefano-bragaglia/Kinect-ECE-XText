/****************************************************************************
 *                                                                           *
 *  OpenNI 1.x Alpha                                                         *
 *  Copyright (C) 2011 PrimeSense Ltd.                                       *
 *                                                                           *
 *  This file is part of OpenNI.                                             *
 *                                                                           *
 *  OpenNI is free software: you can redistribute it and/or modify           *
 *  it under the terms of the GNU Lesser General Public License as published *
 *  by the Free Software Foundation, either version 3 of the License, or     *
 *  (at your option) any later version.                                      *
 *                                                                           *
 *  OpenNI is distributed in the hope that it will be useful,                *
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of           *
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the             *
 *  GNU Lesser General Public License for more details.                      *
 *                                                                           *
 *  You should have received a copy of the GNU Lesser General Public License *
 *  along with OpenNI. If not, see <http://www.gnu.org/licenses/>.           *
 *                                                                           *
 ****************************************************************************/
package tracker;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.color.ColorSpace;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.ComponentColorModel;
import java.awt.image.DataBuffer;
import java.awt.image.DataBufferByte;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.OpenNI.CalibrationProgressEventArgs;
import org.OpenNI.CalibrationProgressStatus;
import org.OpenNI.Context;
import org.OpenNI.DepthGenerator;
import org.OpenNI.DepthMetaData;
import org.OpenNI.GeneralException;
import org.OpenNI.IObservable;
import org.OpenNI.IObserver;
import org.OpenNI.OutArg;
import org.OpenNI.Point3D;
import org.OpenNI.PoseDetectionCapability;
import org.OpenNI.PoseDetectionEventArgs;
import org.OpenNI.SceneMetaData;
import org.OpenNI.ScriptNode;
import org.OpenNI.SkeletonCapability;
import org.OpenNI.SkeletonJoint;
import org.OpenNI.SkeletonJointPosition;
import org.OpenNI.SkeletonProfile;
import org.OpenNI.StatusException;
import org.OpenNI.UserEventArgs;
import org.OpenNI.UserGenerator;

import weka.core.Attribute;
import weka.core.DenseInstance;
import weka.core.Instance;
import classifier.Classifier;
import static constants.HumanBodyValues.*;
import static constants.TrackerHumanValues.*;

public class Tracker extends Component implements TrackerInterface {

	class CalibrationCompleteObserver implements
			IObserver<CalibrationProgressEventArgs> {
		public void update(
				IObservable<CalibrationProgressEventArgs> observable,
				CalibrationProgressEventArgs args) {
			System.out.println("Calibraion complete: " + args.getStatus());
			try {
				if (args.getStatus() == CalibrationProgressStatus.OK) {
					System.out.println("starting tracking " + args.getUser());
					skeletonCap.startTracking(args.getUser());
					joints.put(new Integer(args.getUser()),
							new HashMap<SkeletonJoint, SkeletonJointPosition>());
				} else if (args.getStatus() != CalibrationProgressStatus.MANUAL_ABORT) {
					if (skeletonCap.needPoseForCalibration()) {
						poseDetectionCap.startPoseDetection(calibPose,
								args.getUser());
					} else {
						skeletonCap.requestSkeletonCalibration(args.getUser(),
								true);
					}
				}
			} catch (StatusException e) {
				e.printStackTrace();
			}
		}
	}

	class LostUserObserver implements IObserver<UserEventArgs> {
		public void update(IObservable<UserEventArgs> observable,
				UserEventArgs args) {
			System.out.println("Lost user " + args.getId());
			joints.remove(args.getId());
		}
	}

	class NewUserObserver implements IObserver<UserEventArgs> {
		public void update(IObservable<UserEventArgs> observable,
				UserEventArgs args) {
			System.out.println("New user " + args.getId());

			try {
				users = userGen.getUsers();
			} catch (StatusException e1) {
				e1.printStackTrace();
			}

			int[][] emptyList = new int[MAX][2];
			usersList = emptyList;
			for (int i = 0; i < users.length; i++) {
				usersList[users[i]][0] = users[i];
				usersList[users[i]][1] = 0;

				if (!(usersINTOFOV.contains(new Integer(users[i])))) {
					usersINTOFOV.add(new Integer(users[i]));
				}
			}

			try {
				if (skeletonCap.needPoseForCalibration()) {
					poseDetectionCap
							.startPoseDetection(calibPose, args.getId());
				} else {
					skeletonCap.requestSkeletonCalibration(args.getId(), true);
				}
			} catch (StatusException e) {
				e.printStackTrace();
			}
		}
	}

	class PoseDetectedObserver implements IObserver<PoseDetectionEventArgs> {
		public void update(IObservable<PoseDetectionEventArgs> observable,
				PoseDetectionEventArgs args) {
			System.out.println("Pose " + args.getPose() + " detected for "
					+ args.getUser());
			try {
				poseDetectionCap.stopPoseDetection(args.getUser());
				skeletonCap.requestSkeletonCalibration(args.getUser(), true);
			} catch (StatusException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private BufferedImage bimg;
	String calibPose = null;
	Color colors[] = { Color.RED, Color.BLUE, Color.CYAN, Color.GREEN,
			Color.MAGENTA, Color.PINK, Color.YELLOW, Color.WHITE };
	private Context context;
	private DepthGenerator depthGen;
	private boolean drawBackground = true;
	private boolean drawPixels = true;
	private boolean drawSkeleton = true;
	private float histogram[];

	private byte[] imgbytes;
	HashMap<Integer, HashMap<SkeletonJoint, SkeletonJointPosition>> joints;
	private final int MAX = 12;
	// change the origin of the axeses
	// private final int NEW_ORIGIN = SkeletonJoint.TORSO.ordinal(); // torso
	// private final int NMAX_JOINT = 24;
	//
	// private final int NUM_COORD = 45;
	private PoseDetectionCapability poseDetectionCap;

	private boolean printID = true;

	private boolean printState = true;
	private final String SAMPLE_XML_FILE = "/var/lib/ni/modules.xml";
	private OutArg<ScriptNode> scriptNode;
	private SkeletonCapability skeletonCap;
	private boolean startedTest = false;
	private Classifier test;

	private UserGenerator userGen;
	private int[] users;
	private int usersCount;
	private ArrayList<Integer> usersINTOFOV = new ArrayList<Integer>();

	private int[][] usersList = new int[MAX][2];
	int width, height;
	private float x_torso = 0;
	private float y_torso = 0;

	private float z_torso = 0;

	public Tracker() {
	}

	public void setClassifier(Classifier test) {
		this.test = test;
	}

	private void calcHist(ShortBuffer depth) {
		// reset
		for (int i = 0; i < histogram.length; ++i)
			histogram[i] = 0;

		depth.rewind();

		int points = 0;
		while (depth.remaining() > 0) {
			short depthVal = depth.get();
			if (depthVal != 0) {
				histogram[depthVal]++;
				points++;
			}
		}

		for (int i = 1; i < histogram.length; i++) {
			histogram[i] += histogram[i - 1];
		}

		if (points > 0) {
			for (int i = 1; i < histogram.length; i++) {
				histogram[i] = 1.0f - (histogram[i] / (float) points);
			}
		}
	}

	void drawLine(Graphics g,
			HashMap<SkeletonJoint, SkeletonJointPosition> jointHash,
			SkeletonJoint joint1, SkeletonJoint joint2) {
		Point3D pos1 = jointHash.get(joint1).getPosition();
		Point3D pos2 = jointHash.get(joint2).getPosition();

		if (jointHash.get(joint1).getConfidence() == 0
				|| jointHash.get(joint2).getConfidence() == 0)
			return;

		g.drawLine((int) pos1.getX(), (int) pos1.getY(), (int) pos2.getX(),
				(int) pos2.getY());
	}

	public void drawSkeleton(Graphics g, int user) throws StatusException {
		// getJoints(user);
		// HashMap<SkeletonJoint, SkeletonJointPosition> dict = joints
		// .get(new Integer(user));
		//
		// drawLine(g, dict, SkeletonJoint.HEAD, SkeletonJoint.NECK);
		//
		// drawLine(g, dict, SkeletonJoint.LEFT_SHOULDER, SkeletonJoint.TORSO);
		// drawLine(g, dict, SkeletonJoint.RIGHT_SHOULDER, SkeletonJoint.TORSO);
		//
		// drawLine(g, dict, SkeletonJoint.NECK, SkeletonJoint.LEFT_SHOULDER);
		// drawLine(g, dict, SkeletonJoint.LEFT_SHOULDER,
		// SkeletonJoint.LEFT_ELBOW);
		// drawLine(g, dict, SkeletonJoint.LEFT_ELBOW, SkeletonJoint.LEFT_HAND);
		//
		// drawLine(g, dict, SkeletonJoint.NECK, SkeletonJoint.RIGHT_SHOULDER);
		// drawLine(g, dict, SkeletonJoint.RIGHT_SHOULDER,
		// SkeletonJoint.RIGHT_ELBOW);
		// drawLine(g, dict, SkeletonJoint.RIGHT_ELBOW,
		// SkeletonJoint.RIGHT_HAND);
		//
		// drawLine(g, dict, SkeletonJoint.LEFT_HIP, SkeletonJoint.TORSO);
		// drawLine(g, dict, SkeletonJoint.RIGHT_HIP, SkeletonJoint.TORSO);
		// drawLine(g, dict, SkeletonJoint.LEFT_HIP, SkeletonJoint.RIGHT_HIP);
		//
		// drawLine(g, dict, SkeletonJoint.LEFT_HIP, SkeletonJoint.LEFT_KNEE);
		// drawLine(g, dict, SkeletonJoint.LEFT_KNEE, SkeletonJoint.LEFT_FOOT);
		//
		// drawLine(g, dict, SkeletonJoint.RIGHT_HIP, SkeletonJoint.RIGHT_KNEE);
		// drawLine(g, dict, SkeletonJoint.RIGHT_KNEE,
		// SkeletonJoint.RIGHT_FOOT);

	}

	public void getJoint(int user, SkeletonJoint joint) throws StatusException {
		SkeletonJointPosition pos = skeletonCap.getSkeletonJointPosition(user,
				joint);
		if (pos.getPosition().getZ() != 0) {
			joints.get(user).put(
					joint,
					new SkeletonJointPosition(depthGen
							.convertRealWorldToProjective(pos.getPosition()),
							pos.getConfidence()));
		} else {
			joints.get(user).put(joint,
					new SkeletonJointPosition(new Point3D(), 0));
		}

	}

	public void getJoints(int user) throws StatusException {
		// System.out.println("REading joints");
		getJoint(user, SkeletonJoint.HEAD);
		getJoint(user, SkeletonJoint.NECK);

		getJoint(user, SkeletonJoint.LEFT_SHOULDER);
		getJoint(user, SkeletonJoint.LEFT_ELBOW);
		getJoint(user, SkeletonJoint.LEFT_HAND);

		getJoint(user, SkeletonJoint.RIGHT_SHOULDER);
		getJoint(user, SkeletonJoint.RIGHT_ELBOW);
		getJoint(user, SkeletonJoint.RIGHT_HAND);

		getJoint(user, SkeletonJoint.TORSO);

		getJoint(user, SkeletonJoint.LEFT_HIP);
		getJoint(user, SkeletonJoint.LEFT_KNEE);
		getJoint(user, SkeletonJoint.LEFT_FOOT);

		getJoint(user, SkeletonJoint.RIGHT_HIP);
		getJoint(user, SkeletonJoint.RIGHT_KNEE);
		getJoint(user, SkeletonJoint.RIGHT_FOOT);

	}

	public Dimension getPreferredSize() {
		return new Dimension(width, height);
	}

	public int initTracker() {

		int result = -1;
		try {

			// System.out.println("New Origin of axes: " +
			// SkeletonJoint.TORSO.name() + ", n=" + NEW_ORIGIN);

			scriptNode = new OutArg<ScriptNode>();
			context = Context.createFromXmlFile(SAMPLE_XML_FILE, scriptNode);
			// setta il mirror-mode
			context.setGlobalMirror(true);

			depthGen = DepthGenerator.create(context);
			DepthMetaData depthMD = depthGen.getMetaData();

			histogram = new float[10000];
			width = depthMD.getFullXRes();
			height = depthMD.getFullYRes();

			imgbytes = new byte[width * height * 3];

			userGen = UserGenerator.create(context);
			skeletonCap = userGen.getSkeletonCapability();
			poseDetectionCap = userGen.getPoseDetectionCapability();

			userGen.getNewUserEvent().addObserver(new NewUserObserver());
			userGen.getLostUserEvent().addObserver(new LostUserObserver());
			skeletonCap.getCalibrationCompleteEvent().addObserver(
					new CalibrationCompleteObserver());
			poseDetectionCap.getPoseDetectedEvent().addObserver(
					new PoseDetectedObserver());

			calibPose = skeletonCap.getSkeletonCalibrationPose();
			joints = new HashMap<Integer, HashMap<SkeletonJoint, SkeletonJointPosition>>();

			skeletonCap.setSkeletonProfile(SkeletonProfile.ALL);

			result = 0;

		} catch (GeneralException e) {
			 e.printStackTrace();
			System.err
					.println("Hai forse dimenticato di collegare il Kinect?\nCollegalo e riprova!");
			// System.exit(1);
		}
		return result;
	}

	public void paint(Graphics g) {
		if (drawPixels) {
			DataBufferByte dataBuffer = new DataBufferByte(imgbytes, width
					* height * 3);

			WritableRaster raster = Raster.createInterleavedRaster(dataBuffer,
					width, height, width * 3, 3, new int[] { 0, 1, 2 }, null);

			ColorModel colorModel = new ComponentColorModel(
					ColorSpace.getInstance(ColorSpace.CS_sRGB), new int[] { 8,
							8, 8 }, false, false, ComponentColorModel.OPAQUE,
					DataBuffer.TYPE_BYTE);

			bimg = new BufferedImage(colorModel, raster, false, null);

			g.drawImage(bimg, 0, 0, null);
		}
		try {
			users = userGen.getUsers();
			for (int i = 0; i < users.length; ++i) {
				Color c = colors[users[i] % colors.length];
				c = new Color(255 - c.getRed(), 255 - c.getGreen(),
						255 - c.getBlue());

				g.setColor(c);
				if (drawSkeleton && skeletonCap.isSkeletonTracking(users[i])) {
					drawSkeleton(g, users[i]);
				}

				if (skeletonCap.isSkeletonTracking(users[i])
						&& usersINTOFOV.contains(new Integer(users[i]))
						&& startedTest) {
					createSkeletonInstances(users[i]);
					// System.out.println("send");
				}

				if (printID) {
					Point3D com = depthGen.convertRealWorldToProjective(userGen
							.getUserCoM(users[i]));
					String label = null;
					if (!printState) {
						label = new String("" + users[i]);
					} else if (skeletonCap.isSkeletonTracking(users[i])) {
						// Tracking
						label = new String(users[i] + " - Tracking");
					} else if (skeletonCap.isSkeletonCalibrating(users[i])) {
						// Calibrating
						label = new String(users[i] + " - Calibrating");
					} else {
						// Nothing
						label = new String(users[i] + " - Looking for pose ("
								+ calibPose + ")");
					}

					g.drawString(label, (int) com.getX(), (int) com.getY());
				}
			}
		} catch (StatusException e) {
			e.printStackTrace();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	private double TORSO_CONF = 0.0;
	private ArrayList<Instance> skeletonIstances;
	private List<Attribute> head_att, body_upright_att, body_stan_slanting_att,
			body_sit_slanting_att, left_arm_att, right_arm_att, left_leg_att,
			right_leg_att;

	public void setTorsoConfidence(double d) {
		TORSO_CONF = d;
	}

	private void createSkeletonInstances(int user) throws Exception {

		skeletonIstances = new ArrayList<Instance>();

		getJoints(user);
		HashMap<SkeletonJoint, SkeletonJointPosition> dict = joints
				.get(new Integer(user));

		double torso_conf = dict.get(SkeletonJoint.TORSO).getConfidence();
		if (torso_conf >= TORSO_CONF) {
			// se TORSO rilevato correttamente : IMPORTANTE per la correttezza
			// delle distanze dei vari limb

			Point3D torso_pos = depthGen.convertProjectiveToRealWorld(dict.get(
					SkeletonJoint.TORSO).getPosition());

			// save origin's coordinates
			x_torso = torso_pos.getX();
			y_torso = torso_pos.getY();
			z_torso = torso_pos.getZ();

			createLimbInstance(dict, TRACKER_HEAD_LIMB, HEAD_ABOUT, head_att);

			createLimbInstance(dict, TRACKER_BODY_UPRIGHT_LIMB,
					BODY_UPRIGHT_ABOUT, body_upright_att);
			createLimbInstance(dict, TRACKER_BODY_STAN_SLANTING_LIMB,
					BODY_STAN_SLANTING_ABOUT, body_stan_slanting_att);
			createLimbInstance(dict, TRACKER_BODY_SIT_SLANTING_LIMB,
					BODY_SIT_SLANTING_ABOUT, body_sit_slanting_att);

			createLimbInstance(dict, TRACKER_LEFT_ARM_LIMB, LEFT_ARM_ABOUT,
					left_arm_att);
			createLimbInstance(dict, TRACKER_RIGHT_ARM_LIMB, RIGHT_ARM_ABOUT,
					right_arm_att);
			createLimbInstance(dict, TRACKER_LEFT_LEG_LIMB, LEFT_LEG_ABOUT,
					left_leg_att);
			createLimbInstance(dict, TRACKER_RIGHT_LEG_LIMB, RIGHT_LEG_ABOUT,
					right_leg_att);

			sendInstance();
		}
	}

	private void createLimbInstance(
			HashMap<SkeletonJoint, SkeletonJointPosition> dict, int limb,
			int[] limb_about, List<Attribute> limb_att) throws StatusException {
		int att = 1;
		Instance ist = new DenseInstance(
				(SPATIAL_COORD * limb_about.length) + 1);

		limb_att = test.getLimbFeatureDataSet(limb);

		for (int i = 0; i < limb_about.length; i++) {
			if (limb_about[i] != TORSO) {
				/*
				 * il punto di riferimento per tutti i joint (meno che per il
				 * TORSO), ossia il centro degli assi che descrivono lo spazio
				 * in cui si possono muovere è il TORSO stesso.
				 */
				Point3D joint = depthGen.convertProjectiveToRealWorld(dict.get(
						SKELETON_JOINT(limb_about[i])).getPosition());
				
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
				Point3D left_foot = depthGen.convertProjectiveToRealWorld(dict
						.get(SkeletonJoint.LEFT_FOOT).getPosition());
				Point3D right_foot = depthGen.convertProjectiveToRealWorld(dict
						.get(SkeletonJoint.RIGHT_FOOT).getPosition());

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

		test.testingONLINE(skeletonIstances, System.currentTimeMillis());

	}

	public void setStartedTest(boolean b) {
		startedTest = b;
	}

	public void startGeneratingAll() throws StatusException {
		context.startGeneratingAll();
	}

	public void stopGeneratingAll() throws StatusException {
		context.stopGeneratingAll();
	}

	public void resetTracker() throws GeneralException {
		// stop tracking
		for (Integer i : usersINTOFOV) {
			if (skeletonCap.isSkeletonTracking(i))
				skeletonCap.stopTracking(i);
		}

		for (Integer i : usersINTOFOV) {
			if (!(skeletonCap.isSkeletonTracking(i))) {

				skeletonCap.reset(i);
				skeletonCap.clearSkeletonCalibrationData(i);
				skeletonCap.requestSkeletonCalibration(i, true);
				// skeletonCap.startTracking(i);
			}

		}
	}

	public int updateDepth() {
		int result = 0;
		try {

			usersCount = 0;
			context.waitAnyUpdateAll();

			DepthMetaData depthMD = depthGen.getMetaData();
			SceneMetaData sceneMD = userGen.getUserPixels(0);

			ShortBuffer scene = sceneMD.getData().createShortBuffer();
			ShortBuffer depth = depthMD.getData().createShortBuffer();
			calcHist(depth);
			depth.rewind();

			while (depth.remaining() > 0) {
				int pos = depth.position();
				short pixel = depth.get();
				short user = scene.get();

				imgbytes[3 * pos] = 0;
				imgbytes[3 * pos + 1] = 0;
				imgbytes[3 * pos + 2] = 0;

				if (drawBackground || pixel != 0) {
					int colorID = user % (colors.length - 1);
					if (user == 0) {
						colorID = colors.length - 1;
					} else {
						usersCount += 1;
						if (usersList[user] != null)
							usersList[user][1] += 1;
					}
					if (pixel != 0) {
						float histValue = histogram[pixel];
						imgbytes[3 * pos] = (byte) (histValue * colors[colorID]
								.getRed());
						imgbytes[3 * pos + 1] = (byte) (histValue * colors[colorID]
								.getGreen());
						imgbytes[3 * pos + 2] = (byte) (histValue * colors[colorID]
								.getBlue());
					}
				}
			}

			if (usersCount > 0) {

				for (int i = 0; i < usersList.length; i++) {
					if (usersList[i][0] != 0) {
						// System.out.println(usersList[i][0]);
						if (usersList[i][1] == 0) {
							// System.out.println("Dov'è l'user " +
							// usersList[i][0]);
							if (usersINTOFOV.contains(new Integer(
									usersList[i][0])))
								usersINTOFOV
										.remove(new Integer(usersList[i][0]));

						} else if (usersList[i][1] != 0) {
							if (!(usersINTOFOV.contains(new Integer(
									usersList[i][0]))))
								usersINTOFOV.add(new Integer(usersList[i][0]));

							usersList[i][1] = 0;
						}
					}
				}

			}
		} catch (GeneralException e) {
			// e.printStackTrace();
			result = -1;
			System.err.println("Kinect scollegato?");

		}

		return result;
	}
}
