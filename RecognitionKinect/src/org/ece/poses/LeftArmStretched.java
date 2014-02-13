package org.ece.poses;

import static constants.HumanBodyValues.TOTAL_LIMB;
import human_model.HumanModel;

public class LeftArmStretched implements PoseKnown {

	HumanModel humanModel;
	String poseName;

	public LeftArmStretched() {
		humanModel = new HumanModel(1);

//		humanModel.setHead(-1);
//		int[] b = new int[2];
//		b[0] = -1;
//		b[1] = -1;
//		humanModel.setBody(b);
		humanModel.setLeftArm(1);
//		humanModel.setRightArm(-1);
//		humanModel.setLeftLeg(-1);
//		humanModel.setRightLeg(-1);

		poseName = "LeftArmStr";
	}

	public HumanModel getHm() {
		return humanModel;
	}

	@Override
	public String getHumanPoseName() {
		return poseName;
	}

}
