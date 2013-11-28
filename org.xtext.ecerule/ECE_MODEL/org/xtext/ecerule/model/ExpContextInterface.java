package org.xtext.ecerule.model;

public interface ExpContextInterface {

	public void setFinalCondition(ConditionInterface finalCondition);
	
	public ConditionInterface getFinalCondition();

	public void setInitialCondition(ConditionInterface initialCondition);
	
	public ConditionInterface getInitialCondition();
	
	public void setTime(TimeInterface time);
}
