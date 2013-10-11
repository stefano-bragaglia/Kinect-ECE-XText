/**
 */
package org.xtext.ecerule.ece;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.xtext.ecerule.ece.FeatureRef#getParam <em>Param</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.xtext.ecerule.ece.EcePackage#getFeatureRef()
 * @model
 * @generated
 */
public interface FeatureRef extends Expression
{
  /**
   * Returns the value of the '<em><b>Param</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Param</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Param</em>' reference.
   * @see #setParam(EventFeature)
   * @see org.xtext.ecerule.ece.EcePackage#getFeatureRef_Param()
   * @model
   * @generated
   */
  EventFeature getParam();

  /**
   * Sets the value of the '{@link org.xtext.ecerule.ece.FeatureRef#getParam <em>Param</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Param</em>' reference.
   * @see #getParam()
   * @generated
   */
  void setParam(EventFeature value);

} // FeatureRef
