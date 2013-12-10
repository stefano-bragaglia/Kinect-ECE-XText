package org.gradle;

import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.ExpContextInterface;
import org.xtext.ecerule.model.conditions.relations.LessDescr;
import org.xtext.ecerule.model.conditions.relations.MoreDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;
import org.xtext.ecerule.model.expressions.operations.MinusDescr;
import org.xtext.ecerule.model.expressions.operations.PlusDescr;

public class MainTestVisit {

	public static void main(String[] args) {
	
		Event ev = new Event("PippoEvent");
		
		ConditionInterface initialCondition = new MoreDescr(new MinusDescr(new SampleDescr("Paperino"), new NumberDescr(8)), new SampleDescr("Pippo"));
		ConditionInterface finalCondition = new LessDescr(new PlusDescr(new SampleDescr("Pippo"), new SampleDescr("Pluto")), new PlusDescr(new SampleDescr("Topolino"), new NumberDescr(5)));
		ExpContextInterface expContext = new ExpContext();
		expContext.setInitialCondition(initialCondition);
		expContext.setFinalCondition(finalCondition);
		
		
		TransfEventVisitor visitor0 = new TransfEventVisitor();
		ev.accept(visitor0);
		System.out.println();
		System.out.println(visitor0.getOutputString());
		
		TransfCondiVisitor visitor1 = new TransfCondiVisitor();
		expContext.getInitialCondition().accept(visitor1);
		System.out.println();
		System.out.println(visitor1.getOutputString());
		
		TransfCondiVisitor visitor2 = new TransfCondiVisitor();
		expContext.getFinalCondition().accept(visitor2);
		System.out.println();
		System.out.println(visitor2.getOutputString());
		
		
		System.out.println("\n\n-------------------------------------\nIL PATTERN PER LE CONDITION E':");
		System.out.println(visitor0.getOutputString());
		System.out.println(visitor1.getOutputString());
		System.out.println(visitor2.getOutputString());
	}

}
