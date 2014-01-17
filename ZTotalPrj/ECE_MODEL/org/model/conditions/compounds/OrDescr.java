/**
 * 
 */
package org.model.conditions.compounds;

import org.model.ConditionInterface;
import org.model.conditions.CompoundDescr;

/**
 * @author stefano
 *
 */
public class OrDescr extends CompoundDescr implements ConditionInterface {

	public OrDescr(ConditionInterface cond1, ConditionInterface cond2) {
		super(cond1, cond2);
	}

	@Override
	public boolean validate() {
		ConditionInterface cond1 = super.getCond1();
		ConditionInterface cond2 = super.getCond2();
		boolean value1= cond1.validate();
		boolean value2 = cond2.validate();
		if(value1 || value2){
			return true;
		}
		else{
			return false;
		}
	}

}
