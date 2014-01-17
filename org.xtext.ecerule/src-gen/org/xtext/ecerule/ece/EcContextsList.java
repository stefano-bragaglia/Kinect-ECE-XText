/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ec Contexts List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.EcContextsList#getEcContexts <em>Ec Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getEcContextsList()
 * @model
 * @generated
 */
public interface EcContextsList extends EObject
{
  /**
   * Returns the value of the '<em><b>Ec Contexts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ecerule.ece.EcContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ec Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ec Contexts</em>' containment reference list.
   * @see org.xtext.ecerule.ece.EcePackage#getEcContextsList_EcContexts()
   * @model containment="true"
   * @generated
   */
  EList<EcContext> getEcContexts();

} // EcContextsList
