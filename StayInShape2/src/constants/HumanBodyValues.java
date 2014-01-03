package constants;

public final class HumanBodyValues {

	public static final int SQUARE_DIM = 150;
	public static final int GAP = 30;
	public static final int MARGIN = 20;
	public static final int WO_MARGIN = 130;
	public static final int GO_DIM = 50;
	public static final int NULL = -1;
	public static final int TOTAL_LIMB = 6;
	public static final String PNG_EXT = "png";

	// constant of silhouette
	public static final int DEFAULT = 1;
	public static final int COUNT_DIM = 30;
	public static final int MAX_STEP = 4;
	public static final int MIN_STEP = 1;

	public static final int HEAD_LIMB = 0;
	public static final int BODY_LIMB = 1;
	public static final int LEFT_ARM_LIMB = 2;
	public static final int RIGHT_ARM_LIMB = 3;
	public static final int LEFT_LEG_LIMB = 4;
	public static final int RIGHT_LEG_LIMB = 5;

	public static final int[] LIMBS = { HEAD_LIMB, BODY_LIMB, LEFT_ARM_LIMB,
			RIGHT_ARM_LIMB, LEFT_LEG_LIMB, RIGHT_LEG_LIMB };

	public static final int HEAD_WIDTH = 180;
	public static final int HEAD_HEIGHT = 130;
	public static final int BODY_WIDTH = 180;
	public static final int BODY_HEIGHT = 220;
	public static final int LEG_WIDTH = 310;
	public static final int LEG_HEIGHT = 290;
	public static final int ARM_WIDTH = 220;
	public static final int ARM_HEIGHT = 350;

	// constant of human model:
	// HEAD
	public static final int HEAD_INLINE = 0;
	public static final int HEAD_SLANTING_LEFT = 1;
	public static final int HEAD_SLANTING_RIGHT = 2;
	public static final String[] HEAD_POSES = { "h_inline", "h_slantingLeft",
			"h_slantingRight" };
	// LEFT_ARM
	public static final int LEFT_ARM_LOWERED = 0;
	public static final int LEFT_ARM_T = 1;
	public static final int LEFT_ARM_RAISED = 2;
	public static final int LEFT_ARM_BENDED = 3;
	public static final String[] LEFT_ARM_POSES = { "la_lowered", "la_T",
			"la_raised", "la_bended" };
	// RIGHT_ARM
	public static final int RIGHT_ARM_LOWERED = 0;
	public static final int RIGHT_ARM_T = 1;
	public static final int RIGHT_ARM_RAISED = 2;
	public static final int RIGHT_ARM_BENDED = 3;
	public static final String[] RIGHT_ARM_POSES = { "ra_lowered", "ra_T",
			"ra_raised", "ra_bended" };
	// BODY
	// public static final int BODY_SIT = 0;
	// public static final int BODY_STAN = 1;
	// public static final String[] BODY_POSES = { "b_sit", "b_stan" };
	public static final int B_UPRIGHT = 0;
	public static final int B_STAN_SLANTING = 1;
	public static final int B_SIT_SLANTING = 2;
	public static final int[] BODY_CATEGORIES = { B_UPRIGHT,
			B_STAN_SLANTING, B_SIT_SLANTING };

	public static final int B_UPRIGHT_STAN = 1;
	public static final int B_UPRIGHT_SIT = 0;
	public static final String[] BODY_UPRIGHT = { "body_sit", "body_stan" };

	public static final int B_STANDING_SLANTING_LEFT = 0;
	public static final int B_STANDING_SLANTING_RIGHT = 1;
	public static final int B_STANDING_SLANTING_FORWARD = 2;
	public static final String[] BODY_STANDING_SLANTING = {
			"body_stan_slantingLeft", "body_stan_slantingRight",
			"body_stan_forward" };

	public static final int B_SITTING_SLANTING_LEFT = 0;
	public static final int B_SITTING_SLANTING_RIGHT = 1;
	public static final int B_SITTING_SLANTING_FORWARD = 2;
	public static final String[] BODY_SITTING_SLANTING = {
			"body_sit_slantingLeft", "body_sit_slantingRight" };
	public static final String[][] ALL_BODY_POSES = { BODY_UPRIGHT,
			BODY_STANDING_SLANTING, BODY_SITTING_SLANTING };
	
	// LEFT_LEG
	public static final int LEFT_LEG_INLINE = 0;
	public static final int LEFT_LEG_WIDED = 1;
	public static final int LEFT_LEG_BENDED = 2;
	public static final String[] LEFT_LEG_POSES = { "ll_inline", "ll_wided",
			"ll_sit" };
	// RIGHT_LEG
	public static final int RIGHT_LEG_INLINE = 0;
	public static final int RIGHT_LEG_WIDED = 1;
	public static final int RIGHT_LEG_BENDED = 2;
	public static final String[] RIGHT_LEG_POSES = { "rl_inline", "rl_wided",
			"rl_sit" };

