/**
 */
package org.xtext.ecerule.ece.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.ecerule.ece.ConditionRule;
import org.xtext.ecerule.ece.EcePackage;
import org.xtext.ecerule.ece.Fluent;
import org.xtext.ecerule.ece.InRule;
import org.xtext.ecerule.ece.ToRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fluent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.impl.FluentImpl#getFluentName <em>Fluent Name</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.FluentImpl#getValuePart <em>Value Part</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.FluentImpl#getTimePart <em>Time Part</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.impl.FluentImpl#getCondPart <em>Cond Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FluentImpl extends ReferenceTypeImpl implements Fluent
{
  /**
   * The default value of the '{@link #getFluentName() <em>Fluent Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluentName()
   * @generated
   * @ordered
   */
  protected static final String FLUENT_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFluentName() <em>Fluent Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFluentName()
   * @generated
   * @ordered
   */
  protected String fluentName = FLUENT_NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getValuePart() <em>Value Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValuePart()
   * @generated
   * @ordered
   */
  protected ToRule valuePart;

  /**
   * The cached value of the '{@link #getTimePart() <em>Time Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimePart()
   * @generated
   * @ordered
   */
  protected InRule timePart;

  /**
   * The cached value of the '{@link #getCondPart() <em>Cond Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondPart()
   * @generated
   * @ordered
   */
  protected ConditionRule condPart;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FluentImpl()
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
    return EcePackage.Literals.FLUENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFluentName()
  {
    return fluentName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFluentName(String newFluentName)
  {
    String oldFluentName = fluentName;
    fluentName = newFluentName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.FLUENT__FLUENT_NAME, oldFluentName, fluentName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ToRule getValuePart()
  {
    return valuePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetValuePart(ToRule newValuePart, NotificationChain msgs)
  {
    ToRule oldValuePart = valuePart;
    valuePart = newValuePart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.FLUENT__VALUE_PART, oldValuePart, newValuePart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setValuePart(ToRule newValuePart)
  {
    if (newValuePart != valuePart)
    {
      NotificationChain msgs = null;
      if (valuePart != null)
        msgs = ((InternalEObject)valuePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.FLUENT__VALUE_PART, null, msgs);
      if (newValuePart != null)
        msgs = ((InternalEObject)newValuePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.FLUENT__VALUE_PART, null, msgs);
      msgs = basicSetValuePart(newValuePart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.FLUENT__VALUE_PART, newValuePart, newValuePart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InRule getTimePart()
  {
    return timePart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTimePart(InRule newTimePart, NotificationChain msgs)
  {
    InRule oldTimePart = timePart;
    timePart = newTimePart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.FLUENT__TIME_PART, oldTimePart, newTimePart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimePart(InRule newTimePart)
  {
    if (newTimePart != timePart)
    {
      NotificationChain msgs = null;
      if (timePart != null)
        msgs = ((InternalEObject)timePart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.FLUENT__TIME_PART, null, msgs);
      if (newTimePart != null)
        msgs = ((InternalEObject)newTimePart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.FLUENT__TIME_PART, null, msgs);
      msgs = basicSetTimePart(newTimePart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.FLUENT__TIME_PART, newTimePart, newTimePart));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionRule getCondPart()
  {
    return condPart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondPart(ConditionRule newCondPart, NotificationChain msgs)
  {
    ConditionRule oldCondPart = condPart;
    condPart = newCondPart;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EcePackage.FLUENT__COND_PART, oldCondPart, newCondPart);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCondPart(ConditionRule newCondPart)
  {
    if (newCondPart != condPart)
    {
      NotificationChain msgs = null;
      if (condPart != null)
        msgs = ((InternalEObject)condPart).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EcePackage.FLUENT__COND_PART, null, msgs);
      if (newCondPart != null)
        msgs = ((InternalEObject)newCondPart).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EcePackage.FLUENT__COND_PART, null, msgs);
      msgs = basicSetCondPart(newCondPart, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, EcePackage.FLUENT__COND_PART, newCondPart, newCondPart));
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
      case EcePackage.FLUENT__VALUE_PART:
        return basicSetValuePart(null, msgs);
      case EcePackage.FLUENT__TIME_PART:
        return basicSetTimePart(null, msgs);
      case EcePackage.FLUENT__COND_PART:
        return basicSetCondPart(null, msgs);
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
      case EcePackage.FLUENT__FLUENT_NAME:
        return getFluentName();
      case EcePackage.FLUENT__VALUE_PART:
        return getValuePart();
      case EcePackage.FLUENT__TIME_PART:
        return getTimePart();
      case EcePackage.FLUENT__COND_PART:
        return getCondPart();
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
      case EcePackage.FLUENT__FLUENT_NAME:
        setFluentName((String)newValue);
        return;
      case EcePackage.FLUENT__VALUE_PART:
        setValuePart((ToRule)newValue);
        return;
      case EcePackage.FLUENT__TIME_PART:
        setTimePart((InRule)newValue);
        return;
      case EcePackage.FLUENT__COND_PART:
        setCondPart((ConditionRule)newValue);
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
      case EcePackage.FLUENT__FLUENT_NAME:
        setFluentName(FLUENT_NAME_EDEFAULT);
        return;
      case EcePackage.FLUENT__VALUE_PART:
        setValuePart((ToRule)null);
        return;
      case EcePackage.FLUENT__TIME_PART:
        setTimePart((InRule)null);
        return;
      case EcePackage.FLUENT__COND_PART:
        setCondPart((ConditionRule)null);
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
      case EcePackage.FLUENT__FLUENT_NAME:
        return FLUENT_NAME_EDEFAULT == null ? fluentName != null : !FLUENT_NAME_EDEFAULT.equals(fluentName);
      case EcePackage.FLUENT__VALUE_PART:
        return valuePart != null;
      case EcePackage.FLUENT__TIME_PART:
        return timePart != null;
      case EcePackage.FLUENT__COND_PART:
        return condPart != null;
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
    result.append(" (fluentName: ");
    result.append(fluentName);
    result.append(')');
    return result.toString();
  }

} //FluentImpl
