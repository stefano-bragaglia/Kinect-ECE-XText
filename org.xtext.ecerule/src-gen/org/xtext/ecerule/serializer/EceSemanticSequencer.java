package org.xtext.ecerule.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.ecerule.ece.And;
import org.xtext.ecerule.ece.BoolConstant;
import org.xtext.ecerule.ece.Comparison;
import org.xtext.ecerule.ece.ContextsList;
import org.xtext.ecerule.ece.DroolsModel;
import org.xtext.ecerule.ece.EcContext;
import org.xtext.ecerule.ece.EcContextsList;
import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.Equality;
import org.xtext.ecerule.ece.Event;
import org.xtext.ecerule.ece.EventFeature;
import org.xtext.ecerule.ece.ExpContext;
import org.xtext.ecerule.ece.ExpContextsList;
import org.xtext.ecerule.ece.Expression;
import org.xtext.ecerule.ece.FeatureRef;
import org.xtext.ecerule.ece.FloatConstant;
import org.xtext.ecerule.ece.Fluent;
import org.xtext.ecerule.ece.InRule;
import org.xtext.ecerule.ece.IntConstant;
import org.xtext.ecerule.ece.Minus;
import org.xtext.ecerule.ece.MulOrDiv;
import org.xtext.ecerule.ece.Not;
import org.xtext.ecerule.ece.Or;
import org.xtext.ecerule.ece.Plus;
import org.xtext.ecerule.ece.Statement;
import org.xtext.ecerule.services.EceGrammarAccess;

@SuppressWarnings("all")
public class EceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EceGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EcePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcePackage.AND:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.BOOL_CONSTANT:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (BoolConstant) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.COMPARISON:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.CONTEXTS_LIST:
				if(context == grammarAccess.getContextsListRule()) {
					sequence_ContextsList(context, (ContextsList) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.DROOLS_MODEL:
				if(context == grammarAccess.getDroolsModelRule()) {
					sequence_DroolsModel(context, (DroolsModel) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EC_CONTEXT:
				if(context == grammarAccess.getEcContextRule()) {
					sequence_EcContext(context, (EcContext) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EC_CONTEXTS_LIST:
				if(context == grammarAccess.getEcContextsListRule()) {
					sequence_EcContextsList(context, (EcContextsList) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EQUALITY:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Equality(context, (Equality) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EVENT_FEATURE:
				if(context == grammarAccess.getEventFeatureRule()) {
					sequence_EventFeature(context, (EventFeature) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EXP_CONTEXT:
				if(context == grammarAccess.getExpContextRule()) {
					sequence_ExpContext(context, (ExpContext) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EXP_CONTEXTS_LIST:
				if(context == grammarAccess.getExpContextsListRule()) {
					sequence_ExpContextsList(context, (ExpContextsList) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EXPRESSION:
				if(context == grammarAccess.getConditionRuleRule()) {
					sequence_ConditionRule(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getToRuleRule()) {
					sequence_ToRule(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.FEATURE_REF:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (FeatureRef) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.FLOAT_CONSTANT:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (FloatConstant) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.FLUENT:
				if(context == grammarAccess.getFluentRule()) {
					sequence_Fluent(context, (Fluent) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.IN_RULE:
				if(context == grammarAccess.getInRuleRule()) {
					sequence_InRule(context, (InRule) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.INT_CONSTANT:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (IntConstant) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.MINUS:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_PlusOrMinus(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.MUL_OR_DIV:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.NOT:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.OR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.PLUS:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_PlusOrMinus(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=And_And_1_0 right=Equality)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(EObject context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     param=[EventFeature|ID]
	 */
	protected void sequence_Atomic(EObject context, FeatureRef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_Atomic(EObject context, FloatConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(EObject context, IntConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (op='>=' | op='<=' | op='>' | op='<') right=PlusOrMinus)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condition=Expression
	 */
	protected void sequence_ConditionRule(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecContextsList=EcContextsList expContextsList=ExpContextsList*)
	 */
	protected void sequence_ContextsList(EObject context, ContextsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement*
	 */
	protected void sequence_DroolsModel(EObject context, DroolsModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fluent+=Fluent fluent+=Fluent*)
	 */
	protected void sequence_EcContext(EObject context, EcContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ecContexts+=EcContext ecContexts+=EcContext*)
	 */
	protected void sequence_EcContextsList(EObject context, EcContextsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='==' | op='!=') right=Comparison)
	 */
	protected void sequence_Equality(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EventFeature(EObject context, EventFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.EVENT_FEATURE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.EVENT_FEATURE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (eventName=ID (param+=EventFeature param+=EventFeature*)?)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     dafare='dafare'
	 */
	protected void sequence_ExpContext(EObject context, ExpContext semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.EXP_CONTEXT__DAFARE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.EXP_CONTEXT__DAFARE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExpContextAccess().getDafareDafareKeyword_0(), semanticObject.getDafare());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (expContexts+=ExpContext expContexts+=ExpContext*)
	 */
	protected void sequence_ExpContextsList(EObject context, ExpContextsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fluentName=ID valuePart=ToRule timePart=InRule? condPart=ConditionRule?)
	 */
	protected void sequence_Fluent(EObject context, Fluent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     time=INT
	 */
	protected void sequence_InRule(EObject context, InRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.IN_RULE__TIME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.IN_RULE__TIME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInRuleAccess().getTimeINTTerminalRuleCall_0(), semanticObject.getTime());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/' | op='%' | op='^') right=Primary)
	 */
	protected void sequence_MulOrDiv(EObject context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PlusOrMinus_Minus_1_0_1_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(EObject context, Minus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PlusOrMinus_Plus_1_0_0_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(EObject context, Plus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(EObject context, Not semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=Event contextsList=ContextsList)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.STATEMENT__EVENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.STATEMENT__EVENT));
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.STATEMENT__CONTEXTS_LIST) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.STATEMENT__CONTEXTS_LIST));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getStatementAccess().getEventEventParserRuleCall_1_0(), semanticObject.getEvent());
		feeder.accept(grammarAccess.getStatementAccess().getContextsListContextsListParserRuleCall_2_0(), semanticObject.getContextsList());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     expression=PlusOrMinus
	 */
	protected void sequence_ToRule(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
