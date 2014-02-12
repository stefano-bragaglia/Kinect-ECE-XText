package org.xtext.ecerule.tests

import javax.inject.Inject
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.eclipse.xtext.junit4.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith
import org.xtext.ecerule.EceInjectorProvider
import org.xtext.ecerule.ece.EceModel
import org.eclipse.xtext.xbase.compiler.CompilationTestHelper
import org.xtext.ecerule.ece.Event

//import  org.eclipse.xtext.xbase.compiler.CompilationTestHelper


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EceInjectorProvider))


class MyTest {
	
	@Inject extension ParseHelper<EceModel>
	@Inject extension ValidationTestHelper
	@Inject extension CompilationTestHelper

	@Test
	def void testErrorParsing() {
		'''
		on Start set LeftArm to 999, set LeftArmStrConf to 999, set LeftArmLowConf to 999, set Score to 999;
		on LeftArmStr(poseConf) set LeftArm to 1, set LeftArmStrConf to poseConf expect LeftArm==0 before 10 onFulf MyExpectationFulf;
		on LeftArmLow(poseConf) set LeftArm to 0, set LeftArmLowConf to poseConf;
		on MyExpectationFulf set Score to LeftArmStrConf * LeftArmLowConf;
		'''.parse.assertNoErrors
	}
	


	@Test def void testGeneratedCode() {
		'''
		on Start set LeftArm to 999, set LeftArmStrConf to 999, set LeftArmLowConf to 999, set Score to 999;
		on LeftArmStr(poseConf) set LeftArm to 1, set LeftArmStrConf to poseConf expect LeftArm==0 before 10 onFulf MyExpectationFulf;
		on LeftArmLow(poseConf) set LeftArm to 0, set LeftArmLowConf to poseConf;
		on MyExpectationFulf set Score to LeftArmStrConf * LeftArmLowConf;
		'''.assertCompilesTo(
		'''
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
		''')
	}

}
