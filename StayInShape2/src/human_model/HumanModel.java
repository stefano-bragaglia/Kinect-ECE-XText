package human_model;

import java.util.ArrayList;

import constants.HumanBodyValues;
import static constants.HumanBodyValues.*;

public class HumanModel {

	private int[] body = new int[2];
	private int head, left_arm, right_arm, left_leg, right_leg;
	private String body_pose, head_pose, la_pose, ra_pose, ll_pose, rl_pose;
	private int step;

	public HumanModel(int step) {
		this.step = step + 1;

		body[0] = -1;
		body[1] = -1;
		head = -1;
		left_arm = -1;
		right_arm = -1;
		left_leg = -1;
		right_leg = -1;

		body_pose = "";
		head_pose = "";
		la_pose = "";
		ra_pose = "";
		ll_pose = "";
		rl_pose = "";
	}

	// public HumanModel(int step, int[] limbs_poses) {
	// this.step = step;
	//
	// setLimbsByIntValue(limbs_poses);
	// }

	public HumanModel(int step, String[] limbs_poses) {
		this.step = step;

		setLimbsByStringValue(limbs_poses);
	}

	public void setNumberOfStep(int s) {
		step = s;
	}

	public int getNumberOfStep() {
		return step;
	}

	// public void setLimbsByIntValue(int[] l) {
	//
	// for (int i = 0; i < l.length; i++) {
	// int pose = l[i];
	// if (i == HEAD_LIMB)
	// setHead(pose);
	// if (i == BODY_LIMB)
	// setBody(pose);
	// if (i == LEFT_ARM_LIMB)
	// setLeftArm(pose);
	// if (i == RIGHT_ARM_LIMB)
	// setRightArm(pose);
	// if (i == LEFT_LEG_LIMB)
	// setLeftLeg(pose);
	// if (i == RIGHT_LEG_LIMB)
	// setRightLeg(pose);
	// }
	// }

	public void setLimbsByStringValue(String[] l) {
		for (int i = 0; i < l.length; i++) {
			String pose = l[i];
			if (i == HEAD_LIMB) {
				head_pose = pose;
				if (head_pose.length() > 0) // quindi != ""
					head = findIntValueOfPose(pose, HEAD_POSES);
				else
					head = -1;
			}

			if (i == BODY_LIMB) {
				body_pose = pose;
				if (body_pose.length() > 0)
					body = findIntValuesOfBodyPose(pose, ALL_BODY_POSES);
				else{
					body[0] = -1;
					body[1] = -1;
				}
			}

			if (i == LEFT_ARM_LIMB) {
				la_pose = pose;
				if (la_pose.length() > 0)
					left_arm = findIntValueOfPose(pose, LEFT_ARM_POSES);
				else
					left_arm = -1;
			}

			if (i == RIGHT_ARM_LIMB) {
				ra_pose = pose;
				if (ra_pose.length() > 0)
					right_arm = findIntValueOfPose(pose, RIGHT_ARM_POSES);
				else
					right_arm = -1;
			}

			if (i == LEFT_LEG_LIMB) {
				ll_pose = pose;
				if (ll_pose.length() > 0)
					left_leg = findIntValueOfPose(pose, LEFT_LEG_POSES);
				else
					left_leg = -1;
			}

			if (i == RIGHT_LEG_LIMB) {
				rl_pose = pose;
				if (rl_pose.length() > 0)
					right_leg = findIntValueOfPose(pose, RIGHT_LEG_POSES);
				else
					right_leg = -1;
			}
		}
	}

	private int findIntValueOfPose(String p, String[] poses) {
		int ris = 0;

		for (int i = 0; i < poses.length; i++) {
			if (p.equals(poses[i])) {
				ris = i;
				break;
			}
		}

		return ris;
	}

