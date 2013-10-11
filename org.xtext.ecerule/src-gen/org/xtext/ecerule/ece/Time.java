/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.Time#getT <em>T</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getTime()
 * @model
 * @generated
 */
public interface Time extends EObject
{
  /**
   * Returns the value of the '<em><b>T</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>T</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>T</em>' attribute.
   * @see #setT(int)
   * @see org.xtext.ecerule.ece.EcePackage#getTime_T()
   * @model
   * @generated
   */
  int getT();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Time#getT <em>T</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>T</em>' attribute.
   * @see #getT()
   * @generated
   */
  void setT(int value);

} // Time
