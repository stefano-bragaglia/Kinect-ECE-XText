package com.rules.generationrules;

import org.xtext.ecerule.model.ConditionInterface;

//Classe che gestisce l'aspettativa in Drools (non nel Model)
public class Expectation {

	ConditionInterface finalCondition;
	int expeTimeFC; // tempo al quale verificare la finalCondition
	boolean success; // finalCondition soddisfatta o violata
	boolean evaluated; // finalCondition valutata o ancora da valutare

	public Expectation(ConditionInterface finalCondition, int expTimeFC) {
		super();
		this.finalCondition = finalCondition;
		this.expeTimeFC = expTimeFC;
		this.success = false;
		this.evaluated = false;
	}

	public ConditionInterface getFinalCondition() {
		return finalCondition;
	}

	public void setFinalCondition(ConditionInterface finalCondition) {
		this.finalCondition = finalCondition;
	}

	public int getExpeTimeFC() {
		return expeTimeFC;
	}

	public void setExpeTimeFC(int expTimeFC) {
		this.expeTimeFC = expTimeFC;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess() {
		this.success = true;
		this.evaluated = true;
	}

	public void setFailure() {
		this.success = false;
		this.evaluated = true;
	}

	public boolean isEvaluated() {
		return evaluated;
	}

}
