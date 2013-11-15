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
		on Start set Seduto to 0 ;
		on SiAlza expect Seduto == 1 after 10 ;
		'''.parse.assertNoErrors
	}
	


	@Test def void testGeneratedCode() {
		'''
		on Start set Seduto to 0 ;
		on SiAlza expect Seduto == 1 after 10 ;
		'''.assertCompilesTo(
		'''
import org.xtext.ecerule.model.*;

public class MainEce {
	public static void main (String[] args) {	
		Model model = new Model();
	Statement statement = new Statement();
Event event = new Event();
String eventName = "BilanciaMisuraEasy";
event.setEventName(eventName);
statement.setEvent(event);
 								

ExpContext expContext = new ExpContext();
//default compileCond			//default compileCond							
statement.addExpContext(expContext);

		

							model.add("StmBilanciaMisuraEasy", statement);
		
	}	
}
		''')
	}

}
