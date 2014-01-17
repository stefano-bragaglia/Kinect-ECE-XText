/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.Reference#getRef <em>Ref</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.Reference#getFluentValueSample <em>Fluent Value Sample</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends Expression
{
  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(ReferenceType)
   * @see org.xtext.ecerule.ece.EcePackage#getReference_Ref()
   * @model
   * @generated
   */
  ReferenceType getRef();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Reference#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(ReferenceType value);

  /**
   * Returns the value of the '<em><b>Fluent Value Sample</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fluent Value Sample</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fluent Value Sample</em>' containment reference.
   * @see #setFluentValueSample(AtExpr)
   * @see org.xtext.ecerule.ece.EcePackage#getReference_FluentValueSample()
   * @model containment="true"
   * @generated
   */
  AtExpr getFluentValueSample();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Reference#getFluentValueSample <em>Fluent Value Sample</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fluent Value Sample</em>' containment reference.
   * @see #getFluentValueSample()
   * @generated
   */
  void setFluentValueSample(AtExpr value);

} // Reference
