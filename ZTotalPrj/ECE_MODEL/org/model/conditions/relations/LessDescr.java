/**
 * 
 */
package org.model.conditions.relations;

import org.model.ConditionInterface;
import org.model.ExpressionInterface;
import org.model.conditions.RelationDescr;
import org.model.expressions.NumberDescr;
import org.visitor.Visitable;
import org.visitor.Visitor;

/**
 * @author stefano
 * 
 */
public class LessDescr extends RelationDescr implements ConditionInterface, Visitable {

	/**
	 * @param exp1
	 * @param exp2
	 */
	public LessDescr(ExpressionInterface exp1, ExpressionInterface exp2) {
		super(exp1, exp2);
	}
	
	public boolean validate(){
		
		NumberDescr nd1 = (NumberDescr)super.getExp1();
		NumberDescr nd2 = (NumberDescr)super.getExp2();
		double value1= nd1.validate();
		double value2 = nd2.validate();
		
		return value1<value2;
	}
	
	public void accept(Visitor visitor) {
		super.getExp1().accept(visitor);
		visitor.visit(this);
		super.getExp2().accept(visitor);
		
	}

	

}