	// value of dimension of a single square
	public static final int DIM = 150;

	public static final String getHumanModelDescription(int h, int[] b, int la,
			int ra, int ll, int rl) {
		String desc = getHeadDescription(h) + "\n" + getBodyDescription(b)
				+ "\n" + getLeftArmDescription(la) + "\n"
				+ getRightArmDescription(ra) + "\n" + getLeftLegDescription(ll)
				+ "\n" + getRightLegDescription(rl);

		return desc;
	}

	public static final String getHumanModelCSVDescription(int h, int[] b,
			int la, int ra, int ll, int rl) {
		String desc = getHeadDescription(h) + "," + getBodyDescription(b) + ","
				+ getLeftArmDescription(la) + "," + getRightArmDescription(ra)
				+ "," + getLeftLegDescription(ll) + ","
				+ getRightLegDescription(rl);

		return desc;
	}

	public static final String getHeadDescription(int h) {
		String res = "---";

		switch (h) {
		case NULL:
			break;
		case HEAD_INLINE: {
			res = "Head in line";
			break;
		}
		case HEAD_SLANTING_LEFT: {
			res = "Head slanting left";
			break;
		}
		case HEAD_SLANTING_RIGHT: {
			res = "Head slanting right";
			break;
		}
		}

		return res;
	}

	public static final String getBodyDescription(int[] b) {
		String res = "---";

		// b[0] = categoria
		// b[1] = posa

		switch (b[0]) {
		case NULL:
			break;
		case B_UPRIGHT: {
			switch (b[1]) {
			case B_UPRIGHT_STAN: {
				res = BODY_UPRIGHT[1];
				break;
			}
			case B_UPRIGHT_SIT: {
				res = BODY_UPRIGHT[0];
				break;
			}
			}
			break;
		}
		case B_STAN_SLANTING: {
			switch (b[1]) {
			case B_STANDING_SLANTING_LEFT: {
				res = BODY_STANDING_SLANTING[0];
				break;
			}
			case B_STANDING_SLANTING_RIGHT: {
				res = BODY_STANDING_SLANTING[1];
				break;
			}
			case B_STANDING_SLANTING_FORWARD: {
				res = BODY_STANDING_SLANTING[2];
				break;
			}
			}
			break;
		}
		case B_SIT_SLANTING: {
			switch (b[1]) {
			case B_SITTING_SLANTING_LEFT: {
				res = BODY_SITTING_SLANTING[0];
				break;
			}
			case B_SITTING_SLANTING_RIGHT: {
				res = BODY_SITTING_SLANTING[1];
				break;
			}
			case B_SITTING_SLANTING_FORWARD: {
				res = BODY_SITTING_SLANTING[2];
				break;
			}
			}
			break;
		}
		}

		return res;
	}

	public static final String getLeftArmDescription(int la) {
		String res = "---";

		switch (la) {
		case NULL:
			break;
		case LEFT_ARM_LOWERED: {
			res = "Left Arm lowered";
			break;
		}
		case LEFT_ARM_T: {
			res = "Left Arm stretched";
			break;
		}
		case LEFT_ARM_RAISED: {
			res = "Left Arm raised";
			break;
		}
		case LEFT_ARM_BENDED: {
			res = "Left Arm bended";
			break;
		}
		}

		return res;
	}

	public static final String getRightArmDescription(int ra) {
		String res = "---";

		switch (ra) {
		case NULL:
			break;
		case RIGHT_ARM_LOWERED: {
			res = "Right Arm lowered";
			break;
		}
		case RIGHT_ARM_T: {
			res = "Right Arm stretched";
			break;
		}
		case RIGHT_ARM_RAISED: {
			res = "Right Arm raised";
			break;
		}
		case RIGHT_ARM_BENDED: {
			res = "Right Arm bended";
			break;
		}
		}

		return res;
	}

	public static final String getLeftLegDescription(int ll) {
		String res = "---";

		switch (ll) {
		case NULL:
			break;
		case LEFT_LEG_INLINE: {
			res = "Left Leg in line standing";
			break;
		}
		case LEFT_LEG_WIDED: {
			res = "Left Leg wided apart";
			break;
		}
		case LEFT_LEG_BENDED: {
			res = "Left Leg sitting";
			break;
		}
		}

		return res;
	}

	public static final String getRightLegDescription(int rl) {
		String res = "---";

		switch (rl) {
		case NULL:
			break;
		case RIGHT_LEG_INLINE: {
			res = "Right Leg in line standing";
			break;
		}
		case RIGHT_LEG_WIDED: {
			res = "Right Leg wided apart";
			break;
		}
		case RIGHT_LEG_BENDED: {
			res = "Right Leg sitting";
			break;
		}
		}

		return res;
	}

}
