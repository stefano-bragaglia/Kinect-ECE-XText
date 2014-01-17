/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>At Time Plus Or Min</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getAtTimePlusOrMin()
 * @model
 * @generated
 */
public interface AtTimePlusOrMin extends AtExpr
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
   * @see #setLeft(AtExpr)
   * @see org.xtext.ecerule.ece.EcePackage#getAtTimePlusOrMin_Left()
   * @model containment="true"
   * @generated
   */
  AtExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(AtExpr value);

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
   * @see org.xtext.ecerule.ece.EcePackage#getAtTimePlusOrMin_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getOp <em>Op</em>}' attribute.
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
   * @see #setRight(AtExpr)
   * @see org.xtext.ecerule.ece.EcePackage#getAtTimePlusOrMin_Right()
   * @model containment="true"
   * @generated
   */
  AtExpr getRight();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.AtTimePlusOrMin#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(AtExpr value);

} // AtTimePlusOrMin
