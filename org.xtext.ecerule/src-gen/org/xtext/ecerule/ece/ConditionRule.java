/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.ConditionRule#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getConditionRule()
 * @model
 * @generated
 */
public interface ConditionRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Condition</em>' containment reference.
   * @see #setCondition(BoolExpr)
   * @see org.xtext.ecerule.ece.EcePackage#getConditionRule_Condition()
   * @model containment="true"
   * @generated
   */
  BoolExpr getCondition();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ConditionRule#getCondition <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Condition</em>' containment reference.
   * @see #getCondition()
   * @generated
   */
  void setCondition(BoolExpr value);

} // ConditionRule
