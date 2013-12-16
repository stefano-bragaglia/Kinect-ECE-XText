package org.xtext.ecerule.model;

import org.gradle.Visitable;
import org.gradle.Visitor;
import org.xtext.ecerule.model.ExpressionInterface;
import org.xtext.ecerule.model.TimeInterface;

public class Time implements TimeInterface, Visitable {

	private String allenOp;
	//private ExpressionInterface timeValueExpr;
	private long timeValue;
	
	public Time() {
		super();
	}

	
	public Time(String allenOp, long timeValue) {
		super();
		this.allenOp = allenOp;
		this.timeValue = timeValue;
	}



	public void setAllenOp(String allenOp) {
		this.allenOp = allenOp;

	}

	public String getAllenOp() {
		return allenOp;
	}


	public long getTimeValue() {
		return timeValue;
	}


	public void setTimeValue(long timeValue) {
		this.timeValue = timeValue;
	}


	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	


}
