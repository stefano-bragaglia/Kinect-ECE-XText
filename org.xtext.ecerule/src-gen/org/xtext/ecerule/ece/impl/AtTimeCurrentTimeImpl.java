/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ecerule.ece.AtTimeCurrentTime;
import org.xtext.ecerule.ece.EcePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>At Time Current Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.AtTimeCurrentTimeImpl#getAtTimeValue <em>At Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AtTimeCurrentTimeImpl extends AtExprImpl implements AtTimeCurrentTime
{
  /**
   * The default value of the '{@link #getAtTimeValue() <em>At Time Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtTimeValue()
   * @generated
   * @ordered
   */
  protected static final String AT_TIME_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAtTimeValue() <em>At Time Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAtTimeValue()
   * @generated
   * @ordered
   */
  protected String atTimeValue = AT_TIME_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AtTimeCurrentTimeImpl()
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
    return EcePackage.Literals.AT_TIME_CURRENT_TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAtTimeValue()
  {
    return atTimeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAtTimeValue(String newAtTimeValue)
  {
    String oldAtTimeValue = atTimeValue;
    atTimeValue = newAtTimeValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.AT_TIME_CURRENT_TIME__AT_TIME_VALUE, oldAtTimeValue, atTimeValue));
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
      case EcePackage.AT_TIME_CURRENT_TIME__AT_TIME_VALUE:
        return getAtTimeValue();
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
      case EcePackage.AT_TIME_CURRENT_TIME__AT_TIME_VALUE:
        setAtTimeValue((String)newValue);
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
      case EcePackage.AT_TIME_CURRENT_TIME__AT_TIME_VALUE:
        setAtTimeValue(AT_TIME_VALUE_EDEFAULT);
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
      case EcePackage.AT_TIME_CURRENT_TIME__AT_TIME_VALUE:
        return AT_TIME_VALUE_EDEFAULT == null ? atTimeValue != null : !AT_TIME_VALUE_EDEFAULT.equals(atTimeValue);
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
    result.append(" (atTimeValue: ");
    result.append(atTimeValue);
    result.append(')');
    return result.toString();
  }

} //AtTimeCurrentTimeImpl
