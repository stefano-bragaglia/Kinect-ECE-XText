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
//import  org.eclipse.xtext.xbase.compiler.CompilationTestHelper


@RunWith(typeof(XtextRunner))
@InjectWith(typeof(EceInjectorProvider))


class MyTest {
	
	@Inject extension ParseHelper<EceModel>
	@Inject extension ValidationTestHelper
//	@Inject extension CompilationTestHelper

	@Test
	def void testParsingLite() {
		'''
			on EventoPompaApre set FluenteLivello to 52, expect (true);
		'''.parse.assertNoErrors
	}

	@Test
	def void testParsingSimplePro() {
		'''
			on BilanciaMisura (lettura, tara) 	set peso to (lettura-tara)*100 in 26 if tara<=16 ,
										set totPesate to [totPesate] + (lettura-tara)*100 if (lettura-tara)*100>60,
										expect [totPesate] >= (lettura-tara)*100 finishes 264 if [totPesate]>=0 ;
		'''.parse.assertNoErrors
	}

//	@Test
//	def void testGeneratedCode() {
//		'''
//			on EventoPompaApre set FluenteLivello to 52, expect (true);
//		'''.assertCompilesTo(
//		'''
//		public class EventoPompaApre {
//			
//		}
//
//		''')
//	}

}
