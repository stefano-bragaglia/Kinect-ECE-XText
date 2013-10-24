package org.xtext.ecerule.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.xtext.ecerule.ece.AllenOp
import org.xtext.ecerule.ece.AtExpr
import org.xtext.ecerule.ece.ConditionRule
import org.xtext.ecerule.ece.EceModel
import org.xtext.ecerule.ece.ExpContext
import org.xtext.ecerule.ece.Statement
import org.xtext.ecerule.ece.impl.AndImpl
import org.xtext.ecerule.ece.impl.BoolConstantImpl
import org.xtext.ecerule.ece.impl.ComparisonImpl
import org.xtext.ecerule.ece.impl.EqualityImpl
import org.xtext.ecerule.ece.impl.EventFeatureImpl
import org.xtext.ecerule.ece.impl.ExpressionImpl
import org.xtext.ecerule.ece.impl.FloatConstantImpl
import org.xtext.ecerule.ece.impl.FluentImpl
import org.xtext.ecerule.ece.impl.IntConstantImpl
import org.xtext.ecerule.ece.impl.NotImpl
import org.xtext.ecerule.ece.impl.ReferenceTypeImpl

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
			import org.xtext.ecerule.model.*;
			
			public class MainEce {
				public static void main (String[] args) {	
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
			«compileExpContext(expContext, stm)»
		
		«ENDFOR»
		
		'''
	}
	
	def compileExpContext(ExpContext expContext, Statement statement) {
		'''
		ExpContext expContext = new ExpContext();
		«compileCond(expContext.initialCondition, statement, "Initial")»	«««gestisci contizione iniziale
		«compileCond(expContext.finalCondition, statement, "Final")»		«««gestisci contizione finale
		«compileTime(expContext.allenOp, expContext.time)»	«««gestisci info temporale
		
		statement.addExpContext(expContext);
		
		'''
	}
	
	
	
	def compileCond(ConditionRule cond, Statement statement, String condType) {
		switch cond{
			NotImpl:{
				'''
				«IF cond.expression.eClass.name.equals("Constant")» «««se ho negato una costante
					ConditionDescr CondValue_Not = new NotDescr( «compileTerminalLeft(cond.expression as ExpressionImpl, statement)»);
				«ELSE» «««se ho negato un'espressione
					ConditionDescr CondValue_Not = new NotDescr(«compileRecExpr(cond.expression as ExpressionImpl, statement)»);
				«ENDIF»
				
				expContext.set«condType»Condition(CondValue_Not);
				
				'''
			}
			
			ComparisonImpl:{
				'''
				«IF cond.op.equals(">=")»					««««>=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					ConditionDescr CondValue_MoreEquals = new MoreEqualsDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_MoreEquals = new MoreEqualsDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_MoreEquals = new MoreEqualsDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				expContext.set«condType»Condition(CondValue_MoreEquals);				
				
				«ELSEIF cond.op.equals("<=")» 				««««<=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					ConditionDescr CondValue_LessEquals = new LessEqualsDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_LessEquals = new LessEqualsDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_LessEquals = new LessEqualsDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				expContext.set«condType»Condition(CondValue_LessEquals);
				
				«ELSEIF cond.op.equals(">")»				««««>
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					ConditionDescr CondValue_More = new MoreDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_More = new MoreDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_More = new MoreDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				expContext.set«condType»Condition(CondValue_More);
							
				«ELSE» 										««««<
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					ConditionDescr CondValue_Less = new LessDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_Less = new LessDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							ConditionDescr CondValue_Less = new LessDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				
				expContext.set«condType»Condition(CondValue_Less);			
				«ENDIF»
				'''
			}

			default: '''//default compileCond'''
		}
		
			
		
	}
	
	
	
	// Constant	
	def dispatch compileTerminalLeft(ExpressionImpl term, Statement statement) {
		switch term{
			IntConstantImpl:{'''new NumberDescr(«term.value»)'''}
			FloatConstantImpl:{'''new NumberDescr(«term.value»)'''}
			BoolConstantImpl:{'''new NumberDescr(«term.value»)'''}
		}	
	}
	
	// Constant	
	def dispatch compileTerminalRight(ExpressionImpl term, Statement statement) {
		switch term{
			IntConstantImpl:{'''new NumberDescr(«term.value»)'''}
			FloatConstantImpl:{'''new NumberDescr(«term.value»)'''}
			BoolConstantImpl:{'''new NumberDescr(«term.value»)'''}
		}
	}
	
	
	//Reference
	def dispatch compileTerminalLeft(ReferenceTypeImpl term, Statement statement){
		
		switch term{
			EventFeatureImpl:{
				'''
				«statement.event.params.get(retrieveParam(term.name, statement)).name»
				'''
			}
			FluentImpl:{'''new SampleDescr(«term.name»)'''}
		}				
	}
	
	//Reference
	def dispatch compileTerminalRight(ReferenceTypeImpl term, Statement statement){
		switch term{
			EventFeatureImpl:{
				'''
				«statement.event.params.get(retrieveParam(term.name, statement)).name»
				'''
			}
			FluentImpl:{'''new SampleDescr("«term.name»")'''}
		}				
	}
	
	
	def int retrieveParam(String paramName, Statement statement){
		var paramNumTemp = 100
		for (p: statement.event.params){
			if (p.equals(paramName))
				paramNumTemp = statement.event.params.indexOf(p)
		}				
		return paramNumTemp;
	}
	
	
	def dispatch compileRecExpr (AndImpl conditionExpr, Statement statement){
		'''
		«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
			new AndDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«compileTerminalLeft(conditionExpr.right as ExpressionImpl, statement)»)
		«ELSE»
			«IF conditionExpr.left.eClass.name.contains("Constant")»
				new AndDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
			«ENDIF»
			«IF !conditionExpr.left.eClass.name.contains("Constant")»
				new AndDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
			»«ENDIF»
		«ENDIF»
		'''
	}
	
	def dispatch compileRecExpr (EqualityImpl conditionExpr, Statement statement){
		'''
		«IF conditionExpr.op.equals("==")»						««««==
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new SameDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«compileTerminalLeft(conditionExpr.right as ExpressionImpl, statement)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new SameDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new SameDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
				»«ENDIF»
			«ENDIF»
		«ELSEIF conditionExpr.op.equals("!=")»					««««!=
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new DifferentDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«compileTerminalLeft(conditionExpr.right as ExpressionImpl, statement)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new DifferentDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new DifferentDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
				»«ENDIF»
			«ENDIF»
		«ENDIF»
		'''
	}
	def dispatch compileRecExpr (ComparisonImpl conditionExpr, Statement statement){
		'''
		«IF conditionExpr.op.equals(">=")»						««««>=
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new MoreEqualsDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
				»«compileTerminalLeft(conditionExpr.right as ExpressionImpl, statement)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new MoreEqualsDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new MoreEqualsDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
				»«ENDIF»
			«ENDIF»
		«ELSEIF conditionExpr.op.equals("<=")»					««««<=
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new LessEqualsDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
				»«compileTerminalLeft(conditionExpr.right as ExpressionImpl, statement)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new LessEqualsDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new LessEqualsDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
				»«ENDIF»
			«ENDIF»
		«ELSEIF conditionExpr.op.equals(">")»					««««>
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new MoreDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
				»«compileTerminalLeft(conditionExpr.right as ExpressionImpl, statement)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new MoreDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new MoreDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
				»«ENDIF»
			«ENDIF»
		«ELSE»													««««<
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new LessDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
				»«compileTerminalLeft(conditionExpr.right as ExpressionImpl, statement)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new LessDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new LessDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,
					«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
				»«ENDIF»
			«ENDIF»
		«ENDIF»
		'''
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	def compileFinalCond(ConditionRule rule) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	def compileTime(AllenOp op, AtExpr expr) {
		//throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}

}
