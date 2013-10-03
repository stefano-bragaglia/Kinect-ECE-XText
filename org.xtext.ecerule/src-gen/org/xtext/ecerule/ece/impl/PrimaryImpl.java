/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.FluentWhoseValue;
import org.xtext.ecerule.ece.Primary;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.PrimaryImpl#getValueDirect <em>Value Direct</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.PrimaryImpl#getValueOfFluent <em>Value Of Fluent</em>}</li>
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
  protected static final int VALUE_DIRECT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getValueDirect() <em>Value Direct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueDirect()
   * @generated
   * @ordered
   */
  protected int valueDirect = VALUE_DIRECT_EDEFAULT;

  /**
   * The cached value of the '{@link #getValueOfFluent() <em>Value Of Fluent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValueOfFluent()
   * @generated
   * @ordered
   */
  protected FluentWhoseValue valueOfFluent;

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
  public int getValueDirect()
  {
    return valueDirect;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueDirect(int newValueDirect)
  {
    int oldValueDirect = valueDirect;
    valueDirect = newValueDirect;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.PRIMARY__VALUE_DIRECT, oldValueDirect, valueDirect));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FluentWhoseValue getValueOfFluent()
  {
    return valueOfFluent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValueOfFluent(FluentWhoseValue newValueOfFluent, NotificationChain msgs)
  {
    FluentWhoseValue oldValueOfFluent = valueOfFluent;
    valueOfFluent = newValueOfFluent;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.PRIMARY__VALUE_OF_FLUENT, oldValueOfFluent, newValueOfFluent);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValueOfFluent(FluentWhoseValue newValueOfFluent)
  {
    if (newValueOfFluent != valueOfFluent)
    {
      NotificationChain msgs = null;
      if (valueOfFluent != null)
        msgs = ((InternalEObject)valueOfFluent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.PRIMARY__VALUE_OF_FLUENT, null, msgs);
      if (newValueOfFluent != null)
        msgs = ((InternalEObject)newValueOfFluent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.PRIMARY__VALUE_OF_FLUENT, null, msgs);
      msgs = basicSetValueOfFluent(newValueOfFluent, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.PRIMARY__VALUE_OF_FLUENT, newValueOfFluent, newValueOfFluent));
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
      case EcePackage.PRIMARY__VALUE_OF_FLUENT:
        return basicSetValueOfFluent(null, msgs);
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
      case EcePackage.PRIMARY__VALUE_DIRECT:
        return getValueDirect();
      case EcePackage.PRIMARY__VALUE_OF_FLUENT:
        return getValueOfFluent();
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
        setValueDirect((Integer)newValue);
        return;
      case EcePackage.PRIMARY__VALUE_OF_FLUENT:
        setValueOfFluent((FluentWhoseValue)newValue);
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
      case EcePackage.PRIMARY__VALUE_OF_FLUENT:
        setValueOfFluent((FluentWhoseValue)null);
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
      case EcePackage.PRIMARY__VALUE_OF_FLUENT:
        return valueOfFluent != null;
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
