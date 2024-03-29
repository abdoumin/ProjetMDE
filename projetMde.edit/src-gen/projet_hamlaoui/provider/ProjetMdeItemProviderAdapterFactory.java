/**
 */
package projet_hamlaoui.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

import projet_hamlaoui.util.ProjetMdeAdapterFactory;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProjetMdeItemProviderAdapterFactory extends ProjetMdeAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjetMdeItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAdapter() {
		if (applicationItemProvider == null) {
			applicationItemProvider = new ApplicationItemProvider(this);
		}

		return applicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.BoundedContext} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoundedContextItemProvider boundedContextItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.BoundedContext}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBoundedContextAdapter() {
		if (boundedContextItemProvider == null) {
			boundedContextItemProvider = new BoundedContextItemProvider(this);
		}

		return boundedContextItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.Microservice} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroserviceItemProvider microserviceItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.Microservice}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMicroserviceAdapter() {
		if (microserviceItemProvider == null) {
			microserviceItemProvider = new MicroserviceItemProvider(this);
		}

		return microserviceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.Properties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertiesItemProvider propertiesItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.Properties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropertiesAdapter() {
		if (propertiesItemProvider == null) {
			propertiesItemProvider = new PropertiesItemProvider(this);
		}

		return propertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.Entity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityItemProvider entityItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.Entity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEntityAdapter() {
		if (entityItemProvider == null) {
			entityItemProvider = new EntityItemProvider(this);
		}

		return entityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.Enum} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumItemProvider enumItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.Enum}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createEnumAdapter() {
		if (enumItemProvider == null) {
			enumItemProvider = new EnumItemProvider(this);
		}

		return enumItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.Dependencies} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependenciesItemProvider dependenciesItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.Dependencies}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependenciesAdapter() {
		if (dependenciesItemProvider == null) {
			dependenciesItemProvider = new DependenciesItemProvider(this);
		}

		return dependenciesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.Proprety} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropretyItemProvider propretyItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.Proprety}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPropretyAdapter() {
		if (propretyItemProvider == null) {
			propretyItemProvider = new PropretyItemProvider(this);
		}

		return propretyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.BaseField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseFieldItemProvider baseFieldItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.BaseField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBaseFieldAdapter() {
		if (baseFieldItemProvider == null) {
			baseFieldItemProvider = new BaseFieldItemProvider(this);
		}

		return baseFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.SubClass} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubClassItemProvider subClassItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.SubClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSubClassAdapter() {
		if (subClassItemProvider == null) {
			subClassItemProvider = new SubClassItemProvider(this);
		}

		return subClassItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link projet_hamlaoui.Dependency} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DependencyItemProvider dependencyItemProvider;

	/**
	 * This creates an adapter for a {@link projet_hamlaoui.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDependencyAdapter() {
		if (dependencyItemProvider == null) {
			dependencyItemProvider = new DependencyItemProvider(this);
		}

		return dependencyItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (applicationItemProvider != null)
			applicationItemProvider.dispose();
		if (boundedContextItemProvider != null)
			boundedContextItemProvider.dispose();
		if (microserviceItemProvider != null)
			microserviceItemProvider.dispose();
		if (propertiesItemProvider != null)
			propertiesItemProvider.dispose();
		if (entityItemProvider != null)
			entityItemProvider.dispose();
		if (enumItemProvider != null)
			enumItemProvider.dispose();
		if (dependenciesItemProvider != null)
			dependenciesItemProvider.dispose();
		if (propretyItemProvider != null)
			propretyItemProvider.dispose();
		if (baseFieldItemProvider != null)
			baseFieldItemProvider.dispose();
		if (subClassItemProvider != null)
			subClassItemProvider.dispose();
		if (dependencyItemProvider != null)
			dependencyItemProvider.dispose();
	}

}
