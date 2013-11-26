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
					
					public Statement statement;
					public Event event;
					public String eventName;
					public ExpressionDescr exprContainer;
					public ConditionDescr condContainer;
					public ExpContext expContext;
					public Time time;
					
					Model model = new Model();
					«««per ogni Statement»
					«FOR stm : eceModel.statements» 
						statement = new Statement();
						«compileEvent(stm)» 		«««gestisco l'evento 
						«compileContextsList(stm)»	«««gestisco i contesti
						
						«««aggiungo lo Statement al Model
						model.add("Stm«stm.event.eventName»", statement);
					«ENDFOR»
					
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
		
«««		«FOR ecContext : stm.contextsList.ecContextsList.ecContexts»
«««			«compileEceContext(eceContext, stm)»
«««		«ENDFOR»
		
		«IF stm.contextsList.expContextsList !=null »
			«FOR expContext : stm.contextsList.expContextsList.expContexts»
				«compileExpContext(expContext, stm)»
			«ENDFOR»
		«ENDIF»
		'''
	}
	
	def compileExpContext(ExpContext expContext, Statement statement) {
		'''
		expContext = new ExpContext();
		
		«IF expContext.initialCondition != null»
		«compileCond(expContext.initialCondition as ExpressionImpl, statement, "Initial")»	«««(1)gestisci contizione iniziale
		«ENDIF»
		
		«compileCond(expContext.finalCondition as ExpressionImpl, statement, "Final")»		«««(2)gestisci contizione finale
		
		«IF expContext.allenOp!=null»
		«compileTime(expContext.allenOp as AllenOperatorImpl, expContext.time as ExpressionImpl, statement)»	«««(3)gestisci info temporale
		«ENDIF»
		
		statement.addExpContext(expContext);
		
		'''
	}
	
//************************************************************************************************************	
//*****COMPILE CONDITION (initail e final)********************************************************************
//************************************************************************************************************
	
	def compileCond(ExpressionImpl condExpr, Statement statement, String condType) {
		var cond = condExpr.condition;
		switch cond{
			NotImpl:{
				'''
				«IF cond.expression.eClass.name.equals("Constant")» «««se ho negato una costante
					condContainer = new NotDescr( «compileTerminalLeft(cond.expression as ExpressionImpl, statement)»);
				«ELSE» «««se ho negato un'espressione
					condContainer = new NotDescr(«compileRecExpr(cond.expression as ExpressionImpl, statement)»);
				«ENDIF»
				
				expContext.set«condType»Condition(condContainer);
				
				'''
			}
			
			OrImpl:{
				'''
				«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					condContainer = new OrDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«
						»«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
				«ELSE»
					«IF cond.left.eClass.name.contains("Constant")»
						condContainer = new OrDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«
						»«compileRecExpr(cond.right as ExpressionImpl, statement)»);
					«ENDIF»
					«IF !cond.left.eClass.name.contains("Constant")»
						condContainer = new OrDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«
						»«compileRecExpr(cond.right as ExpressionImpl, statement)»);
					«ENDIF»
				«ENDIF»
				
				expContext.set«condType»Condition(condContainer);
				'''
			}
			
			AndImpl:{
				'''
				«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					condContainer = new AndDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«
						»«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
				«ELSE»
					«IF cond.left.eClass.name.contains("Constant")»
						condContainer = new AndDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«
						»«compileRecExpr(cond.right as ExpressionImpl, statement)»);
					«ENDIF»
					«IF !cond.left.eClass.name.contains("Constant")»
						condContainer = new AndDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«
						»«compileRecExpr(cond.right as ExpressionImpl, statement)»);
					«ENDIF»
				«ENDIF»
				
				expContext.set«condType»Condition(condContainer);
				
				'''
			}
			
			EqualityImpl:{
				'''
				«IF cond.op.equals("==")»					««««==
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
						condContainer = new SameDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«
							»«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new SameDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«
							»«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new SameDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«
							»«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				expContext.set«condType»Condition(condContainer);
				
				«ELSE» 										««««!=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
						condContainer = new DifferentDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«
							»«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new DifferentDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«
							»«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new DifferentDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«
							»«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				expContext.set«condType»Condition(condContainer);
				«ENDIF»
				'''
			}
			
			ComparisonImpl:{
				'''
				«IF cond.op.equals(">=")»					««««>=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					condContainer = new MoreEqualsDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new MoreEqualsDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new MoreEqualsDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				expContext.set«condType»Condition(condContainer);				
				
				«ELSEIF cond.op.equals("<=")» 				««««<=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					condContainer = new LessEqualsDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new LessEqualsDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new LessEqualsDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				expContext.set«condType»Condition(condContainer);
				
				«ELSEIF cond.op.equals(">")»				««««>
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					condContainer = new MoreDescr( «compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new MoreDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new MoreDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				expContext.set«condType»Condition(condContainer);
							
				«ELSE» 										««««<
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					condContainer = new LessDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileTerminalRight(cond.right as ExpressionImpl, statement)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new LessDescr(«compileTerminalLeft(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new LessDescr(«compileRecExpr(cond.left as ExpressionImpl, statement)»,«compileRecExpr(cond.right as ExpressionImpl, statement)»);
						«ENDIF»
					«ENDIF»
				
				expContext.set«condType»Condition(condContainer);			
				«ENDIF»
				'''
			}

			default: '''
			//default compileCond
			//TYPE OF condExpr IS---> «cond.eClass.name»
			'''
			
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
			if (p.name.equals(paramName))
				paramNumTemp = statement.event.params.indexOf(p)
		}				
		return paramNumTemp;
	}
	
	
//*****COMPILE RECURSIVE EXPRESSION*********************************************************************************

	def dispatch compileRecExpr (NotImpl conditionExpr, Statement statement){
		'''
		«IF conditionExpr.expression.eClass.name.contains("Constant")»
			new NotDescr( «compileTerminalLeft(conditionExpr.expression as ExpressionImpl, statement)»)
		«ELSE»
			new NotDescr(«compileRecExpr(conditionExpr.expression as ExpressionImpl, statement)»)
		«ENDIF»
		'''
	}
	
	def dispatch compileRecExpr (OrImpl conditionExpr, Statement statement){
		'''
		«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
			new OrDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
			»«compileTerminalLeft(conditionExpr.right as ExpressionImpl, statement)»)
		«ELSE»
			«IF conditionExpr.left.eClass.name.contains("Constant")»
				new OrDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
				»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
			«ENDIF»
			«IF !conditionExpr.left.eClass.name.contains("Constant")»
				new OrDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,«
				»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
			»«ENDIF»
		«ENDIF»
		'''
	}
	
	def dispatch compileRecExpr (AndImpl conditionExpr, Statement statement){
		'''
		«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
			new AndDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«compileTerminalRight(conditionExpr.right as ExpressionImpl, statement)»)
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
				new SameDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«compileTerminalRight(conditionExpr.right as ExpressionImpl, statement)»)
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
	
	def dispatch compileRecExpr (IntConstantImpl conditionExpr, Statement statement){
		'''new NumberDescr(«conditionExpr.value»)'''
	}
	
	def dispatch compileRecExpr (FloatConstantImpl conditionExpr, Statement statement){
		'''new NumberDescr(«conditionExpr.value»)'''
	}
	
	def dispatch compileRecExpr (BoolConstantImpl conditionExpr, Statement statement){
		'''new NumberDescr(«conditionExpr.value»)'''
	}
	
	def dispatch compileRecExpr (ReferenceImpl conditionExpr, Statement statement){
		'''
		«IF conditionExpr.ref.eClass.name.contains("Feature")»
			«statement.event.params.get(retrieveParam(conditionExpr.ref.name, statement)).name»
		«ELSE»
			new SampleDescr("«conditionExpr.ref.name»")
		«ENDIF»
		'''
	}
	
	def dispatch compileRecExpr (PlusImpl conditionExpr, Statement statement){
		'''
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new PlusDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
				»«compileTerminalRight(conditionExpr.right as ExpressionImpl, statement)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new PlusDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
					»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new PlusDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,«
					»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
				»«ENDIF»
			«ENDIF»
		'''	
	}
	
	def dispatch compileRecExpr (MinusImpl conditionExpr, Statement statement){
		'''
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new MinusDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
				»«compileTerminalRight(conditionExpr.right as ExpressionImpl, statement)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new MinusDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
					»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new MinusDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,«
					»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
				»«ENDIF»
			«ENDIF»
		'''
	}
	
	def dispatch compileRecExpr (MulOrDivImpl conditionExpr, Statement statement){
		'''
			«IF conditionExpr.op.equals("*")»
				«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
					new MultDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
					»«compileTerminalRight(conditionExpr.right as ExpressionImpl, statement)»)
				«ELSE»
					«IF conditionExpr.left.eClass.name.contains("Constant")»
						new MultDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
						»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
					«ENDIF»
					«IF !conditionExpr.left.eClass.name.contains("Constant")»
						new MultDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,«
						»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
					»«ENDIF»
				«ENDIF»
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
					new ObelusDescr( «compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
					»«compileTerminalRight(conditionExpr.right as ExpressionImpl, statement)»)
				«ELSE»
					«IF conditionExpr.left.eClass.name.contains("Constant")»
						new ObelusDescr(«compileTerminalLeft(conditionExpr.left as ExpressionImpl, statement)»,«
						»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)
					«ENDIF»
					«IF !conditionExpr.left.eClass.name.contains("Constant")»
						new ObelusDescr(«compileRecExpr(conditionExpr.left as ExpressionImpl, statement)»,«
						»«compileRecExpr(conditionExpr.right as ExpressionImpl, statement)»)«
					»«ENDIF»
				«ENDIF»
			«ENDIF»
		'''
	}
	
	
	
	
	
//************************************************************************************************************	
//*****COMPILE TIME*******************************************************************************************
//************************************************************************************************************
	
	def compileTime(AllenOperatorImpl op, ExpressionImpl expr, Statement statement) {
		'''
		time = new Time();
		time.setAllenOp("«op.value»");
		time.setTimeValueExpr(«compileRecExpr(expr as ExpressionImpl, statement)»);
		expContext.setTime(time);
		
		'''
	}
	
	
}
