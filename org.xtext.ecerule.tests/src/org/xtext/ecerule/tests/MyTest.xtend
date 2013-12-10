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
		on StartEv set SedutoFl to 1 ;
		on AlzatoEv expect SedutoFl == 0;
		'''.parse.assertNoErrors
	}
	


	@Test def void testGeneratedCode() {
		'''
		on StartEv set SedutoFl to 1 ;
		on AlzatoEv expect SedutoFl == 0;
		'''.assertCompilesTo(
		'''
import org.xtext.ecerule.model.*;

public class MainEce {
	
	public Model getModel() {	
		
		public Statement statement;
		public Event event;
		public String eventName;
		public ExpressionDescr exprContainer;
		public ConditionDescr condContainer;
		public ExpContext expContext;
		public Time time;
		
		Model model = new Model();
		
		
		statement = new Statement();
		
		event = new Event();
		eventName = "StartEv";
		event.setEventName(eventName);
		statement.setEvent(event);
		
 		ecContext = new EcContext();
		statement.addEcContext(ecContext);

		model.add("StmStartEv", statement);
		
		
		statement = new Statement();
		
		event = new Event();
		eventName = "AlzatoEv";
		event.setEventName(eventName);
		statement.setEvent(event);
		 								
		expContext = new ExpContext();
		condContainer = new SameDescr(new SampleDescr("SedutoFl") ,new NumberDescr(0));
		expContext.setFinalCondition(condContainer);
		statement.addExpContext(expContext);

		model.add("StmAlzatoEv", statement);
		
		
		
		return model;
	}	
}
		''')
	}

}
