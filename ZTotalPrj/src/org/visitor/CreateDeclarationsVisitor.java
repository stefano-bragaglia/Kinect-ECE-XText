package org.visitor;

import java.util.ArrayList;
import java.util.List;

import org.model.ActionAftExpectEval;
import org.model.ConditionInterface;
import org.model.EcContext;
import org.model.EcContextInterface;
import org.model.Event;
import org.model.ExpContext;
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


public class CreateDeclarationsVisitor implements Visitor {

	private List<String> declarationsList = new ArrayList();
	private List<String> declNamesList = new ArrayList<String>();
	
	public String getDeclarations() {
		String declarations="";
		for (String decl : declarationsList){
			declarations = declarations + decl + "\n\n\n";
		}
		return declarations;
	}

	public List<String> getDeclarationsList() {
		return declarationsList;
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

	// 1) dichiarazioni di eventi e loro parametri
	public void visit(Event event) {
		String eventName = event.getEventName();
		String decl = "declare "+eventName+ " extends Event\n";
		//decl = decl.concat("\t@role(event)\n");
		decl = decl.concat("end\n");
		if(declNamesList.indexOf(eventName)==-1){ //se ancora non c'è tale dichiarazione
			declNamesList.add(eventName);
			declarationsList.add(decl);
		}
		
		/*
		if(event.getEventFeatureList().size()!=0){
			String paramName = event.getEventFeatureList().get(0);
			decl = "declare "+paramName+ " extends Fluent\n";
			decl = decl.concat("end\n");
			if(declNamesList.indexOf(paramName)==-1){ //se ancora non c'è tale dichiarazione
				declNamesList.add(paramName);
				declarationsList.add(decl);	
			}
		}*/
		
	}

	public void visit(ExpContext expContext) {
		
		
		/*
		ConditionInterface finalCondition = expContext.getFinalCondition();
		TransfParamVisitor tpv = new TransfParamVisitor();
		finalCondition.accept(tpv);
		String decl = tpv.getParamFluentDecl();
		declarationsList.add(decl);
		
		String actionOnFulf = expContext.getActionOnFulf().getAction();
		decl = "declare "+actionOnFulf+" extends InternalEvent\n";
		decl = decl.concat("end\n");
		if(declNamesList.indexOf(actionOnFulf)==-1){ //se ancora non c'è tale dichiarazione
			declNamesList.add(actionOnFulf);
			declarationsList.add(decl);	
		}
		
		String actionOnViol = expContext.getActionOnViol().getAction();
		decl = "declare "+actionOnViol+" extends InternalEvent\n";
		decl = decl.concat("end\n");
		if(declNamesList.indexOf(actionOnViol)==-1){ //se ancora non c'è tale dichiarazione
			declNamesList.add(actionOnViol);
			declarationsList.add(decl);	
		}
		*/
	}

	public void visit(Time time) {
		// TODO Auto-generated method stub
		
	}

	public void visit(EceStatement eceStatement) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(MultDescr multDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Statement statement) {
		
		// 2) dichiarazione di fluenti (inclusi i parametri degli eventi)
		// e inserimento dei sample relativi
		Event ev = (Event) statement.getEvent();
		List<String> params = ev.getEventFeatureList();
		for(String par: params){
			if(! declNamesList.contains(par)){
				String decl = "declare "+par+ " extends Fluent \n";
				decl=decl.concat("end\n\n");
				
				decl=decl.concat("rule \"Insert fluent e sample "+par+"\" \n"); 
				decl=decl.concat("when\n");
				decl=decl.concat("then\n");
					decl=decl.concat("\t"+par+" f = new "+par+"();  \n");	
					decl=decl.concat("\tinsert(f);  \n");
					decl=decl.concat("\tSample s = new Sample(); \n");
					decl=decl.concat("\ts.setFluent(f); \n");
					decl=decl.concat("\tinsert(s);  \n");
				decl=decl.concat("end\n");
				
				
				declNamesList.add(par);
				declarationsList.add(decl);
				
			}
		}
		
		List<EcContextInterface> ecContextList = statement.getEcContextList();
		FindFluentEcVisitor ffecv = new FindFluentEcVisitor();
		for(EcContextInterface ecCtxI: ecContextList ){
			EcContext ecCtx = (EcContext) ecCtxI;
			Fluent fluent = (Fluent) ecCtx.getFluentList().get(0);
			fluent.accept(ffecv);
		}
		List<String> fluentList = ffecv.getFluentList();
		for(String fl:fluentList){
			if(! declNamesList.contains(fl)){
				
				String decl = "declare "+fl+ " extends Fluent \n";
				decl=decl.concat("end\n\n");
				
				decl=decl.concat("rule \"Insert fluent e sample "+fl+"\" \n"); 
				decl=decl.concat("when\n");
				decl=decl.concat("then\n");
					decl=decl.concat("\t"+fl+" f = new "+fl+"();  \n");	
					decl=decl.concat("\tinsert(f);  \n");
					decl=decl.concat("\tSample s = new Sample(); \n");
					decl=decl.concat("\ts.setFluent(f); \n");
					decl=decl.concat("\tinsert(s);  \n");
				decl=decl.concat("end\n");
				
				
				declNamesList.add(fl);
				declarationsList.add(decl);
				
			}
		}
		
		// 3) dichiarazione delle aspettavive
		if(statement.getExpContextList().size()!=0){
			String expectationName = "Expectation"+statement.getEvent().getEventName();
			if(! declNamesList.contains(expectationName)){
				
				String decl = "declare "+expectationName+ " extends Event \n";
					decl=decl.concat("\tstate: int //-1 pending, 0 violated, 1 fulfilled   \n");
				decl=decl.concat("end\n\n");
				
				declNamesList.add(expectationName);
				declarationsList.add(decl);
			}
			
		}
		
		
		
		
	}

	@Override
	public void visit(Fluent fluent) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	




}
