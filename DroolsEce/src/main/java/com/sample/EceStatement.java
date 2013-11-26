package com.sample;

public class EceStatement {
	private String eventPattern;
	private String initialCondition;
	private String finalCondition;
	private String codeFulf;
	private String codeViol;

	public EceStatement(String eventPattern, String initialCondition,
			String finalCondition, String codeFulf, String codeViol) {
		super();
		this.eventPattern = eventPattern;
		this.initialCondition = initialCondition;
		this.finalCondition = finalCondition;
		this.codeFulf = codeFulf;
		this.codeViol = codeViol;
	}

	public EceStatement() {
		
	}

	public String getEventPattern() {
		return eventPattern;
	}

	public void setEventPattern(String eventPattern) {
		this.eventPattern = eventPattern;
	}

	public String getInitialCondition() {
		return initialCondition;
	}

	public void setInitialCondition(String initialCondition) {
		this.initialCondition = initialCondition;
	}

	public String getFinalCondition() {
		return finalCondition;
	}

	public void setFinalCondition(String finalCondition) {
		this.finalCondition = finalCondition;
	}

	public String getCodeFulf() {
		return codeFulf;
	}

	public void setCodeFulf(String codeFulf) {
		this.codeFulf = codeFulf;
	}

	public String getCodeViol() {
		return codeViol;
	}

	public void setCodeViol(String codeViol) {
		this.codeViol = codeViol;
	}
	
	

}
