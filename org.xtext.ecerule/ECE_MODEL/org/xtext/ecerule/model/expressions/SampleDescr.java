/**
 * 
 */
package org.xtext.ecerule.model.expressions;

import org.xtext.ecerule.model.ExpressionInterface;

/**
 * @author stefano
 * 
 */
public class SampleDescr implements ExpressionInterface {

	/**
	 * 
	 */
	private String name;

	/**
	 * @param name
	 */
	public SampleDescr(String name) {
		if (name == null || (name = name.trim()).isEmpty())
			throw new IllegalArgumentException(
					"Illegal 'name' argument in SampleDescr(String): " + name);
		this.name = name;
		assert invariant() : "Illegal state in SampleDescr(String)";
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
		assert invariant() : "Illegal state in SampleDescr.getName()";
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
					"Illegal 'parameters' argument in SampleDescr.validate(String[]): "
							+ parameters);
		assert invariant() : "Illegal state in SampleDescr.validate()";
		return true;
	}

	public double validate() {
		// TODO Auto-generated method stub
		return 0;
	}

}
