/**
 * 
 */
package org.xtext.ecerule.model.expressions;

import org.xtext.ecerule.model.ExpressionInterface;

/**
 * @author stefano
 * 
 */
public class ParameterDescr implements ExpressionInterface {

	/**
	 * 
	 */
	private String name;

	/**
	 * @param name
	 */
	public ParameterDescr(String name) {
		if (name == null || (name = name.trim()).isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'name' argument in Parameter(String): " + name);
		this.name = name;
		assert invariant() : "Illegal state in Parameter(String)";
	}

	/**
	 * @return
	 */
	private boolean invariant() {
		return (name != null && !name.isEmpty());
	}

	/**
	 * @return
	 */
	public String getName() {
		assert invariant() : "Illegal state in Parameter.getName()";
		return name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.bragaglia.freckles.Expression#validate(java.lang.String[])
	 */
	public boolean validate(String[] parameters) {
		if (parameters == null)
			throw new IllegalArgumentException(
					"Illegal 'parameters' argument in Parameter.validate(String[]): "
							+ parameters);
		boolean result = false;
		for (int i = 0; !result && i < parameters.length; i++)
			result = name.equals(parameters[i]);
		assert invariant() : "Illegal state in Parameter.validate()";
		return result;
	}

	public double validate() {
		// TODO Auto-generated method stub
		return 0;
	}

}
