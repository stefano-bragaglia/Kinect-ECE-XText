package org.model;

import java.util.HashMap;
import java.util.Map;

import org.model.ModelInterface;
import org.model.StatementInterface;



public class Model implements ModelInterface {

	private Map<String, StatementInterface> statements = new HashMap();
	
	public void add(String statementName, StatementInterface statement) {
		this.statements.put(statementName, statement);
		
	}

	public void remove(String statementName) {
		this.statements.remove(statementName);
		
	}

	public Map<String, StatementInterface> getStatements() {
		return statements;
	}
	
	

	
}
