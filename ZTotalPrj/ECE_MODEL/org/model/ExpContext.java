package org.model;

import org.model.ConditionInterface;
import org.model.ExpContextInterface;
import org.model.Time;
import org.model.TimeInterface;
import org.visitor.CreateDeclarationsVisitor;
import org.visitor.Visitable;
import org.visitor.Visitor;

public class ExpContext implements ExpContextInterface, Visitable {

	private ConditionInterface finalCondition;
	private ConditionInterface initialCondition;
	private TimeInterface time;
	private ActionAftExpectEval actionOnFulf;
	private ActionAftExpectEval actionOnViol;
	

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
	
	
	public ActionAftExpectEval getActionOnFulf() {
		return actionOnFulf;
	}

	public void setActionOnFulf(ActionAftExpectEval actionOnFulf) {
		this.actionOnFulf = actionOnFulf;
	}

	public ActionAftExpectEval getActionOnViol() {
		return actionOnViol;
	}

	public void setActionOnViol(ActionAftExpectEval actionOnViol) {
		this.actionOnViol = actionOnViol;
	}

	
	
	public void accept(Visitor visitor) {
		if (this.initialCondition!=null)
			this.initialCondition.accept(visitor);
		this.finalCondition.accept(visitor);
	}

	@Override
	public void accept(CreateDeclarationsVisitor visitor) {
		visitor.visit(this);
		
	}

}
