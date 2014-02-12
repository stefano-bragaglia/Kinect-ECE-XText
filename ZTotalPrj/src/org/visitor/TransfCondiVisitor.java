package org.visitor;

import java.util.ArrayList;
import java.util.List;

import org.model.Event;
import org.model.EventInterface;
import org.model.ExpContext;
import org.model.ExpressionInterface;
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

public class TransfCondiVisitor implements Visitor {
	
	private List<String> ReferenceList = new ArrayList<String>(); //lista dei fluenti usati nell' espressione
	private List<String> ExpressionList = new ArrayList<String>(); //espressione da valutare
	
	String expr1;
	String operator;
	String expr2;
	
	String ref;
	
	
	public String getExprPattern() {
		if(this.expr1!=null && this.expr2!=null){
			String exprPattern = expr1 +""+ operator +""+ expr2;	
			//System.err.println(exprPattern);
			return exprPattern;
			
		}else {
			//System.err.println(ref);
			return ref;
		}
	}
	
	public List<String> getReferenceList() {
		return ReferenceList;
	}
	public List<String> getExpressionList() {
		return ExpressionList;
	}
	public String getExpr1() {
		return expr1;
	}
	public String getOperator() {
		return operator;
	}
	public String getExpr2() {
		return expr2;
	}
	public String getRef() {
		return ref;
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
		String refName=sampleDescr.getName();
		this.ReferenceList.add(refName);
		this.ref="(double)$s_"+refName+".getValue()"; 
		
	}
	@Override
	public void visit(NumberDescr numberDescr) {
		double n = numberDescr.getValue();
		this.ref= Double.toString(n);
		
	}
	@Override
	public void visit(SameDescr sameDescr) {
		
		ExpressionInterface exp1 = sameDescr.getExp1();
		TransfCondiVisitor tcv1 = new TransfCondiVisitor();
		exp1.accept(tcv1);
		this.expr1=tcv1.getExprPattern();
		
		operator = "==";
		
		ExpressionInterface exp2 = sameDescr.getExp2();
		TransfCondiVisitor tcv2 = new TransfCondiVisitor();
		exp2.accept(tcv2);
		this.expr2=tcv2.getExprPattern();
		
		
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
	
	
	
	


}
