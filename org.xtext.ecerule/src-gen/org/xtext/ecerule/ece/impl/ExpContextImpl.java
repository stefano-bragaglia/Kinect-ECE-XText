/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.ExpContext;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.ExpContextImpl#getDafare <em>Dafare</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpContextImpl extends MinimalEObjectImpl.Container implements ExpContext
{
  /**
   * The default value of the '{@link #getDafare() <em>Dafare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDafare()
   * @generated
   * @ordered
   */
  protected static final String DAFARE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDafare() <em>Dafare</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDafare()
   * @generated
   * @ordered
   */
  protected String dafare = DAFARE_EDEFAULT;

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
  public String getDafare()
  {
    return dafare;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDafare(String newDafare)
  {
    String oldDafare = dafare;
    dafare = newDafare;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.EXP_CONTEXT__DAFARE, oldDafare, dafare));
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
      case EcePackage.EXP_CONTEXT__DAFARE:
        return getDafare();
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
      case EcePackage.EXP_CONTEXT__DAFARE:
        setDafare((String)newValue);
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
      case EcePackage.EXP_CONTEXT__DAFARE:
        setDafare(DAFARE_EDEFAULT);
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
      case EcePackage.EXP_CONTEXT__DAFARE:
        return DAFARE_EDEFAULT == null ? dafare != null : !DAFARE_EDEFAULT.equals(dafare);
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
    result.append(" (dafare: ");
    result.append(dafare);
    result.append(')');
    return result.toString();
  }

} //ExpContextImpl
