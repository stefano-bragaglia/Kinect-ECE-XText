/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.ExpContext#getFinalCondition <em>Final Condition</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.ExpContext#getAllenOp <em>Allen Op</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.ExpContext#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.ExpContext#getInitialCondition <em>Initial Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getExpContext()
 * @model
 * @generated
 */
public interface ExpContext extends EObject
{
  /**
   * Returns the value of the '<em><b>Final Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Final Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Final Condition</em>' containment reference.
   * @see #setFinalCondition(ConditionRule)
   * @see org.xtext.ecerule.ece.EcePackage#getExpContext_FinalCondition()
   * @model containment="true"
   * @generated
   */
  ConditionRule getFinalCondition();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpContext#getFinalCondition <em>Final Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Final Condition</em>' containment reference.
   * @see #getFinalCondition()
   * @generated
   */
  void setFinalCondition(ConditionRule value);

  /**
   * Returns the value of the '<em><b>Allen Op</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Allen Op</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Allen Op</em>' containment reference.
   * @see #setAllenOp(AllenOp)
   * @see org.xtext.ecerule.ece.EcePackage#getExpContext_AllenOp()
   * @model containment="true"
   * @generated
   */
  AllenOp getAllenOp();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpContext#getAllenOp <em>Allen Op</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Allen Op</em>' containment reference.
   * @see #getAllenOp()
   * @generated
   */
  void setAllenOp(AllenOp value);

  /**
   * Returns the value of the '<em><b>Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' containment reference.
   * @see #setTime(Expression)
   * @see org.xtext.ecerule.ece.EcePackage#getExpContext_Time()
   * @model containment="true"
   * @generated
   */
  Expression getTime();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpContext#getTime <em>Time</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' containment reference.
   * @see #getTime()
   * @generated
   */
  void setTime(Expression value);

  /**
   * Returns the value of the '<em><b>Initial Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initial Condition</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initial Condition</em>' containment reference.
   * @see #setInitialCondition(ConditionRule)
   * @see org.xtext.ecerule.ece.EcePackage#getExpContext_InitialCondition()
   * @model containment="true"
   * @generated
   */
  ConditionRule getInitialCondition();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpContext#getInitialCondition <em>Initial Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initial Condition</em>' containment reference.
   * @see #getInitialCondition()
   * @generated
   */
  void setInitialCondition(ConditionRule value);

} // ExpContext
