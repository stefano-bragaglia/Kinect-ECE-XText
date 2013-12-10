package org.xtext.ecerule.model;

import org.gradle.Visitable;
import org.gradle.Visitor;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.ExpContextInterface;
import org.xtext.ecerule.model.Time;
import org.xtext.ecerule.model.TimeInterface;

public class ExpContext implements ExpContextInterface, Visitable {

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

	//@Override
	public void setFinalCondition(ConditionInterface finalCondition) {
		this.finalCondition = finalCondition;
		this.time=new Time("", null);

	}

	//@Override
	public void setInitialCondition(ConditionInterface initialCondition) {
		this.initialCondition = initialCondition;

	}
	
	

	//@Override
	public void setTime(TimeInterface time) {
		this.time = time;

	}

	public void accept(Visitor visitor) {
		if (this.initialCondition!=null)
			this.initialCondition.accept(visitor);
		this.finalCondition.accept(visitor);
	}

}
