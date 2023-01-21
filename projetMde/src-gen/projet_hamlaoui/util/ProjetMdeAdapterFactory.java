/**
 */
package projet_hamlaoui.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import projet_hamlaoui.Application;
import projet_hamlaoui.BaseField;
import projet_hamlaoui.BoundedContext;
import projet_hamlaoui.Dependencies;
import projet_hamlaoui.Dependency;
import projet_hamlaoui.Entity;
import projet_hamlaoui.Field;
import projet_hamlaoui.Microservice;
import projet_hamlaoui.ProjetMdePackage;
import projet_hamlaoui.Properties;
import projet_hamlaoui.Proprety;
import projet_hamlaoui.SubClass;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see projet_hamlaoui.ProjetMdePackage
 * @generated
 */
public class ProjetMdeAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProjetMdePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetMdeAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ProjetMdePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProjetMdeSwitch<Adapter> modelSwitch = new ProjetMdeSwitch<Adapter>() {
		@Override
		public Adapter caseApplication(Application object) {
			return createApplicationAdapter();
		}

		@Override
		public Adapter caseBoundedContext(BoundedContext object) {
			return createBoundedContextAdapter();
		}

		@Override
		public Adapter caseMicroservice(Microservice object) {
			return createMicroserviceAdapter();
		}

		@Override
		public Adapter caseProperties(Properties object) {
			return createPropertiesAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseEnum(projet_hamlaoui.Enum object) {
			return createEnumAdapter();
		}

		@Override
		public Adapter caseDependencies(Dependencies object) {
			return createDependenciesAdapter();
		}

		@Override
		public Adapter caseProprety(Proprety object) {
			return createPropretyAdapter();
		}

		@Override
		public Adapter caseField(Field object) {
			return createFieldAdapter();
		}

		@Override
		public Adapter caseBaseField(BaseField object) {
			return createBaseFieldAdapter();
		}

		@Override
		public Adapter caseSubClass(SubClass object) {
			return createSubClassAdapter();
		}

		@Override
		public Adapter caseDependency(Dependency object) {
			return createDependencyAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Application <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Application
	 * @generated
	 */
	public Adapter createApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.BoundedContext <em>Bounded Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.BoundedContext
	 * @generated
	 */
	public Adapter createBoundedContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Microservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Microservice
	 * @generated
	 */
	public Adapter createMicroserviceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Properties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Properties
	 * @generated
	 */
	public Adapter createPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Enum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Enum
	 * @generated
	 */
	public Adapter createEnumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Dependencies <em>Dependencies</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Dependencies
	 * @generated
	 */
	public Adapter createDependenciesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Proprety <em>Proprety</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Proprety
	 * @generated
	 */
	public Adapter createPropretyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.BaseField <em>Base Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.BaseField
	 * @generated
	 */
	public Adapter createBaseFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.SubClass <em>Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.SubClass
	 * @generated
	 */
	public Adapter createSubClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link projet_hamlaoui.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see projet_hamlaoui.Dependency
	 * @generated
	 */
	public Adapter createDependencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ProjetMdeAdapterFactory
