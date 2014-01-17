/**
 */
package org.xtext.ecerule.ece.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.ecerule.ece.EcContext;
import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.Fluent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ec Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.EcContextImpl#getFluent <em>Fluent</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EcContextImpl extends MinimalEObjectImpl.Container implements EcContext
{
  /**
   * The cached value of the '{@link #getFluent() <em>Fluent</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluent()
   * @generated
   * @ordered
   */
  protected EList<Fluent> fluent;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EcContextImpl()
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
    return EcePackage.Literals.EC_CONTEXT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Fluent> getFluent()
  {
    if (fluent == null)
    {
      fluent = new EObjectContainmentEList<Fluent>(Fluent.class, this, EcePackage.EC_CONTEXT__FLUENT);
    }
    return fluent;
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
      case EcePackage.EC_CONTEXT__FLUENT:
        return ((InternalEList<?>)getFluent()).basicRemove(otherEnd, msgs);
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
      case EcePackage.EC_CONTEXT__FLUENT:
        return getFluent();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case EcePackage.EC_CONTEXT__FLUENT:
        getFluent().clear();
        getFluent().addAll((Collection<? extends Fluent>)newValue);
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
      case EcePackage.EC_CONTEXT__FLUENT:
        getFluent().clear();
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
      case EcePackage.EC_CONTEXT__FLUENT:
        return fluent != null && !fluent.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //EcContextImpl
