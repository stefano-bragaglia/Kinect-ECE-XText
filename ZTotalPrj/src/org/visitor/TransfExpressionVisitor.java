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

public class TransfExpressionVisitor implements Visitor{
	String paramName;
	
	List<String> sampleList = new ArrayList<String>();
	
	String expr1;
	String operator;
	String expr2;
	
	String sampleStr;
	
	
	
	
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}


	public List<String> getSampleList() {
		return sampleList;
	}


	public String getExprPattern() {
		if(sampleStr==null){
			String exprPattern = expr1 +" "+ operator +" "+ expr2;	
			return exprPattern;
		}else{
			return sampleStr;
		}
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
		this.operator="*";
		
		TransfExpressionVisitor tev1 = new TransfExpressionVisitor();
		multDescr.getExp1().accept(tev1);
		this.expr1="((long)"+tev1.getExprPattern()+")";
		
		TransfExpressionVisitor tev2 = new TransfExpressionVisitor();
		multDescr.getExp2().accept(tev2);
		this.expr2="((long)"+tev2.getExprPattern()+")";	
		
		this.sampleList.addAll(tev1.getSampleList());
		this.sampleList.addAll(tev2.getSampleList());
	}

	@Override
	public void visit(MinusDescr minusDescr) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(SampleDescr sampleDescr) {
		if(sampleDescr.getName().equals(paramName)){
			this.sampleStr="$par";
		}else{
			this.sampleStr="$s_"+sampleDescr.getName()+".getValue()";
		}
		sampleList.add(sampleDescr.getName());
	}

	@Override
	public void visit(NumberDescr numberDescr) {
		this.sampleStr=""+numberDescr.getValue();
		
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
		// TODO Auto-generated method stub
		
	}


	


}
