/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>In Time Current Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.InTimeCurrentTime#getInTimeValue <em>In Time Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getInTimeCurrentTime()
 * @model
 * @generated
 */
public interface InTimeCurrentTime extends InExpr
{
  /**
   * Returns the value of the '<em><b>In Time Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>In Time Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>In Time Value</em>' attribute.
   * @see #setInTimeValue(String)
   * @see org.xtext.ecerule.ece.EcePackage#getInTimeCurrentTime_InTimeValue()
   * @model
   * @generated
   */
  String getInTimeValue();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.InTimeCurrentTime#getInTimeValue <em>In Time Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>In Time Value</em>' attribute.
   * @see #getInTimeValue()
   * @generated
   */
  void setInTimeValue(String value);

} // InTimeCurrentTime
