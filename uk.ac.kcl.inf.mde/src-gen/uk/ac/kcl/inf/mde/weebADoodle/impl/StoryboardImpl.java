/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mde.weebADoodle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mde.weebADoodle.Scene;
import uk.ac.kcl.inf.mde.weebADoodle.Storyboard;
import uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Storyboard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.StoryboardImpl#getScenes <em>Scenes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StoryboardImpl extends MinimalEObjectImpl.Container implements Storyboard
{
  /**
   * The cached value of the '{@link #getScenes() <em>Scenes</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScenes()
   * @generated
   * @ordered
   */
  protected EList<Scene> scenes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StoryboardImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return WeebADoodlePackage.Literals.STORYBOARD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Scene> getScenes()
  {
    if (scenes == null)
    {
      scenes = new EObjectContainmentEList<Scene>(Scene.class, this, WeebADoodlePackage.STORYBOARD__SCENES);
    }
    return scenes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.STORYBOARD__SCENES:
        return ((InternalEList<?>)getScenes()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.STORYBOARD__SCENES:
        return getScenes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.STORYBOARD__SCENES:
        getScenes().clear();
        getScenes().addAll((Collection<? extends Scene>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.STORYBOARD__SCENES:
        getScenes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case WeebADoodlePackage.STORYBOARD__SCENES:
        return scenes != null && !scenes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //StoryboardImpl