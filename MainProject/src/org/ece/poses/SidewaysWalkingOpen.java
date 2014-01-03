package org.ece.poses;

import static constants.HumanBodyValues.TOTAL_LIMB;

import human_model.HumanModel;

public class SidewaysWalkingOpen {

	HumanModel humanModel;

	public SidewaysWalkingOpen() {
		String[] limbs = new String[TOTAL_LIMB];
		limbs[0] = "h_inline";
		limbs[1] = "b_stan";
		limbs[2] = "la_lowered";
		limbs[3] = "ra_lowered";
		limbs[4] = "ll_wided";
		limbs[5] = "rl_wided";
		humanModel = new HumanModel(1, limbs);
	}

	public HumanModel getHm() {
		return humanModel;
	}

}
