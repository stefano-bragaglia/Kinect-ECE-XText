/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.FloatConstant#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getFloatConstant()
 * @model
 * @generated
 */
public interface FloatConstant extends Expression
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(float)
   * @see org.xtext.ecerule.ece.EcePackage#getFloatConstant_Value()
   * @model
   * @generated
   */
  float getValue();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.FloatConstant#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(float value);

} // FloatConstant
