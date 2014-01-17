package org.model;

import org.visitor.Visitable;
import org.visitor.Visitor;


public interface ExpressionInterface extends Visitable{

	/**
	 * @param parameters
	 * @return
	 */
	public boolean validate(String[] parameters);
	public double validate();
	void accept(Visitor visitor);
	
	

}