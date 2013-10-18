package org.xtext.ecerule.model;

public class ExpContext implements ExpContextInterface {

	private ConditionInterface finalCondition;
	private ConditionInterface initialCondition;
	private TimeInterface time;

	@Override
	public void setFinalCondition(ConditionInterface finalCondition) {
		this.finalCondition = finalCondition;

	}

	@Override
	public void setInitialCondition(ConditionInterface initialCondition) {
		this.initialCondition = initialCondition;

	}

	@Override
	public void setTime(TimeInterface time) {
		this.time = time;

	}

}
