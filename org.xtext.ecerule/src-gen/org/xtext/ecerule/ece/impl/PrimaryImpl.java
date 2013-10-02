/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.Primary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.PrimaryImpl#getValueDirect <em>Value Direct</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrimaryImpl extends MulOrDivImpl implements Primary
{
  /**
   * The default value of the '{@link #getValueDirect() <em>Value Direct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDirect()
   * @generated
   * @ordered
   */
  protected static final float VALUE_DIRECT_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getValueDirect() <em>Value Direct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDirect()
   * @generated
   * @ordered
   */
  protected float valueDirect = VALUE_DIRECT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PrimaryImpl()
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
    return EcePackage.Literals.PRIMARY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public float getValueDirect()
  {
    return valueDirect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueDirect(float newValueDirect)
  {
    float oldValueDirect = valueDirect;
    valueDirect = newValueDirect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.PRIMARY__VALUE_DIRECT, oldValueDirect, valueDirect));
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
      case EcePackage.PRIMARY__VALUE_DIRECT:
        return getValueDirect();
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
      case EcePackage.PRIMARY__VALUE_DIRECT:
        setValueDirect((Float)newValue);
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
      case EcePackage.PRIMARY__VALUE_DIRECT:
        setValueDirect(VALUE_DIRECT_EDEFAULT);
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
      case EcePackage.PRIMARY__VALUE_DIRECT:
        return valueDirect != VALUE_DIRECT_EDEFAULT;
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
    result.append(" (valueDirect: ");
    result.append(valueDirect);
    result.append(')');
    return result.toString();
  }

} //PrimaryImpl
