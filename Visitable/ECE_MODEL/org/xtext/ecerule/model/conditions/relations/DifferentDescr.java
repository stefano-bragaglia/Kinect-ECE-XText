/**
 * 
 */
package org.xtext.ecerule.model.conditions.relations;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.ExpressionInterface;
import org.xtext.ecerule.model.conditions.RelationDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;

/**
 * @author stefano
 * 
 */
public class DifferentDescr extends RelationDescr implements ConditionInterface {

	/**
	 * @param exp1
	 * @param exp2
	 */
	public DifferentDescr(ExpressionInterface exp1, ExpressionInterface exp2) {
		super(exp1, exp2);
	}
	
public boolean validate(){
		
		NumberDescr nd1 = (NumberDescr)super.getExp1();
		NumberDescr nd2 = (NumberDescr)super.getExp2();
		double value1= nd1.validate();
		double value2 = nd2.validate();
		
		return value1!=value2;
	}

}
