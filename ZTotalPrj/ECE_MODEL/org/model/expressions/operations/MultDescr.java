/**
 * 
 */
package org.model.expressions.operations;

import org.model.ExpressionInterface;
import org.model.expressions.NumberDescr;
import org.model.expressions.OperationDescr;

/**
 * @author stefano
 * 
 */
public class MultDescr extends OperationDescr implements ExpressionInterface {

	/**
	 * @param exp1
	 * @param exp2
	 */
	public MultDescr(ExpressionInterface exp1, ExpressionInterface exp2) {
		super(exp1, exp2);
		assert invariant() : "Illegal state in TimesDescr(ExpressionDescr, ExpressionDescr)";
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
	
	public double validate(){
		
		NumberDescr nd1 = (NumberDescr)super.getExp1();
		NumberDescr nd2 = (NumberDescr)super.getExp2();
		double value1= nd1.validate();
		double value2 = nd2.validate();
		
		return value1*value2;
	}

}
