package org.model;

import org.model.ConditionInterface;
import org.model.ExpContextInterface;
import org.model.Time;
import org.model.TimeInterface;
import org.visitor.Visitable;
import org.visitor.Visitor;

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
