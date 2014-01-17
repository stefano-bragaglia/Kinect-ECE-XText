package org.xtext.ecerule.model;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.ExpressionInterface;

public class EcContext implements EcContextInterface{
	private String fluentName;
	private ExpressionInterface valueExpr;
	private ConditionInterface condition;
	private ExpressionInterface timeExpr;

	public String getFluentName() {
		return fluentName;
	}

	public void setFluentName(String fluentName) {
		this.fluentName = fluentName;
	}

	public ExpressionInterface getValueExpr() {
		return valueExpr;
	}

	public void setValueExpr(ExpressionInterface valueExpr) {
		this.valueExpr = valueExpr;
	}

	public ConditionInterface getCondition() {
		return condition;
	}

	public void setCondition(ConditionInterface condition) {
		this.condition = condition;
	}

	public ExpressionInterface getTimeExpr() {
		return timeExpr;
	}

	public void setTimeExpr(ExpressionInterface timeExpr) {
		this.timeExpr = timeExpr;
	}

}
