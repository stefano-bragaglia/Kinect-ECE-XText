/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.InRule#getTime <em>Time</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.InRule#getCurrentTime <em>Current Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getInRule()
 * @model
 * @generated
 */
public interface InRule extends EObject
{
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
   * @see org.xtext.ecerule.ece.EcePackage#getInRule_Time()
   * @model
   * @generated
   */
  int getTime();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.InRule#getTime <em>Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time</em>' attribute.
   * @see #getTime()
   * @generated
   */
  void setTime(int value);

  /**
   * Returns the value of the '<em><b>Current Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Current Time</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Current Time</em>' attribute.
   * @see #setCurrentTime(String)
   * @see org.xtext.ecerule.ece.EcePackage#getInRule_CurrentTime()
   * @model
   * @generated
   */
  String getCurrentTime();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.InRule#getCurrentTime <em>Current Time</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Current Time</em>' attribute.
   * @see #getCurrentTime()
   * @generated
   */
  void setCurrentTime(String value);

} // InRule
