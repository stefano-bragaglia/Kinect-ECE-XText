package org.xtext.ecerule.model;

public interface ModelInterface {

	public void add(String statementName, StatementInterface statement);

	// public abstract void clear();

	// public Session getSession(Type type);

	public void remove(String statementName);

}