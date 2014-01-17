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
public class PlusDescr extends OperationDescr implements ExpressionInterface, Visitable {

	/**
	 * @param exp1
	 * @param exp2
	 */
	public PlusDescr(ExpressionInterface exp1, ExpressionInterface exp2) {
		super(exp1, exp2);
		assert invariant() : "Illegal state in PlusDescr(ExpressionDescr, ExpressionDescr)";
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
		
		return value1+value2;
	}

	@Override
	public void accept(Visitor visitor) {
		super.getExp1();
		
		
		
		
		visitor.visit(this);
		
	}

}
