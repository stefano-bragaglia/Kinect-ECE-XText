/**
 * 
 */
package org.xtext.ecerule.model.expressions.operations;

import org.xtext.ecerule.model.ExpressionInterface;
import org.xtext.ecerule.model.expressions.OperationDescr;

/**
 * @author stefano
 * 
 */
public class MinusDescr extends OperationDescr implements ExpressionInterface {

	/**
	 * @param exp1
	 * @param exp2
	 */
	public MinusDescr(ExpressionInterface exp1, ExpressionInterface exp2) {
		super(exp1, exp2);
		assert invariant() : "Illegal state in MinusDescr(ExpressionDescr, ExpressionDescr)";
	}

	/**
	 * Invariant check against the internal state.
	 * 
	 * @return <code>true</code> if this instance's state is consistent,
	 *         <code>false</code> otherwise
	 */
	private boolean invariant() {
		return (true);
	}

}