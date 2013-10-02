/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Fluent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.ExpFluent#getFluentName <em>Fluent Name</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.ExpFluent#getValuePart <em>Value Part</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.ExpFluent#getTimePart <em>Time Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getExpFluent()
 * @model
 * @generated
 */
public interface ExpFluent extends EObject
{
  /**
   * Returns the value of the '<em><b>Fluent Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fluent Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fluent Name</em>' attribute.
   * @see #setFluentName(String)
   * @see org.xtext.ecerule.ece.EcePackage#getExpFluent_FluentName()
   * @model
   * @generated
   */
  String getFluentName();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpFluent#getFluentName <em>Fluent Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fluent Name</em>' attribute.
   * @see #getFluentName()
   * @generated
   */
  void setFluentName(String value);

  /**
   * Returns the value of the '<em><b>Value Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Part</em>' containment reference.
   * @see #setValuePart(ToRule)
   * @see org.xtext.ecerule.ece.EcePackage#getExpFluent_ValuePart()
   * @model containment="true"
   * @generated
   */
  ToRule getValuePart();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpFluent#getValuePart <em>Value Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Part</em>' containment reference.
   * @see #getValuePart()
   * @generated
   */
  void setValuePart(ToRule value);

  /**
   * Returns the value of the '<em><b>Time Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Part</em>' containment reference.
   * @see #setTimePart(InRule)
   * @see org.xtext.ecerule.ece.EcePackage#getExpFluent_TimePart()
   * @model containment="true"
   * @generated
   */
  InRule getTimePart();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpFluent#getTimePart <em>Time Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Part</em>' containment reference.
   * @see #getTimePart()
   * @generated
   */
  void setTimePart(InRule value);

} // ExpFluent
