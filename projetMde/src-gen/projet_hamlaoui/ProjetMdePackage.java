/**
 */
package projet_hamlaoui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see projet_hamlaoui.ProjetMdeFactory
 * @model kind="package"
 * @generated
 */
public interface ProjetMdePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "projet_hamlaoui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/projetMde";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "projetMde";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProjetMdePackage eINSTANCE = projet_hamlaoui.impl.ProjetMdePackageImpl.init();

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.ApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.ApplicationImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getApplication()
	 * @generated
	 */
	int APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Boundedcontext</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION__BOUNDEDCONTEXT = 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.BoundedContextImpl <em>Bounded Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.BoundedContextImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getBoundedContext()
	 * @generated
	 */
	int BOUNDED_CONTEXT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT__MICROSERVICE = 1;

	/**
	 * The number of structural features of the '<em>Bounded Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Bounded Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUNDED_CONTEXT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.MicroserviceImpl <em>Microservice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.MicroserviceImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getMicroservice()
	 * @generated
	 */
	int MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__PROPERTIES = 1;

	/**
	 * The feature id for the '<em><b>Entity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__ENTITY = 2;

	/**
	 * The feature id for the '<em><b>Enum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__ENUM = 3;

	/**
	 * The feature id for the '<em><b>Dependencies</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE__DEPENDENCIES = 4;

	/**
	 * The number of structural features of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Microservice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICROSERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.PropertiesImpl <em>Properties</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.PropertiesImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getProperties()
	 * @generated
	 */
	int PROPERTIES = 3;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PACKAGE = 0;

	/**
	 * The feature id for the '<em><b>Proprety</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES__PROPRETY = 1;

	/**
	 * The number of structural features of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Properties</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.EntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.EntityImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getEntity()
	 * @generated
	 */
	int ENTITY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Create</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__CREATE = 1;

	/**
	 * The feature id for the '<em><b>Read</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__READ = 2;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__UPDATE = 3;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__DELETE = 4;

	/**
	 * The feature id for the '<em><b>Main Entity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__MAIN_ENTITY = 5;

	/**
	 * The feature id for the '<em><b>Field</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY__FIELD = 6;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.EnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.EnumImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getEnum()
	 * @generated
	 */
	int ENUM = 5;

	/**
	 * The feature id for the '<em><b>Values</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__VALUES = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM__NAME = 1;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENUM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.DependenciesImpl <em>Dependencies</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.DependenciesImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getDependencies()
	 * @generated
	 */
	int DEPENDENCIES = 6;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES__DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Dependencies</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCIES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.PropretyImpl <em>Proprety</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.PropretyImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getProprety()
	 * @generated
	 */
	int PROPRETY = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRETY__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRETY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Proprety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRETY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Proprety</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPRETY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.Field <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.Field
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getField()
	 * @generated
	 */
	int FIELD = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.BaseFieldImpl <em>Base Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.BaseFieldImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getBaseField()
	 * @generated
	 */
	int BASE_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FIELD__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FIELD__TYPE = FIELD__TYPE;

	/**
	 * The number of structural features of the '<em>Base Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FIELD_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Base Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASE_FIELD_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.SubClassImpl <em>Sub Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.SubClassImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getSubClass()
	 * @generated
	 */
	int SUB_CLASS = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS__NAME = FIELD__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS__TYPE = FIELD__TYPE;

	/**
	 * The number of structural features of the '<em>Sub Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_FEATURE_COUNT = FIELD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sub Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_CLASS_OPERATION_COUNT = FIELD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link projet_hamlaoui.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see projet_hamlaoui.impl.DependencyImpl
	 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 11;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see projet_hamlaoui.Application
	 * @generated
	 */
	EClass getApplication();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Application#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projet_hamlaoui.Application#getName()
	 * @see #getApplication()
	 * @generated
	 */
	EAttribute getApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.Application#getBoundedcontext <em>Boundedcontext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Boundedcontext</em>'.
	 * @see projet_hamlaoui.Application#getBoundedcontext()
	 * @see #getApplication()
	 * @generated
	 */
	EReference getApplication_Boundedcontext();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.BoundedContext <em>Bounded Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bounded Context</em>'.
	 * @see projet_hamlaoui.BoundedContext
	 * @generated
	 */
	EClass getBoundedContext();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.BoundedContext#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projet_hamlaoui.BoundedContext#getName()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EAttribute getBoundedContext_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.BoundedContext#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservice</em>'.
	 * @see projet_hamlaoui.BoundedContext#getMicroservice()
	 * @see #getBoundedContext()
	 * @generated
	 */
	EReference getBoundedContext_Microservice();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Microservice</em>'.
	 * @see projet_hamlaoui.Microservice
	 * @generated
	 */
	EClass getMicroservice();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Microservice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projet_hamlaoui.Microservice#getName()
	 * @see #getMicroservice()
	 * @generated
	 */
	EAttribute getMicroservice_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.Microservice#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see projet_hamlaoui.Microservice#getProperties()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Properties();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.Microservice#getEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entity</em>'.
	 * @see projet_hamlaoui.Microservice#getEntity()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Entity();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.Microservice#getEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Enum</em>'.
	 * @see projet_hamlaoui.Microservice#getEnum()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Enum();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.Microservice#getDependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependencies</em>'.
	 * @see projet_hamlaoui.Microservice#getDependencies()
	 * @see #getMicroservice()
	 * @generated
	 */
	EReference getMicroservice_Dependencies();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties</em>'.
	 * @see projet_hamlaoui.Properties
	 * @generated
	 */
	EClass getProperties();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Properties#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see projet_hamlaoui.Properties#getPackage()
	 * @see #getProperties()
	 * @generated
	 */
	EAttribute getProperties_Package();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.Properties#getProprety <em>Proprety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Proprety</em>'.
	 * @see projet_hamlaoui.Properties#getProprety()
	 * @see #getProperties()
	 * @generated
	 */
	EReference getProperties_Proprety();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see projet_hamlaoui.Entity
	 * @generated
	 */
	EClass getEntity();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Entity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projet_hamlaoui.Entity#getName()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Name();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Entity#isCreate <em>Create</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Create</em>'.
	 * @see projet_hamlaoui.Entity#isCreate()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Create();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Entity#isRead <em>Read</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Read</em>'.
	 * @see projet_hamlaoui.Entity#isRead()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Read();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Entity#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see projet_hamlaoui.Entity#isUpdate()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Update();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Entity#isDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see projet_hamlaoui.Entity#isDelete()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_Delete();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Entity#isMainEntity <em>Main Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Main Entity</em>'.
	 * @see projet_hamlaoui.Entity#isMainEntity()
	 * @see #getEntity()
	 * @generated
	 */
	EAttribute getEntity_MainEntity();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.Entity#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Field</em>'.
	 * @see projet_hamlaoui.Entity#getField()
	 * @see #getEntity()
	 * @generated
	 */
	EReference getEntity_Field();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see projet_hamlaoui.Enum
	 * @generated
	 */
	EClass getEnum();

	/**
	 * Returns the meta object for the attribute list '{@link projet_hamlaoui.Enum#getValues <em>Values</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Values</em>'.
	 * @see projet_hamlaoui.Enum#getValues()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Values();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Enum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projet_hamlaoui.Enum#getName()
	 * @see #getEnum()
	 * @generated
	 */
	EAttribute getEnum_Name();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependencies</em>'.
	 * @see projet_hamlaoui.Dependencies
	 * @generated
	 */
	EClass getDependencies();

	/**
	 * Returns the meta object for the containment reference list '{@link projet_hamlaoui.Dependencies#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependency</em>'.
	 * @see projet_hamlaoui.Dependencies#getDependency()
	 * @see #getDependencies()
	 * @generated
	 */
	EReference getDependencies_Dependency();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Proprety <em>Proprety</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Proprety</em>'.
	 * @see projet_hamlaoui.Proprety
	 * @generated
	 */
	EClass getProprety();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Proprety#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projet_hamlaoui.Proprety#getName()
	 * @see #getProprety()
	 * @generated
	 */
	EAttribute getProprety_Name();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Proprety#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see projet_hamlaoui.Proprety#getValue()
	 * @see #getProprety()
	 * @generated
	 */
	EAttribute getProprety_Value();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see projet_hamlaoui.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Field#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see projet_hamlaoui.Field#getName()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Name();

	/**
	 * Returns the meta object for the attribute '{@link projet_hamlaoui.Field#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see projet_hamlaoui.Field#getType()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Type();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.BaseField <em>Base Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Base Field</em>'.
	 * @see projet_hamlaoui.BaseField
	 * @generated
	 */
	EClass getBaseField();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.SubClass <em>Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Class</em>'.
	 * @see projet_hamlaoui.SubClass
	 * @generated
	 */
	EClass getSubClass();

	/**
	 * Returns the meta object for class '{@link projet_hamlaoui.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see projet_hamlaoui.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ProjetMdeFactory getProjetMdeFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.ApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.ApplicationImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getApplication()
		 * @generated
		 */
		EClass APPLICATION = eINSTANCE.getApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPLICATION__NAME = eINSTANCE.getApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Boundedcontext</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION__BOUNDEDCONTEXT = eINSTANCE.getApplication_Boundedcontext();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.BoundedContextImpl <em>Bounded Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.BoundedContextImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getBoundedContext()
		 * @generated
		 */
		EClass BOUNDED_CONTEXT = eINSTANCE.getBoundedContext();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOUNDED_CONTEXT__NAME = eINSTANCE.getBoundedContext_Name();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUNDED_CONTEXT__MICROSERVICE = eINSTANCE.getBoundedContext_Microservice();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.MicroserviceImpl <em>Microservice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.MicroserviceImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getMicroservice()
		 * @generated
		 */
		EClass MICROSERVICE = eINSTANCE.getMicroservice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICROSERVICE__NAME = eINSTANCE.getMicroservice_Name();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__PROPERTIES = eINSTANCE.getMicroservice_Properties();

		/**
		 * The meta object literal for the '<em><b>Entity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__ENTITY = eINSTANCE.getMicroservice_Entity();

		/**
		 * The meta object literal for the '<em><b>Enum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__ENUM = eINSTANCE.getMicroservice_Enum();

		/**
		 * The meta object literal for the '<em><b>Dependencies</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICROSERVICE__DEPENDENCIES = eINSTANCE.getMicroservice_Dependencies();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.PropertiesImpl <em>Properties</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.PropertiesImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getProperties()
		 * @generated
		 */
		EClass PROPERTIES = eINSTANCE.getProperties();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTIES__PACKAGE = eINSTANCE.getProperties_Package();

		/**
		 * The meta object literal for the '<em><b>Proprety</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROPERTIES__PROPRETY = eINSTANCE.getProperties_Proprety();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.EntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.EntityImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getEntity()
		 * @generated
		 */
		EClass ENTITY = eINSTANCE.getEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Create</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__CREATE = eINSTANCE.getEntity_Create();

		/**
		 * The meta object literal for the '<em><b>Read</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__READ = eINSTANCE.getEntity_Read();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__UPDATE = eINSTANCE.getEntity_Update();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__DELETE = eINSTANCE.getEntity_Delete();

		/**
		 * The meta object literal for the '<em><b>Main Entity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTITY__MAIN_ENTITY = eINSTANCE.getEntity_MainEntity();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTITY__FIELD = eINSTANCE.getEntity_Field();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.EnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.EnumImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getEnum()
		 * @generated
		 */
		EClass ENUM = eINSTANCE.getEnum();

		/**
		 * The meta object literal for the '<em><b>Values</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__VALUES = eINSTANCE.getEnum_Values();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENUM__NAME = eINSTANCE.getEnum_Name();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.DependenciesImpl <em>Dependencies</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.DependenciesImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getDependencies()
		 * @generated
		 */
		EClass DEPENDENCIES = eINSTANCE.getDependencies();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENCIES__DEPENDENCY = eINSTANCE.getDependencies_Dependency();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.PropretyImpl <em>Proprety</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.PropretyImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getProprety()
		 * @generated
		 */
		EClass PROPRETY = eINSTANCE.getProprety();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRETY__NAME = eINSTANCE.getProprety_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPRETY__VALUE = eINSTANCE.getProprety_Value();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.Field <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.Field
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__NAME = eINSTANCE.getField_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__TYPE = eINSTANCE.getField_Type();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.BaseFieldImpl <em>Base Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.BaseFieldImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getBaseField()
		 * @generated
		 */
		EClass BASE_FIELD = eINSTANCE.getBaseField();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.SubClassImpl <em>Sub Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.SubClassImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getSubClass()
		 * @generated
		 */
		EClass SUB_CLASS = eINSTANCE.getSubClass();

		/**
		 * The meta object literal for the '{@link projet_hamlaoui.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see projet_hamlaoui.impl.DependencyImpl
		 * @see projet_hamlaoui.impl.ProjetMdePackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

	}

} //ProjetMdePackage
