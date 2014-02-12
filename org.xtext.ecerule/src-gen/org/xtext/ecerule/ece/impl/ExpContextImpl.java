/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ecerule.ece.AllenOp;
import org.xtext.ecerule.ece.ConditionRule;
import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.ExpContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.ExpContextImpl#getFinalCondition <em>Final Condition</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.ExpContextImpl#getAllenOp <em>Allen Op</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.ExpContextImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.ExpContextImpl#getInitialCondition <em>Initial Condition</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.ExpContextImpl#getActionF <em>Action F</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.ExpContextImpl#getActionV <em>Action V</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpContextImpl extends MinimalEObjectImpl.Container implements ExpContext
{
  /**
   * The cached value of the '{@link #getFinalCondition() <em>Final Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFinalCondition()
   * @generated
   * @ordered
   */
  protected ConditionRule finalCondition;

  /**
   * The cached value of the '{@link #getAllenOp() <em>Allen Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllenOp()
   * @generated
   * @ordered
   */
  protected AllenOp allenOp;

  /**
   * The default value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected static final int TIME_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTime() <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime()
   * @generated
   * @ordered
   */
  protected int time = TIME_EDEFAULT;

  /**
   * The cached value of the '{@link #getInitialCondition() <em>Initial Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitialCondition()
   * @generated
   * @ordered
   */
  protected ConditionRule initialCondition;

  /**
   * The default value of the '{@link #getActionF() <em>Action F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionF()
   * @generated
   * @ordered
   */
  protected static final String ACTION_F_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActionF() <em>Action F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionF()
   * @generated
   * @ordered
   */
  protected String actionF = ACTION_F_EDEFAULT;

  /**
   * The default value of the '{@link #getActionV() <em>Action V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionV()
   * @generated
   * @ordered
   */
  protected static final String ACTION_V_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getActionV() <em>Action V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionV()
   * @generated
   * @ordered
   */
  protected String actionV = ACTION_V_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpContextImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return EcePackage.Literals.EXP_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionRule getFinalCondition()
  {
    return finalCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFinalCondition(ConditionRule newFinalCondition, NotificationChain msgs)
  {
    ConditionRule oldFinalCondition = finalCondition;
    finalCondition = newFinalCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__FINAL_CONDITION, oldFinalCondition, newFinalCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFinalCondition(ConditionRule newFinalCondition)
  {
    if (newFinalCondition != finalCondition)
    {
      NotificationChain msgs = null;
      if (finalCondition != null)
        msgs = ((InternalEObject)finalCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.EXP_CONTEXT__FINAL_CONDITION, null, msgs);
      if (newFinalCondition != null)
        msgs = ((InternalEObject)newFinalCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.EXP_CONTEXT__FINAL_CONDITION, null, msgs);
      msgs = basicSetFinalCondition(newFinalCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__FINAL_CONDITION, newFinalCondition, newFinalCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllenOp getAllenOp()
  {
    return allenOp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAllenOp(AllenOp newAllenOp, NotificationChain msgs)
  {
    AllenOp oldAllenOp = allenOp;
    allenOp = newAllenOp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__ALLEN_OP, oldAllenOp, newAllenOp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllenOp(AllenOp newAllenOp)
  {
    if (newAllenOp != allenOp)
    {
      NotificationChain msgs = null;
      if (allenOp != null)
        msgs = ((InternalEObject)allenOp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.EXP_CONTEXT__ALLEN_OP, null, msgs);
      if (newAllenOp != null)
        msgs = ((InternalEObject)newAllenOp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.EXP_CONTEXT__ALLEN_OP, null, msgs);
      msgs = basicSetAllenOp(newAllenOp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__ALLEN_OP, newAllenOp, newAllenOp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTime()
  {
    return time;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime(int newTime)
  {
    int oldTime = time;
    time = newTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionRule getInitialCondition()
  {
    return initialCondition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitialCondition(ConditionRule newInitialCondition, NotificationChain msgs)
  {
    ConditionRule oldInitialCondition = initialCondition;
    initialCondition = newInitialCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__INITIAL_CONDITION, oldInitialCondition, newInitialCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitialCondition(ConditionRule newInitialCondition)
  {
    if (newInitialCondition != initialCondition)
    {
      NotificationChain msgs = null;
      if (initialCondition != null)
        msgs = ((InternalEObject)initialCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.EXP_CONTEXT__INITIAL_CONDITION, null, msgs);
      if (newInitialCondition != null)
        msgs = ((InternalEObject)newInitialCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.EXP_CONTEXT__INITIAL_CONDITION, null, msgs);
      msgs = basicSetInitialCondition(newInitialCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__INITIAL_CONDITION, newInitialCondition, newInitialCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActionF()
  {
    return actionF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionF(String newActionF)
  {
    String oldActionF = actionF;
    actionF = newActionF;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__ACTION_F, oldActionF, actionF));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getActionV()
  {
    return actionV;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionV(String newActionV)
  {
    String oldActionV = actionV;
    actionV = newActionV;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__ACTION_V, oldActionV, actionV));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case EcePackage.EXP_CONTEXT__FINAL_CONDITION:
        return basicSetFinalCondition(null, msgs);
      case EcePackage.EXP_CONTEXT__ALLEN_OP:
        return basicSetAllenOp(null, msgs);
      case EcePackage.EXP_CONTEXT__INITIAL_CONDITION:
        return basicSetInitialCondition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case EcePackage.EXP_CONTEXT__FINAL_CONDITION:
        return getFinalCondition();
      case EcePackage.EXP_CONTEXT__ALLEN_OP:
        return getAllenOp();
      case EcePackage.EXP_CONTEXT__TIME:
        return getTime();
      case EcePackage.EXP_CONTEXT__INITIAL_CONDITION:
        return getInitialCondition();
      case EcePackage.EXP_CONTEXT__ACTION_F:
        return getActionF();
      case EcePackage.EXP_CONTEXT__ACTION_V:
        return getActionV();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EcePackage.EXP_CONTEXT__FINAL_CONDITION:
        setFinalCondition((ConditionRule)newValue);
        return;
      case EcePackage.EXP_CONTEXT__ALLEN_OP:
        setAllenOp((AllenOp)newValue);
        return;
      case EcePackage.EXP_CONTEXT__TIME:
        setTime((Integer)newValue);
        return;
      case EcePackage.EXP_CONTEXT__INITIAL_CONDITION:
        setInitialCondition((ConditionRule)newValue);
        return;
      case EcePackage.EXP_CONTEXT__ACTION_F:
        setActionF((String)newValue);
        return;
      case EcePackage.EXP_CONTEXT__ACTION_V:
        setActionV((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case EcePackage.EXP_CONTEXT__FINAL_CONDITION:
        setFinalCondition((ConditionRule)null);
        return;
      case EcePackage.EXP_CONTEXT__ALLEN_OP:
        setAllenOp((AllenOp)null);
        return;
      case EcePackage.EXP_CONTEXT__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case EcePackage.EXP_CONTEXT__INITIAL_CONDITION:
        setInitialCondition((ConditionRule)null);
        return;
      case EcePackage.EXP_CONTEXT__ACTION_F:
        setActionF(ACTION_F_EDEFAULT);
        return;
      case EcePackage.EXP_CONTEXT__ACTION_V:
        setActionV(ACTION_V_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case EcePackage.EXP_CONTEXT__FINAL_CONDITION:
        return finalCondition != null;
      case EcePackage.EXP_CONTEXT__ALLEN_OP:
        return allenOp != null;
      case EcePackage.EXP_CONTEXT__TIME:
        return time != TIME_EDEFAULT;
      case EcePackage.EXP_CONTEXT__INITIAL_CONDITION:
        return initialCondition != null;
      case EcePackage.EXP_CONTEXT__ACTION_F:
        return ACTION_F_EDEFAULT == null ? actionF != null : !ACTION_F_EDEFAULT.equals(actionF);
      case EcePackage.EXP_CONTEXT__ACTION_V:
        return ACTION_V_EDEFAULT == null ? actionV != null : !ACTION_V_EDEFAULT.equals(actionV);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (time: ");
    result.append(time);
    result.append(", actionF: ");
    result.append(actionF);
    result.append(", actionV: ");
    result.append(actionV);
    result.append(')');
    return result.toString();
  }

} //ExpContextImpl
