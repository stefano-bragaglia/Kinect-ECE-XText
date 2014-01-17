package org.xtext.ecerule.model;

import org.gradle.Visitable;


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
