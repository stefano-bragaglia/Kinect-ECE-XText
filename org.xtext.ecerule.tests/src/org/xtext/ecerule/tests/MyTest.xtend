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
		on Start set LeftArmLowered to 1;
		on LeftArmStretched expect LeftArmLowered==1 after 10; 
		'''.parse.assertNoErrors
	}
	


	@Test def void testGeneratedCode() {
		'''
		on Start set LeftArmLowered to 1;
		on LeftArmStretched expect LeftArmLowered==1 after 10; 
		'''.assertCompilesTo(
		'''
package org.ece.include;

	import org.xtext.ecerule.model.*;
	import org.xtext.ecerule.model.conditions.*;
	import org.xtext.ecerule.model.conditions.compounds.*;
	import org.xtext.ecerule.model.conditions.relations.*;
	import org.xtext.ecerule.model.expressions.*;
	import org.xtext.ecerule.model.expressions.operations.*;
	
	public class MainEce {
		
		public static Model getModel() {	
			
			Statement statement;
			Event event;
			String eventName;
			ExpressionInterface exprContainer;
			ConditionInterface condContainer;
			//EcContext ecContext;
			ExpContext expContext;
			Time time;
			
			Model model = new Model();
			
			
		statement = new Statement();
event = new Event();
eventName = "Start";
event.setEventName(eventName);
statement.setEvent(event);
 								//ecContext = new EcContext();
//statement.addEcContext(ecContext);


													model.add("StmStart", statement);


		statement = new Statement();
event = new Event();
eventName = "BraccioAlzato";
event.setEventName(eventName);
statement.setEvent(event);
 								
expContext = new ExpContext();

//default compileCond
//TYPE OF condExpr IS---> Reference
time = new Time();
time.setAllenOp("after");
		time.setTimeValue(10);
expContext.setTime(time);

statement.addExpContext(expContext);

													model.add("StmBraccioAlzato", statement);


			
			return model;
		}	
	}
		''')
	}

}
