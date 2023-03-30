/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mde.weebADoodle;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getPosition <em>Position</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getAction <em>Action</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getDialogue <em>Dialogue</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getCharacter_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getCharacter_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Position</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Position</em>' containment reference.
   * @see #setPosition(PositionStatement)
   * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getCharacter_Position()
   * @model containment="true"
   * @generated
   */
  PositionStatement getPosition();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getPosition <em>Position</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Position</em>' containment reference.
   * @see #getPosition()
   * @generated
   */
  void setPosition(PositionStatement value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' containment reference.
   * @see #setAction(ActionStatement)
   * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getCharacter_Action()
   * @model containment="true"
   * @generated
   */
  ActionStatement getAction();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getAction <em>Action</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' containment reference.
   * @see #getAction()
   * @generated
   */
  void setAction(ActionStatement value);

  /**
   * Returns the value of the '<em><b>Dialogue</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dialogue</em>' containment reference.
   * @see #setDialogue(DialogueStatement)
   * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getCharacter_Dialogue()
   * @model containment="true"
   * @generated
   */
  DialogueStatement getDialogue();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getDialogue <em>Dialogue</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dialogue</em>' containment reference.
   * @see #getDialogue()
   * @generated
   */
  void setDialogue(DialogueStatement value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference.
   * @see #setDescription(DescriptionStatement)
   * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage#getCharacter_Description()
   * @model containment="true"
   * @generated
   */
  DescriptionStatement getDescription();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.mde.weebADoodle.Character#getDescription <em>Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' containment reference.
   * @see #getDescription()
   * @generated
   */
  void setDescription(DescriptionStatement value);

} // Character
