/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ecerule.ece.AtExpr;
import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.Reference;
import org.xtext.ecerule.ece.ReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.ReferenceImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.ReferenceImpl#getFluentValueSample <em>Fluent Value Sample</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReferenceImpl extends AtomicImpl implements Reference
{
  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected ReferenceType ref;

  /**
   * The cached value of the '{@link #getFluentValueSample() <em>Fluent Value Sample</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluentValueSample()
   * @generated
   * @ordered
   */
  protected AtExpr fluentValueSample;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReferenceImpl()
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
    return EcePackage.Literals.REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (ReferenceType)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, EcePackage.REFERENCE__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReferenceType basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(ReferenceType newRef)
  {
    ReferenceType oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.REFERENCE__REF, oldRef, ref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtExpr getFluentValueSample()
  {
    return fluentValueSample;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFluentValueSample(AtExpr newFluentValueSample, NotificationChain msgs)
  {
    AtExpr oldFluentValueSample = fluentValueSample;
    fluentValueSample = newFluentValueSample;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE, oldFluentValueSample, newFluentValueSample);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFluentValueSample(AtExpr newFluentValueSample)
  {
    if (newFluentValueSample != fluentValueSample)
    {
      NotificationChain msgs = null;
      if (fluentValueSample != null)
        msgs = ((InternalEObject)fluentValueSample).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE, null, msgs);
      if (newFluentValueSample != null)
        msgs = ((InternalEObject)newFluentValueSample).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE, null, msgs);
      msgs = basicSetFluentValueSample(newFluentValueSample, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE, newFluentValueSample, newFluentValueSample));
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
      case EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        return basicSetFluentValueSample(null, msgs);
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
      case EcePackage.REFERENCE__REF:
        if (resolve) return getRef();
        return basicGetRef();
      case EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        return getFluentValueSample();
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
      case EcePackage.REFERENCE__REF:
        setRef((ReferenceType)newValue);
        return;
      case EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        setFluentValueSample((AtExpr)newValue);
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
      case EcePackage.REFERENCE__REF:
        setRef((ReferenceType)null);
        return;
      case EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        setFluentValueSample((AtExpr)null);
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
      case EcePackage.REFERENCE__REF:
        return ref != null;
      case EcePackage.REFERENCE__FLUENT_VALUE_SAMPLE:
        return fluentValueSample != null;
    }
    return super.eIsSet(featureID);
  }

} //ReferenceImpl
