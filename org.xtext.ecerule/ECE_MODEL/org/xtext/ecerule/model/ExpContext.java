package org.xtext.ecerule.model;

public class ExpContext implements ExpContextInterface {

	private ConditionInterface finalCondition;
	private ConditionInterface initialCondition;
	private TimeInterface time;

	public ConditionInterface getFinalCondition() {
		return finalCondition;
	}

	public ConditionInterface getInitialCondition() {
		return initialCondition;
	}

	public TimeInterface getTime() {
		return time;
	}

	@Override
	public void setFinalCondition(ConditionInterface finalCondition) {
		this.finalCondition = finalCondition;
		this.time=new Time("", 0);

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
