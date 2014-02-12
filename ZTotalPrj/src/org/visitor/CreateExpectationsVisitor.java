package org.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.model.ConditionInterface;
import org.model.Event;
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


public class CreateExpectationsVisitor implements Visitor {

	private List<String> expectationList = new ArrayList();
	Random random = new Random();
	
	public String getExpectations() {
		String expectations="";
		for (String expct : expectationList){
			expectations = expectations + expct + "\n\n\n";
		}
		return expectations;
	}

	public List<String> getExpectationList() {
		return expectationList;
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
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(MultDescr multDescr) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void visit(Statement statement) {
		
		if(statement.getExpContextList().size()!=0){ //se è uno statement EXP
			
			Event ev = (Event) statement.getEvent();
			String evName = ev.getEventName(); //event name
			
			ExpContext expCtx = (ExpContext) statement.getExpContextList().get(0); //ciclo for se ci sono più expContext in uno statement
			
			String allenOp = expCtx.getTime().getAllenOp();
			long timeVal = expCtx.getTime().getTimeValue();
			
			ConditionInterface fCond = expCtx.getFinalCondition();
			TransfCondiVisitor tcv = new TransfCondiVisitor();
			fCond.accept(tcv);
			List<String> refList = tcv.getReferenceList();
			String fCondExpr = tcv.getExprPattern();
			
			String actionOnFulf = expCtx.getActionOnFulf().getAction();
			
			
			//fulfilment
			String exp = "rule \"Evaluate FULF Expectation"+evName+"\"\n";
			exp = exp.concat("when\n");
				
			
				exp = exp.concat("\t$evframe: EventFrame() \n");
				exp = exp.concat("\t$exp: Expectation"+evName+"(state==-1, this before [0, "+timeVal+"] $evframe)  \n\n");
				
				for(String flName: refList){
					exp = exp.concat("\t$fl_"+flName+": "+flName+"()  \n");
					exp = exp.concat("\t$s_"+flName+": Sample(fluent==$fl_"+flName+")  \n"); 
				}
				
				exp = exp.concat("\n\teval("+fCondExpr+")  \n");
				
				
			exp = exp.concat("then\n");
			
			
				exp = exp.concat("\tretract($evframe); \n");
				exp = exp.concat("\tretract($exp); \n\n");
				
				exp = exp.concat("\tSystem.out.println(\"Expectation FULFILLED\");    \n");
				exp = exp.concat("\t"+actionOnFulf+" ef = new "+actionOnFulf+"();  \n");
				exp = exp.concat("\tinsert(ef);  \n");
			
				
			exp = exp.concat("end\n");
			
			
			expectationList.add(exp);
			
			
		}
	}

	@Override
	public void visit(EceStatement eceStatement) {
		// TODO Auto-generated method stub
		
	}


	


}
