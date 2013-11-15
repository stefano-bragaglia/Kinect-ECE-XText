package org.xtext.ecerule.model;

public interface TimeInterface {

	public void setAllenOp(String allenOp);
	
	public void setTimeValueExpr(ExpressionInterface timeValueExpr);
	
	public String getAllenOp();

	public ExpressionInterface getTimeValueExpr();
	
	public double getTimeValue();

}
