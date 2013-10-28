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
	def void testParsingLite() {
		'''
			on BilanciaMisuraEasy(pesata) set peso to pesata if pesata >100, set peso to 88888 if pesata <=100, expect peso == 88888 if pesata>100;
		'''.parse.assertNoErrors
	}

//	@Test
//	def void testParsingSimplePro() {
//		'''
//			on BilanciaMisura (lettura, tara) 	set peso to (lettura-tara)*100 in 26 if tara<=16 ,
//										set totPesate to [totPesate] + (lettura-tara)*100 if (lettura-tara)*100>60,
//										expect [totPesate] >= (lettura-tara)*100 finishes 264 if [totPesate]>=0 ;
//		'''.parse.assertNoErrors
//	}

	@Test def void testGeneratedCode() {
		'''
		on BilanciaMisuraEasy(pesata) set peso to pesata, expect peso == 2 if pesata<30;
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
