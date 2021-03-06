package org.gradle;

import java.util.ArrayList;
import java.util.List;

import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.Time;
import org.xtext.ecerule.model.TimeInterface;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;
import org.xtext.ecerule.model.expressions.operations.MinusDescr;
import org.xtext.ecerule.model.expressions.operations.PlusDescr;

public class AfterVisitor implements Visitor{
	
	private List<String> afterList = new ArrayList();
	
	public String getAfter() {
		String afterPattern="";
		for (int i= 0; i< afterList.size(); i++){
			afterPattern = afterPattern + afterList.get(i);
			if(i<afterList.size()-1){
				afterPattern = afterPattern + "&&";
			}
			
		}
		return afterPattern;
	}
	
	

	public void visit(Visitable object) {
		// TODO Auto-generated method stub
		
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

	public void visit(SameDescr sameDescr) {
		// TODO Auto-generated method stub
		
	}

	public void visit(Event event) {
		// TODO Auto-generated method stub
		
	}



	public void visit(Time time) {
		String afterPattern="";
		if(time.getAllenOp().equals("after")){
			afterPattern = afterPattern.concat("($tsmp<clock.getCurrentTime()-"+time.getTimeValue()+")");
			afterList.add(afterPattern);
		}
		
	}

}
