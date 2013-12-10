package org.xtext.ecerule.model;

import org.gradle.Visitable;
import org.gradle.Visitor;

public interface ExpressionInterface extends Visitable{

	/**
	 * @param parameters
	 * @return
	 */
	public boolean validate(String[] parameters);
	public double validate();
	void accept(Visitor visitor);
	
	

}