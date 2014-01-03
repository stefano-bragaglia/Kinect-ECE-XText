package constants;

import com.primesense.nite.*;

public final class TrackerHumanValues {

	public static final double MIN_QUALITY = 0.4;
	
	public static final int NEW_ORIGIN = JointType.TORSO.ordinal(); // torso
	public static final int NMAX_JOINT = 24;
	// public static final int MAX_COORD = 45;
	public static final int SPATIAL_COORD = 3;
	public static final int COMPONENTS_OF_PREDICTION = 2;
	public static final int POSE = 0;
	public static final int VALUE_OF_POSE = 1;

	public static final String[] POSES = { "FirstPose", "SecondPose",
			"ThirdPose", "LastPose" };

	public static final int KINECTFOV_WIDTH = 640;
	public static final int KINECTFOV_HEIGHT = 480;

	// public static final String FIRST = "first_pose";//of repetition
	// public static final String SECOND = "second_pose";//of repetition
	// public static final String THIRD = "third_pose";//of repetition
	// public static final String LAST = "last_pose"; //close the repetition

	public static final int HEAD = 0;
	public static final int NECK = 1;
	public static final int TORSO = 2;
	public static final int RIGHT_SHOULDER = 5;
	public static final int RIGHT_ELBOW = 6;
	public static final int RIGHT_HAND = 9;
	public static final int LEFT_SHOULDER = 11;
	public static final int LEFT_ELBOW = 12;
	public static final int LEFT_HAND = 14;
	public static final int RIGHT_HIP = 16;
	public static final int RIGHT_KNEE = 17;
	public static final int RIGHT_FOOT = 19;
	public static final int LEFT_HIP = 20;
	public static final int LEFT_KNEE = 21;
	public static final int LEFT_FOOT = 23;

	// BODY JOINTS
	public static final int[] BODY_UPRIGHT_ABOUT = { TORSO };
	public static final int[] BODY_SIT_SLANTING_ABOUT = { TORSO, LEFT_HIP,
			LEFT_KNEE, LEFT_FOOT, RIGHT_HIP, RIGHT_KNEE, RIGHT_FOOT };
	public static final int[] BODY_STAN_SLANTING_ABOUT = BODY_SIT_SLANTING_ABOUT;
	public static final int[][] ALL_BODY_ABOUT = { BODY_UPRIGHT_ABOUT,
			BODY_STAN_SLANTING_ABOUT, BODY_SIT_SLANTING_ABOUT };

	// public static final int[] BODY_ABOUT = { TORSO, LEFT_HIP, LEFT_KNEE,
	// LEFT_FOOT, RIGHT_HIP, RIGHT_KNEE, RIGHT_FOOT };

	public static final int[] HEAD_ABOUT = { HEAD, NECK };
	public static final int[] LEFT_ARM_ABOUT = { LEFT_SHOULDER, LEFT_ELBOW,
			LEFT_HAND };
	public static final int[] RIGHT_ARM_ABOUT = { RIGHT_SHOULDER, RIGHT_ELBOW,
			RIGHT_HAND };
	public static final int[] LEFT_LEG_ABOUT = { LEFT_HIP, LEFT_KNEE, LEFT_FOOT };
	public static final int[] RIGHT_LEG_ABOUT = { RIGHT_HIP, RIGHT_KNEE,
			RIGHT_FOOT };

	public static final int HEAD_JOINTS = HEAD_ABOUT.length;

	public static final int LEFT_ARM_JOINTS = LEFT_ARM_ABOUT.length;
	public static final int RIGHT_ARM_JOINTS = RIGHT_ARM_ABOUT.length;
	public static final int LEFT_LEG_JOINTS = LEFT_LEG_ABOUT.length;
	public static final int RIGHT_LEG_JOINTS = RIGHT_LEG_ABOUT.length;

	public static final JointType SKELETON_JOINT(int l) {
		JointType sj = null;

		if (l == HEAD)
			sj = JointType.HEAD;
		else if (l == NECK)
			sj = JointType.NECK;
		else if (l == TORSO)
			sj = JointType.TORSO;
		else if (l == RIGHT_SHOULDER)
			sj = JointType.RIGHT_SHOULDER;
		else if (l == RIGHT_ELBOW)
			sj = JointType.RIGHT_ELBOW;
		else if (l == RIGHT_HAND)
			sj = JointType.RIGHT_HAND;
		else if (l == LEFT_SHOULDER)
			sj = JointType.LEFT_SHOULDER;
		else if (l == LEFT_ELBOW)
			sj = JointType.LEFT_ELBOW;
		else if (l == LEFT_HAND)
			sj = JointType.LEFT_HAND;
		else if (l == RIGHT_HIP)
			sj = JointType.RIGHT_HIP;
		else if (l == RIGHT_KNEE)
			sj = JointType.RIGHT_KNEE;
		else if (l == RIGHT_FOOT)
			sj = JointType.RIGHT_FOOT;
		else if (l == LEFT_HIP)
			sj = JointType.LEFT_HIP;
		else if (l == LEFT_KNEE)
			sj = JointType.LEFT_KNEE;
		else if (l == LEFT_FOOT)
			sj = JointType.LEFT_FOOT;
		return sj;
	}

	// for the Tracker
	public static final int TRACKER_HEAD_LIMB = 0;

	public static final int TRACKER_BODY_UPRIGHT_LIMB = 1;
	public static final int TRACKER_BODY_STAN_SLANTING_LIMB = 2;
	public static final int TRACKER_BODY_SIT_SLANTING_LIMB = 3;
	public static final int[] TRACKER_BODY_CATEGORIES = {
			TRACKER_BODY_UPRIGHT_LIMB, TRACKER_BODY_STAN_SLANTING_LIMB,
			TRACKER_BODY_SIT_SLANTING_LIMB };

	public static final int TRACKER_LEFT_ARM_LIMB = 4;
	public static final int TRACKER_RIGHT_ARM_LIMB = 5;
	public static final int TRACKER_LEFT_LEG_LIMB = 6;
	public static final int TRACKER_RIGHT_LEG_LIMB = 7;
	public static final int TRACKER_TOTAL_LIMBS = 8;
	public static final int[] TRACKER_LIMBS = { TRACKER_HEAD_LIMB,
			TRACKER_BODY_UPRIGHT_LIMB, TRACKER_BODY_STAN_SLANTING_LIMB,
			TRACKER_BODY_SIT_SLANTING_LIMB, TRACKER_LEFT_ARM_LIMB,
			TRACKER_RIGHT_ARM_LIMB, TRACKER_LEFT_LEG_LIMB,
			TRACKER_RIGHT_LEG_LIMB };
	public static final String[] TRACKER_NAME_OF_LIMBS = { "Head",
			"Body upright", "Body STAN slanting", "Body SIT slanting",
			"Left arm", "Right arm", "Left leg", "Right leg" };

	// for the FakeTracker.java
	// public static final int[] BODY_ABOUT = { TORSO };
	// public static final int BODY_JOINTS = BODY_ABOUT.length;
}
