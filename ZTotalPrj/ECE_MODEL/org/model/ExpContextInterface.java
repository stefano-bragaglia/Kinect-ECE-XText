package org.model;

import org.model.ConditionInterface;
import org.model.TimeInterface;
import org.visitor.Visitable;

public interface ExpContextInterface extends Visitable{

	public void setFinalCondition(ConditionInterface finalCondition);

	public void setInitialCondition(ConditionInterface initialCondition);
	
	public ConditionInterface getFinalCondition();
	
	public ConditionInterface getInitialCondition();
	
	
	public void setTime(TimeInterface time);

}
