/**
 */
package projet_hamlaoui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependencies</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.Dependencies#getDependency <em>Dependency</em>}</li>
 * </ul>
 *
 * @see projet_hamlaoui.ProjetMdePackage#getDependencies()
 * @model
 * @generated
 */
public interface Dependencies extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getDependencies_Dependency()
	 * @model containment="true"
	 * @generated
	 */
	EList<Dependency> getDependency();

} // Dependencies
