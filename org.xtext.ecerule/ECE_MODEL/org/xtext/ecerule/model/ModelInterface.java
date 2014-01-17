package org.xtext.ecerule.model;

import org.xtext.ecerule.model.StatementInterface;

public interface ModelInterface {

	public void add(String statementName, StatementInterface statement);

	// public abstract void clear();

	// public Session getSession(Type type);

	public void remove(String statementName);

}