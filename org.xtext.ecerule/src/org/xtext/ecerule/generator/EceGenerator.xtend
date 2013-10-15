
package org.xtext.ecerule.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.xtext.ecerule.ece.Statement

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class EceGenerator implements IGenerator {

	override void doGenerate(Resource res, IFileSystemAccess fsa) {
		for (stm : res.allContents.toIterable.filter(typeof(Statement))) {
			fsa.generateFile("statements/" + stm.event.eventName + ".java", stm.compile)
		}
	}
	
	
	def CharSequence compile(Statement stm){
		'''
		public class «stm.event.eventName» {
			private Event event
			
			
			
			
			
			
			
			
			public class Event {
				public Event(){
				
				}
			}
		}
		
		
		
		
		
		'''
	}
	
}
