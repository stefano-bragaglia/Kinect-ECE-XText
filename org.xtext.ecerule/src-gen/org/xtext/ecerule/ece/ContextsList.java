/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contexts List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.ContextsList#getEcContextsList <em>Ec Contexts List</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.ContextsList#getExpContextsList <em>Exp Contexts List</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getContextsList()
 * @model
 * @generated
 */
public interface ContextsList extends EObject
{
  /**
   * Returns the value of the '<em><b>Ec Contexts List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ec Contexts List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ec Contexts List</em>' containment reference.
   * @see #setEcContextsList(EcContextsList)
   * @see org.xtext.ecerule.ece.EcePackage#getContextsList_EcContextsList()
   * @model containment="true"
   * @generated
   */
  EcContextsList getEcContextsList();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ContextsList#getEcContextsList <em>Ec Contexts List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ec Contexts List</em>' containment reference.
   * @see #getEcContextsList()
   * @generated
   */
  void setEcContextsList(EcContextsList value);

  /**
   * Returns the value of the '<em><b>Exp Contexts List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp Contexts List</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp Contexts List</em>' containment reference.
   * @see #setExpContextsList(ExpContextsList)
   * @see org.xtext.ecerule.ece.EcePackage#getContextsList_ExpContextsList()
   * @model containment="true"
   * @generated
   */
  ExpContextsList getExpContextsList();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.ContextsList#getExpContextsList <em>Exp Contexts List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp Contexts List</em>' containment reference.
   * @see #getExpContextsList()
   * @generated
   */
  void setExpContextsList(ExpContextsList value);

} // ContextsList
