/**
 * 
 */
package org.xtext.ecerule.model.conditions;

import org.xtext.ecerule.model.ConditionInterface;

/**
 * @author stefano
 * 
 */
public class NotDescr implements ConditionInterface {

	/**
	 * 
	 */
	private ConditionInterface condition;

	/**
	 * @param condition
	 */
	public NotDescr(ConditionInterface condition) {
		if (condition == null)
			throw new IllegalArgumentException(
					"Illegal 'condition' argument in NotDescr(ConditionDescr): "
							+ condition);
		this.condition = condition;
		assert invariant() : "Illegal state in NotDescr(ConditionDescr)";
	}

	/**
	 * @return
	 */
	public ConditionInterface getCondition() {
		assert invariant() : "Illegal state in NotDescr.getCondition()";
		return condition;
	}

	/**
	 * @return
	 */
	private boolean invariant() {
		return (condition != null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.bragaglia.freckles.ConditionDescr#validate(java.lang.String[])
	 */
	@Override
	public boolean validate(String[] parameters) {
		if (parameters == null)
			throw new IllegalArgumentException(
					"Illegal 'parameters' argument in NotDescr.validate(String[]): "
							+ parameters);
		boolean result = condition.validate(parameters);
		assert invariant() : "Illegal state in NotDescr.validate(String[])";
		return result;
	}

	@Override
	public boolean validate() {
		ConditionInterface cond = this.getCondition();
		boolean value= cond.validate();
		return !value;
	}

}
