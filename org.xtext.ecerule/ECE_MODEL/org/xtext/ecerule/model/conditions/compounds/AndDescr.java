/**
 * 
 */
package org.xtext.ecerule.model.conditions.compounds;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.conditions.CompoundDescr;

/**
 * @author stefano
 *
 */
public class AndDescr extends CompoundDescr implements ConditionInterface {

	
	public AndDescr(ConditionInterface cond1, ConditionInterface cond2) {
		super(cond1, cond2);
	}

	public boolean validate() {
		ConditionInterface cond1 = super.getCond1();
		ConditionInterface cond2 = super.getCond2();
		boolean value1= cond1.validate();
		boolean value2 = cond2.validate();
		if(value1 && value2){
			return true;
		}
		else{
			return false;
		}
	}
	
	

}
