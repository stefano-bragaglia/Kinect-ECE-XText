/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.FluentWhoseValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fluent Whose Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.FluentWhoseValueImpl#getFluentWhoseValueName <em>Fluent Whose Value Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FluentWhoseValueImpl extends StringExprImpl implements FluentWhoseValue
{
  /**
   * The default value of the '{@link #getFluentWhoseValueName() <em>Fluent Whose Value Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluentWhoseValueName()
   * @generated
   * @ordered
   */
  protected static final String FLUENT_WHOSE_VALUE_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFluentWhoseValueName() <em>Fluent Whose Value Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluentWhoseValueName()
   * @generated
   * @ordered
   */
  protected String fluentWhoseValueName = FLUENT_WHOSE_VALUE_NAME_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FluentWhoseValueImpl()
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
    return EcePackage.Literals.FLUENT_WHOSE_VALUE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFluentWhoseValueName()
  {
    return fluentWhoseValueName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFluentWhoseValueName(String newFluentWhoseValueName)
  {
    String oldFluentWhoseValueName = fluentWhoseValueName;
    fluentWhoseValueName = newFluentWhoseValueName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.FLUENT_WHOSE_VALUE__FLUENT_WHOSE_VALUE_NAME, oldFluentWhoseValueName, fluentWhoseValueName));
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
      case EcePackage.FLUENT_WHOSE_VALUE__FLUENT_WHOSE_VALUE_NAME:
        return getFluentWhoseValueName();
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
      case EcePackage.FLUENT_WHOSE_VALUE__FLUENT_WHOSE_VALUE_NAME:
        setFluentWhoseValueName((String)newValue);
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
      case EcePackage.FLUENT_WHOSE_VALUE__FLUENT_WHOSE_VALUE_NAME:
        setFluentWhoseValueName(FLUENT_WHOSE_VALUE_NAME_EDEFAULT);
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
      case EcePackage.FLUENT_WHOSE_VALUE__FLUENT_WHOSE_VALUE_NAME:
        return FLUENT_WHOSE_VALUE_NAME_EDEFAULT == null ? fluentWhoseValueName != null : !FLUENT_WHOSE_VALUE_NAME_EDEFAULT.equals(fluentWhoseValueName);
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
    result.append(" (fluentWhoseValueName: ");
    result.append(fluentWhoseValueName);
    result.append(')');
    return result.toString();
  }

} //FluentWhoseValueImpl
