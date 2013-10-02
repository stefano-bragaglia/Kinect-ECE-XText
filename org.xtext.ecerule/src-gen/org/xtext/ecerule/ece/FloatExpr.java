/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Float Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.FloatExpr#getValueDirect <em>Value Direct</em>}</li>
 *   <li>{@link org.xtext.ecerule.ece.FloatExpr#getValueOfFluent <em>Value Of Fluent</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getFloatExpr()
 * @model
 * @generated
 */
public interface FloatExpr extends Equality
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
   * @see org.xtext.ecerule.ece.EcePackage#getFloatExpr_ValueDirect()
   * @model
   * @generated
   */
  float getValueDirect();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.FloatExpr#getValueDirect <em>Value Direct</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Direct</em>' attribute.
   * @see #getValueDirect()
   * @generated
   */
  void setValueDirect(float value);

  /**
   * Returns the value of the '<em><b>Value Of Fluent</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Value Of Fluent</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value Of Fluent</em>' containment reference.
   * @see #setValueOfFluent(FluentWhoseValue)
   * @see org.xtext.ecerule.ece.EcePackage#getFloatExpr_ValueOfFluent()
   * @model containment="true"
   * @generated
   */
  FluentWhoseValue getValueOfFluent();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.FloatExpr#getValueOfFluent <em>Value Of Fluent</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value Of Fluent</em>' containment reference.
   * @see #getValueOfFluent()
   * @generated
   */
  void setValueOfFluent(FluentWhoseValue value);

} // FloatExpr
