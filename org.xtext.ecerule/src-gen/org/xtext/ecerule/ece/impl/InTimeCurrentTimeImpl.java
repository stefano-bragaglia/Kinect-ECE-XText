/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.InTimeCurrentTime;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>In Time Current Time</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.InTimeCurrentTimeImpl#getInTimeValue <em>In Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InTimeCurrentTimeImpl extends InExprImpl implements InTimeCurrentTime
{
  /**
   * The default value of the '{@link #getInTimeValue() <em>In Time Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInTimeValue()
   * @generated
   * @ordered
   */
  protected static final String IN_TIME_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getInTimeValue() <em>In Time Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInTimeValue()
   * @generated
   * @ordered
   */
  protected String inTimeValue = IN_TIME_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InTimeCurrentTimeImpl()
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
    return EcePackage.Literals.IN_TIME_CURRENT_TIME;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getInTimeValue()
  {
    return inTimeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInTimeValue(String newInTimeValue)
  {
    String oldInTimeValue = inTimeValue;
    inTimeValue = newInTimeValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.IN_TIME_CURRENT_TIME__IN_TIME_VALUE, oldInTimeValue, inTimeValue));
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
      case EcePackage.IN_TIME_CURRENT_TIME__IN_TIME_VALUE:
        return getInTimeValue();
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
      case EcePackage.IN_TIME_CURRENT_TIME__IN_TIME_VALUE:
        setInTimeValue((String)newValue);
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
      case EcePackage.IN_TIME_CURRENT_TIME__IN_TIME_VALUE:
        setInTimeValue(IN_TIME_VALUE_EDEFAULT);
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
      case EcePackage.IN_TIME_CURRENT_TIME__IN_TIME_VALUE:
        return IN_TIME_VALUE_EDEFAULT == null ? inTimeValue != null : !IN_TIME_VALUE_EDEFAULT.equals(inTimeValue);
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
    result.append(" (inTimeValue: ");
    result.append(inTimeValue);
    result.append(')');
    return result.toString();
  }

} //InTimeCurrentTimeImpl
