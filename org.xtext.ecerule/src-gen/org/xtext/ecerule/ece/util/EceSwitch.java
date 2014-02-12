/**
 */
package org.xtext.ecerule.ece.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.xtext.ecerule.ece.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.xtext.ecerule.ece.EcePackage
 * @generated
 */
public class EceSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static EcePackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EceSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = EcePackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case EcePackage.ECE_MODEL:
      {
        EceModel eceModel = (EceModel)theEObject;
        T result = caseEceModel(eceModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.STATEMENT:
      {
        Statement statement = (Statement)theEObject;
        T result = caseStatement(statement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.EVENT_FEATURE:
      {
        EventFeature eventFeature = (EventFeature)theEObject;
        T result = caseEventFeature(eventFeature);
        if (result == null) result = caseReferenceType(eventFeature);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.CONTEXTS_LIST:
      {
        ContextsList contextsList = (ContextsList)theEObject;
        T result = caseContextsList(contextsList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.EC_CONTEXTS_LIST:
      {
        EcContextsList ecContextsList = (EcContextsList)theEObject;
        T result = caseEcContextsList(ecContextsList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.EXP_CONTEXTS_LIST:
      {
        ExpContextsList expContextsList = (ExpContextsList)theEObject;
        T result = caseExpContextsList(expContextsList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.EC_CONTEXT:
      {
        EcContext ecContext = (EcContext)theEObject;
        T result = caseEcContext(ecContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.EXP_CONTEXT:
      {
        ExpContext expContext = (ExpContext)theEObject;
        T result = caseExpContext(expContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.ALLEN_OP:
      {
        AllenOp allenOp = (AllenOp)theEObject;
        T result = caseAllenOp(allenOp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.FLUENT:
      {
        Fluent fluent = (Fluent)theEObject;
        T result = caseFluent(fluent);
        if (result == null) result = caseReferenceType(fluent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.EXPRESSION:
      {
        Expression expression = (Expression)theEObject;
        T result = caseExpression(expression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.ATOMIC:
      {
        Atomic atomic = (Atomic)theEObject;
        T result = caseAtomic(atomic);
        if (result == null) result = caseEquality(atomic);
        if (result == null) result = caseExpression(atomic);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.REFERENCE_TYPE:
      {
        ReferenceType referenceType = (ReferenceType)theEObject;
        T result = caseReferenceType(referenceType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.EQUALITY:
      {
        Equality equality = (Equality)theEObject;
        T result = caseEquality(equality);
        if (result == null) result = caseExpression(equality);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.CONDITION_RULE:
      {
        ConditionRule conditionRule = (ConditionRule)theEObject;
        T result = caseConditionRule(conditionRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.FLUENT_REF:
      {
        FluentRef fluentRef = (FluentRef)theEObject;
        T result = caseFluentRef(fluentRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.AT_EXPR:
      {
        AtExpr atExpr = (AtExpr)theEObject;
        T result = caseAtExpr(atExpr);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.ALLEN_OPERATOR:
      {
        AllenOperator allenOperator = (AllenOperator)theEObject;
        T result = caseAllenOperator(allenOperator);
        if (result == null) result = caseAllenOp(allenOperator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.MUL_OR_DIV:
      {
        MulOrDiv mulOrDiv = (MulOrDiv)theEObject;
        T result = caseMulOrDiv(mulOrDiv);
        if (result == null) result = caseExpression(mulOrDiv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.FLOAT_CONSTANT:
      {
        FloatConstant floatConstant = (FloatConstant)theEObject;
        T result = caseFloatConstant(floatConstant);
        if (result == null) result = caseAtomic(floatConstant);
        if (result == null) result = caseEquality(floatConstant);
        if (result == null) result = caseExpression(floatConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.INT_CONSTANT:
      {
        IntConstant intConstant = (IntConstant)theEObject;
        T result = caseIntConstant(intConstant);
        if (result == null) result = caseAtomic(intConstant);
        if (result == null) result = caseEquality(intConstant);
        if (result == null) result = caseExpression(intConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.BOOL_CONSTANT:
      {
        BoolConstant boolConstant = (BoolConstant)theEObject;
        T result = caseBoolConstant(boolConstant);
        if (result == null) result = caseAtomic(boolConstant);
        if (result == null) result = caseEquality(boolConstant);
        if (result == null) result = caseExpression(boolConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.REFERENCE:
      {
        Reference reference = (Reference)theEObject;
        T result = caseReference(reference);
        if (result == null) result = caseAtomic(reference);
        if (result == null) result = caseEquality(reference);
        if (result == null) result = caseExpression(reference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.CURRENT_TIME:
      {
        CurrentTime currentTime = (CurrentTime)theEObject;
        T result = caseCurrentTime(currentTime);
        if (result == null) result = caseAtomic(currentTime);
        if (result == null) result = caseEquality(currentTime);
        if (result == null) result = caseExpression(currentTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.OR:
      {
        Or or = (Or)theEObject;
        T result = caseOr(or);
        if (result == null) result = caseExpression(or);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.AND:
      {
        And and = (And)theEObject;
        T result = caseAnd(and);
        if (result == null) result = caseExpression(and);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.COMPARISON:
      {
        Comparison comparison = (Comparison)theEObject;
        T result = caseComparison(comparison);
        if (result == null) result = caseExpression(comparison);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.PLUS:
      {
        Plus plus = (Plus)theEObject;
        T result = casePlus(plus);
        if (result == null) result = caseExpression(plus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.MINUS:
      {
        Minus minus = (Minus)theEObject;
        T result = caseMinus(minus);
        if (result == null) result = caseExpression(minus);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.NOT:
      {
        Not not = (Not)theEObject;
        T result = caseNot(not);
        if (result == null) result = caseExpression(not);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.AT_TIME_PLUS_OR_MIN:
      {
        AtTimePlusOrMin atTimePlusOrMin = (AtTimePlusOrMin)theEObject;
        T result = caseAtTimePlusOrMin(atTimePlusOrMin);
        if (result == null) result = caseAtExpr(atTimePlusOrMin);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.AT_TIME_INT_CONSTANT:
      {
        AtTimeIntConstant atTimeIntConstant = (AtTimeIntConstant)theEObject;
        T result = caseAtTimeIntConstant(atTimeIntConstant);
        if (result == null) result = caseAtExpr(atTimeIntConstant);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case EcePackage.AT_TIME_CURRENT_TIME:
      {
        AtTimeCurrentTime atTimeCurrentTime = (AtTimeCurrentTime)theEObject;
        T result = caseAtTimeCurrentTime(atTimeCurrentTime);
        if (result == null) result = caseAtExpr(atTimeCurrentTime);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEceModel(EceModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStatement(Statement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Feature</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Feature</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventFeature(EventFeature object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contexts List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contexts List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextsList(ContextsList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ec Contexts List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ec Contexts List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEcContextsList(EcContextsList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp Contexts List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp Contexts List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpContextsList(ExpContextsList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ec Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ec Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEcContext(EcContext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Exp Context</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Exp Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpContext(ExpContext object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allen Op</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allen Op</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllenOp(AllenOp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fluent</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fluent</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFluent(Fluent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Atomic</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Atomic</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtomic(Atomic object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceType(ReferenceType object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Equality</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEquality(Equality object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Condition Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Condition Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionRule(ConditionRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Fluent Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fluent Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFluentRef(FluentRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Expr</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Expr</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtExpr(AtExpr object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Allen Operator</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Allen Operator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAllenOperator(AllenOperator object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Mul Or Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mul Or Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMulOrDiv(MulOrDiv object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Float Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Float Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFloatConstant(FloatConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Int Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIntConstant(IntConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Bool Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBoolConstant(BoolConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReference(Reference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Current Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Current Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCurrentTime(CurrentTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Or</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOr(Or object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>And</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>And</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnd(And object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Comparison</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseComparison(Comparison object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePlus(Plus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMinus(Minus object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Not</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Not</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNot(Not object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Time Plus Or Min</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Time Plus Or Min</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtTimePlusOrMin(AtTimePlusOrMin object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Time Int Constant</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Time Int Constant</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtTimeIntConstant(AtTimeIntConstant object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>At Time Current Time</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>At Time Current Time</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAtTimeCurrentTime(AtTimeCurrentTime object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //EceSwitch
