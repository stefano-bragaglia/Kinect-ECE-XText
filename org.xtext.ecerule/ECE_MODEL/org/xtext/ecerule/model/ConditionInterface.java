package org.xtext.ecerule.model;


/**
 * @author stefano
 * 
 */
public interface ConditionInterface {

	/**
	 * @param parameters
	 * @return
	 */
	public boolean validate(String[] parameters);

}
