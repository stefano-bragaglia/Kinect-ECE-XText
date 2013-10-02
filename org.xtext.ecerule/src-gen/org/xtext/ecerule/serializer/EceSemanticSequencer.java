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
import org.xtext.ecerule.ece.Comparison;
import org.xtext.ecerule.ece.DroolsModel;
import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.Equality;
import org.xtext.ecerule.ece.Event;
import org.xtext.ecerule.ece.ExpFluent;
import org.xtext.ecerule.ece.FloatExpr;
import org.xtext.ecerule.ece.Fluent;
import org.xtext.ecerule.ece.FluentWhoseValue;
import org.xtext.ecerule.ece.InRule;
import org.xtext.ecerule.ece.Minus;
import org.xtext.ecerule.ece.MulOrDiv;
import org.xtext.ecerule.ece.Or;
import org.xtext.ecerule.ece.Plus;
import org.xtext.ecerule.ece.Primary;
import org.xtext.ecerule.ece.Statement;
import org.xtext.ecerule.ece.Str;
import org.xtext.ecerule.ece.ToRule;
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
				   context == grammarAccess.getBoolExprRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0()) {
					sequence_And(context, (And) semanticObject); 
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
			case EcePackage.DROOLS_MODEL:
				if(context == grammarAccess.getDroolsModelRule()) {
					sequence_DroolsModel(context, (DroolsModel) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EQUALITY:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getBoolExprRule() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0()) {
					sequence_Equality(context, (Equality) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getEqualityAccess().getEqualityLeftAction_0_1_0()) {
					sequence_Equality_Equality_0_1_0(context, (Equality) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_1_0()) {
					sequence_Equality_Equality_1_1_0(context, (Equality) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.EXP_FLUENT:
				if(context == grammarAccess.getExpFluentRule()) {
					sequence_ExpFluent(context, (ExpFluent) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.FLOAT_EXPR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getBoolExprRule() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_0_1_0() ||
				   context == grammarAccess.getFloatExprRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0()) {
					sequence_FloatExpr(context, (FloatExpr) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.FLUENT:
				if(context == grammarAccess.getFluentRule()) {
					sequence_Fluent(context, (Fluent) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.FLUENT_WHOSE_VALUE:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getBoolExprRule() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_1_0() ||
				   context == grammarAccess.getFluentWhoseValueRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getStringExprRule()) {
					sequence_FluentWhoseValue(context, (FluentWhoseValue) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.IN_RULE:
				if(context == grammarAccess.getInRuleRule()) {
					sequence_InRule(context, (InRule) semanticObject); 
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
			case EcePackage.OR:
				if(context == grammarAccess.getBoolExprRule() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0()) {
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
			case EcePackage.PRIMARY:
				if(context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Primary) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.STR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getBoolExprRule() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getStrRule() ||
				   context == grammarAccess.getStringExprRule()) {
					sequence_Str(context, (Str) semanticObject); 
					return; 
				}
				else break;
			case EcePackage.TO_RULE:
				if(context == grammarAccess.getToRuleRule()) {
					sequence_ToRule(context, (ToRule) semanticObject); 
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAndAccess().getAndLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getAndAccess().getRightEqualityParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
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
	 *     statements+=Statement*
	 */
	protected void sequence_DroolsModel(EObject context, DroolsModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     ((left=Equality_Equality_0_1_0 (op='==' | op='!=') right=FloatExpr) | (left=Equality_Equality_1_1_0 (op='==' | op='!=') right=StringExpr))
	 */
	protected void sequence_Equality(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality_Equality_0_1_0 (op='==' | op='!=') right=FloatExpr)
	 */
	protected void sequence_Equality_Equality_0_1_0(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality_Equality_1_1_0 (op='==' | op='!=') right=StringExpr)
	 */
	protected void sequence_Equality_Equality_1_1_0(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     eventName=ID
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.EVENT__EVENT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.EVENT__EVENT_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventAccess().getEventNameIDTerminalRuleCall_0(), semanticObject.getEventName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fluentName=ID valuePart=ToRule timePart=InRule?)
	 */
	protected void sequence_ExpFluent(EObject context, ExpFluent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (valueDirect=FLOAT | valueOfFluent=FluentWhoseValue)
	 */
	protected void sequence_FloatExpr(EObject context, FloatExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     fluentWhoseValueName=ID
	 */
	protected void sequence_FluentWhoseValue(EObject context, FluentWhoseValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fluentName=ID valuePart=ToRule)
	 */
	protected void sequence_Fluent(EObject context, Fluent semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.FLUENT__FLUENT_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.FLUENT__FLUENT_NAME));
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.FLUENT__VALUE_PART) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.FLUENT__VALUE_PART));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getFluentAccess().getFluentNameIDTerminalRuleCall_0_0(), semanticObject.getFluentName());
		feeder.accept(grammarAccess.getFluentAccess().getValuePartToRuleParserRuleCall_1_1_0(), semanticObject.getValuePart());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (time=INT | currentTime='now')
	 */
	protected void sequence_InRule(EObject context, InRule semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
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
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.OR__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.OR__LEFT));
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.OR__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.OR__RIGHT));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getOrAccess().getOrLeftAction_1_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getOrAccess().getRightAndParserRuleCall_1_2_0(), semanticObject.getRight());
		feeder.finish();
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
	 *     valueDirect=FLOAT
	 */
	protected void sequence_Primary(EObject context, Primary semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=Event fluent+=Fluent fluent+=Fluent*)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=STRING
	 */
	protected void sequence_Str(EObject context, Str semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=StringExpr
	 */
	protected void sequence_ToRule(EObject context, ToRule semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, EcePackage.Literals.TO_RULE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, EcePackage.Literals.TO_RULE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getToRuleAccess().getExpressionStringExprParserRuleCall_0(), semanticObject.getExpression());
		feeder.finish();
	}
}
