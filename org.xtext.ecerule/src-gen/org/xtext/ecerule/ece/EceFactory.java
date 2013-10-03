/**
 */
package org.xtext.ecerule.ece;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.xtext.ecerule.ece.EcePackage
 * @generated
 */
public interface EceFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  EceFactory eINSTANCE = org.xtext.ecerule.ece.impl.EceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Drools Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Drools Model</em>'.
   * @generated
   */
  DroolsModel createDroolsModel();

  /**
   * Returns a new object of class '<em>Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Statement</em>'.
   * @generated
   */
  Statement createStatement();

  /**
   * Returns a new object of class '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Event</em>'.
   * @generated
   */
  Event createEvent();

  /**
   * Returns a new object of class '<em>Fluent</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fluent</em>'.
   * @generated
   */
  Fluent createFluent();

  /**
   * Returns a new object of class '<em>To Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>To Rule</em>'.
   * @generated
   */
  ToRule createToRule();

  /**
   * Returns a new object of class '<em>String Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>String Expr</em>'.
   * @generated
   */
  StringExpr createStringExpr();

  /**
   * Returns a new object of class '<em>Bool Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Bool Expr</em>'.
   * @generated
   */
  BoolExpr createBoolExpr();

  /**
   * Returns a new object of class '<em>Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Or</em>'.
   * @generated
   */
  Or createOr();

  /**
   * Returns a new object of class '<em>And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>And</em>'.
   * @generated
   */
  And createAnd();

  /**
   * Returns a new object of class '<em>Equality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Equality</em>'.
   * @generated
   */
  Equality createEquality();

  /**
   * Returns a new object of class '<em>Comparison</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Comparison</em>'.
   * @generated
   */
  Comparison createComparison();

  /**
   * Returns a new object of class '<em>switch Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>switch Expr</em>'.
   * @generated
   */
  switchExpr createswitchExpr();

  /**
   * Returns a new object of class '<em>Mutation Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mutation Expr</em>'.
   * @generated
   */
  MutationExpr createMutationExpr();

  /**
   * Returns a new object of class '<em>Float Expr</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Float Expr</em>'.
   * @generated
   */
  FloatExpr createFloatExpr();

  /**
   * Returns a new object of class '<em>Plus Or Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus Or Minus</em>'.
   * @generated
   */
  PlusOrMinus createPlusOrMinus();

  /**
   * Returns a new object of class '<em>Mul Or Div</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Mul Or Div</em>'.
   * @generated
   */
  MulOrDiv createMulOrDiv();

  /**
   * Returns a new object of class '<em>Primary</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Primary</em>'.
   * @generated
   */
  Primary createPrimary();

  /**
   * Returns a new object of class '<em>Fluent Whose Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Fluent Whose Value</em>'.
   * @generated
   */
  FluentWhoseValue createFluentWhoseValue();

  /**
   * Returns a new object of class '<em>Str</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Str</em>'.
   * @generated
   */
  Str createStr();

  /**
   * Returns a new object of class '<em>In Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>In Rule</em>'.
   * @generated
   */
  InRule createInRule();

  /**
   * Returns a new object of class '<em>Condition Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Condition Rule</em>'.
   * @generated
   */
  ConditionRule createConditionRule();

  /**
   * Returns a new object of class '<em>Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plus</em>'.
   * @generated
   */
  Plus createPlus();

  /**
   * Returns a new object of class '<em>Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Minus</em>'.
   * @generated
   */
  Minus createMinus();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  EcePackage getEcePackage();

} //EceFactory
