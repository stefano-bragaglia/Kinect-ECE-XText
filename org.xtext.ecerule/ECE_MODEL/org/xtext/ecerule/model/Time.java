package org.xtext.ecerule.model;


public class Time implements TimeInterface {

	private String allenOp;
	private int timeValue;
	
	@Override
	public void setAllenOp(String allenOp) {
		this.allenOp=allenOp;
		
	}

	@Override
	public void setTimeValue(int timeValue) {
		this.timeValue=timeValue;
		
	}

}
