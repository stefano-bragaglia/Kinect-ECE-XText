package org.model;

import org.visitor.FindFluentEcVisitor;
import org.visitor.Visitor;

public interface FluentInterface extends Visitor {

	public void setFluentName(String fluentName);
	
	public void setToExpression(ExpressionInterface expression);
	
}
