/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.xtext.ecerule.ece.EceFactory
 * @model kind="package"
 * @generated
 */
public interface EcePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ece";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.xtext.org/ecerule/Ece";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ece";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EcePackage eINSTANCE = org.xtext.ecerule.ece.impl.EcePackageImpl.init();

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.EceModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.EceModelImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEceModel()
   * @generated
   */
  int ECE_MODEL = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECE_MODEL__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ECE_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.StatementImpl <em>Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.StatementImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getStatement()
   * @generated
   */
  int STATEMENT = 1;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EVENT = 0;

  /**
   * The feature id for the '<em><b>Contexts List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__CONTEXTS_LIST = 1;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.EventImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEvent()
   * @generated
   */
  int EVENT = 2;

  /**
   * The feature id for the '<em><b>Event Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__EVENT_NAME = 0;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PARAMS = 1;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ReferenceTypeImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getReferenceType()
   * @generated
   */
  int REFERENCE_TYPE = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Reference Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.EventFeatureImpl <em>Event Feature</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.EventFeatureImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEventFeature()
   * @generated
   */
  int EVENT_FEATURE = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE__NAME = REFERENCE_TYPE__NAME;

  /**
   * The number of structural features of the '<em>Event Feature</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ContextsListImpl <em>Contexts List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ContextsListImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getContextsList()
   * @generated
   */
  int CONTEXTS_LIST = 4;

  /**
   * The feature id for the '<em><b>Ec Contexts List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTS_LIST__EC_CONTEXTS_LIST = 0;

  /**
   * The feature id for the '<em><b>Exp Contexts List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTS_LIST__EXP_CONTEXTS_LIST = 1;

  /**
   * The number of structural features of the '<em>Contexts List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXTS_LIST_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.EcContextsListImpl <em>Ec Contexts List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.EcContextsListImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEcContextsList()
   * @generated
   */
  int EC_CONTEXTS_LIST = 5;

  /**
   * The feature id for the '<em><b>Ec Contexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_CONTEXTS_LIST__EC_CONTEXTS = 0;

  /**
   * The number of structural features of the '<em>Ec Contexts List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_CONTEXTS_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ExpContextsListImpl <em>Exp Contexts List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ExpContextsListImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getExpContextsList()
   * @generated
   */
  int EXP_CONTEXTS_LIST = 6;

  /**
   * The feature id for the '<em><b>Exp Contexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXTS_LIST__EXP_CONTEXTS = 0;

  /**
   * The number of structural features of the '<em>Exp Contexts List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXTS_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.EcContextImpl <em>Ec Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.EcContextImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEcContext()
   * @generated
   */
  int EC_CONTEXT = 7;

  /**
   * The feature id for the '<em><b>Fluent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_CONTEXT__FLUENT = 0;

  /**
   * The number of structural features of the '<em>Ec Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EC_CONTEXT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ExpContextImpl <em>Exp Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ExpContextImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getExpContext()
   * @generated
   */
  int EXP_CONTEXT = 8;

  /**
   * The feature id for the '<em><b>Final Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXT__FINAL_CONDITION = 0;

  /**
   * The feature id for the '<em><b>Allen Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXT__ALLEN_OP = 1;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXT__TIME = 2;

  /**
   * The feature id for the '<em><b>Initial Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXT__INITIAL_CONDITION = 3;

  /**
   * The feature id for the '<em><b>Action F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXT__ACTION_F = 4;

  /**
   * The feature id for the '<em><b>Action V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXT__ACTION_V = 5;

  /**
   * The number of structural features of the '<em>Exp Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_CONTEXT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AllenOpImpl <em>Allen Op</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AllenOpImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAllenOp()
   * @generated
   */
  int ALLEN_OP = 9;

  /**
   * The number of structural features of the '<em>Allen Op</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLEN_OP_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.FluentImpl <em>Fluent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.FluentImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFluent()
   * @generated
   */
  int FLUENT = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__NAME = REFERENCE_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Value Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__VALUE_PART = REFERENCE_TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Cond Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__COND_PART = REFERENCE_TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Fluent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_FEATURE_COUNT = REFERENCE_TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ExpressionImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getExpression()
   * @generated
   */
  int EXPRESSION = 11;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AtomicImpl <em>Atomic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AtomicImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtomic()
   * @generated
   */
  int ATOMIC = 12;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Atomic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATOMIC_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.EqualityImpl <em>Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.EqualityImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 14;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ConditionRuleImpl <em>Condition Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ConditionRuleImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getConditionRule()
   * @generated
   */
  int CONDITION_RULE = 15;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_RULE__CONDITION = 0;

  /**
   * The number of structural features of the '<em>Condition Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITION_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.FluentRefImpl <em>Fluent Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.FluentRefImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFluentRef()
   * @generated
   */
  int FLUENT_REF = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_REF__VALUE = 0;

  /**
   * The number of structural features of the '<em>Fluent Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_REF_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AtExprImpl <em>At Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AtExprImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtExpr()
   * @generated
   */
  int AT_EXPR = 17;

  /**
   * The number of structural features of the '<em>At Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AllenOperatorImpl <em>Allen Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AllenOperatorImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAllenOperator()
   * @generated
   */
  int ALLEN_OPERATOR = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLEN_OPERATOR__VALUE = ALLEN_OP_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Allen Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALLEN_OPERATOR_FEATURE_COUNT = ALLEN_OP_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.MulOrDivImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMulOrDiv()
   * @generated
   */
  int MUL_OR_DIV = 19;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Mul Or Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.FloatConstantImpl <em>Float Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.FloatConstantImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFloatConstant()
   * @generated
   */
  int FLOAT_CONSTANT = 20;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__EXPRESSION = ATOMIC__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__LEFT = ATOMIC__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__OP = ATOMIC__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__RIGHT = ATOMIC__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT__VALUE = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Float Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_CONSTANT_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.IntConstantImpl <em>Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.IntConstantImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getIntConstant()
   * @generated
   */
  int INT_CONSTANT = 21;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__EXPRESSION = ATOMIC__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__LEFT = ATOMIC__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__OP = ATOMIC__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__RIGHT = ATOMIC__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT__VALUE = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INT_CONSTANT_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.BoolConstantImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getBoolConstant()
   * @generated
   */
  int BOOL_CONSTANT = 22;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__EXPRESSION = ATOMIC__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__LEFT = ATOMIC__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__OP = ATOMIC__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__RIGHT = ATOMIC__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT__VALUE = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Bool Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_CONSTANT_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ReferenceImpl <em>Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ReferenceImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getReference()
   * @generated
   */
  int REFERENCE = 23;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__EXPRESSION = ATOMIC__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__LEFT = ATOMIC__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__OP = ATOMIC__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__RIGHT = ATOMIC__RIGHT;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__REF = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Fluent Value Sample</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE__FLUENT_VALUE_SAMPLE = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REFERENCE_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.CurrentTimeImpl <em>Current Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.CurrentTimeImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getCurrentTime()
   * @generated
   */
  int CURRENT_TIME = 24;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME__EXPRESSION = ATOMIC__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME__LEFT = ATOMIC__LEFT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME__OP = ATOMIC__OP;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME__RIGHT = ATOMIC__RIGHT;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME__VALUE = ATOMIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Current Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CURRENT_TIME_FEATURE_COUNT = ATOMIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.OrImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getOr()
   * @generated
   */
  int OR = 25;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AndImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAnd()
   * @generated
   */
  int AND = 26;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ComparisonImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 27;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.PlusImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getPlus()
   * @generated
   */
  int PLUS = 28;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.MinusImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMinus()
   * @generated
   */
  int MINUS = 29;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = EXPRESSION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.NotImpl <em>Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.NotImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getNot()
   * @generated
   */
  int NOT = 30;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT__EXPRESSION = EXPRESSION__EXPRESSION;

  /**
   * The number of structural features of the '<em>Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOT_FEATURE_COUNT = EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AtTimePlusOrMinImpl <em>At Time Plus Or Min</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AtTimePlusOrMinImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtTimePlusOrMin()
   * @generated
   */
  int AT_TIME_PLUS_OR_MIN = 31;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_PLUS_OR_MIN__LEFT = AT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_PLUS_OR_MIN__OP = AT_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_PLUS_OR_MIN__RIGHT = AT_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>At Time Plus Or Min</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_PLUS_OR_MIN_FEATURE_COUNT = AT_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AtTimeIntConstantImpl <em>At Time Int Constant</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AtTimeIntConstantImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtTimeIntConstant()
   * @generated
   */
  int AT_TIME_INT_CONSTANT = 32;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_INT_CONSTANT__VALUE = AT_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>At Time Int Constant</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_INT_CONSTANT_FEATURE_COUNT = AT_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AtTimeCurrentTimeImpl <em>At Time Current Time</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AtTimeCurrentTimeImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtTimeCurrentTime()
   * @generated
   */
  int AT_TIME_CURRENT_TIME = 33;

  /**
   * The feature id for the '<em><b>At Time Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_CURRENT_TIME__AT_TIME_VALUE = AT_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>At Time Current Time</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AT_TIME_CURRENT_TIME_FEATURE_COUNT = AT_EXPR_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.EceModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.xtext.ecerule.ece.EceModel
   * @generated
   */
  EClass getEceModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ecerule.ece.EceModel#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.ecerule.ece.EceModel#getStatements()
   * @see #getEceModel()
   * @generated
   */
  EReference getEceModel_Statements();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Statement <em>Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Statement</em>'.
   * @see org.xtext.ecerule.ece.Statement
   * @generated
   */
  EClass getStatement();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Statement#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Event</em>'.
   * @see org.xtext.ecerule.ece.Statement#getEvent()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Event();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Statement#getContextsList <em>Contexts List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Contexts List</em>'.
   * @see org.xtext.ecerule.ece.Statement#getContextsList()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_ContextsList();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.xtext.ecerule.ece.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.Event#getEventName <em>Event Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Event Name</em>'.
   * @see org.xtext.ecerule.ece.Event#getEventName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_EventName();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ecerule.ece.Event#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see org.xtext.ecerule.ece.Event#getParams()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Params();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.EventFeature <em>Event Feature</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event Feature</em>'.
   * @see org.xtext.ecerule.ece.EventFeature
   * @generated
   */
  EClass getEventFeature();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.ContextsList <em>Contexts List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contexts List</em>'.
   * @see org.xtext.ecerule.ece.ContextsList
   * @generated
   */
  EClass getContextsList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ContextsList#getEcContextsList <em>Ec Contexts List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Ec Contexts List</em>'.
   * @see org.xtext.ecerule.ece.ContextsList#getEcContextsList()
   * @see #getContextsList()
   * @generated
   */
  EReference getContextsList_EcContextsList();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ContextsList#getExpContextsList <em>Exp Contexts List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp Contexts List</em>'.
   * @see org.xtext.ecerule.ece.ContextsList#getExpContextsList()
   * @see #getContextsList()
   * @generated
   */
  EReference getContextsList_ExpContextsList();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.EcContextsList <em>Ec Contexts List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ec Contexts List</em>'.
   * @see org.xtext.ecerule.ece.EcContextsList
   * @generated
   */
  EClass getEcContextsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ecerule.ece.EcContextsList#getEcContexts <em>Ec Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Ec Contexts</em>'.
   * @see org.xtext.ecerule.ece.EcContextsList#getEcContexts()
   * @see #getEcContextsList()
   * @generated
   */
  EReference getEcContextsList_EcContexts();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.ExpContextsList <em>Exp Contexts List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Contexts List</em>'.
   * @see org.xtext.ecerule.ece.ExpContextsList
   * @generated
   */
  EClass getExpContextsList();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ecerule.ece.ExpContextsList#getExpContexts <em>Exp Contexts</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp Contexts</em>'.
   * @see org.xtext.ecerule.ece.ExpContextsList#getExpContexts()
   * @see #getExpContextsList()
   * @generated
   */
  EReference getExpContextsList_ExpContexts();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.EcContext <em>Ec Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ec Context</em>'.
   * @see org.xtext.ecerule.ece.EcContext
   * @generated
   */
  EClass getEcContext();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ecerule.ece.EcContext#getFluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fluent</em>'.
   * @see org.xtext.ecerule.ece.EcContext#getFluent()
   * @see #getEcContext()
   * @generated
   */
  EReference getEcContext_Fluent();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.ExpContext <em>Exp Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Context</em>'.
   * @see org.xtext.ecerule.ece.ExpContext
   * @generated
   */
  EClass getExpContext();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ExpContext#getFinalCondition <em>Final Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Final Condition</em>'.
   * @see org.xtext.ecerule.ece.ExpContext#getFinalCondition()
   * @see #getExpContext()
   * @generated
   */
  EReference getExpContext_FinalCondition();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ExpContext#getAllenOp <em>Allen Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Allen Op</em>'.
   * @see org.xtext.ecerule.ece.ExpContext#getAllenOp()
   * @see #getExpContext()
   * @generated
   */
  EReference getExpContext_AllenOp();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.ExpContext#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.xtext.ecerule.ece.ExpContext#getTime()
   * @see #getExpContext()
   * @generated
   */
  EAttribute getExpContext_Time();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ExpContext#getInitialCondition <em>Initial Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Initial Condition</em>'.
   * @see org.xtext.ecerule.ece.ExpContext#getInitialCondition()
   * @see #getExpContext()
   * @generated
   */
  EReference getExpContext_InitialCondition();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.ExpContext#getActionF <em>Action F</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action F</em>'.
   * @see org.xtext.ecerule.ece.ExpContext#getActionF()
   * @see #getExpContext()
   * @generated
   */
  EAttribute getExpContext_ActionF();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.ExpContext#getActionV <em>Action V</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Action V</em>'.
   * @see org.xtext.ecerule.ece.ExpContext#getActionV()
   * @see #getExpContext()
   * @generated
   */
  EAttribute getExpContext_ActionV();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.AllenOp <em>Allen Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allen Op</em>'.
   * @see org.xtext.ecerule.ece.AllenOp
   * @generated
   */
  EClass getAllenOp();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Fluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fluent</em>'.
   * @see org.xtext.ecerule.ece.Fluent
   * @generated
   */
  EClass getFluent();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Fluent#getValuePart <em>Value Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Part</em>'.
   * @see org.xtext.ecerule.ece.Fluent#getValuePart()
   * @see #getFluent()
   * @generated
   */
  EReference getFluent_ValuePart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Fluent#getCondPart <em>Cond Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Cond Part</em>'.
   * @see org.xtext.ecerule.ece.Fluent#getCondPart()
   * @see #getFluent()
   * @generated
   */
  EReference getFluent_CondPart();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.xtext.ecerule.ece.Expression
   * @generated
   */
  EClass getExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Expression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.ecerule.ece.Expression#getExpression()
   * @see #getExpression()
   * @generated
   */
  EReference getExpression_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Atomic <em>Atomic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Atomic</em>'.
   * @see org.xtext.ecerule.ece.Atomic
   * @generated
   */
  EClass getAtomic();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.ReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference Type</em>'.
   * @see org.xtext.ecerule.ece.ReferenceType
   * @generated
   */
  EClass getReferenceType();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.ReferenceType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.xtext.ecerule.ece.ReferenceType#getName()
   * @see #getReferenceType()
   * @generated
   */
  EAttribute getReferenceType_Name();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Equality <em>Equality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Equality</em>'.
   * @see org.xtext.ecerule.ece.Equality
   * @generated
   */
  EClass getEquality();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Equality#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.ecerule.ece.Equality#getLeft()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.Equality#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.ecerule.ece.Equality#getOp()
   * @see #getEquality()
   * @generated
   */
  EAttribute getEquality_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Equality#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.ecerule.ece.Equality#getRight()
   * @see #getEquality()
   * @generated
   */
  EReference getEquality_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.ConditionRule <em>Condition Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Condition Rule</em>'.
   * @see org.xtext.ecerule.ece.ConditionRule
   * @generated
   */
  EClass getConditionRule();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ConditionRule#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see org.xtext.ecerule.ece.ConditionRule#getCondition()
   * @see #getConditionRule()
   * @generated
   */
  EReference getConditionRule_Condition();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.FluentRef <em>Fluent Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fluent Ref</em>'.
   * @see org.xtext.ecerule.ece.FluentRef
   * @generated
   */
  EClass getFluentRef();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.FluentRef#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.FluentRef#getValue()
   * @see #getFluentRef()
   * @generated
   */
  EAttribute getFluentRef_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.AtExpr <em>At Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Expr</em>'.
   * @see org.xtext.ecerule.ece.AtExpr
   * @generated
   */
  EClass getAtExpr();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.AllenOperator <em>Allen Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Allen Operator</em>'.
   * @see org.xtext.ecerule.ece.AllenOperator
   * @generated
   */
  EClass getAllenOperator();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.AllenOperator#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.AllenOperator#getValue()
   * @see #getAllenOperator()
   * @generated
   */
  EAttribute getAllenOperator_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.MulOrDiv <em>Mul Or Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mul Or Div</em>'.
   * @see org.xtext.ecerule.ece.MulOrDiv
   * @generated
   */
  EClass getMulOrDiv();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.MulOrDiv#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.ecerule.ece.MulOrDiv#getLeft()
   * @see #getMulOrDiv()
   * @generated
   */
  EReference getMulOrDiv_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.MulOrDiv#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.ecerule.ece.MulOrDiv#getOp()
   * @see #getMulOrDiv()
   * @generated
   */
  EAttribute getMulOrDiv_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.MulOrDiv#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.ecerule.ece.MulOrDiv#getRight()
   * @see #getMulOrDiv()
   * @generated
   */
  EReference getMulOrDiv_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.FloatConstant <em>Float Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Constant</em>'.
   * @see org.xtext.ecerule.ece.FloatConstant
   * @generated
   */
  EClass getFloatConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.FloatConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.FloatConstant#getValue()
   * @see #getFloatConstant()
   * @generated
   */
  EAttribute getFloatConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.IntConstant <em>Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Int Constant</em>'.
   * @see org.xtext.ecerule.ece.IntConstant
   * @generated
   */
  EClass getIntConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.IntConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.IntConstant#getValue()
   * @see #getIntConstant()
   * @generated
   */
  EAttribute getIntConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.BoolConstant <em>Bool Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Constant</em>'.
   * @see org.xtext.ecerule.ece.BoolConstant
   * @generated
   */
  EClass getBoolConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.BoolConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.BoolConstant#getValue()
   * @see #getBoolConstant()
   * @generated
   */
  EAttribute getBoolConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Reference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reference</em>'.
   * @see org.xtext.ecerule.ece.Reference
   * @generated
   */
  EClass getReference();

  /**
   * Returns the meta object for the reference '{@link org.xtext.ecerule.ece.Reference#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see org.xtext.ecerule.ece.Reference#getRef()
   * @see #getReference()
   * @generated
   */
  EReference getReference_Ref();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Reference#getFluentValueSample <em>Fluent Value Sample</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Fluent Value Sample</em>'.
   * @see org.xtext.ecerule.ece.Reference#getFluentValueSample()
   * @see #getReference()
   * @generated
   */
  EReference getReference_FluentValueSample();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.CurrentTime <em>Current Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Current Time</em>'.
   * @see org.xtext.ecerule.ece.CurrentTime
   * @generated
   */
  EClass getCurrentTime();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.CurrentTime#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.CurrentTime#getValue()
   * @see #getCurrentTime()
   * @generated
   */
  EAttribute getCurrentTime_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Or <em>Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Or</em>'.
   * @see org.xtext.ecerule.ece.Or
   * @generated
   */
  EClass getOr();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Or#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.ecerule.ece.Or#getLeft()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Or#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.ecerule.ece.Or#getRight()
   * @see #getOr()
   * @generated
   */
  EReference getOr_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.And <em>And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>And</em>'.
   * @see org.xtext.ecerule.ece.And
   * @generated
   */
  EClass getAnd();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.And#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.ecerule.ece.And#getLeft()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.And#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.ecerule.ece.And#getRight()
   * @see #getAnd()
   * @generated
   */
  EReference getAnd_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see org.xtext.ecerule.ece.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Comparison#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.ecerule.ece.Comparison#getLeft()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.Comparison#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.ecerule.ece.Comparison#getOp()
   * @see #getComparison()
   * @generated
   */
  EAttribute getComparison_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Comparison#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.ecerule.ece.Comparison#getRight()
   * @see #getComparison()
   * @generated
   */
  EReference getComparison_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Plus <em>Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus</em>'.
   * @see org.xtext.ecerule.ece.Plus
   * @generated
   */
  EClass getPlus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Plus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.ecerule.ece.Plus#getLeft()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Plus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.ecerule.ece.Plus#getRight()
   * @see #getPlus()
   * @generated
   */
  EReference getPlus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.xtext.ecerule.ece.Minus
   * @generated
   */
  EClass getMinus();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Minus#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.ecerule.ece.Minus#getLeft()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Left();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Minus#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.ecerule.ece.Minus#getRight()
   * @see #getMinus()
   * @generated
   */
  EReference getMinus_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Not <em>Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Not</em>'.
   * @see org.xtext.ecerule.ece.Not
   * @generated
   */
  EClass getNot();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.AtTimePlusOrMin <em>At Time Plus Or Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Time Plus Or Min</em>'.
   * @see org.xtext.ecerule.ece.AtTimePlusOrMin
   * @generated
   */
  EClass getAtTimePlusOrMin();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see org.xtext.ecerule.ece.AtTimePlusOrMin#getLeft()
   * @see #getAtTimePlusOrMin()
   * @generated
   */
  EReference getAtTimePlusOrMin_Left();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.ecerule.ece.AtTimePlusOrMin#getOp()
   * @see #getAtTimePlusOrMin()
   * @generated
   */
  EAttribute getAtTimePlusOrMin_Op();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see org.xtext.ecerule.ece.AtTimePlusOrMin#getRight()
   * @see #getAtTimePlusOrMin()
   * @generated
   */
  EReference getAtTimePlusOrMin_Right();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.AtTimeIntConstant <em>At Time Int Constant</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Time Int Constant</em>'.
   * @see org.xtext.ecerule.ece.AtTimeIntConstant
   * @generated
   */
  EClass getAtTimeIntConstant();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.AtTimeIntConstant#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.AtTimeIntConstant#getValue()
   * @see #getAtTimeIntConstant()
   * @generated
   */
  EAttribute getAtTimeIntConstant_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.AtTimeCurrentTime <em>At Time Current Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>At Time Current Time</em>'.
   * @see org.xtext.ecerule.ece.AtTimeCurrentTime
   * @generated
   */
  EClass getAtTimeCurrentTime();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.AtTimeCurrentTime#getAtTimeValue <em>At Time Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>At Time Value</em>'.
   * @see org.xtext.ecerule.ece.AtTimeCurrentTime#getAtTimeValue()
   * @see #getAtTimeCurrentTime()
   * @generated
   */
  EAttribute getAtTimeCurrentTime_AtTimeValue();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  EceFactory getEceFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.EceModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.EceModelImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEceModel()
     * @generated
     */
    EClass ECE_MODEL = eINSTANCE.getEceModel();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ECE_MODEL__STATEMENTS = eINSTANCE.getEceModel_Statements();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.StatementImpl <em>Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.StatementImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getStatement()
     * @generated
     */
    EClass STATEMENT = eINSTANCE.getStatement();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EVENT = eINSTANCE.getStatement_Event();

    /**
     * The meta object literal for the '<em><b>Contexts List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__CONTEXTS_LIST = eINSTANCE.getStatement_ContextsList();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.EventImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Event Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__EVENT_NAME = eINSTANCE.getEvent_EventName();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__PARAMS = eINSTANCE.getEvent_Params();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.EventFeatureImpl <em>Event Feature</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.EventFeatureImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEventFeature()
     * @generated
     */
    EClass EVENT_FEATURE = eINSTANCE.getEventFeature();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ContextsListImpl <em>Contexts List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ContextsListImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getContextsList()
     * @generated
     */
    EClass CONTEXTS_LIST = eINSTANCE.getContextsList();

    /**
     * The meta object literal for the '<em><b>Ec Contexts List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXTS_LIST__EC_CONTEXTS_LIST = eINSTANCE.getContextsList_EcContextsList();

    /**
     * The meta object literal for the '<em><b>Exp Contexts List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXTS_LIST__EXP_CONTEXTS_LIST = eINSTANCE.getContextsList_ExpContextsList();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.EcContextsListImpl <em>Ec Contexts List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.EcContextsListImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEcContextsList()
     * @generated
     */
    EClass EC_CONTEXTS_LIST = eINSTANCE.getEcContextsList();

    /**
     * The meta object literal for the '<em><b>Ec Contexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EC_CONTEXTS_LIST__EC_CONTEXTS = eINSTANCE.getEcContextsList_EcContexts();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ExpContextsListImpl <em>Exp Contexts List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ExpContextsListImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getExpContextsList()
     * @generated
     */
    EClass EXP_CONTEXTS_LIST = eINSTANCE.getExpContextsList();

    /**
     * The meta object literal for the '<em><b>Exp Contexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_CONTEXTS_LIST__EXP_CONTEXTS = eINSTANCE.getExpContextsList_ExpContexts();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.EcContextImpl <em>Ec Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.EcContextImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEcContext()
     * @generated
     */
    EClass EC_CONTEXT = eINSTANCE.getEcContext();

    /**
     * The meta object literal for the '<em><b>Fluent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EC_CONTEXT__FLUENT = eINSTANCE.getEcContext_Fluent();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ExpContextImpl <em>Exp Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ExpContextImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getExpContext()
     * @generated
     */
    EClass EXP_CONTEXT = eINSTANCE.getExpContext();

    /**
     * The meta object literal for the '<em><b>Final Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_CONTEXT__FINAL_CONDITION = eINSTANCE.getExpContext_FinalCondition();

    /**
     * The meta object literal for the '<em><b>Allen Op</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_CONTEXT__ALLEN_OP = eINSTANCE.getExpContext_AllenOp();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP_CONTEXT__TIME = eINSTANCE.getExpContext_Time();

    /**
     * The meta object literal for the '<em><b>Initial Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_CONTEXT__INITIAL_CONDITION = eINSTANCE.getExpContext_InitialCondition();

    /**
     * The meta object literal for the '<em><b>Action F</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP_CONTEXT__ACTION_F = eINSTANCE.getExpContext_ActionF();

    /**
     * The meta object literal for the '<em><b>Action V</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP_CONTEXT__ACTION_V = eINSTANCE.getExpContext_ActionV();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.AllenOpImpl <em>Allen Op</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.AllenOpImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAllenOp()
     * @generated
     */
    EClass ALLEN_OP = eINSTANCE.getAllenOp();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.FluentImpl <em>Fluent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.FluentImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFluent()
     * @generated
     */
    EClass FLUENT = eINSTANCE.getFluent();

    /**
     * The meta object literal for the '<em><b>Value Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__VALUE_PART = eINSTANCE.getFluent_ValuePart();

    /**
     * The meta object literal for the '<em><b>Cond Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__COND_PART = eINSTANCE.getFluent_CondPart();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ExpressionImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getExpression()
     * @generated
     */
    EClass EXPRESSION = eINSTANCE.getExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXPRESSION__EXPRESSION = eINSTANCE.getExpression_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.AtomicImpl <em>Atomic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.AtomicImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtomic()
     * @generated
     */
    EClass ATOMIC = eINSTANCE.getAtomic();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ReferenceTypeImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getReferenceType()
     * @generated
     */
    EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REFERENCE_TYPE__NAME = eINSTANCE.getReferenceType_Name();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.EqualityImpl <em>Equality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.EqualityImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEquality()
     * @generated
     */
    EClass EQUALITY = eINSTANCE.getEquality();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__LEFT = eINSTANCE.getEquality_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EQUALITY__OP = eINSTANCE.getEquality_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EQUALITY__RIGHT = eINSTANCE.getEquality_Right();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ConditionRuleImpl <em>Condition Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ConditionRuleImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getConditionRule()
     * @generated
     */
    EClass CONDITION_RULE = eINSTANCE.getConditionRule();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITION_RULE__CONDITION = eINSTANCE.getConditionRule_Condition();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.FluentRefImpl <em>Fluent Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.FluentRefImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFluentRef()
     * @generated
     */
    EClass FLUENT_REF = eINSTANCE.getFluentRef();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLUENT_REF__VALUE = eINSTANCE.getFluentRef_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.AtExprImpl <em>At Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.AtExprImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtExpr()
     * @generated
     */
    EClass AT_EXPR = eINSTANCE.getAtExpr();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.AllenOperatorImpl <em>Allen Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.AllenOperatorImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAllenOperator()
     * @generated
     */
    EClass ALLEN_OPERATOR = eINSTANCE.getAllenOperator();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALLEN_OPERATOR__VALUE = eINSTANCE.getAllenOperator_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.MulOrDivImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMulOrDiv()
     * @generated
     */
    EClass MUL_OR_DIV = eINSTANCE.getMulOrDiv();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_OR_DIV__LEFT = eINSTANCE.getMulOrDiv_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUL_OR_DIV__OP = eINSTANCE.getMulOrDiv_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MUL_OR_DIV__RIGHT = eINSTANCE.getMulOrDiv_Right();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.FloatConstantImpl <em>Float Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.FloatConstantImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFloatConstant()
     * @generated
     */
    EClass FLOAT_CONSTANT = eINSTANCE.getFloatConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_CONSTANT__VALUE = eINSTANCE.getFloatConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.IntConstantImpl <em>Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.IntConstantImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getIntConstant()
     * @generated
     */
    EClass INT_CONSTANT = eINSTANCE.getIntConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute INT_CONSTANT__VALUE = eINSTANCE.getIntConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.BoolConstantImpl <em>Bool Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.BoolConstantImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getBoolConstant()
     * @generated
     */
    EClass BOOL_CONSTANT = eINSTANCE.getBoolConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_CONSTANT__VALUE = eINSTANCE.getBoolConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ReferenceImpl <em>Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ReferenceImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getReference()
     * @generated
     */
    EClass REFERENCE = eINSTANCE.getReference();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__REF = eINSTANCE.getReference_Ref();

    /**
     * The meta object literal for the '<em><b>Fluent Value Sample</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REFERENCE__FLUENT_VALUE_SAMPLE = eINSTANCE.getReference_FluentValueSample();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.CurrentTimeImpl <em>Current Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.CurrentTimeImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getCurrentTime()
     * @generated
     */
    EClass CURRENT_TIME = eINSTANCE.getCurrentTime();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CURRENT_TIME__VALUE = eINSTANCE.getCurrentTime_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.OrImpl <em>Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.OrImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getOr()
     * @generated
     */
    EClass OR = eINSTANCE.getOr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__LEFT = eINSTANCE.getOr_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference OR__RIGHT = eINSTANCE.getOr_Right();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.AndImpl <em>And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.AndImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAnd()
     * @generated
     */
    EClass AND = eINSTANCE.getAnd();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__LEFT = eINSTANCE.getAnd_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AND__RIGHT = eINSTANCE.getAnd_Right();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ComparisonImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__LEFT = eINSTANCE.getComparison_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COMPARISON__OP = eINSTANCE.getComparison_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPARISON__RIGHT = eINSTANCE.getComparison_Right();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.PlusImpl <em>Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.PlusImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getPlus()
     * @generated
     */
    EClass PLUS = eINSTANCE.getPlus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__LEFT = eINSTANCE.getPlus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PLUS__RIGHT = eINSTANCE.getPlus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.MinusImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__LEFT = eINSTANCE.getMinus_Left();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MINUS__RIGHT = eINSTANCE.getMinus_Right();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.NotImpl <em>Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.NotImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getNot()
     * @generated
     */
    EClass NOT = eINSTANCE.getNot();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.AtTimePlusOrMinImpl <em>At Time Plus Or Min</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.AtTimePlusOrMinImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtTimePlusOrMin()
     * @generated
     */
    EClass AT_TIME_PLUS_OR_MIN = eINSTANCE.getAtTimePlusOrMin();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT_TIME_PLUS_OR_MIN__LEFT = eINSTANCE.getAtTimePlusOrMin_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_TIME_PLUS_OR_MIN__OP = eINSTANCE.getAtTimePlusOrMin_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AT_TIME_PLUS_OR_MIN__RIGHT = eINSTANCE.getAtTimePlusOrMin_Right();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.AtTimeIntConstantImpl <em>At Time Int Constant</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.AtTimeIntConstantImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtTimeIntConstant()
     * @generated
     */
    EClass AT_TIME_INT_CONSTANT = eINSTANCE.getAtTimeIntConstant();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_TIME_INT_CONSTANT__VALUE = eINSTANCE.getAtTimeIntConstant_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.AtTimeCurrentTimeImpl <em>At Time Current Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.AtTimeCurrentTimeImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAtTimeCurrentTime()
     * @generated
     */
    EClass AT_TIME_CURRENT_TIME = eINSTANCE.getAtTimeCurrentTime();

    /**
     * The meta object literal for the '<em><b>At Time Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AT_TIME_CURRENT_TIME__AT_TIME_VALUE = eINSTANCE.getAtTimeCurrentTime_AtTimeValue();

  }

} //EcePackage
