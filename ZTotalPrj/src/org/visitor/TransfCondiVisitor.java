package org.visitor;

import org.model.Event;
import org.model.EventInterface;
import org.model.ExpContext;
import org.model.Time;
import org.model.conditions.relations.LessDescr;
import org.model.conditions.relations.MoreDescr;
import org.model.conditions.relations.SameDescr;
import org.model.expressions.NumberDescr;
import org.model.expressions.SampleDescr;
import org.model.expressions.operations.MinusDescr;
import org.model.expressions.operations.PlusDescr;
import org.support.EceStatement;

public class TransfCondiVisitor implements Visitor {
	
	private StringBuilder sbReference = new StringBuilder(); //richiamo pattern Fatti
	private StringBuilder sbExpression = new StringBuilder(); //espressione da valutare
	
	public String getOutputStringReference(){
		return ""+sbReference.toString();
	}
	
	public String getOutputStringExpression(){
		return ""+"("+sbExpression.toString() +")";
	}

	public void visit(Visitable object) {
		// TODO Auto-generated method stub

	}
	

	public void visit(LessDescr lessDescr) {
		String out = "<";
		System.out.println(out);
		sbExpression.append(out);

	}
	
	public void visit(MoreDescr moreDescr) {
		String out = ">";
		System.out.println(out);
		sbExpression.append(out);

	}

	public void visit(PlusDescr plusDescr) {
		String out = "+";
		System.out.println(out);
		sbExpression.append(out);

	}
	
	public void visit(MinusDescr minusDescr) {
		String out = "-";
		System.out.println(out);
		sbExpression.append(out);

	}

	public void visit(SampleDescr sampleDescr) {
		String fluentName = sampleDescr.getName();
		String out = "$val_" + fluentName;
		System.out.println(out);
		sbExpression.append(out);
		
//		String ref = "Fluent(name==\""+fluentName+"\", $val_"+fluentName+":value);\n";
		String ref = fluentName+"(this after $evPtr, $val_"+fluentName+":value);\n";
		sbReference.append(ref);

	}

	public void visit(NumberDescr numberDescr) {
		double num = numberDescr.getValue();
		String out = "" + num;
		System.out.println(out);
		sbExpression.append(out);

	}
	
	public void visit (SameDescr sameDescr){
		String out = "==";
		System.out.println(out);
		sbExpression.append(out);
	}

	public void visit(Event event) {
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
	
	


}
