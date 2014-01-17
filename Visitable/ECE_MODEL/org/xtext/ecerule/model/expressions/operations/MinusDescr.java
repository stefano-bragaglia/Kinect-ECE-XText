/**
 * 
 */
package org.xtext.ecerule.model.expressions.operations;

import org.gradle.Visitable;
import org.gradle.Visitor;
import org.xtext.ecerule.model.ExpressionInterface;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.OperationDescr;

/**
 * @author stefano
 * 
 */
public class MinusDescr extends OperationDescr implements ExpressionInterface, Visitable {

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
	
	public double validate(){
		
		NumberDescr nd1 = (NumberDescr)super.getExp1();
		NumberDescr nd2 = (NumberDescr)super.getExp2();
		double value1= nd1.validate();
		double value2 = nd2.validate();
		
		return value1-value2;
	}

	public void accept(Visitor visitor) {
		super.getExp1().accept(visitor);
		visitor.visit(this);
		super.getExp2().accept(visitor);
		
	}

}
