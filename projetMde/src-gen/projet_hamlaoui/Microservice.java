/**
 */
package projet_hamlaoui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Microservice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.Microservice#getName <em>Name</em>}</li>
 *   <li>{@link projet_hamlaoui.Microservice#getProperties <em>Properties</em>}</li>
 *   <li>{@link projet_hamlaoui.Microservice#getEntity <em>Entity</em>}</li>
 *   <li>{@link projet_hamlaoui.Microservice#getEnum <em>Enum</em>}</li>
 *   <li>{@link projet_hamlaoui.Microservice#getDependencies <em>Dependencies</em>}</li>
 * </ul>
 *
 * @see projet_hamlaoui.ProjetMdePackage#getMicroservice()
 * @model
 * @generated
 */
public interface Microservice extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projet_hamlaoui.ProjetMdePackage#getMicroservice_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Microservice#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.Properties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getMicroservice_Properties()
	 * @model containment="true"
	 * @generated
	 */
	EList<Properties> getProperties();

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getMicroservice_Entity()
	 * @model containment="true"
	 * @generated
	 */
	EList<Entity> getEntity();

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getMicroservice_Enum()
	 * @model containment="true"
	 * @generated
	 */
	EList<projet_hamlaoui.Enum> getEnum();

	/**
	 * Returns the value of the '<em><b>Dependencies</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.Dependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependencies</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getMicroservice_Dependencies()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependencies> getDependencies();

} // Microservice
