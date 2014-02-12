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
      case EcePackage.ECE_MODEL: return createEceModel();
      case EcePackage.STATEMENT: return createStatement();
      case EcePackage.EVENT: return createEvent();
      case EcePackage.EVENT_FEATURE: return createEventFeature();
      case EcePackage.CONTEXTS_LIST: return createContextsList();
      case EcePackage.EC_CONTEXTS_LIST: return createEcContextsList();
      case EcePackage.EXP_CONTEXTS_LIST: return createExpContextsList();
      case EcePackage.EC_CONTEXT: return createEcContext();
      case EcePackage.EXP_CONTEXT: return createExpContext();
      case EcePackage.ALLEN_OP: return createAllenOp();
      case EcePackage.FLUENT: return createFluent();
      case EcePackage.EXPRESSION: return createExpression();
      case EcePackage.ATOMIC: return createAtomic();
      case EcePackage.REFERENCE_TYPE: return createReferenceType();
      case EcePackage.EQUALITY: return createEquality();
      case EcePackage.CONDITION_RULE: return createConditionRule();
      case EcePackage.FLUENT_REF: return createFluentRef();
      case EcePackage.AT_EXPR: return createAtExpr();
      case EcePackage.ALLEN_OPERATOR: return createAllenOperator();
      case EcePackage.MUL_OR_DIV: return createMulOrDiv();
      case EcePackage.FLOAT_CONSTANT: return createFloatConstant();
      case EcePackage.INT_CONSTANT: return createIntConstant();
      case EcePackage.BOOL_CONSTANT: return createBoolConstant();
      case EcePackage.REFERENCE: return createReference();
      case EcePackage.CURRENT_TIME: return createCurrentTime();
      case EcePackage.OR: return createOr();
      case EcePackage.AND: return createAnd();
      case EcePackage.COMPARISON: return createComparison();
      case EcePackage.PLUS: return createPlus();
      case EcePackage.MINUS: return createMinus();
      case EcePackage.NOT: return createNot();
      case EcePackage.AT_TIME_PLUS_OR_MIN: return createAtTimePlusOrMin();
      case EcePackage.AT_TIME_INT_CONSTANT: return createAtTimeIntConstant();
      case EcePackage.AT_TIME_CURRENT_TIME: return createAtTimeCurrentTime();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EceModel createEceModel()
  {
    EceModelImpl eceModel = new EceModelImpl();
    return eceModel;
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
  public EventFeature createEventFeature()
  {
    EventFeatureImpl eventFeature = new EventFeatureImpl();
    return eventFeature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContextsList createContextsList()
  {
    ContextsListImpl contextsList = new ContextsListImpl();
    return contextsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcContextsList createEcContextsList()
  {
    EcContextsListImpl ecContextsList = new EcContextsListImpl();
    return ecContextsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpContextsList createExpContextsList()
  {
    ExpContextsListImpl expContextsList = new ExpContextsListImpl();
    return expContextsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcContext createEcContext()
  {
    EcContextImpl ecContext = new EcContextImpl();
    return ecContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpContext createExpContext()
  {
    ExpContextImpl expContext = new ExpContextImpl();
    return expContext;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllenOp createAllenOp()
  {
    AllenOpImpl allenOp = new AllenOpImpl();
    return allenOp;
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
  public Expression createExpression()
  {
    ExpressionImpl expression = new ExpressionImpl();
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atomic createAtomic()
  {
    AtomicImpl atomic = new AtomicImpl();
    return atomic;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType createReferenceType()
  {
    ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
    return referenceType;
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
  public ConditionRule createConditionRule()
  {
    ConditionRuleImpl conditionRule = new ConditionRuleImpl();
    return conditionRule;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FluentRef createFluentRef()
  {
    FluentRefImpl fluentRef = new FluentRefImpl();
    return fluentRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtExpr createAtExpr()
  {
    AtExprImpl atExpr = new AtExprImpl();
    return atExpr;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllenOperator createAllenOperator()
  {
    AllenOperatorImpl allenOperator = new AllenOperatorImpl();
    return allenOperator;
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
  public FloatConstant createFloatConstant()
  {
    FloatConstantImpl floatConstant = new FloatConstantImpl();
    return floatConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IntConstant createIntConstant()
  {
    IntConstantImpl intConstant = new IntConstantImpl();
    return intConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BoolConstant createBoolConstant()
  {
    BoolConstantImpl boolConstant = new BoolConstantImpl();
    return boolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reference createReference()
  {
    ReferenceImpl reference = new ReferenceImpl();
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CurrentTime createCurrentTime()
  {
    CurrentTimeImpl currentTime = new CurrentTimeImpl();
    return currentTime;
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
  public Not createNot()
  {
    NotImpl not = new NotImpl();
    return not;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtTimePlusOrMin createAtTimePlusOrMin()
  {
    AtTimePlusOrMinImpl atTimePlusOrMin = new AtTimePlusOrMinImpl();
    return atTimePlusOrMin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtTimeIntConstant createAtTimeIntConstant()
  {
    AtTimeIntConstantImpl atTimeIntConstant = new AtTimeIntConstantImpl();
    return atTimeIntConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtTimeCurrentTime createAtTimeCurrentTime()
  {
    AtTimeCurrentTimeImpl atTimeCurrentTime = new AtTimeCurrentTimeImpl();
    return atTimeCurrentTime;
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
