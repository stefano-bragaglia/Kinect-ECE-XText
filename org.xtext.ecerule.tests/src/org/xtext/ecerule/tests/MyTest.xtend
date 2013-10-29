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

//import  org.eclipse.xtext.xbase.compiler.CompilationTestHelper


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EceInjectorProvider))


class MyTest {
	
	@Inject extension ParseHelper<EceModel>
	@Inject extension ValidationTestHelper
	@Inject extension CompilationTestHelper

	@Test
	def void testParsing() {
		'''
		on BilanciaMisuraEasy(pesata) set peso to pesata if pesata <=100, set peso to 88888 if pesata >100, expect peso == 88888 before 3600 if pesata>100;
		'''.parse.assertNoErrors
	}


	@Test def void testGeneratedCode() {
		'''
		on BilanciaMisuraEasy(pesata) set peso to pesata if pesata <=100, set peso to 88888 if pesata >100, expect peso == 88888 before 3600 if pesata>100;
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
