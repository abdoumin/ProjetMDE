/**
 */
package projet_hamlaoui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.Application#getName <em>Name</em>}</li>
 *   <li>{@link projet_hamlaoui.Application#getBoundedcontext <em>Boundedcontext</em>}</li>
 * </ul>
 *
 * @see projet_hamlaoui.ProjetMdePackage#getApplication()
 * @model
 * @generated
 */
public interface Application extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see projet_hamlaoui.ProjetMdePackage#getApplication_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Application#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Boundedcontext</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.BoundedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boundedcontext</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getApplication_Boundedcontext()
	 * @model containment="true"
	 * @generated
	 */
	EList<BoundedContext> getBoundedcontext();

} // Application
