package org.gradle;

import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.EventInterface;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.Time;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;
import org.xtext.ecerule.model.expressions.operations.MinusDescr;
import org.xtext.ecerule.model.expressions.operations.PlusDescr;

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
		String ref = fluentName+"($val_"+fluentName+":value);\n";
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
	
	


}