	private int[] findIntValuesOfBodyPose(String p, String[][] poses) {
		int[] ris = new int[2];

		for (int i = 0; i < poses.length; i++) {
			for (int j = 0; j < poses[i].length; j++) {
				if (p.equals(poses[i][j])) {
					ris[0] = i;
					ris[1] = j;
					break;
				}
			}
		}

		return ris;
	}

	public void setHead(int h) {
		head = h;
		if (h != NULL) {
			head_pose = HEAD_POSES[h];
		} else
			head_pose = "";
	}

	public int getHead() {
		return head;
	}

	public String getHeadDescription() {
		return HumanBodyValues.getHeadDescription(head);
	}

	public void setBody(int[] b) {
		body = b;
		if (b != null) {
			body_pose = ALL_BODY_POSES[b[0]][b[1]];
		} else
			body_pose = "";
	}

	public int[] getBody() {
		return body;
	}

	public String getBodyDescription() {
		return HumanBodyValues.getBodyDescription(body);
	}

	public void setLeftArm(int la) {
		left_arm = la;
		if (la != NULL) {
			la_pose = LEFT_ARM_POSES[la];
		} else
			la_pose = "";
	}

	public int getLeftArm() {
		return left_arm;
	}

	public String getLeftArmDescription() {
		return HumanBodyValues.getLeftArmDescription(left_arm);
	}

	public void setRightArm(int ra) {
		right_arm = ra;
		if (ra != NULL) {
			ra_pose = RIGHT_ARM_POSES[ra];
		} else
			ra_pose = "";
	}

	public int getRightArm() {
		return right_arm;
	}

	public String getRightArmDescription() {
		return HumanBodyValues.getRightArmDescription(right_arm);
	}

	public void setLeftLeg(int ll) {
		left_leg = ll;
		if (ll != NULL) {
			ll_pose = LEFT_LEG_POSES[ll];
		} else
			ll_pose = "";
	}

	public int getLeftLeg() {
		return left_leg;
	}

	public String getLeftLegDescription() {
		return HumanBodyValues.getHeadDescription(left_leg);
	}

	public void setRightLeg(int rl) {
		right_leg = rl;
		if (rl != NULL) {
			rl_pose = RIGHT_LEG_POSES[rl];
		} else
			rl_pose = "";
	}

	public int getRightLeg() {
		return right_leg;
	}

	public String getRightLegDescription() {
		return HumanBodyValues.getRightLegDescription(right_leg);
	}

	public ArrayList<Integer> getHumanModelIntParameters() {
		ArrayList<Integer> hm = new ArrayList<Integer>();
		hm.add(head);
		hm.add(body[1]); //posa
		hm.add(left_arm);
		hm.add(right_arm);
		hm.add(left_leg);
		hm.add(right_leg);

		return hm;
	}

	public ArrayList<String> getHumanModelStringParameters() {
		ArrayList<String> hm = new ArrayList<String>();
		hm.add(head_pose);
		hm.add(body_pose);
		hm.add(la_pose);
		hm.add(ra_pose);
		hm.add(ll_pose);
		hm.add(rl_pose);

		return hm;
	}

	public String getCSVDescription() {
		String desc = constants.HumanBodyValues.getHumanModelCSVDescription(
				head, body, left_arm, right_arm, left_leg, right_leg);

		return desc;
	}

	public String toString() {
		System.out.println("head      -----  "+head+ "   "+head_pose);
		System.out.println("body[0]   -----  "+body[0]+ "   "+body_pose);
		System.out.println("body[1]   -----  "+body[1]);
		System.out.println("left_arm  -----  "+left_arm+ "   "+la_pose);
		System.out.println("right_arm -----  "+right_arm+ "   "+ra_pose);
		System.out.println("left_leg  -----  "+left_leg+ "   "+ll_pose);
		System.out.println("right_leg -----  "+right_leg+ "   "+rl_pose);
		
		System.out.println();
		
		
		
		
		String desc = constants.HumanBodyValues.getHumanModelDescription(head,
				body, left_arm, right_arm, left_leg, right_leg);

		return desc;
	}

}
