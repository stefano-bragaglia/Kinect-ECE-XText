package org.visitor;

import java.util.ArrayList;
import java.util.List;

import org.model.Event;
import org.model.ExpContext;
import org.model.Time;
import org.model.TimeInterface;
import org.model.conditions.relations.LessDescr;
import org.model.conditions.relations.MoreDescr;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;
import org.model.expressions.operations.MinusDescr;
import org.model.expressions.operations.PlusDescr;
import org.support.EceStatement;

public class BeforeVisitor implements Visitor{
	
	private List<String> beforeList = new ArrayList();
	
	public String getBefore() {
		String beforePattern="";
		for (int i= 0; i< beforeList.size(); i++){
			beforePattern = beforePattern + beforeList.get(i);
			if(i<beforeList.size()-1){
				beforePattern = beforePattern + "&&";
			}
			
		}
		if(beforePattern.equals("")){
			return null;
		}
		else{
			return beforePattern;
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
		String beforePattern="";
		if(time.getAllenOp().equals("before")){
			beforePattern = beforePattern.concat("(clock.getCurrentTime()<$tsmp+"+time.getTimeValue()+" && clock.getCurrentTime()>$tsmp)");
			beforeList.add(beforePattern);
		}
		
	}



	@Override
	public void visit(EceStatement eceStatement) {
		// TODO Auto-generated method stub
		
	}

}
