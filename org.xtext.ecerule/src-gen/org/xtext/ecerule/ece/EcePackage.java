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
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.DroolsModelImpl <em>Drools Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.DroolsModelImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getDroolsModel()
   * @generated
   */
  int DROOLS_MODEL = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROOLS_MODEL__STATEMENTS = 0;

  /**
   * The number of structural features of the '<em>Drools Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DROOLS_MODEL_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Fluent</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__FLUENT = 1;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT__EXP = 2;

  /**
   * The number of structural features of the '<em>Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATEMENT_FEATURE_COUNT = 3;

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
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.FluentImpl <em>Fluent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.FluentImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFluent()
   * @generated
   */
  int FLUENT = 3;

  /**
   * The feature id for the '<em><b>Fluent Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__FLUENT_NAME = 0;

  /**
   * The feature id for the '<em><b>Value Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__VALUE_PART = 1;

  /**
   * The feature id for the '<em><b>Time Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__TIME_PART = 2;

  /**
   * The feature id for the '<em><b>Cond Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT__COND_PART = 3;

  /**
   * The number of structural features of the '<em>Fluent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ToRuleImpl <em>To Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ToRuleImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getToRule()
   * @generated
   */
  int TO_RULE = 4;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_RULE__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>To Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TO_RULE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.BoolExprImpl <em>Bool Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.BoolExprImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getBoolExpr()
   * @generated
   */
  int BOOL_EXPR = 6;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_EXPR__VALUE = 0;

  /**
   * The number of structural features of the '<em>Bool Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BOOL_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.OrImpl <em>Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.OrImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getOr()
   * @generated
   */
  int OR = 7;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__VALUE = BOOL_EXPR__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__LEFT = BOOL_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR__RIGHT = BOOL_EXPR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OR_FEATURE_COUNT = BOOL_EXPR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.AndImpl <em>And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.AndImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getAnd()
   * @generated
   */
  int AND = 8;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__VALUE = OR__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__LEFT = OR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__RIGHT = OR__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND__OP = OR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AND_FEATURE_COUNT = OR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.EqualityImpl <em>Equality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.EqualityImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getEquality()
   * @generated
   */
  int EQUALITY = 9;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__VALUE = AND__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__LEFT = AND__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__RIGHT = AND__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY__OP = AND__OP;

  /**
   * The number of structural features of the '<em>Equality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EQUALITY_FEATURE_COUNT = AND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.StringExprImpl <em>String Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.StringExprImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getStringExpr()
   * @generated
   */
  int STRING_EXPR = 5;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR__VALUE = EQUALITY__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR__LEFT = EQUALITY__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR__RIGHT = EQUALITY__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR__OP = EQUALITY__OP;

  /**
   * The number of structural features of the '<em>String Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STRING_EXPR_FEATURE_COUNT = EQUALITY_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ComparisonImpl <em>Comparison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ComparisonImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getComparison()
   * @generated
   */
  int COMPARISON = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__VALUE = AND__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__LEFT = AND__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__RIGHT = AND__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON__OP = AND__OP;

  /**
   * The number of structural features of the '<em>Comparison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPARISON_FEATURE_COUNT = AND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.switchExprImpl <em>switch Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.switchExprImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getswitchExpr()
   * @generated
   */
  int SWITCH_EXPR = 11;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPR__VALUE = 0;

  /**
   * The number of structural features of the '<em>switch Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.MutationExprImpl <em>Mutation Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.MutationExprImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMutationExpr()
   * @generated
   */
  int MUTATION_EXPR = 12;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUTATION_EXPR__VALUE = 0;

  /**
   * The number of structural features of the '<em>Mutation Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUTATION_EXPR_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.FloatExprImpl <em>Float Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.FloatExprImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFloatExpr()
   * @generated
   */
  int FLOAT_EXPR = 13;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_EXPR__VALUE = EQUALITY__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_EXPR__LEFT = EQUALITY__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_EXPR__RIGHT = EQUALITY__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_EXPR__OP = EQUALITY__OP;

  /**
   * The feature id for the '<em><b>Value Direct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_EXPR__VALUE_DIRECT = EQUALITY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Calculated</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_EXPR__VALUE_CALCULATED = EQUALITY_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value Of Fluent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_EXPR__VALUE_OF_FLUENT = EQUALITY_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Float Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLOAT_EXPR_FEATURE_COUNT = EQUALITY_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.PlusOrMinusImpl <em>Plus Or Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.PlusOrMinusImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getPlusOrMinus()
   * @generated
   */
  int PLUS_OR_MINUS = 14;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS__VALUE = COMPARISON__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS__LEFT = COMPARISON__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS__RIGHT = COMPARISON__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS__OP = COMPARISON__OP;

  /**
   * The number of structural features of the '<em>Plus Or Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_OR_MINUS_FEATURE_COUNT = COMPARISON_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.MulOrDivImpl <em>Mul Or Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.MulOrDivImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMulOrDiv()
   * @generated
   */
  int MUL_OR_DIV = 15;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__VALUE = PLUS_OR_MINUS__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__LEFT = PLUS_OR_MINUS__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__RIGHT = PLUS_OR_MINUS__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV__OP = PLUS_OR_MINUS__OP;

  /**
   * The number of structural features of the '<em>Mul Or Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MUL_OR_DIV_FEATURE_COUNT = PLUS_OR_MINUS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.PrimaryImpl <em>Primary</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.PrimaryImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getPrimary()
   * @generated
   */
  int PRIMARY = 16;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__VALUE = MUL_OR_DIV__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__LEFT = MUL_OR_DIV__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__RIGHT = MUL_OR_DIV__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__OP = MUL_OR_DIV__OP;

  /**
   * The feature id for the '<em><b>Value Direct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__VALUE_DIRECT = MUL_OR_DIV_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Value Of Fluent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY__VALUE_OF_FLUENT = MUL_OR_DIV_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Primary</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMARY_FEATURE_COUNT = MUL_OR_DIV_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.FluentWhoseValueImpl <em>Fluent Whose Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.FluentWhoseValueImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFluentWhoseValue()
   * @generated
   */
  int FLUENT_WHOSE_VALUE = 17;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_WHOSE_VALUE__VALUE = STRING_EXPR__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_WHOSE_VALUE__LEFT = STRING_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_WHOSE_VALUE__RIGHT = STRING_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_WHOSE_VALUE__OP = STRING_EXPR__OP;

  /**
   * The feature id for the '<em><b>Fluent Whose Value Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_WHOSE_VALUE__FLUENT_WHOSE_VALUE_NAME = STRING_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Fluent Whose Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FLUENT_WHOSE_VALUE_FEATURE_COUNT = STRING_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.StrImpl <em>Str</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.StrImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getStr()
   * @generated
   */
  int STR = 18;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR__VALUE = STRING_EXPR__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR__LEFT = STRING_EXPR__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR__RIGHT = STRING_EXPR__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR__OP = STRING_EXPR__OP;

  /**
   * The number of structural features of the '<em>Str</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STR_FEATURE_COUNT = STRING_EXPR_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.InRuleImpl <em>In Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.InRuleImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getInRule()
   * @generated
   */
  int IN_RULE = 19;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_RULE__TIME = 0;

  /**
   * The feature id for the '<em><b>Current Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_RULE__CURRENT_TIME = 1;

  /**
   * The number of structural features of the '<em>In Rule</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IN_RULE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ConditionRuleImpl <em>Condition Rule</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ConditionRuleImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getConditionRule()
   * @generated
   */
  int CONDITION_RULE = 20;

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
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.ExpFluentImpl <em>Exp Fluent</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.ExpFluentImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getExpFluent()
   * @generated
   */
  int EXP_FLUENT = 21;

  /**
   * The feature id for the '<em><b>Fluent Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FLUENT__FLUENT_NAME = 0;

  /**
   * The feature id for the '<em><b>Value Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FLUENT__VALUE_PART = 1;

  /**
   * The feature id for the '<em><b>Time Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FLUENT__TIME_PART = 2;

  /**
   * The number of structural features of the '<em>Exp Fluent</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXP_FLUENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.PlusImpl <em>Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.PlusImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getPlus()
   * @generated
   */
  int PLUS = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__VALUE = PLUS_OR_MINUS__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__LEFT = PLUS_OR_MINUS__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__RIGHT = PLUS_OR_MINUS__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS__OP = PLUS_OR_MINUS__OP;

  /**
   * The number of structural features of the '<em>Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PLUS_FEATURE_COUNT = PLUS_OR_MINUS_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.xtext.ecerule.ece.impl.MinusImpl <em>Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.xtext.ecerule.ece.impl.MinusImpl
   * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMinus()
   * @generated
   */
  int MINUS = 23;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__VALUE = PLUS_OR_MINUS__VALUE;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__LEFT = PLUS_OR_MINUS__LEFT;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__RIGHT = PLUS_OR_MINUS__RIGHT;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS__OP = PLUS_OR_MINUS__OP;

  /**
   * The number of structural features of the '<em>Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MINUS_FEATURE_COUNT = PLUS_OR_MINUS_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.DroolsModel <em>Drools Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Drools Model</em>'.
   * @see org.xtext.ecerule.ece.DroolsModel
   * @generated
   */
  EClass getDroolsModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ecerule.ece.DroolsModel#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see org.xtext.ecerule.ece.DroolsModel#getStatements()
   * @see #getDroolsModel()
   * @generated
   */
  EReference getDroolsModel_Statements();

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
   * Returns the meta object for the containment reference list '{@link org.xtext.ecerule.ece.Statement#getFluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fluent</em>'.
   * @see org.xtext.ecerule.ece.Statement#getFluent()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Fluent();

  /**
   * Returns the meta object for the containment reference list '{@link org.xtext.ecerule.ece.Statement#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Exp</em>'.
   * @see org.xtext.ecerule.ece.Statement#getExp()
   * @see #getStatement()
   * @generated
   */
  EReference getStatement_Exp();

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
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Fluent <em>Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fluent</em>'.
   * @see org.xtext.ecerule.ece.Fluent
   * @generated
   */
  EClass getFluent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.Fluent#getFluentName <em>Fluent Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fluent Name</em>'.
   * @see org.xtext.ecerule.ece.Fluent#getFluentName()
   * @see #getFluent()
   * @generated
   */
  EAttribute getFluent_FluentName();

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
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Fluent#getTimePart <em>Time Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Part</em>'.
   * @see org.xtext.ecerule.ece.Fluent#getTimePart()
   * @see #getFluent()
   * @generated
   */
  EReference getFluent_TimePart();

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
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.ToRule <em>To Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>To Rule</em>'.
   * @see org.xtext.ecerule.ece.ToRule
   * @generated
   */
  EClass getToRule();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ToRule#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see org.xtext.ecerule.ece.ToRule#getExpression()
   * @see #getToRule()
   * @generated
   */
  EReference getToRule_Expression();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.StringExpr <em>String Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>String Expr</em>'.
   * @see org.xtext.ecerule.ece.StringExpr
   * @generated
   */
  EClass getStringExpr();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.BoolExpr <em>Bool Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Bool Expr</em>'.
   * @see org.xtext.ecerule.ece.BoolExpr
   * @generated
   */
  EClass getBoolExpr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.BoolExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.BoolExpr#getValue()
   * @see #getBoolExpr()
   * @generated
   */
  EAttribute getBoolExpr_Value();

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
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.And#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see org.xtext.ecerule.ece.And#getOp()
   * @see #getAnd()
   * @generated
   */
  EAttribute getAnd_Op();

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
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Comparison <em>Comparison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Comparison</em>'.
   * @see org.xtext.ecerule.ece.Comparison
   * @generated
   */
  EClass getComparison();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.switchExpr <em>switch Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>switch Expr</em>'.
   * @see org.xtext.ecerule.ece.switchExpr
   * @generated
   */
  EClass getswitchExpr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.switchExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.switchExpr#getValue()
   * @see #getswitchExpr()
   * @generated
   */
  EAttribute getswitchExpr_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.MutationExpr <em>Mutation Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mutation Expr</em>'.
   * @see org.xtext.ecerule.ece.MutationExpr
   * @generated
   */
  EClass getMutationExpr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.MutationExpr#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see org.xtext.ecerule.ece.MutationExpr#getValue()
   * @see #getMutationExpr()
   * @generated
   */
  EAttribute getMutationExpr_Value();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.FloatExpr <em>Float Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Float Expr</em>'.
   * @see org.xtext.ecerule.ece.FloatExpr
   * @generated
   */
  EClass getFloatExpr();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.FloatExpr#getValueDirect <em>Value Direct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Direct</em>'.
   * @see org.xtext.ecerule.ece.FloatExpr#getValueDirect()
   * @see #getFloatExpr()
   * @generated
   */
  EAttribute getFloatExpr_ValueDirect();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.FloatExpr#getValueCalculated <em>Value Calculated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Calculated</em>'.
   * @see org.xtext.ecerule.ece.FloatExpr#getValueCalculated()
   * @see #getFloatExpr()
   * @generated
   */
  EReference getFloatExpr_ValueCalculated();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.FloatExpr#getValueOfFluent <em>Value Of Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Of Fluent</em>'.
   * @see org.xtext.ecerule.ece.FloatExpr#getValueOfFluent()
   * @see #getFloatExpr()
   * @generated
   */
  EReference getFloatExpr_ValueOfFluent();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.PlusOrMinus <em>Plus Or Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Plus Or Minus</em>'.
   * @see org.xtext.ecerule.ece.PlusOrMinus
   * @generated
   */
  EClass getPlusOrMinus();

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
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Primary <em>Primary</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primary</em>'.
   * @see org.xtext.ecerule.ece.Primary
   * @generated
   */
  EClass getPrimary();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.Primary#getValueDirect <em>Value Direct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value Direct</em>'.
   * @see org.xtext.ecerule.ece.Primary#getValueDirect()
   * @see #getPrimary()
   * @generated
   */
  EAttribute getPrimary_ValueDirect();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.Primary#getValueOfFluent <em>Value Of Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Of Fluent</em>'.
   * @see org.xtext.ecerule.ece.Primary#getValueOfFluent()
   * @see #getPrimary()
   * @generated
   */
  EReference getPrimary_ValueOfFluent();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.FluentWhoseValue <em>Fluent Whose Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fluent Whose Value</em>'.
   * @see org.xtext.ecerule.ece.FluentWhoseValue
   * @generated
   */
  EClass getFluentWhoseValue();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.FluentWhoseValue#getFluentWhoseValueName <em>Fluent Whose Value Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fluent Whose Value Name</em>'.
   * @see org.xtext.ecerule.ece.FluentWhoseValue#getFluentWhoseValueName()
   * @see #getFluentWhoseValue()
   * @generated
   */
  EAttribute getFluentWhoseValue_FluentWhoseValueName();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Str <em>Str</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Str</em>'.
   * @see org.xtext.ecerule.ece.Str
   * @generated
   */
  EClass getStr();

  /**
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.InRule <em>In Rule</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>In Rule</em>'.
   * @see org.xtext.ecerule.ece.InRule
   * @generated
   */
  EClass getInRule();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.InRule#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see org.xtext.ecerule.ece.InRule#getTime()
   * @see #getInRule()
   * @generated
   */
  EAttribute getInRule_Time();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.InRule#getCurrentTime <em>Current Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Current Time</em>'.
   * @see org.xtext.ecerule.ece.InRule#getCurrentTime()
   * @see #getInRule()
   * @generated
   */
  EAttribute getInRule_CurrentTime();

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
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.ExpFluent <em>Exp Fluent</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Exp Fluent</em>'.
   * @see org.xtext.ecerule.ece.ExpFluent
   * @generated
   */
  EClass getExpFluent();

  /**
   * Returns the meta object for the attribute '{@link org.xtext.ecerule.ece.ExpFluent#getFluentName <em>Fluent Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fluent Name</em>'.
   * @see org.xtext.ecerule.ece.ExpFluent#getFluentName()
   * @see #getExpFluent()
   * @generated
   */
  EAttribute getExpFluent_FluentName();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ExpFluent#getValuePart <em>Value Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value Part</em>'.
   * @see org.xtext.ecerule.ece.ExpFluent#getValuePart()
   * @see #getExpFluent()
   * @generated
   */
  EReference getExpFluent_ValuePart();

  /**
   * Returns the meta object for the containment reference '{@link org.xtext.ecerule.ece.ExpFluent#getTimePart <em>Time Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Time Part</em>'.
   * @see org.xtext.ecerule.ece.ExpFluent#getTimePart()
   * @see #getExpFluent()
   * @generated
   */
  EReference getExpFluent_TimePart();

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
   * Returns the meta object for class '{@link org.xtext.ecerule.ece.Minus <em>Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Minus</em>'.
   * @see org.xtext.ecerule.ece.Minus
   * @generated
   */
  EClass getMinus();

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
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.DroolsModelImpl <em>Drools Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.DroolsModelImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getDroolsModel()
     * @generated
     */
    EClass DROOLS_MODEL = eINSTANCE.getDroolsModel();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DROOLS_MODEL__STATEMENTS = eINSTANCE.getDroolsModel_Statements();

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
     * The meta object literal for the '<em><b>Fluent</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__FLUENT = eINSTANCE.getStatement_Fluent();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATEMENT__EXP = eINSTANCE.getStatement_Exp();

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
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.FluentImpl <em>Fluent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.FluentImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFluent()
     * @generated
     */
    EClass FLUENT = eINSTANCE.getFluent();

    /**
     * The meta object literal for the '<em><b>Fluent Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLUENT__FLUENT_NAME = eINSTANCE.getFluent_FluentName();

    /**
     * The meta object literal for the '<em><b>Value Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__VALUE_PART = eINSTANCE.getFluent_ValuePart();

    /**
     * The meta object literal for the '<em><b>Time Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__TIME_PART = eINSTANCE.getFluent_TimePart();

    /**
     * The meta object literal for the '<em><b>Cond Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLUENT__COND_PART = eINSTANCE.getFluent_CondPart();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ToRuleImpl <em>To Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ToRuleImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getToRule()
     * @generated
     */
    EClass TO_RULE = eINSTANCE.getToRule();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TO_RULE__EXPRESSION = eINSTANCE.getToRule_Expression();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.StringExprImpl <em>String Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.StringExprImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getStringExpr()
     * @generated
     */
    EClass STRING_EXPR = eINSTANCE.getStringExpr();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.BoolExprImpl <em>Bool Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.BoolExprImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getBoolExpr()
     * @generated
     */
    EClass BOOL_EXPR = eINSTANCE.getBoolExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BOOL_EXPR__VALUE = eINSTANCE.getBoolExpr_Value();

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
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute AND__OP = eINSTANCE.getAnd_Op();

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
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ComparisonImpl <em>Comparison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ComparisonImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getComparison()
     * @generated
     */
    EClass COMPARISON = eINSTANCE.getComparison();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.switchExprImpl <em>switch Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.switchExprImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getswitchExpr()
     * @generated
     */
    EClass SWITCH_EXPR = eINSTANCE.getswitchExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH_EXPR__VALUE = eINSTANCE.getswitchExpr_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.MutationExprImpl <em>Mutation Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.MutationExprImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMutationExpr()
     * @generated
     */
    EClass MUTATION_EXPR = eINSTANCE.getMutationExpr();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MUTATION_EXPR__VALUE = eINSTANCE.getMutationExpr_Value();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.FloatExprImpl <em>Float Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.FloatExprImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFloatExpr()
     * @generated
     */
    EClass FLOAT_EXPR = eINSTANCE.getFloatExpr();

    /**
     * The meta object literal for the '<em><b>Value Direct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLOAT_EXPR__VALUE_DIRECT = eINSTANCE.getFloatExpr_ValueDirect();

    /**
     * The meta object literal for the '<em><b>Value Calculated</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOAT_EXPR__VALUE_CALCULATED = eINSTANCE.getFloatExpr_ValueCalculated();

    /**
     * The meta object literal for the '<em><b>Value Of Fluent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FLOAT_EXPR__VALUE_OF_FLUENT = eINSTANCE.getFloatExpr_ValueOfFluent();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.PlusOrMinusImpl <em>Plus Or Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.PlusOrMinusImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getPlusOrMinus()
     * @generated
     */
    EClass PLUS_OR_MINUS = eINSTANCE.getPlusOrMinus();

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
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.PrimaryImpl <em>Primary</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.PrimaryImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getPrimary()
     * @generated
     */
    EClass PRIMARY = eINSTANCE.getPrimary();

    /**
     * The meta object literal for the '<em><b>Value Direct</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PRIMARY__VALUE_DIRECT = eINSTANCE.getPrimary_ValueDirect();

    /**
     * The meta object literal for the '<em><b>Value Of Fluent</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMARY__VALUE_OF_FLUENT = eINSTANCE.getPrimary_ValueOfFluent();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.FluentWhoseValueImpl <em>Fluent Whose Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.FluentWhoseValueImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getFluentWhoseValue()
     * @generated
     */
    EClass FLUENT_WHOSE_VALUE = eINSTANCE.getFluentWhoseValue();

    /**
     * The meta object literal for the '<em><b>Fluent Whose Value Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FLUENT_WHOSE_VALUE__FLUENT_WHOSE_VALUE_NAME = eINSTANCE.getFluentWhoseValue_FluentWhoseValueName();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.StrImpl <em>Str</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.StrImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getStr()
     * @generated
     */
    EClass STR = eINSTANCE.getStr();

    /**
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.InRuleImpl <em>In Rule</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.InRuleImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getInRule()
     * @generated
     */
    EClass IN_RULE = eINSTANCE.getInRule();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_RULE__TIME = eINSTANCE.getInRule_Time();

    /**
     * The meta object literal for the '<em><b>Current Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IN_RULE__CURRENT_TIME = eINSTANCE.getInRule_CurrentTime();

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
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.ExpFluentImpl <em>Exp Fluent</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.ExpFluentImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getExpFluent()
     * @generated
     */
    EClass EXP_FLUENT = eINSTANCE.getExpFluent();

    /**
     * The meta object literal for the '<em><b>Fluent Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXP_FLUENT__FLUENT_NAME = eINSTANCE.getExpFluent_FluentName();

    /**
     * The meta object literal for the '<em><b>Value Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_FLUENT__VALUE_PART = eINSTANCE.getExpFluent_ValuePart();

    /**
     * The meta object literal for the '<em><b>Time Part</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXP_FLUENT__TIME_PART = eINSTANCE.getExpFluent_TimePart();

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
     * The meta object literal for the '{@link org.xtext.ecerule.ece.impl.MinusImpl <em>Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.xtext.ecerule.ece.impl.MinusImpl
     * @see org.xtext.ecerule.ece.impl.EcePackageImpl#getMinus()
     * @generated
     */
    EClass MINUS = eINSTANCE.getMinus();

  }

} //EcePackage
