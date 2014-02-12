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
 *   <li>{@link org.xtext.ecerule.ece.ExpContext#getActionF <em>Action F</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.ExpContext#getActionV <em>Action V</em>}</li>
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
   * Returns the value of the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time</em>' attribute.
   * @see #setTime(int)
   * @see org.xtext.ecerule.ece.EcePackage#getExpContext_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpContext#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

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

  /**
   * Returns the value of the '<em><b>Action F</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action F</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action F</em>' attribute.
   * @see #setActionF(String)
   * @see org.xtext.ecerule.ece.EcePackage#getExpContext_ActionF()
   * @model
   * @generated
   */
  String getActionF();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpContext#getActionF <em>Action F</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action F</em>' attribute.
   * @see #getActionF()
   * @generated
   */
  void setActionF(String value);

  /**
   * Returns the value of the '<em><b>Action V</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action V</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action V</em>' attribute.
   * @see #setActionV(String)
   * @see org.xtext.ecerule.ece.EcePackage#getExpContext_ActionV()
   * @model
   * @generated
   */
  String getActionV();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ExpContext#getActionV <em>Action V</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action V</em>' attribute.
   * @see #getActionV()
   * @generated
   */
  void setActionV(String value);

} // ExpContext
