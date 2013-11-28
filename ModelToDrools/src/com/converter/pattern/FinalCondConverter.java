package com.converter.pattern;

import org.xtext.ecerule.model.ConditionInterface;

public class FinalCondConverter {

	private ConditionInterface cond;
	private String outputPattern;

	public ConditionInterface getCond() {
		return cond;
	}

	public void setCond(ConditionInterface cond) {
		this.cond = cond;
	}

	public String getOutputPattern() {
		return outputPattern;
	}

	public FinalCondConverter(ConditionInterface cond){
		this.cond=cond;
	}
	
	public String getPattern(){
		String out="";
		out = out.concat("$fl: Fluent(name=\"Peso\", value<100)");
		
		
		System.out.println("PATTERN FINALCOND----->  "+out);
		return out;		
	}
}
