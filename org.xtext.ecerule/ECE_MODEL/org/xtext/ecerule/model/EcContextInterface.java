package org.xtext.ecerule.model;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.ExpressionInterface;

public interface EcContextInterface {

	public void setFluentName(String fluentName);

	public void setValueExpr(ExpressionInterface valueExpr);

	public void setCondition(ConditionInterface condition);

	public void setTimeExpr(ExpressionInterface timeExpr);

}
