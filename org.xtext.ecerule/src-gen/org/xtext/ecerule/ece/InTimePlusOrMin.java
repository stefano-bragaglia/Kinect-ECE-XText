/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Time Plus Or Min</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.InTimePlusOrMin#getLeft <em>Left</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.InTimePlusOrMin#getOp <em>Op</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.InTimePlusOrMin#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getInTimePlusOrMin()
 * @model
 * @generated
 */
public interface InTimePlusOrMin extends InExpr
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
   * @see #setLeft(InExpr)
   * @see org.xtext.ecerule.ece.EcePackage#getInTimePlusOrMin_Left()
   * @model containment="true"
   * @generated
   */
  InExpr getLeft();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.InTimePlusOrMin#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(InExpr value);

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
   * @see org.xtext.ecerule.ece.EcePackage#getInTimePlusOrMin_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.InTimePlusOrMin#getOp <em>Op</em>}' attribute.
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
   * @see #setRight(InExpr)
   * @see org.xtext.ecerule.ece.EcePackage#getInTimePlusOrMin_Right()
   * @model containment="true"
   * @generated
   */
  InExpr getRight();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.InTimePlusOrMin#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(InExpr value);

} // InTimePlusOrMin
