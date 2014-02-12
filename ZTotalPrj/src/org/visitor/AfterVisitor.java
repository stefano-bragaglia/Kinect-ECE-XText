package org.visitor;

import java.util.ArrayList;
import java.util.List;

import org.model.Event;
import org.model.ExpContext;
import org.model.Statement;
import org.model.Time;
import org.model.TimeInterface;
import org.model.conditions.relations.LessDescr;
import org.model.conditions.relations.MoreDescr;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;
import org.model.expressions.operations.MinusDescr;
import org.model.expressions.operations.MultDescr;
import org.model.expressions.operations.PlusDescr;
import org.support.EceStatement;

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
		if(afterPattern.equals("")){
			return null;
		}
		else{
			return afterPattern;
		}
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
