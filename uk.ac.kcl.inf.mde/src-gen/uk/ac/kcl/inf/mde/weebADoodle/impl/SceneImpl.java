/**
 * generated by Xtext 2.29.0
 */
package uk.ac.kcl.inf.mde.weebADoodle.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import uk.ac.kcl.inf.mde.weebADoodle.Direction;
import uk.ac.kcl.inf.mde.weebADoodle.Scene;
import uk.ac.kcl.inf.mde.weebADoodle.SceneObject;
import uk.ac.kcl.inf.mde.weebADoodle.Setting;
import uk.ac.kcl.inf.mde.weebADoodle.WeebADoodlePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Scene</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.SceneImpl#getName <em>Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.SceneImpl#getValue <em>Value</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.SceneImpl#getBackground <em>Background</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.SceneImpl#getCharacters <em>Characters</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.SceneImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.SceneImpl#getSettings <em>Settings</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.mde.weebADoodle.impl.SceneImpl#getDirections <em>Directions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SceneImpl extends MinimalEObjectImpl.Container implements Scene
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected static final String VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getValue()
   * @generated
   * @ordered
   */
  protected String value = VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected static final String BACKGROUND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackground()
   * @generated
   * @ordered
   */
  protected String background = BACKGROUND_EDEFAULT;

  /**
   * The cached value of the '{@link #getCharacters() <em>Characters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCharacters()
   * @generated
   * @ordered
   */
  protected EList<uk.ac.kcl.inf.mde.weebADoodle.Character> characters;

  /**
   * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getObjects()
   * @generated
   * @ordered
   */
  protected EList<SceneObject> objects;

  /**
   * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettings()
   * @generated
   * @ordered
   */
  protected Setting settings;

  /**
   * The cached value of the '{@link #getDirections() <em>Directions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirections()
   * @generated
   * @ordered
   */
  protected Direction directions;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SceneImpl()
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
    return WeebADoodlePackage.Literals.SCENE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.SCENE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setValue(String newValue)
  {
    String oldValue = value;
    value = newValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.SCENE__VALUE, oldValue, value));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getBackground()
  {
    return background;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBackground(String newBackground)
  {
    String oldBackground = background;
    background = newBackground;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.SCENE__BACKGROUND, oldBackground, background));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<uk.ac.kcl.inf.mde.weebADoodle.Character> getCharacters()
  {
    if (characters == null)
    {
      characters = new EObjectContainmentEList<uk.ac.kcl.inf.mde.weebADoodle.Character>(uk.ac.kcl.inf.mde.weebADoodle.Character.class, this, WeebADoodlePackage.SCENE__CHARACTERS);
    }
    return characters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<SceneObject> getObjects()
  {
    if (objects == null)
    {
      objects = new EObjectContainmentEList<SceneObject>(SceneObject.class, this, WeebADoodlePackage.SCENE__OBJECTS);
    }
    return objects;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Setting getSettings()
  {
    return settings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSettings(Setting newSettings, NotificationChain msgs)
  {
    Setting oldSettings = settings;
    settings = newSettings;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.SCENE__SETTINGS, oldSettings, newSettings);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSettings(Setting newSettings)
  {
    if (newSettings != settings)
    {
      NotificationChain msgs = null;
      if (settings != null)
        msgs = ((InternalEObject)settings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.SCENE__SETTINGS, null, msgs);
      if (newSettings != null)
        msgs = ((InternalEObject)newSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.SCENE__SETTINGS, null, msgs);
      msgs = basicSetSettings(newSettings, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.SCENE__SETTINGS, newSettings, newSettings));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Direction getDirections()
  {
    return directions;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirections(Direction newDirections, NotificationChain msgs)
  {
    Direction oldDirections = directions;
    directions = newDirections;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.SCENE__DIRECTIONS, oldDirections, newDirections);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDirections(Direction newDirections)
  {
    if (newDirections != directions)
    {
      NotificationChain msgs = null;
      if (directions != null)
        msgs = ((InternalEObject)directions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.SCENE__DIRECTIONS, null, msgs);
      if (newDirections != null)
        msgs = ((InternalEObject)newDirections).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WeebADoodlePackage.SCENE__DIRECTIONS, null, msgs);
      msgs = basicSetDirections(newDirections, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, WeebADoodlePackage.SCENE__DIRECTIONS, newDirections, newDirections));
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
      case WeebADoodlePackage.SCENE__CHARACTERS:
        return ((InternalEList<?>)getCharacters()).basicRemove(otherEnd, msgs);
      case WeebADoodlePackage.SCENE__OBJECTS:
        return ((InternalEList<?>)getObjects()).basicRemove(otherEnd, msgs);
      case WeebADoodlePackage.SCENE__SETTINGS:
        return basicSetSettings(null, msgs);
      case WeebADoodlePackage.SCENE__DIRECTIONS:
        return basicSetDirections(null, msgs);
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
      case WeebADoodlePackage.SCENE__NAME:
        return getName();
      case WeebADoodlePackage.SCENE__VALUE:
        return getValue();
      case WeebADoodlePackage.SCENE__BACKGROUND:
        return getBackground();
      case WeebADoodlePackage.SCENE__CHARACTERS:
        return getCharacters();
      case WeebADoodlePackage.SCENE__OBJECTS:
        return getObjects();
      case WeebADoodlePackage.SCENE__SETTINGS:
        return getSettings();
      case WeebADoodlePackage.SCENE__DIRECTIONS:
        return getDirections();
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
      case WeebADoodlePackage.SCENE__NAME:
        setName((String)newValue);
        return;
      case WeebADoodlePackage.SCENE__VALUE:
        setValue((String)newValue);
        return;
      case WeebADoodlePackage.SCENE__BACKGROUND:
        setBackground((String)newValue);
        return;
      case WeebADoodlePackage.SCENE__CHARACTERS:
        getCharacters().clear();
        getCharacters().addAll((Collection<? extends uk.ac.kcl.inf.mde.weebADoodle.Character>)newValue);
        return;
      case WeebADoodlePackage.SCENE__OBJECTS:
        getObjects().clear();
        getObjects().addAll((Collection<? extends SceneObject>)newValue);
        return;
      case WeebADoodlePackage.SCENE__SETTINGS:
        setSettings((Setting)newValue);
        return;
      case WeebADoodlePackage.SCENE__DIRECTIONS:
        setDirections((Direction)newValue);
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
      case WeebADoodlePackage.SCENE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case WeebADoodlePackage.SCENE__VALUE:
        setValue(VALUE_EDEFAULT);
        return;
      case WeebADoodlePackage.SCENE__BACKGROUND:
        setBackground(BACKGROUND_EDEFAULT);
        return;
      case WeebADoodlePackage.SCENE__CHARACTERS:
        getCharacters().clear();
        return;
      case WeebADoodlePackage.SCENE__OBJECTS:
        getObjects().clear();
        return;
      case WeebADoodlePackage.SCENE__SETTINGS:
        setSettings((Setting)null);
        return;
      case WeebADoodlePackage.SCENE__DIRECTIONS:
        setDirections((Direction)null);
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
      case WeebADoodlePackage.SCENE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case WeebADoodlePackage.SCENE__VALUE:
        return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
      case WeebADoodlePackage.SCENE__BACKGROUND:
        return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
      case WeebADoodlePackage.SCENE__CHARACTERS:
        return characters != null && !characters.isEmpty();
      case WeebADoodlePackage.SCENE__OBJECTS:
        return objects != null && !objects.isEmpty();
      case WeebADoodlePackage.SCENE__SETTINGS:
        return settings != null;
      case WeebADoodlePackage.SCENE__DIRECTIONS:
        return directions != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", value: ");
    result.append(value);
    result.append(", background: ");
    result.append(background);
    result.append(')');
    return result.toString();
  }

} //SceneImpl