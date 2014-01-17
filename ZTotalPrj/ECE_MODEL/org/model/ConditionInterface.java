package org.model;

import org.visitor.Visitable;




/**
 * @author stefano
 * 
 */
public interface ConditionInterface extends Visitable {

	/**
	 * @param parameters
	 * @return
	 */
	public boolean validate(String[] parameters);
	public boolean validate();

}
