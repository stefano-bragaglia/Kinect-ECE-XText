/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.Primary#getValueDirect <em>Value Direct</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getPrimary()
 * @model
 * @generated
 */
public interface Primary extends MulOrDiv
{
  /**
   * Returns the value of the '<em><b>Value Direct</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Direct</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Direct</em>' attribute.
   * @see #setValueDirect(float)
   * @see org.xtext.ecerule.ece.EcePackage#getPrimary_ValueDirect()
   * @model
   * @generated
   */
  float getValueDirect();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.Primary#getValueDirect <em>Value Direct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Direct</em>' attribute.
   * @see #getValueDirect()
   * @generated
   */
  void setValueDirect(float value);

} // Primary
