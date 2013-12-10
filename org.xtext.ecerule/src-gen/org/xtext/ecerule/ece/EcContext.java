/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ec Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.EcContext#getFluent <em>Fluent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getEcContext()
 * @model
 * @generated
 */
public interface EcContext extends EObject
{
  /**
   * Returns the value of the '<em><b>Fluent</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ecerule.ece.Fluent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fluent</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fluent</em>' containment reference list.
   * @see org.xtext.ecerule.ece.EcePackage#getEcContext_Fluent()
   * @model containment="true"
   * @generated
   */
  EList<Fluent> getFluent();

} // EcContext
