/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mde.weebADoodle.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.mde.weebADoodle.ActionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.Board;
import uk.ac.kcl.inf.mde.weebADoodle.CameraShotStatement;
import uk.ac.kcl.inf.mde.weebADoodle.DescriptionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.DialogueStatement;
import uk.ac.kcl.inf.mde.weebADoodle.LightingStatement;
import uk.ac.kcl.inf.mde.weebADoodle.PositionStatement;
import uk.ac.kcl.inf.mde.weebADoodle.Scene;
import uk.ac.kcl.inf.mde.weebADoodle.SceneObject;
import uk.ac.kcl.inf.mde.weebADoodle.Setting;
import uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage
 * @generated
 */
public class WeebADoodleAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static WeebADoodlePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WeebADoodleAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = WeebADoodlePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WeebADoodleSwitch<Adapter> modelSwitch =
    new WeebADoodleSwitch<Adapter>()
    {
      @Override
      public Adapter caseBoard(Board object)
      {
        return createBoardAdapter();
      }
      @Override
      public Adapter caseScene(Scene object)
      {
        return createSceneAdapter();
      }
      @Override
      public Adapter caseCharacter(uk.ac.kcl.inf.mde.weebADoodle.Character object)
      {
        return createCharacterAdapter();
      }
      @Override
      public Adapter caseSceneObject(SceneObject object)
      {
        return createSceneObjectAdapter();
      }
      @Override
      public Adapter caseSetting(Setting object)
      {
        return createSettingAdapter();
      }
      @Override
      public Adapter caseDescriptionStatement(DescriptionStatement object)
      {
        return createDescriptionStatementAdapter();
      }
      @Override
      public Adapter caseDialogueStatement(DialogueStatement object)
      {
        return createDialogueStatementAdapter();
      }
      @Override
      public Adapter caseActionStatement(ActionStatement object)
      {
        return createActionStatementAdapter();
      }
      @Override
      public Adapter casePositionStatement(PositionStatement object)
      {
        return createPositionStatementAdapter();
      }
      @Override
      public Adapter caseCameraShotStatement(CameraShotStatement object)
      {
        return createCameraShotStatementAdapter();
      }
      @Override
      public Adapter caseLightingStatement(LightingStatement object)
      {
        return createLightingStatementAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.Board <em>Board</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.Board
   * @generated
   */
  public Adapter createBoardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.Scene <em>Scene</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.Scene
   * @generated
   */
  public Adapter createSceneAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.Character <em>Character</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.Character
   * @generated
   */
  public Adapter createCharacterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.SceneObject <em>Scene Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.SceneObject
   * @generated
   */
  public Adapter createSceneObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.Setting <em>Setting</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.Setting
   * @generated
   */
  public Adapter createSettingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.DescriptionStatement <em>Description Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.DescriptionStatement
   * @generated
   */
  public Adapter createDescriptionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.DialogueStatement <em>Dialogue Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.DialogueStatement
   * @generated
   */
  public Adapter createDialogueStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.ActionStatement <em>Action Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.ActionStatement
   * @generated
   */
  public Adapter createActionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.PositionStatement <em>Position Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.PositionStatement
   * @generated
   */
  public Adapter createPositionStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.CameraShotStatement <em>Camera Shot Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.CameraShotStatement
   * @generated
   */
  public Adapter createCameraShotStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.mde.weebADoodle.LightingStatement <em>Lighting Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.mde.weebADoodle.LightingStatement
   * @generated
   */
  public Adapter createLightingStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //WeebADoodleAdapterFactory
