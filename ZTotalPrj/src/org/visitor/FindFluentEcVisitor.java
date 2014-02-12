package org.visitor;

import java.util.ArrayList;
import java.util.List;

import org.model.Event;
import org.model.Fluent;
import org.model.Statement;
import org.model.Time;
import org.model.conditions.relations.LessDescr;
import org.model.conditions.relations.MoreDescr;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;
import org.model.expressions.operations.MinusDescr;
import org.model.expressions.operations.MultDescr;
import org.model.expressions.operations.PlusDescr;
import org.support.EceStatement;

public class FindFluentEcVisitor implements Visitor{

	
	private List<String> fluentList = new ArrayList<String>();
	

	public List<String> getFluentList() {
		return fluentList;
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
	public void visit(MultDescr multDescr) {
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
	public void visit(Statement statement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Fluent fluent) {
		String flName= fluent.getFluentName();
			fluentList.add(flName);	
		
		
	}

}
