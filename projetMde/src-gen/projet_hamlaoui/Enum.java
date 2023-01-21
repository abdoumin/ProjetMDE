/**
 */
package projet_hamlaoui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.Enum#getValues <em>Values</em>}</li>
 *   <li>{@link projet_hamlaoui.Enum#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see projet_hamlaoui.ProjetMdePackage#getEnum()
 * @model
 * @generated
 */
public interface Enum extends EObject {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' attribute list.
	 * @see projet_hamlaoui.ProjetMdePackage#getEnum_Values()
	 * @model
	 * @generated
	 */
	EList<String> getValues();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projet_hamlaoui.ProjetMdePackage#getEnum_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Enum#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Enum
