package org.xtext.ecerule.model;

import java.util.Map;



public class Model implements ModelInterface {

	private Map<String, StatementInterface> statements;
	
	@Override
	public void add(String statementName, StatementInterface statement) {
		this.statements.put(statementName, statement);
		
	}

	@Override
	public void remove(String statementName) {
		this.statements.remove(statementName);
		
	}

	
}
