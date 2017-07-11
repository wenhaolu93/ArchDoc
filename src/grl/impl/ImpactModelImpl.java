/**
 */
package grl.impl;

import ca.mcgill.sel.core.COREImpactModel;
import grl.GRLspec;
import grl.GrlPackage;
import grl.ImpactModel;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Impact Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link grl.impl.ImpactModelImpl#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link grl.impl.ImpactModelImpl#getCoreImpactModel <em>Core Impact Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImpactModelImpl extends MinimalEObjectImpl.Container implements ImpactModel {
	/**
	 * The cached value of the '{@link #getCoreImpactModel() <em>Core Impact Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreImpactModel()
	 * @generated
	 * @ordered
	 */
	protected COREImpactModel coreImpactModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImpactModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GrlPackage.Literals.IMPACT_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GRLspec getGrlspec() {
		if (eContainerFeatureID() != GrlPackage.IMPACT_MODEL__GRLSPEC) return null;
		return (GRLspec)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrlspec(GRLspec newGrlspec, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGrlspec, GrlPackage.IMPACT_MODEL__GRLSPEC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrlspec(GRLspec newGrlspec) {
		if (newGrlspec != eInternalContainer() || (eContainerFeatureID() != GrlPackage.IMPACT_MODEL__GRLSPEC && newGrlspec != null)) {
			if (EcoreUtil.isAncestor(this, newGrlspec))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGrlspec != null)
				msgs = ((InternalEObject)newGrlspec).eInverseAdd(this, GrlPackage.GR_LSPEC__IMPACT_MODEL, GRLspec.class, msgs);
			msgs = basicSetGrlspec(newGrlspec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrlPackage.IMPACT_MODEL__GRLSPEC, newGrlspec, newGrlspec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COREImpactModel getCoreImpactModel() {
		if (coreImpactModel != null && coreImpactModel.eIsProxy()) {
			InternalEObject oldCoreImpactModel = (InternalEObject)coreImpactModel;
			coreImpactModel = (COREImpactModel)eResolveProxy(oldCoreImpactModel);
			if (coreImpactModel != oldCoreImpactModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GrlPackage.IMPACT_MODEL__CORE_IMPACT_MODEL, oldCoreImpactModel, coreImpactModel));
			}
		}
		return coreImpactModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COREImpactModel basicGetCoreImpactModel() {
		return coreImpactModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreImpactModel(COREImpactModel newCoreImpactModel) {
		COREImpactModel oldCoreImpactModel = coreImpactModel;
		coreImpactModel = newCoreImpactModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GrlPackage.IMPACT_MODEL__CORE_IMPACT_MODEL, oldCoreImpactModel, coreImpactModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrlPackage.IMPACT_MODEL__GRLSPEC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGrlspec((GRLspec)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GrlPackage.IMPACT_MODEL__GRLSPEC:
				return basicSetGrlspec(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case GrlPackage.IMPACT_MODEL__GRLSPEC:
				return eInternalContainer().eInverseRemove(this, GrlPackage.GR_LSPEC__IMPACT_MODEL, GRLspec.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GrlPackage.IMPACT_MODEL__GRLSPEC:
				return getGrlspec();
			case GrlPackage.IMPACT_MODEL__CORE_IMPACT_MODEL:
				if (resolve) return getCoreImpactModel();
				return basicGetCoreImpactModel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GrlPackage.IMPACT_MODEL__GRLSPEC:
				setGrlspec((GRLspec)newValue);
				return;
			case GrlPackage.IMPACT_MODEL__CORE_IMPACT_MODEL:
				setCoreImpactModel((COREImpactModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GrlPackage.IMPACT_MODEL__GRLSPEC:
				setGrlspec((GRLspec)null);
				return;
			case GrlPackage.IMPACT_MODEL__CORE_IMPACT_MODEL:
				setCoreImpactModel((COREImpactModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GrlPackage.IMPACT_MODEL__GRLSPEC:
				return getGrlspec() != null;
			case GrlPackage.IMPACT_MODEL__CORE_IMPACT_MODEL:
				return coreImpactModel != null;
		}
		return super.eIsSet(featureID);
	}

} //ImpactModelImpl
