package com.sample;

public class EceStatement {
	private String eventPattern;
	private String initialCondition;
	private String finalConditionRef;
	private String finalConditionExp;
	private String allenExp;
	private String codeFulf;
	private String codeViol;

	public EceStatement(String eventPattern, String initialCondition,
			String finalConditionRef,String finalConditionExp, String allenExp, String codeFulf, String codeViol) {
		super();
		this.eventPattern = eventPattern;
		this.initialCondition = initialCondition;
		this.finalConditionRef = finalConditionRef;
		this.finalConditionExp = finalConditionExp;
		this.allenExp=allenExp;
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

	public String getFinalConditionRef() {
		return finalConditionRef;
	}

	public void setFinalConditionRef(String finalConditionRef) {
		this.finalConditionRef = finalConditionRef;
	}
	
	public String getFinalConditionExp() {
		return finalConditionExp;
	}

	public void setFinalConditionExp(String finalConditionExp) {
		this.finalConditionExp = finalConditionExp;
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

	public String getAllenExp() {
		return allenExp;
	}

	public void setAllenExp(String allenExp) {
		this.allenExp = allenExp;
	}
	
	

}
