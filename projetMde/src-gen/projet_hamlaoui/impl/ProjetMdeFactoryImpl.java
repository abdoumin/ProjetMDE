/**
 */
package projet_hamlaoui.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import projet_hamlaoui.Application;
import projet_hamlaoui.BaseField;
import projet_hamlaoui.BoundedContext;
import projet_hamlaoui.Dependencies;
import projet_hamlaoui.Dependency;
import projet_hamlaoui.Entity;
import projet_hamlaoui.Microservice;
import projet_hamlaoui.ProjetMdeFactory;
import projet_hamlaoui.ProjetMdePackage;
import projet_hamlaoui.Properties;
import projet_hamlaoui.Proprety;
import projet_hamlaoui.SubClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetMdeFactoryImpl extends EFactoryImpl implements ProjetMdeFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProjetMdeFactory init() {
		try {
			ProjetMdeFactory theProjetMdeFactory = (ProjetMdeFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProjetMdePackage.eNS_URI);
			if (theProjetMdeFactory != null) {
				return theProjetMdeFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProjetMdeFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetMdeFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ProjetMdePackage.APPLICATION:
			return createApplication();
		case ProjetMdePackage.BOUNDED_CONTEXT:
			return createBoundedContext();
		case ProjetMdePackage.MICROSERVICE:
			return createMicroservice();
		case ProjetMdePackage.PROPERTIES:
			return createProperties();
		case ProjetMdePackage.ENTITY:
			return createEntity();
		case ProjetMdePackage.ENUM:
			return createEnum();
		case ProjetMdePackage.DEPENDENCIES:
			return createDependencies();
		case ProjetMdePackage.PROPRETY:
			return createProprety();
		case ProjetMdePackage.BASE_FIELD:
			return createBaseField();
		case ProjetMdePackage.SUB_CLASS:
			return createSubClass();
		case ProjetMdePackage.DEPENDENCY:
			return createDependency();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoundedContext createBoundedContext() {
		BoundedContextImpl boundedContext = new BoundedContextImpl();
		return boundedContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Microservice createMicroservice() {
		MicroserviceImpl microservice = new MicroserviceImpl();
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Properties createProperties() {
		PropertiesImpl properties = new PropertiesImpl();
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity createEntity() {
		EntityImpl entity = new EntityImpl();
		return entity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public projet_hamlaoui.Enum createEnum() {
		EnumImpl enum_ = new EnumImpl();
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependencies createDependencies() {
		DependenciesImpl dependencies = new DependenciesImpl();
		return dependencies;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Proprety createProprety() {
		PropretyImpl proprety = new PropretyImpl();
		return proprety;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseField createBaseField() {
		BaseFieldImpl baseField = new BaseFieldImpl();
		return baseField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubClass createSubClass() {
		SubClassImpl subClass = new SubClassImpl();
		return subClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency createDependency() {
		DependencyImpl dependency = new DependencyImpl();
		return dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetMdePackage getProjetMdePackage() {
		return (ProjetMdePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProjetMdePackage getPackage() {
		return ProjetMdePackage.eINSTANCE;
	}

} //ProjetMdeFactoryImpl
