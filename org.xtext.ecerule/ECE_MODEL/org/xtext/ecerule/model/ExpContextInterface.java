package org.xtext.ecerule.model;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.TimeInterface;

public interface ExpContextInterface {

	public void setFinalCondition(ConditionInterface finalCondition);

	public void setInitialCondition(ConditionInterface initialCondition);
	
	public void setTime(TimeInterface time);
}
