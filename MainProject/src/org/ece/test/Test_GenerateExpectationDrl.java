package org.ece.test;

import java.io.FileNotFoundException;

import org.ece.generation.GenerateExpectationDrl;
import org.xtext.ecerule.model.ConditionInterface;
import org.xtext.ecerule.model.Event;
import org.xtext.ecerule.model.ExpContext;
import org.xtext.ecerule.model.ExpressionInterface;
import org.xtext.ecerule.model.Model;
import org.xtext.ecerule.model.Statement;
import org.xtext.ecerule.model.Time;
import org.xtext.ecerule.model.conditions.relations.SameDescr;
import org.xtext.ecerule.model.expressions.NumberDescr;
import org.xtext.ecerule.model.expressions.SampleDescr;

public class Test_GenerateExpectationDrl {

	public static void main(String[] args) throws FileNotFoundException {
	
		// ------------------------------------------------------
		Statement statement;
		Event event;
		String eventName;
		ExpressionInterface exprContainer;
		ConditionInterface condContainer;
		// EcContext ecContext;
		ExpContext expContext;
		Time time;

		Model model = new Model();

		statement = new Statement();
		event = new Event();
		eventName = "AlzatoEv";
		event.setEventName(eventName);
		statement.setEvent(event);

		expContext = new ExpContext();

		condContainer = new SameDescr(new SampleDescr("SedutoFl"),
				new NumberDescr(0));
		expContext.setFinalCondition(condContainer);

		statement.addExpContext(expContext);

		model.add("StmAlzatoEv", statement);
		
		//Model model = MainEce.getModel(); //recupero il model generato dall'editor
		
		
		GenerateExpectationDrl ged = new GenerateExpectationDrl(model);
		ged.generateDRL("src/org/ece/rules/SingleGenerated.drl");
		
		
	}

}
