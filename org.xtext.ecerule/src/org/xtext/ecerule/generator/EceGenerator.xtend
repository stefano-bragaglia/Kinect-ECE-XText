package org.xtext.ecerule.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.ecerule.ece.Statement
import org.xtext.ecerule.ece.EceModel
import org.xtext.ecerule.ece.ExpContext
import org.xtext.ecerule.ece.ConditionRule
import org.xtext.ecerule.ece.AllenOp
import org.xtext.ecerule.ece.AtExpr
import org.xtext.ecerule.ece.impl.ReferenceImpl
import org.xtext.ecerule.ece.impl.BoolConstantImpl
import org.xtext.ecerule.ece.impl.IntConstantImpl
import org.xtext.ecerule.ece.impl.FloatConstantImpl
import org.xtext.ecerule.ece.impl.PlusImpl
import org.xtext.ecerule.ece.impl.MinusImpl
import org.xtext.ecerule.ece.impl.MulOrDivImpl
import org.xtext.ecerule.ece.impl.NotImpl
import org.xtext.ecerule.ece.impl.ExpressionImpl
import org.xtext.ecerule.ece.impl.OrImpl
import org.xtext.ecerule.ece.impl.ComparisonImpl

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
					«««per ogni Statement»
					«FOR stm : eceModel.statements» 
						Statement statement = new Statement();
						«compileEvent(stm)» 		«««gestisco l'evento
						«compileContextsList(stm)»	«««gestisco i contesti
						
						«««aggiungo lo Statement al Model________________________________________
						model.add("Stm«stm.event.eventName»", statement);
					«ENDFOR»
					
					
			}
				
				
		'''
	}
	
	
	
	def compileEvent(Statement stm) {
		'''
		Event event = new Event();
		String eventName = "«stm.event.eventName»";
		event.setEventName(eventName);
		«FOR feature : stm.event.params»
			event.addEventFeature(«feature.name»);
		«ENDFOR»
		statement.setEvent(event);
		'''
	}
	
	
	def compileContextsList(Statement stm) {
		'''
		
«««		«FOR ecContext : stm.contextsList.ecContextsList.ecContexts»
«««	
«««		«ENDFOR»

		«FOR expContext : stm.contextsList.expContextsList.expContexts»
			«compileExpContext(expContext)»
		
		«ENDFOR»
		
		'''
	}
	
	def compileExpContext(ExpContext expContext) {
		'''
		ExpContext expContext = new ExpContext();
		«compileInitialCond(expContext.initialCondition)»	«««gestisci contizione iniziale
		«compileFinalCond(expContext.finalCondition)»		«««gestisci contizione finale
		«compileTime(expContext.allenOp, expContext.time)»	«««gestisci info temporale
		
		statement.addExpContext(expContext);
		
		'''
	}
	
	
	
	def compileInitialCond(ConditionRule cond) {
		switch cond{
			NotImpl:{
				'''
				«IF cond.expression.eClass.name.equals("Constant")» «««se ho negato una costante
					ConditionDescr _CondValue_Not = new NotDescr( «compileTerminalLeft(cond.expression as ExpressionImpl)»);
				«ELSE» «««se ho negato un'espressione
					ConditionDescr _CondValue_Not = new NotDescr(«compileRecExpr(cond.expression as ExpressionImpl)»);
				«ENDIF»
				
				expContext.setInitialCondition(_CondValue_Not);
				
				'''
			}
			
			ComparisonImpl:{
				'''
				«IF cond.op.equals(">=")»					««««>=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					ConditionDescr CondValue_MoreEquals = new MoreEqualsDescr( «compileTerminalLeft(cond.left as ExpressionImpl)»,«compileTerminalRight(cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_MoreEquals = new MoreEqualsDescr(«compileTerminalLeft(cond.left as ExpressionImpl)»,«compileRecExpr(cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_MoreEquals = new MoreEqualsDescr(«compileRecExpr(cond.left as ExpressionImpl)»,«compileRecExpr(cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				expContext.setInitialCondition(CondValue_MoreEquals);				
				
				«ELSEIF cond.op.equals("<=")» 				««««<=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					ConditionDescr CondValue_LessEquals = new LessEqualsDescr( «compileTerminalLeft(cond.left as ExpressionImpl)»,«compileTerminalRight(cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_LessEquals = new LessEqualsDescr(«compileTerminalLeft(cond.left as ExpressionImpl)»,«compileRecExpr(cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_LessEquals = new LessEqualsDescr(«compileRecExpr(cond.left as ExpressionImpl)»,«compileRecExpr(cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				expContext.setInitialCondition(CondValue_LessEquals);
				
				«ELSEIF cond.op.equals(">")»				««««>
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					ConditionDescr CondValue_More = new MoreDescr( «compileTerminalLeft(cond.left as ExpressionImpl)»,«compileTerminalRight(cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_More = new MoreDescr(«compileTerminalLeft(cond.left as ExpressionImpl)»,«compileRecExpr(cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_More = new MoreDescr(«compileRecExpr(cond.left as ExpressionImpl)»,«compileRecExpr(cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				expContext.setInitialCondition(CondValue_More);
							
				«ELSE» 										««««<
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					ConditionDescr CondValue_Less = new LessDescr(«compileTerminalLeft(cond.left as ExpressionImpl)»,«compileTerminalRight(cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_Less = new LessDescr(«compileTerminalLeft(cond.left as ExpressionImpl)»,«compileRecExpr(cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_Less = new LessDescr(«compileRecExpr(cond.left as ExpressionImpl)»,«compileRecExpr(cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				
				expContext.setInitialCondition(CondValue_Less);			
				«ENDIF»
				'''
			}

			default: '''//default compileCond'''
		}
		
			
		
	}
	
	def compileFinalCond(ConditionRule rule) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def compileTime(AllenOp op, AtExpr expr) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
