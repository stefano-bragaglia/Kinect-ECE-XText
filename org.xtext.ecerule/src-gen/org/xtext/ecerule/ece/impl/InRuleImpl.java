/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.InRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.InRuleImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.InRuleImpl#getCurrentTime <em>Current Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InRuleImpl extends MinimalEObjectImpl.Container implements InRule
{
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
   * The default value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentTime()
   * @generated
   * @ordered
   */
  protected static final String CURRENT_TIME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCurrentTime() <em>Current Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCurrentTime()
   * @generated
   * @ordered
   */
  protected String currentTime = CURRENT_TIME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InRuleImpl()
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
    return EcePackage.Literals.IN_RULE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.IN_RULE__TIME, oldTime, time));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCurrentTime()
  {
    return currentTime;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCurrentTime(String newCurrentTime)
  {
    String oldCurrentTime = currentTime;
    currentTime = newCurrentTime;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.IN_RULE__CURRENT_TIME, oldCurrentTime, currentTime));
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
      case EcePackage.IN_RULE__TIME:
        return getTime();
      case EcePackage.IN_RULE__CURRENT_TIME:
        return getCurrentTime();
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
      case EcePackage.IN_RULE__TIME:
        setTime((Integer)newValue);
        return;
      case EcePackage.IN_RULE__CURRENT_TIME:
        setCurrentTime((String)newValue);
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
      case EcePackage.IN_RULE__TIME:
        setTime(TIME_EDEFAULT);
        return;
      case EcePackage.IN_RULE__CURRENT_TIME:
        setCurrentTime(CURRENT_TIME_EDEFAULT);
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
      case EcePackage.IN_RULE__TIME:
        return time != TIME_EDEFAULT;
      case EcePackage.IN_RULE__CURRENT_TIME:
        return CURRENT_TIME_EDEFAULT == null ? currentTime != null : !CURRENT_TIME_EDEFAULT.equals(currentTime);
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
    result.append(", currentTime: ");
    result.append(currentTime);
    result.append(')');
    return result.toString();
  }

} //InRuleImpl
