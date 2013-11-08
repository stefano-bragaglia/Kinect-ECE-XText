/**
 * 
 */
package org.xtext.ecerule.model.conditions;

import java.util.ArrayList;
import java.util.List;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.ExpressionInterface;

/**
 * TODO forse conviene cambiare il costruttore per accettare ConditionDescr[]
 * 
 * @author stefano
 */
public abstract class CompoundDescr implements ConditionInterface {

	/**
	 * 
	 */
	private ConditionInterface cond1;

	/**
	 * 
	 */
	private ConditionInterface cond2;

	/**
	 * 
	 */
	
	
	public CompoundDescr(ConditionInterface cond1, ConditionInterface cond2) {
		if (cond1 == null)
			throw new IllegalArgumentException(
					"Illegal 'cond1' exception in CompoundDescr(ConditionInterface, ConditionInterface): "
							+ cond1);
		if (cond2 == null)
			throw new IllegalArgumentException(
					"Illegal 'cond2' exception in CompoundDescr(ConditionInterface, ConditionInterface): "
							+ cond2);
		this.cond1 = cond1;
		this.cond2 = cond2;
		assert invariant() : "Illegal state in CompoundDescr(ConditionInterface, ConditionInterface)";
	}

	/**
	 * @return
	 */
	private boolean invariant() {
		return (cond1 != null && cond2 != null);
	}

	

	
	public ConditionInterface getCond1() {
		return cond1;
	}

	public void setCond1(ConditionInterface cond1) {
		this.cond1 = cond1;
	}

	public ConditionInterface getCond2() {
		return cond2;
	}

	public void setCond2(ConditionInterface cond2) {
		this.cond2 = cond2;
	}

	
	@Override
	public boolean validate(String[] parameters) {
		if (parameters == null)
			throw new IllegalArgumentException(
					"Illegal 'parameters' argument in CompoundDescr.validate(String[]): "
							+ parameters);
		boolean result = cond1.validate(parameters) && cond2.validate(parameters);
		assert invariant() : "Illegal state in CompoundDescr.validate(String[])";
		return result;
	}

}
