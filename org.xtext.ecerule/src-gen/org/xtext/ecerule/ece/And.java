/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.And#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.And#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getAnd()
 * @model
 * @generated
 */
public interface And extends Expression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Equality)
   * @see org.xtext.ecerule.ece.EcePackage#getAnd_Left()
   * @model containment="true"
   * @generated
   */
  Equality getLeft();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.And#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Equality value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Equality)
   * @see org.xtext.ecerule.ece.EcePackage#getAnd_Right()
   * @model containment="true"
   * @generated
   */
  Equality getRight();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.And#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Equality value);

} // And
