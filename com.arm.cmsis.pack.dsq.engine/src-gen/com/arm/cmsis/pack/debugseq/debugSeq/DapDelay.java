/**
 * generated by Xtext 2.10.0
 */
package com.arm.cmsis.pack.debugseq.debugSeq;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dap Delay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.arm.cmsis.pack.debugseq.debugSeq.DapDelay#getDelay <em>Delay</em>}</li>
 * </ul>
 *
 * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDapDelay()
 * @model
 * @generated
 */
public interface DapDelay extends Expression
{
  /**
   * Returns the value of the '<em><b>Delay</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Delay</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Delay</em>' containment reference.
   * @see #setDelay(Expression)
   * @see com.arm.cmsis.pack.debugseq.debugSeq.DebugSeqPackage#getDapDelay_Delay()
   * @model containment="true"
   * @generated
   */
  Expression getDelay();

  /**
   * Sets the value of the '{@link com.arm.cmsis.pack.debugseq.debugSeq.DapDelay#getDelay <em>Delay</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Delay</em>' containment reference.
   * @see #getDelay()
   * @generated
   */
  void setDelay(Expression value);

} // DapDelay
