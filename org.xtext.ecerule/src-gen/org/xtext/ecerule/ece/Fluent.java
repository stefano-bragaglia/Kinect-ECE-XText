/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fluent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.Fluent#getValuePart <em>Value Part</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.Fluent#getTimePart <em>Time Part</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.Fluent#getCondPart <em>Cond Part</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getFluent()
 * @model
 * @generated
 */
public interface Fluent extends ReferenceType
{
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
   * @see org.xtext.ecerule.ece.EcePackage#getFluent_ValuePart()
   * @model containment="true"
   * @generated
   */
  ToRule getValuePart();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Fluent#getValuePart <em>Value Part</em>}' containment reference.
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
   * @see org.xtext.ecerule.ece.EcePackage#getFluent_TimePart()
   * @model containment="true"
   * @generated
   */
  InRule getTimePart();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Fluent#getTimePart <em>Time Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Part</em>' containment reference.
   * @see #getTimePart()
   * @generated
   */
  void setTimePart(InRule value);

  /**
   * Returns the value of the '<em><b>Cond Part</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cond Part</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cond Part</em>' containment reference.
   * @see #setCondPart(ConditionRule)
   * @see org.xtext.ecerule.ece.EcePackage#getFluent_CondPart()
   * @model containment="true"
   * @generated
   */
  ConditionRule getCondPart();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Fluent#getCondPart <em>Cond Part</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cond Part</em>' containment reference.
   * @see #getCondPart()
   * @generated
   */
  void setCondPart(ConditionRule value);

} // Fluent
