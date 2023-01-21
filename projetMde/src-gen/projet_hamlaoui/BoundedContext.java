/**
 */
package projet_hamlaoui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bounded Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.BoundedContext#getName <em>Name</em>}</li>
 *   <li>{@link projet_hamlaoui.BoundedContext#getMicroservice <em>Microservice</em>}</li>
 * </ul>
 *
 * @see projet_hamlaoui.ProjetMdePackage#getBoundedContext()
 * @model
 * @generated
 */
public interface BoundedContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projet_hamlaoui.ProjetMdePackage#getBoundedContext_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.BoundedContext#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getBoundedContext_Microservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<Microservice> getMicroservice();

} // BoundedContext
