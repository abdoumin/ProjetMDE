/**
 */
package projet_hamlaoui.impl;

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

import projet_hamlaoui.Dependencies;
import projet_hamlaoui.Entity;
import projet_hamlaoui.Microservice;
import projet_hamlaoui.ProjetMdePackage;
import projet_hamlaoui.Properties;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.impl.MicroserviceImpl#getName <em>Name</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.MicroserviceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.MicroserviceImpl#getEntity <em>Entity</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.MicroserviceImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.MicroserviceImpl#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroserviceImpl extends MinimalEObjectImpl.Container implements Microservice {
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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Properties> properties;

	/**
	 * The cached value of the '{@link #getEntity() <em>Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<Entity> entity;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<projet_hamlaoui.Enum> enum_;

	/**
	 * The cached value of the '{@link #getDependencies() <em>Dependencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDependencies()
	 * @generated
	 * @ordered
	 */
	protected EList<Dependencies> dependencies;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetMdePackage.Literals.MICROSERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetMdePackage.MICROSERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Properties> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Properties>(Properties.class, this,
					ProjetMdePackage.MICROSERVICE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Entity> getEntity() {
		if (entity == null) {
			entity = new EObjectContainmentEList<Entity>(Entity.class, this, ProjetMdePackage.MICROSERVICE__ENTITY);
		}
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<projet_hamlaoui.Enum> getEnum() {
		if (enum_ == null) {
			enum_ = new EObjectContainmentEList<projet_hamlaoui.Enum>(projet_hamlaoui.Enum.class, this,
					ProjetMdePackage.MICROSERVICE__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dependencies> getDependencies() {
		if (dependencies == null) {
			dependencies = new EObjectContainmentEList<Dependencies>(Dependencies.class, this,
					ProjetMdePackage.MICROSERVICE__DEPENDENCIES);
		}
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetMdePackage.MICROSERVICE__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		case ProjetMdePackage.MICROSERVICE__ENTITY:
			return ((InternalEList<?>) getEntity()).basicRemove(otherEnd, msgs);
		case ProjetMdePackage.MICROSERVICE__ENUM:
			return ((InternalEList<?>) getEnum()).basicRemove(otherEnd, msgs);
		case ProjetMdePackage.MICROSERVICE__DEPENDENCIES:
			return ((InternalEList<?>) getDependencies()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ProjetMdePackage.MICROSERVICE__NAME:
			return getName();
		case ProjetMdePackage.MICROSERVICE__PROPERTIES:
			return getProperties();
		case ProjetMdePackage.MICROSERVICE__ENTITY:
			return getEntity();
		case ProjetMdePackage.MICROSERVICE__ENUM:
			return getEnum();
		case ProjetMdePackage.MICROSERVICE__DEPENDENCIES:
			return getDependencies();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ProjetMdePackage.MICROSERVICE__NAME:
			setName((String) newValue);
			return;
		case ProjetMdePackage.MICROSERVICE__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends Properties>) newValue);
			return;
		case ProjetMdePackage.MICROSERVICE__ENTITY:
			getEntity().clear();
			getEntity().addAll((Collection<? extends Entity>) newValue);
			return;
		case ProjetMdePackage.MICROSERVICE__ENUM:
			getEnum().clear();
			getEnum().addAll((Collection<? extends projet_hamlaoui.Enum>) newValue);
			return;
		case ProjetMdePackage.MICROSERVICE__DEPENDENCIES:
			getDependencies().clear();
			getDependencies().addAll((Collection<? extends Dependencies>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ProjetMdePackage.MICROSERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetMdePackage.MICROSERVICE__PROPERTIES:
			getProperties().clear();
			return;
		case ProjetMdePackage.MICROSERVICE__ENTITY:
			getEntity().clear();
			return;
		case ProjetMdePackage.MICROSERVICE__ENUM:
			getEnum().clear();
			return;
		case ProjetMdePackage.MICROSERVICE__DEPENDENCIES:
			getDependencies().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ProjetMdePackage.MICROSERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetMdePackage.MICROSERVICE__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case ProjetMdePackage.MICROSERVICE__ENTITY:
			return entity != null && !entity.isEmpty();
		case ProjetMdePackage.MICROSERVICE__ENUM:
			return enum_ != null && !enum_.isEmpty();
		case ProjetMdePackage.MICROSERVICE__DEPENDENCIES:
			return dependencies != null && !dependencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //MicroserviceImpl
