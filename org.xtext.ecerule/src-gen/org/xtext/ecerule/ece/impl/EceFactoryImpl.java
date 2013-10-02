/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.ecerule.ece.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EceFactoryImpl extends EFactoryImpl implements EceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static EceFactory init()
  {
    try
    {
      EceFactory theEceFactory = (EceFactory)EPackage.Registry.INSTANCE.getEFactory(EcePackage.eNS_URI);
      if (theEceFactory != null)
      {
        return theEceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new EceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case EcePackage.DROOLS_MODEL: return createDroolsModel();
      case EcePackage.STATEMENT: return createStatement();
      case EcePackage.EVENT: return createEvent();
      case EcePackage.FLUENT: return createFluent();
      case EcePackage.TO_RULE: return createToRule();
      case EcePackage.STRING_EXPR: return createStringExpr();
      case EcePackage.BOOL_EXPR: return createBoolExpr();
      case EcePackage.OR: return createOr();
      case EcePackage.AND: return createAnd();
      case EcePackage.EQUALITY: return createEquality();
      case EcePackage.COMPARISON: return createComparison();
      case EcePackage.FLOAT_EXPR: return createFloatExpr();
      case EcePackage.PLUS_OR_MINUS: return createPlusOrMinus();
      case EcePackage.MUL_OR_DIV: return createMulOrDiv();
      case EcePackage.PRIMARY: return createPrimary();
      case EcePackage.FLUENT_WHOSE_VALUE: return createFluentWhoseValue();
      case EcePackage.STR: return createStr();
      case EcePackage.IN_RULE: return createInRule();
      case EcePackage.EXP_FLUENT: return createExpFluent();
      case EcePackage.PLUS: return createPlus();
      case EcePackage.MINUS: return createMinus();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DroolsModel createDroolsModel()
  {
    DroolsModelImpl droolsModel = new DroolsModelImpl();
    return droolsModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Statement createStatement()
  {
    StatementImpl statement = new StatementImpl();
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Fluent createFluent()
  {
    FluentImpl fluent = new FluentImpl();
    return fluent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToRule createToRule()
  {
    ToRuleImpl toRule = new ToRuleImpl();
    return toRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StringExpr createStringExpr()
  {
    StringExprImpl stringExpr = new StringExprImpl();
    return stringExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolExpr createBoolExpr()
  {
    BoolExprImpl boolExpr = new BoolExprImpl();
    return boolExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Or createOr()
  {
    OrImpl or = new OrImpl();
    return or;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public And createAnd()
  {
    AndImpl and = new AndImpl();
    return and;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Equality createEquality()
  {
    EqualityImpl equality = new EqualityImpl();
    return equality;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Comparison createComparison()
  {
    ComparisonImpl comparison = new ComparisonImpl();
    return comparison;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FloatExpr createFloatExpr()
  {
    FloatExprImpl floatExpr = new FloatExprImpl();
    return floatExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PlusOrMinus createPlusOrMinus()
  {
    PlusOrMinusImpl plusOrMinus = new PlusOrMinusImpl();
    return plusOrMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MulOrDiv createMulOrDiv()
  {
    MulOrDivImpl mulOrDiv = new MulOrDivImpl();
    return mulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Primary createPrimary()
  {
    PrimaryImpl primary = new PrimaryImpl();
    return primary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FluentWhoseValue createFluentWhoseValue()
  {
    FluentWhoseValueImpl fluentWhoseValue = new FluentWhoseValueImpl();
    return fluentWhoseValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Str createStr()
  {
    StrImpl str = new StrImpl();
    return str;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InRule createInRule()
  {
    InRuleImpl inRule = new InRuleImpl();
    return inRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpFluent createExpFluent()
  {
    ExpFluentImpl expFluent = new ExpFluentImpl();
    return expFluent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plus createPlus()
  {
    PlusImpl plus = new PlusImpl();
    return plus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Minus createMinus()
  {
    MinusImpl minus = new MinusImpl();
    return minus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcePackage getEcePackage()
  {
    return (EcePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static EcePackage getPackage()
  {
    return EcePackage.eINSTANCE;
  }

} //EceFactoryImpl
