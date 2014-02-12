package org.ece.include;
import org.model.*;
import org.model.conditions.*;
import org.model.conditions.compounds.*;
import org.model.conditions.relations.*;
import org.model.expressions.*;
import org.model.expressions.operations.*;

public class MainEce {

	public static Model getModel() {
		
		Statement statement;
		Event event;
		String eventName;
		ExpressionInterface exprContainer;
		ConditionInterface condContainer;
		FluentInterface fluent;
		EcContext ecContext;
		ExpContext expContext;
		Time time;

		Model model = new Model();


		statement = new Statement();

		event = new Event();
		eventName = "Start";
		event.setEventName(eventName);
		statement.setEvent(event);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArm");
		exprContainer = new NumberDescr(999);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArmStrConf");
		exprContainer = new NumberDescr(999);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArmLowConf");
		exprContainer = new NumberDescr(999);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("Score");
		exprContainer = new NumberDescr(999);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);


		model.add("Stm_Start", statement);



		statement = new Statement();

		event = new Event();
		eventName = "LeftArmStr";
		event.setEventName(eventName);
		event.addEventFeature("poseConf");
		statement.setEvent(event);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArm");
		exprContainer = new NumberDescr(1);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArmStrConf");
		exprContainer = new SampleDescr("poseConf");
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		expContext = new ExpContext();
		condContainer = new SameDescr(new SampleDescr("LeftArm"), new NumberDescr(0));
		expContext.setFinalCondition(condContainer);
		time = new Time();
		time.setAllenOp("before");
		time.setTimeValue(10);
		expContext.setTime(time);
		expContext.setActionOnFulf(new ActionAftExpectEval("MyExpectationFulf"));
		statement.addExpContext(expContext);


		model.add("Stm_LeftArmStr", statement);



		statement = new Statement();

		event = new Event();
		eventName = "LeftArmLow";
		event.setEventName(eventName);
		event.addEventFeature("poseConf");
		statement.setEvent(event);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArm");
		exprContainer = new NumberDescr(0);
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);
		
		ecContext = new EcContext();
		fluent = new Fluent("LeftArmLowConf");
		exprContainer = new SampleDescr("poseConf");
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);


		model.add("Stm_LeftArmLow", statement);



		statement = new Statement();

		event = new Event();
		eventName = "MyExpectationFulf";
		event.setEventName(eventName);
		statement.setEvent(event);
		
		ecContext = new EcContext();
		fluent = new Fluent("Score");
		exprContainer = new MultDescr(new SampleDescr("LeftArmStrConf"), new SampleDescr("LeftArmLowConf"));
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
		statement.addEcContext(ecContext);


		model.add("Stm_MyExpectationFulf", statement);




		return model;
	}	
}
