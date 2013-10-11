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

import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.ExpContext;
import org.xtext.ecerule.ece.ExpContextsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exp Contexts List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.ExpContextsListImpl#getExpContexts <em>Exp Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExpContextsListImpl extends MinimalEObjectImpl.Container implements ExpContextsList
{
  /**
   * The cached value of the '{@link #getExpContexts() <em>Exp Contexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpContexts()
   * @generated
   * @ordered
   */
  protected EList<ExpContext> expContexts;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExpContextsListImpl()
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
    return EcePackage.Literals.EXP_CONTEXTS_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExpContext> getExpContexts()
  {
    if (expContexts == null)
    {
      expContexts = new EObjectContainmentEList<ExpContext>(ExpContext.class, this, EcePackage.EXP_CONTEXTS_LIST__EXP_CONTEXTS);
    }
    return expContexts;
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
      case EcePackage.EXP_CONTEXTS_LIST__EXP_CONTEXTS:
        return ((InternalEList<?>)getExpContexts()).basicRemove(otherEnd, msgs);
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
      case EcePackage.EXP_CONTEXTS_LIST__EXP_CONTEXTS:
        return getExpContexts();
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
      case EcePackage.EXP_CONTEXTS_LIST__EXP_CONTEXTS:
        getExpContexts().clear();
        getExpContexts().addAll((Collection<? extends ExpContext>)newValue);
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
      case EcePackage.EXP_CONTEXTS_LIST__EXP_CONTEXTS:
        getExpContexts().clear();
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
      case EcePackage.EXP_CONTEXTS_LIST__EXP_CONTEXTS:
        return expContexts != null && !expContexts.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ExpContextsListImpl
