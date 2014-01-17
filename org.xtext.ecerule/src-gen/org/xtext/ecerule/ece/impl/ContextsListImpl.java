/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.ecerule.ece.ContextsList;
import org.xtext.ecerule.ece.EcContextsList;
import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.ExpContextsList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contexts List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.ContextsListImpl#getEcContextsList <em>Ec Contexts List</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.ContextsListImpl#getExpContextsList <em>Exp Contexts List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContextsListImpl extends MinimalEObjectImpl.Container implements ContextsList
{
  /**
   * The cached value of the '{@link #getEcContextsList() <em>Ec Contexts List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEcContextsList()
   * @generated
   * @ordered
   */
  protected EcContextsList ecContextsList;

  /**
   * The cached value of the '{@link #getExpContextsList() <em>Exp Contexts List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpContextsList()
   * @generated
   * @ordered
   */
  protected ExpContextsList expContextsList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContextsListImpl()
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
    return EcePackage.Literals.CONTEXTS_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EcContextsList getEcContextsList()
  {
    return ecContextsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEcContextsList(EcContextsList newEcContextsList, NotificationChain msgs)
  {
    EcContextsList oldEcContextsList = ecContextsList;
    ecContextsList = newEcContextsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST, oldEcContextsList, newEcContextsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEcContextsList(EcContextsList newEcContextsList)
  {
    if (newEcContextsList != ecContextsList)
    {
      NotificationChain msgs = null;
      if (ecContextsList != null)
        msgs = ((InternalEObject)ecContextsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST, null, msgs);
      if (newEcContextsList != null)
        msgs = ((InternalEObject)newEcContextsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST, null, msgs);
      msgs = basicSetEcContextsList(newEcContextsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST, newEcContextsList, newEcContextsList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExpContextsList getExpContextsList()
  {
    return expContextsList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpContextsList(ExpContextsList newExpContextsList, NotificationChain msgs)
  {
    ExpContextsList oldExpContextsList = expContextsList;
    expContextsList = newExpContextsList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST, oldExpContextsList, newExpContextsList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpContextsList(ExpContextsList newExpContextsList)
  {
    if (newExpContextsList != expContextsList)
    {
      NotificationChain msgs = null;
      if (expContextsList != null)
        msgs = ((InternalEObject)expContextsList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST, null, msgs);
      if (newExpContextsList != null)
        msgs = ((InternalEObject)newExpContextsList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST, null, msgs);
      msgs = basicSetExpContextsList(newExpContextsList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST, newExpContextsList, newExpContextsList));
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
      case EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST:
        return basicSetEcContextsList(null, msgs);
      case EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST:
        return basicSetExpContextsList(null, msgs);
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
      case EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST:
        return getEcContextsList();
      case EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST:
        return getExpContextsList();
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
      case EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST:
        setEcContextsList((EcContextsList)newValue);
        return;
      case EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST:
        setExpContextsList((ExpContextsList)newValue);
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
      case EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST:
        setEcContextsList((EcContextsList)null);
        return;
      case EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST:
        setExpContextsList((ExpContextsList)null);
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
      case EcePackage.CONTEXTS_LIST__EC_CONTEXTS_LIST:
        return ecContextsList != null;
      case EcePackage.CONTEXTS_LIST__EXP_CONTEXTS_LIST:
        return expContextsList != null;
    }
    return super.eIsSet(featureID);
  }

} //ContextsListImpl
