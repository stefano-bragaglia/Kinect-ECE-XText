/**
 * 
 */
package org.model.conditions.relations;

import org.model.ConditionInterface;
import org.model.ExpressionInterface;
import org.model.conditions.RelationDescr;
import org.model.expressions.NumberDescr;

/**
 * @author stefano
 * 
 */
public class LessEqualsDescr extends RelationDescr implements ConditionInterface {

	/**
	 * @param exp1
	 * @param exp2
	 */
	public LessEqualsDescr(ExpressionInterface exp1, ExpressionInterface exp2) {
		super(exp1, exp2);
	}
	
	public boolean validate(){
		
		NumberDescr nd1 = (NumberDescr)super.getExp1();
		NumberDescr nd2 = (NumberDescr)super.getExp2();
		double value1= nd1.validate();
		double value2 = nd2.validate();
		
		return value1<=value2;
	}

}
