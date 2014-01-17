/**
 * 
 */
package org.model.expressions;

import org.model.ExpressionInterface;
import org.visitor.Visitable;
import org.visitor.Visitor;

/**
 * @author stefano
 * 
 */
public class SampleDescr implements ExpressionInterface, Visitable {

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
	//@Override
	public boolean validate(String[] parameters) {
		if (parameters == null)
			throw new IllegalArgumentException(
					"Illegal 'parameters' argument in SampleDescr.validate(String[]): "
							+ parameters);
		assert invariant() : "Illegal state in SampleDescr.validate()";
		return true;
	}



	//@Override
	public double validate() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

}
