/**
 */
package projet_hamlaoui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.Entity#getName <em>Name</em>}</li>
 *   <li>{@link projet_hamlaoui.Entity#isCreate <em>Create</em>}</li>
 *   <li>{@link projet_hamlaoui.Entity#isRead <em>Read</em>}</li>
 *   <li>{@link projet_hamlaoui.Entity#isUpdate <em>Update</em>}</li>
 *   <li>{@link projet_hamlaoui.Entity#isDelete <em>Delete</em>}</li>
 *   <li>{@link projet_hamlaoui.Entity#isMainEntity <em>Main Entity</em>}</li>
 *   <li>{@link projet_hamlaoui.Entity#getField <em>Field</em>}</li>
 * </ul>
 *
 * @see projet_hamlaoui.ProjetMdePackage#getEntity()
 * @model
 * @generated
 */
public interface Entity extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projet_hamlaoui.ProjetMdePackage#getEntity_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Entity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Create</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' attribute.
	 * @see #setCreate(boolean)
	 * @see projet_hamlaoui.ProjetMdePackage#getEntity_Create()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isCreate();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Entity#isCreate <em>Create</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create</em>' attribute.
	 * @see #isCreate()
	 * @generated
	 */
	void setCreate(boolean value);

	/**
	 * Returns the value of the '<em><b>Read</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read</em>' attribute.
	 * @see #setRead(boolean)
	 * @see projet_hamlaoui.ProjetMdePackage#getEntity_Read()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isRead();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Entity#isRead <em>Read</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read</em>' attribute.
	 * @see #isRead()
	 * @generated
	 */
	void setRead(boolean value);

	/**
	 * Returns the value of the '<em><b>Update</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update</em>' attribute.
	 * @see #setUpdate(boolean)
	 * @see projet_hamlaoui.ProjetMdePackage#getEntity_Update()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isUpdate();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Entity#isUpdate <em>Update</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update</em>' attribute.
	 * @see #isUpdate()
	 * @generated
	 */
	void setUpdate(boolean value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' attribute.
	 * @see #setDelete(boolean)
	 * @see projet_hamlaoui.ProjetMdePackage#getEntity_Delete()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isDelete();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Entity#isDelete <em>Delete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' attribute.
	 * @see #isDelete()
	 * @generated
	 */
	void setDelete(boolean value);

	/**
	 * Returns the value of the '<em><b>Main Entity</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Main Entity</em>' attribute.
	 * @see #setMainEntity(boolean)
	 * @see projet_hamlaoui.ProjetMdePackage#getEntity_MainEntity()
	 * @model default="true" required="true"
	 * @generated
	 */
	boolean isMainEntity();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Entity#isMainEntity <em>Main Entity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Main Entity</em>' attribute.
	 * @see #isMainEntity()
	 * @generated
	 */
	void setMainEntity(boolean value);

	/**
	 * Returns the value of the '<em><b>Field</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.Field}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Field</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getEntity_Field()
	 * @model containment="true"
	 * @generated
	 */
	EList<Field> getField();

} // Entity
