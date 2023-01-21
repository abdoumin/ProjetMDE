/**
 */
package projet_hamlaoui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link projet_hamlaoui.Properties#getPackage <em>Package</em>}</li>
 *   <li>{@link projet_hamlaoui.Properties#getProprety <em>Proprety</em>}</li>
 * </ul>
 *
 * @see projet_hamlaoui.ProjetMdePackage#getProperties()
 * @model
 * @generated
 */
public interface Properties extends EObject {
	/**
	 * Returns the value of the '<em><b>Package</b></em>' attribute.
	 * The default value is <code>"com.mde"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package</em>' attribute.
	 * @see #setPackage(String)
	 * @see projet_hamlaoui.ProjetMdePackage#getProperties_Package()
	 * @model default="com.mde" required="true"
	 * @generated
	 */
	String getPackage();

	/**
	 * Sets the value of the '{@link projet_hamlaoui.Properties#getPackage <em>Package</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package</em>' attribute.
	 * @see #getPackage()
	 * @generated
	 */
	void setPackage(String value);

	/**
	 * Returns the value of the '<em><b>Proprety</b></em>' containment reference list.
	 * The list contents are of type {@link projet_hamlaoui.Proprety}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Proprety</em>' containment reference list.
	 * @see projet_hamlaoui.ProjetMdePackage#getProperties_Proprety()
	 * @model containment="true"
	 * @generated
	 */
	EList<Proprety> getProprety();

} // Properties
