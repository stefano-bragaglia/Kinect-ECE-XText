/**
 * 
 */
package org.xtext.ecerule.model.conditions.relations;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.ExpressionInterface;
import org.xtext.ecerule.model.conditions.RelationDescr;

/**
 * @author stefano
 * 
 */
public class MoreDescr extends RelationDescr implements ConditionInterface {

	/**
	 * @param exp1
	 * @param exp2
	 */
	public MoreDescr(ExpressionInterface exp1, ExpressionInterface exp2) {
		super(exp1, exp2);
	}

}
