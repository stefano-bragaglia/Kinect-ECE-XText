package org.gradle;

import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.EventInterface;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;
import org.xtext.ecerule.model.expressions.operations.MinusDescr;
import org.xtext.ecerule.model.expressions.operations.PlusDescr;

public class TransfEventVisitor implements Visitor {
	
	private String eventPattern;

	public String getOutputString(){
		return "\n"+eventPattern+";";
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
		eventPattern = "$evPtr: "+event.getEventName()+"";
		System.out.println(eventPattern);
	}
	
	
	public void visit(Visitable object) {
		// TODO Auto-generated method stub
		
	}


	public void visit(SameDescr sameDescr) {
		// TODO Auto-generated method stub
		
	}

	
}
