package org.model;

import org.model.conditions.relations.LessDescr;
import org.model.conditions.relations.MoreDescr;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;
import org.model.expressions.operations.MinusDescr;
import org.model.expressions.operations.MultDescr;
import org.model.expressions.operations.PlusDescr;
import org.support.EceStatement;
import org.visitor.FindFluentEcVisitor;
import org.visitor.Visitable;
import org.visitor.Visitor;

public class Fluent implements FluentInterface, Visitable {
	private String fluentName;
	private ExpressionInterface toExpression;
	
	public Fluent(String fluentName){
		this.fluentName=fluentName;	
	}
	
	@Override
	public void setFluentName(String fluentName) {
		this.fluentName=fluentName;
	}

	public String getFluentName() {
		return fluentName;
	}

	public ExpressionInterface getToExpression() {
		return toExpression;
	}

	@Override
	public void setToExpression(ExpressionInterface expression) {
		this.toExpression=expression;
		
	}
	
	
	
	
	
	@Override
	public void visit(Visitable object) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(LessDescr lessDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MoreDescr moreDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(PlusDescr plusDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MinusDescr minusDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SampleDescr sampleDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(NumberDescr numberDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SameDescr sameDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Event event) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Time time) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(EceStatement eceStatement) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(MultDescr multDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Statement statement) {
		// TODO Auto-generated method stub
		
	}

	
	

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
		
	}


	

}
