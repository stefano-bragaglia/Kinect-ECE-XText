/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>At Time Current Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.AtTimeCurrentTime#getAtTimeValue <em>At Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getAtTimeCurrentTime()
 * @model
 * @generated
 */
public interface AtTimeCurrentTime extends AtExpr
{
  /**
   * Returns the value of the '<em><b>At Time Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>At Time Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>At Time Value</em>' attribute.
   * @see #setAtTimeValue(String)
   * @see org.xtext.ecerule.ece.EcePackage#getAtTimeCurrentTime_AtTimeValue()
   * @model
   * @generated
   */
  String getAtTimeValue();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.AtTimeCurrentTime#getAtTimeValue <em>At Time Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>At Time Value</em>' attribute.
   * @see #getAtTimeValue()
   * @generated
   */
  void setAtTimeValue(String value);

} // AtTimeCurrentTime
