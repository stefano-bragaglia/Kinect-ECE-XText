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
import org.xtext.ecerule.ece.AllenOperator;
import org.xtext.ecerule.ece.And;
import org.xtext.ecerule.ece.AtTimeCurrentTime;
import org.xtext.ecerule.ece.AtTimeIntConstant;
import org.xtext.ecerule.ece.AtTimePlusOrMin;
import org.xtext.ecerule.ece.BoolConstant;
import org.xtext.ecerule.ece.Comparison;
import org.xtext.ecerule.ece.ConditionRule;
import org.xtext.ecerule.ece.ContextsList;
import org.xtext.ecerule.ece.CurrentTime;
import org.xtext.ecerule.ece.EcContext;
import org.xtext.ecerule.ece.EcContextsList;
import org.xtext.ecerule.ece.EceModel;
import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.Equality;
import org.xtext.ecerule.ece.Event;
import org.xtext.ecerule.ece.EventFeature;
import org.xtext.ecerule.ece.ExpContext;
import org.xtext.ecerule.ece.ExpContextsList;
import org.xtext.ecerule.ece.Expression;
import org.xtext.ecerule.ece.FloatConstant;
import org.xtext.ecerule.ece.Fluent;
import org.xtext.ecerule.ece.FluentRef;
import org.xtext.ecerule.ece.IntConstant;
import org.xtext.ecerule.ece.Minus;
import org.xtext.ecerule.ece.MulOrDiv;
import org.xtext.ecerule.ece.Not;
import org.xtext.ecerule.ece.Or;
import org.xtext.ecerule.ece.Plus;
import org.xtext.ecerule.ece.Reference;
import org.xtext.ecerule.ece.Statement;
import org.xtext.ecerule.services.EceGrammarAccess;

@SuppressWarnings("all")
public class EceSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private EceGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == EcePackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case EcePackage.ALLEN_OPERATOR:
				if(context == grammarAccess.getAllenOpRule()) {
					sequence_AllenOp(context, (AllenOperator) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.AND:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.AT_TIME_CURRENT_TIME:
				if(context == grammarAccess.getAtTimeAtomicRule() ||
				   context == grammarAccess.getAtTimeExpressionRule() ||
				   context == grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0() ||
				   context == grammarAccess.getAtTimePrimaryRule()) {
					sequence_AtTimeAtomic(context, (AtTimeCurrentTime) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.AT_TIME_INT_CONSTANT:
				if(context == grammarAccess.getAtTimeAtomicRule() ||
				   context == grammarAccess.getAtTimeExpressionRule() ||
				   context == grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0() ||
				   context == grammarAccess.getAtTimePrimaryRule()) {
					sequence_AtTimeAtomic(context, (AtTimeIntConstant) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.AT_TIME_PLUS_OR_MIN:
				if(context == grammarAccess.getAtTimeExpressionRule() ||
				   context == grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0() ||
				   context == grammarAccess.getAtTimePrimaryRule()) {
					sequence_AtTimeExpression(context, (AtTimePlusOrMin) semanticObject); 
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
				if(context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.CONDITION_RULE:
				if(context == grammarAccess.getConditionRuleRule()) {
					sequence_ConditionRule(context, (ConditionRule) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.CONTEXTS_LIST:
				if(context == grammarAccess.getContextsListRule()) {
					sequence_ContextsList(context, (ContextsList) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.CURRENT_TIME:
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
					sequence_Atomic(context, (CurrentTime) semanticObject); 
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
			case EcePackage.ECE_MODEL:
				if(context == grammarAccess.getEceModelRule()) {
					sequence_EceModel(context, (EceModel) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EQUALITY:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
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
				if(context == grammarAccess.getEventFeatureRule() ||
				   context == grammarAccess.getReferenceTypeRule()) {
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
				if(context == grammarAccess.getToRuleRule()) {
					sequence_ToRule(context, (Expression) semanticObject); 
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
				if(context == grammarAccess.getFluentRule() ||
				   context == grammarAccess.getReferenceTypeRule()) {
					sequence_Fluent(context, (Fluent) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.FLUENT_REF:
				if(context == grammarAccess.getFluentRefRule()) {
					sequence_FluentRef(context, (FluentRef) semanticObject); 
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
				if(context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()) {
					sequence_PlusOrMinus(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.MUL_OR_DIV:
				if(context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()) {
					sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.NOT:
				if(context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.OR:
				if(context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.PLUS:
				if(context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()) {
					sequence_PlusOrMinus(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.REFERENCE:
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
					sequence_Atomic(context, (Reference) semanticObject); 
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
	 *     (value='before' | value='after' | value='in')
	 */
	protected void sequence_AllenOp(EObject context, AllenOperator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     atTimeValue='now'
	 */
	protected void sequence_AtTimeAtomic(EObject context, AtTimeCurrentTime semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.AT_TIME_CURRENT_TIME__AT_TIME_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.AT_TIME_CURRENT_TIME__AT_TIME_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtTimeAtomicAccess().getAtTimeValueNowKeyword_1_1_0(), semanticObject.getAtTimeValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_AtTimeAtomic(EObject context, AtTimeIntConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.AT_TIME_INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.AT_TIME_INT_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_0_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AtTimeExpression_AtTimePlusOrMin_1_0 (op='-' | op='+') right=AtTimePrimary)
	 */
	protected void sequence_AtTimeExpression(EObject context, AtTimePlusOrMin semanticObject) {
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
	 *     value='now'
	 */
	protected void sequence_Atomic(EObject context, CurrentTime semanticObject) {
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
	 *     (ref=[ReferenceType|ID] fluentValueSample=AtTimePrimary?)
	 */
	protected void sequence_Atomic(EObject context, Reference semanticObject) {
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
	 *     condition=Equality
	 */
	protected void sequence_ConditionRule(EObject context, ConditionRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.CONDITION_RULE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.CONDITION_RULE__CONDITION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionRuleAccess().getConditionEqualityParserRuleCall_0(), semanticObject.getCondition());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (ecContextsList=EcContextsList? expContextsList=ExpContextsList?)
	 */
	protected void sequence_ContextsList(EObject context, ContextsList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fluent+=Fluent
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
	 *     statements+=Statement*
	 */
	protected void sequence_EceModel(EObject context, EceModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='==' | op='!=') right=Atomic)
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
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.REFERENCE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.REFERENCE_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (eventName=ID (params+=EventFeature params+=EventFeature*)?)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (finalCondition=ConditionRule (allenOp=AllenOp time=INT)? initialCondition=ConditionRule? actionF=ID? actionV=ID?)
	 */
	protected void sequence_ExpContext(EObject context, ExpContext semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
	 *     value=ID
	 */
	protected void sequence_FluentRef(EObject context, FluentRef semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.FLUENT_REF__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.FLUENT_REF__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFluentRefAccess().getValueIDTerminalRuleCall_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID valuePart=ToRule condPart=ConditionRule?)
	 */
	protected void sequence_Fluent(EObject context, Fluent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/' | op='%' | op='^') right=Atomic)
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getPrimaryAccess().getExpressionPrimaryParserRuleCall_1_2_0(), semanticObject.getExpression());
		feeder.finish();
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
	 *     expression=MulOrDiv
	 */
	protected void sequence_ToRule(EObject context, Expression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.EXPRESSION__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.EXPRESSION__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getToRuleAccess().getExpressionMulOrDivParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
