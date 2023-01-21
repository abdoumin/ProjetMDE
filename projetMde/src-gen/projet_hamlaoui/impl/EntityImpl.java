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

import projet_hamlaoui.Entity;
import projet_hamlaoui.Field;
import projet_hamlaoui.ProjetMdePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.EntityImpl#isCreate <em>Create</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.EntityImpl#isRead <em>Read</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.EntityImpl#isUpdate <em>Update</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.EntityImpl#isDelete <em>Delete</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.EntityImpl#isMainEntity <em>Main Entity</em>}</li>
 *   <li>{@link projet_hamlaoui.impl.EntityImpl#getField <em>Field</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
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
	 * The default value of the '{@link #isCreate() <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CREATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCreate() <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCreate()
	 * @generated
	 * @ordered
	 */
	protected boolean create = CREATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRead() <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRead()
	 * @generated
	 * @ordered
	 */
	protected boolean read = READ_EDEFAULT;

	/**
	 * The default value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UPDATE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUpdate() <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUpdate()
	 * @generated
	 * @ordered
	 */
	protected boolean update = UPDATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DELETE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isDelete() <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelete()
	 * @generated
	 * @ordered
	 */
	protected boolean delete = DELETE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMainEntity() <em>Main Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMainEntity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MAIN_ENTITY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isMainEntity() <em>Main Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMainEntity()
	 * @generated
	 * @ordered
	 */
	protected boolean mainEntity = MAIN_ENTITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getField() <em>Field</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getField()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> field;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ProjetMdePackage.Literals.ENTITY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetMdePackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCreate() {
		return create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreate(boolean newCreate) {
		boolean oldCreate = create;
		create = newCreate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetMdePackage.ENTITY__CREATE, oldCreate, create));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRead() {
		return read;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRead(boolean newRead) {
		boolean oldRead = read;
		read = newRead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetMdePackage.ENTITY__READ, oldRead, read));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUpdate() {
		return update;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdate(boolean newUpdate) {
		boolean oldUpdate = update;
		update = newUpdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetMdePackage.ENTITY__UPDATE, oldUpdate, update));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(boolean newDelete) {
		boolean oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetMdePackage.ENTITY__DELETE, oldDelete, delete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMainEntity() {
		return mainEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMainEntity(boolean newMainEntity) {
		boolean oldMainEntity = mainEntity;
		mainEntity = newMainEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ProjetMdePackage.ENTITY__MAIN_ENTITY, oldMainEntity,
					mainEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getField() {
		if (field == null) {
			field = new EObjectContainmentEList<Field>(Field.class, this, ProjetMdePackage.ENTITY__FIELD);
		}
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ProjetMdePackage.ENTITY__FIELD:
			return ((InternalEList<?>) getField()).basicRemove(otherEnd, msgs);
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
		case ProjetMdePackage.ENTITY__NAME:
			return getName();
		case ProjetMdePackage.ENTITY__CREATE:
			return isCreate();
		case ProjetMdePackage.ENTITY__READ:
			return isRead();
		case ProjetMdePackage.ENTITY__UPDATE:
			return isUpdate();
		case ProjetMdePackage.ENTITY__DELETE:
			return isDelete();
		case ProjetMdePackage.ENTITY__MAIN_ENTITY:
			return isMainEntity();
		case ProjetMdePackage.ENTITY__FIELD:
			return getField();
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
		case ProjetMdePackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case ProjetMdePackage.ENTITY__CREATE:
			setCreate((Boolean) newValue);
			return;
		case ProjetMdePackage.ENTITY__READ:
			setRead((Boolean) newValue);
			return;
		case ProjetMdePackage.ENTITY__UPDATE:
			setUpdate((Boolean) newValue);
			return;
		case ProjetMdePackage.ENTITY__DELETE:
			setDelete((Boolean) newValue);
			return;
		case ProjetMdePackage.ENTITY__MAIN_ENTITY:
			setMainEntity((Boolean) newValue);
			return;
		case ProjetMdePackage.ENTITY__FIELD:
			getField().clear();
			getField().addAll((Collection<? extends Field>) newValue);
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
		case ProjetMdePackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ProjetMdePackage.ENTITY__CREATE:
			setCreate(CREATE_EDEFAULT);
			return;
		case ProjetMdePackage.ENTITY__READ:
			setRead(READ_EDEFAULT);
			return;
		case ProjetMdePackage.ENTITY__UPDATE:
			setUpdate(UPDATE_EDEFAULT);
			return;
		case ProjetMdePackage.ENTITY__DELETE:
			setDelete(DELETE_EDEFAULT);
			return;
		case ProjetMdePackage.ENTITY__MAIN_ENTITY:
			setMainEntity(MAIN_ENTITY_EDEFAULT);
			return;
		case ProjetMdePackage.ENTITY__FIELD:
			getField().clear();
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
		case ProjetMdePackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ProjetMdePackage.ENTITY__CREATE:
			return create != CREATE_EDEFAULT;
		case ProjetMdePackage.ENTITY__READ:
			return read != READ_EDEFAULT;
		case ProjetMdePackage.ENTITY__UPDATE:
			return update != UPDATE_EDEFAULT;
		case ProjetMdePackage.ENTITY__DELETE:
			return delete != DELETE_EDEFAULT;
		case ProjetMdePackage.ENTITY__MAIN_ENTITY:
			return mainEntity != MAIN_ENTITY_EDEFAULT;
		case ProjetMdePackage.ENTITY__FIELD:
			return field != null && !field.isEmpty();
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
		result.append(", create: ");
		result.append(create);
		result.append(", read: ");
		result.append(read);
		result.append(", update: ");
		result.append(update);
		result.append(", delete: ");
		result.append(delete);
		result.append(", mainEntity: ");
		result.append(mainEntity);
		result.append(')');
		return result.toString();
	}

} //EntityImpl
