/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Equality</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.Equality#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.Equality#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.Equality#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getEquality()
 * @model
 * @generated
 */
public interface Equality extends Expression
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
   * @see #setLeft(Atomic)
   * @see org.xtext.ecerule.ece.EcePackage#getEquality_Left()
   * @model containment="true"
   * @generated
   */
  Atomic getLeft();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Equality#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Atomic value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see org.xtext.ecerule.ece.EcePackage#getEquality_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Equality#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Atomic)
   * @see org.xtext.ecerule.ece.EcePackage#getEquality_Right()
   * @model containment="true"
   * @generated
   */
  Atomic getRight();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Equality#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Atomic value);

} // Equality
