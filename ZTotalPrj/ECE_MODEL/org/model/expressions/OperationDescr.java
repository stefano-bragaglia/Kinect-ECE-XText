/**
 * 
 */
package org.model.expressions;

import org.model.ExpressionInterface;

/**
 * @author stefano
 * 
 */
public abstract class OperationDescr implements ExpressionInterface {

	/**
	 * 
	 */
	private ExpressionInterface exp1;

	/**
	 * 
	 */
	private ExpressionInterface exp2;

	/**
	 * @param exp1
	 * @param exp2
	 */
	public OperationDescr(ExpressionInterface exp1, ExpressionInterface exp2) {
		if (exp1 == null)
			throw new IllegalArgumentException(
					"Illegal 'exp1' exception in Operation(Expression, Expression): "
							+ exp1);
		if (exp2 == null)
			throw new IllegalArgumentException(
					"Illegal 'exp2' exception in Operation(Expression, Expression): "
							+ exp2);
		this.exp1 = exp1;
		this.exp2 = exp2;
		assert invariant() : "Illegal state in Operation(Expression, Expression)";
	}

	/**
	 * @return
	 */
	public ExpressionInterface getExp1() {
		assert invariant() : "Illegal state in Operation.getExp1()";
		return exp1;
	}

	/**
	 * @return
	 */
	public ExpressionInterface getExp2() {
		assert invariant() : "Illegal state in Operation.getExp2()";
		return exp2;
	}

	/**
	 * @return
	 */
	private boolean invariant() {
		return (exp1 != null && exp2 != null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.bragaglia.freckles.Expression#validate(java.lang.String[])
	 */
	
	public boolean validate(String[] parameters) {
		if (parameters == null)
			throw new IllegalArgumentException(
					"Illegal 'parameters' argument in Operation.validate(String[]): "
							+ parameters);
		boolean result = exp1.validate(parameters) && exp2.validate(parameters);
		assert invariant() : "Illegal state in Operation.validate(String[])";
		return result;
	}

	
	
	
}
