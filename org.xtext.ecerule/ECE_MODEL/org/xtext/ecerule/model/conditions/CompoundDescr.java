/**
 * 
 */
package org.xtext.ecerule.model.conditions;

import java.util.ArrayList;
import java.util.List;

import org.xtext.ecerule.model.ConditionInterface;

/**
 * TODO forse conviene cambiare il costruttore per accettare ConditionDescr[]
 * 
 * @author stefano
 */
public abstract class CompoundDescr implements ConditionInterface {

	/**
	 * 
	 */
	private List<ConditionInterface> conditions;

	/**
	 * 
	 */
	public CompoundDescr() {
		this.conditions = new ArrayList<>();
		assert invariant() : "Illegal state in CompoundDescr()";
	}

	/**
	 * @return
	 */
	private boolean invariant() {
		return (conditions != null);
	}

	/**
	 * 
	 */
	public void clear() {
		conditions.clear();
		assert invariant() : "Illegal state in CompoundDescr.clear()";
	}

	/**
	 * @param condition
	 */
	public void add(ConditionInterface condition) {
		if (condition == null)
			throw new IllegalArgumentException(
					"Illegal 'condition' argument in CompoundDescr.add(ConditionDescr): "
							+ condition);
		conditions.add(condition);
		assert invariant() : "Illegal state in CompoundDescr.add(ConditionDescr)";
	}

	/**
	 * @param condition
	 */
	public void remove(ConditionInterface condition) {
		if (condition == null)
			throw new IllegalArgumentException(
					"Illegal 'condition' argument in CompoundDescr.remove(ConditionDescr): "
							+ condition);
		conditions.remove(condition);
		assert invariant() : "Illegal state in CompoundDescr.remove(ConditionDescr)";
	}

	/**
	 * @return
	 */
	public int size() {
		int result = conditions.size();
		assert invariant() : "Illegal state in CompoundDescr.size()";
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.bragaglia.freckles.ConditionDescr#validate(java.lang.String[])
	 */
	@Override
	public boolean validate(String[] parameters) {
		if (parameters != null)
			throw new IllegalArgumentException(
					"Illegal 'parameters' argument in CompoundDescr.validate(String[]): "
							+ parameters);
		boolean result = false;
		for (int i = 0; !result && i < conditions.size(); i++)
			result = conditions.get(i).validate(parameters);
		assert invariant() : "Illegal state in CompoundDescr.validate(String[])";
		return false;
	}

}
