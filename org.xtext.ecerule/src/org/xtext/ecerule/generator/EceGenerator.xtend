package org.xtext.ecerule.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.ecerule.ece.Statement
import org.xtext.ecerule.ece.EceModel

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class EceGenerator implements IGenerator {

	override void doGenerate(Resource res, IFileSystemAccess fsa) {
		for (eceModel : res.allContents.toIterable.filter(typeof(EceModel))) {
			fsa.generateFile("gen/MainEce.java", eceModel.compile)
		}
	}

	def CharSequence compile(EceModel eceModel) {
		'''
			import org.xtext.ecerule.model.Model;
			import org.xtext.ecerule.model.Statement;
			import org.xtext.ecerule.model.Event;
			
			public class MainEce {
					
				Model model = new Model();
					//PER OGNI STATEMENT
					«FOR stm : eceModel.statements» 
						Statement statement = new Statement();
						Event event = new Event();
						String eventName = "«stm.event.eventName»";
						event.setEventName(eventName);
						«FOR feature : stm.event.params»
							event.addEventFeature(«feature.name»);
						«ENDFOR»
						statement.setEvent(event);
						
						
						
						
						
						
						
						
						
						
						
						//AGGIUNGO LO STM AL MODEL
						model.add("Stm«stm.event.eventName»", statement);
					«ENDFOR»
					
					
			}
				
				
		'''
	}

}
