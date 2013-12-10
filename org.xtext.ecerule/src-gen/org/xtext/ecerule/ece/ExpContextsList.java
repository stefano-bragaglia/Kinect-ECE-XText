/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exp Contexts List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.ExpContextsList#getExpContexts <em>Exp Contexts</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getExpContextsList()
 * @model
 * @generated
 */
public interface ExpContextsList extends EObject
{
  /**
   * Returns the value of the '<em><b>Exp Contexts</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.ecerule.ece.ExpContext}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Contexts</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Contexts</em>' containment reference list.
   * @see org.xtext.ecerule.ece.EcePackage#getExpContextsList_ExpContexts()
   * @model containment="true"
   * @generated
   */
  EList<ExpContext> getExpContexts();

} // ExpContextsList
