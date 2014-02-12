package org.visitor;

import org.model.Event;
import org.model.EventInterface;
import org.model.ExpContext;
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

public class TransfEventVisitor implements Visitor {
	
	private String eventPattern;

	public String getOutputString(){
		return "\n"+eventPattern+"";
	}
	

	public void visit(LessDescr lessDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(MoreDescr moreDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(PlusDescr plusDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(MinusDescr minusDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(SampleDescr sampleDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(NumberDescr numberDescr) {
		// TODO Auto-generated method stub
		
	}

//	public void visit(Event event) {
//		eventPattern = "$evPtr: Event(name==\""+event.getEventName()+"\")";
//		System.out.println(eventPattern);
//	}

	
	public void visit(Event event) {
		eventPattern = "$evPtr: "+event.getEventName()+"($tsmp:time)";
		//System.out.println(eventPattern);
	}
	
	
	public void visit(Visitable object) {
		// TODO Auto-generated method stub
		
	}


	public void visit(SameDescr sameDescr) {
		// TODO Auto-generated method stub
		
	}


	public void visit(ExpContext expContext) {
		// TODO Auto-generated method stub
		
	}


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

	
}
