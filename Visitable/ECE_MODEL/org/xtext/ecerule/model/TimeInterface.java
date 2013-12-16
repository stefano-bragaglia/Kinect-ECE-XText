package org.xtext.ecerule.model;

import org.xtext.ecerule.model.ExpressionInterface;

public interface TimeInterface {

	public void setAllenOp(String allenOp);
	
	public void setTimeValue(long timeValue);
	
	public String getAllenOp();

	public long getTimeValue();
	
	//public double getTimeValue();

}
