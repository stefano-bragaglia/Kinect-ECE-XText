package org.xtext.ecerule.model;

public class Time implements TimeInterface {

	private String allenOp;
	private ExpressionInterface timeValueExpr;

	
	public Time() {
		super();
	}

	public Time(String allenOp, ExpressionInterface timeValueExpr) {
		super();
		this.allenOp = allenOp;
		this.timeValueExpr = timeValueExpr;
	}

	public void setAllenOp(String allenOp) {
		this.allenOp = allenOp;

	}

	public String getAllenOp() {
		return allenOp;
	}

	public void setTimeValueExpr(ExpressionInterface timeValueExpr) {
		this.timeValueExpr = timeValueExpr;

	}

	public ExpressionInterface getTimeValueExpr() {
		return timeValueExpr;
	}
	
	public double getTimeValue(){
		return this.timeValueExpr.validate();
		
	}

}
