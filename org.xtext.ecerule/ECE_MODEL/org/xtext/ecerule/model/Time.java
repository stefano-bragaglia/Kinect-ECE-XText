package org.xtext.ecerule.model;

public class Time implements TimeInterface {

	private String allenOp;
	private int timeValue;

	
	public Time() {
		super();
	}

	public Time(String allenOp, int timeValue) {
		super();
		this.allenOp = allenOp;
		this.timeValue = timeValue;
	}

	@Override
	public void setAllenOp(String allenOp) {
		this.allenOp = allenOp;

	}

	public String getAllenOp() {
		return allenOp;
	}

	@Override
	public void setTimeValue(int timeValue) {
		this.timeValue = timeValue;

	}

	public int getTimeValue() {
		return timeValue;
	}

}
