package org.ece.test;

import java.io.FileNotFoundException;
import java.util.HashMap;

import org.ece.generation.GenerateDeclarationsDrl;
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

import rec.Builder;
import rec.Session;
import rec.config.Mode;

public class Test_Main {

	public static void main(String[] args) throws FileNotFoundException {
		// ---------------------------------------------------
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
		// ---------------------------------------------------

		// generate declarations
		GenerateDeclarationsDrl gdd = new GenerateDeclarationsDrl(model);
		gdd.generateDRL("src/org/ece/rules/Declarations.drl");

		// generate specific expectation rules
		GenerateExpectationDrl ged = new GenerateExpectationDrl(model);
		ged.generateDRL("src/org/ece/rules/SingleGenerated.drl");

		
		Builder builder = new Builder();
		builder.setMode(Mode.FULL);
		builder.addResource("com/sample/onestep/SingleFactory.drl");

		Session session = builder.build();
		session.start();
		
//		// This event is defined in the above .drl
//		session.notify("MyEvent", new Integer(5), new HashMap<String, Object>());
//		session.dump(null);

		session.stop();

		System.out.println("Done.");

	}

}
