package org.xtext.ecerule.model;

import org.gradle.TransfCondiVisitor;
import org.gradle.Visitable;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.TimeInterface;

public interface ExpContextInterface extends Visitable{

	public void setFinalCondition(ConditionInterface finalCondition);

	public void setInitialCondition(ConditionInterface initialCondition);
	
	public ConditionInterface getFinalCondition();
	
	public ConditionInterface getInitialCondition();
	
	
	public void setTime(TimeInterface time);

}
