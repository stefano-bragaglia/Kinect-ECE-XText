package org.model;

import org.visitor.Visitable;
import org.visitor.Visitor;

public class ActionAftExpectEval implements Visitable {
	private String action;
	
	public ActionAftExpectEval(String action){
		this.action=action;
	}
	

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}



	@Override
	public void accept(Visitor visitor) {
		// TODO Auto-generated method stub
		
	}
	

}
