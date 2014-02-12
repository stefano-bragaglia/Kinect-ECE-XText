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
import org.xtext.ecerule.ece.impl.OrImpl
import org.xtext.ecerule.ece.impl.PlusImpl
import org.xtext.ecerule.ece.impl.MinusImpl
import org.xtext.ecerule.ece.impl.MulOrDivImpl
import org.xtext.ecerule.ece.impl.ReferenceImpl
import org.xtext.ecerule.ece.Expression
import org.xtext.ecerule.ece.impl.AllenOpImpl
import org.xtext.ecerule.ece.impl.AllenOperatorImpl
import org.xtext.ecerule.ece.EcContext
import org.xtext.ecerule.ece.Fluent
import org.xtext.ecerule.ece.IntConstant
import org.xtext.ecerule.ece.FloatConstant
import org.xtext.ecerule.ece.Reference
import org.xtext.ecerule.ece.MulOrDiv
import org.xtext.ecerule.ece.Equality
import org.xtext.ecerule.ece.AllenOperator

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
package org.ece.include;
import org.model.*;
import org.model.conditions.*;
import org.model.conditions.compounds.*;
import org.model.conditions.relations.*;
import org.model.expressions.*;
import org.model.expressions.operations.*;

public class MainEce {

	public static Model getModel() {
		
		Statement statement;
		Event event;
		String eventName;
		ExpressionInterface exprContainer;
		ConditionInterface condContainer;
		FluentInterface fluent;
		EcContext ecContext;
		ExpContext expContext;
		Time time;

		Model model = new Model();


					«««per ogni Statement»
					«FOR stm : eceModel.statements» 		
							statement = new Statement();
					
							«compileEvent(stm)»
							«compileContextsList(stm)»


							model.add("Stm_«stm.event.eventName»", statement);



					«ENDFOR»

		return model;
	}	
}
		'''
	}
	
	
	
	def compileEvent(Statement stm) {
	'''
	event = new Event();
	eventName = "«stm.event.eventName»";
	event.setEventName(eventName);
	«FOR feature : stm.event.params»
	event.addEventFeature("«feature.name»");
	«ENDFOR»
	statement.setEvent(event);
	'''
	}
	
	
	def compileContextsList(Statement stm) {
		'''
		«IF stm.contextsList.ecContextsList !=null »	
			«FOR ecContext : stm.contextsList.ecContextsList.ecContexts»
					«compileEcContext(ecContext, stm)»
			«ENDFOR»
		«ENDIF»
		«IF stm.contextsList.expContextsList !=null »
			«FOR expContext : stm.contextsList.expContextsList.expContexts»
				«compileExpContext(expContext, stm)»
			«ENDFOR»
		«ENDIF»
		'''
	}
	
	
	
	
	//COMPILE EC CONTEXT
	def compileEcContext(EcContext ecContext, Statement statement) {
		'''
		
		ecContext = new EcContext();
		«IF ecContext.fluent != null»
			«compileFluent(ecContext.fluent.get(0), statement)»
		«ENDIF»
		statement.addEcContext(ecContext);
		'''
	}
	
	
	
	
	//COMPILE EXP CONTEXT
	def compileExpContext(ExpContext expContext, Statement statement) {
		'''
		
		expContext = new ExpContext();
		«compileCond(expContext.finalCondition, statement, "Final")»
		expContext.setFinalCondition(condContainer);
		«IF expContext.allenOp!=null»
		«compileTime(expContext.allenOp, expContext.time, statement)»
		«ENDIF»
		«IF expContext.actionF!=null»
		expContext.setActionOnFulf(new ActionAftExpectEval("«expContext.actionF»"));
		«ENDIF»
		«IF expContext.actionV!=null»
		expContext.setActionOnViol(new ActionAftExpectEval("«expContext.actionV»"));
		«ENDIF»
		statement.addExpContext(expContext);
		'''
	}
	
	
	
	
	
	
	
	
	
//************************************************************************************************************	
//*****COMPILE FLUENT ****************************************************************************************
//************************************************************************************************************	
	
	def compileFluent(Fluent fluent, Statement statement) {
		'''
		fluent = new Fluent("«fluent.name»");
		«compileExpr(fluent.valuePart.expression,  statement)»
		fluent.setToExpression(exprContainer);
		ecContext.addFluent(fluent);
«««		«IF fluent.condPart!=null»
«««			
«««		«ENDIF»
«««		
«««		«IF fluent.timePart!=null»
«««		
«««		«ENDIF»
		'''
	}
	
	
	
	
	
	
	
	
/////////////////////////////////////////////////////////////////////////////////////////	
	
//COMPILAZIONE EXPRESSION
//LIVELLO 1	
	def compileExpr (Expression expr, Statement stetement){
		var classType = expr.eClass;
		
		switch expr{
			
			IntConstant:{
				var num = expr as IntConstant 
				'''exprContainer = new NumberDescr(«num.value»);'''
			}
			Reference:{
				var ref = expr as Reference
				'''exprContainer = new SampleDescr("«ref.ref.name»");'''	
			}
			MulOrDiv:{
				var e = expr as MulOrDiv
				'''
				«IF e.op.equals("*") »
				exprContainer = new MultDescr(«compileInnerExpr(e.left)», «compileInnerExpr(e.right)»);
				«ENDIF»
				'''
			}		
		}
	}
	
	
//COMPILAZIONE EXPRESSION
//LIVELLI INFERIORI	
	def compileInnerExpr(Expression expr){
		switch expr{
			
			Reference:{
				var ref = expr as Reference
				'''new SampleDescr("«ref.ref.name»")'''	
			}
			IntConstant:{
				var n = expr as IntConstant
				'''new NumberDescr(«n.value»)'''
			}
			
			
			
		}
	}
	
///////////////////////////////////////////////////////////////////////////

	def compileCond(ConditionRule expr, Statement statement, String condType){
		switch expr.condition{
			Equality:{
				'''condContainer = new SameDescr(«compileInnerExpr(expr.condition.left)», «compileInnerExpr(expr.condition.right)»);'''
			}
		}
		
	
	}
	
	
	
	def compileTime(AllenOp op, int value, Statement statement){
		var operator = op as AllenOperator
		'''
		time = new Time();
		time.setAllenOp("«operator.value»");
		time.setTimeValue(«value»);
		expContext.setTime(time);
		'''
	}


	
	
}