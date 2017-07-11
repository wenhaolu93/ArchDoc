/**
 */
package asd.impl;

import asd.ASDspec;
import asd.Aim;
import asd.AsdPackage;
import asd.Outcome;
import asd.Subject;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aim</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asd.impl.AimImpl#getAsdSpec <em>Asd Spec</em>}</li>
 *   <li>{@link asd.impl.AimImpl#getOutcomes <em>Outcomes</em>}</li>
 *   <li>{@link asd.impl.AimImpl#getSubjects <em>Subjects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AimImpl extends MediatedElementImpl implements Aim {
	/**
	 * The cached value of the '{@link #getOutcomes() <em>Outcomes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutcomes()
	 * @generated
	 * @ordered
	 */
	protected EList outcomes;

	/**
	 * The cached value of the '{@link #getSubjects() <em>Subjects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjects()
	 * @generated
	 * @ordered
	 */
	protected EList subjects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AimImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AsdPackage.Literals.AIM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASDspec getAsdSpec() {
		if (eContainerFeatureID() != AsdPackage.AIM__ASD_SPEC) return null;
		return (ASDspec)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsdSpec(ASDspec newAsdSpec, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAsdSpec, AsdPackage.AIM__ASD_SPEC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsdSpec(ASDspec newAsdSpec) {
		if (newAsdSpec != eInternalContainer() || (eContainerFeatureID() != AsdPackage.AIM__ASD_SPEC && newAsdSpec != null)) {
			if (EcoreUtil.isAncestor(this, newAsdSpec))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAsdSpec != null)
				msgs = ((InternalEObject)newAsdSpec).eInverseAdd(this, AsdPackage.AS_DSPEC__OBJECTS, ASDspec.class, msgs);
			msgs = basicSetAsdSpec(newAsdSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdPackage.AIM__ASD_SPEC, newAsdSpec, newAsdSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getOutcomes() {
		if (outcomes == null) {
			outcomes = new EObjectWithInverseResolvingEList.ManyInverse(Outcome.class, this, AsdPackage.AIM__OUTCOMES, AsdPackage.OUTCOME__OBJECTS);
		}
		return outcomes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubjects() {
		if (subjects == null) {
			subjects = new EObjectWithInverseResolvingEList.ManyInverse(Subject.class, this, AsdPackage.AIM__SUBJECTS, AsdPackage.SUBJECT__OBJECTS);
		}
		return subjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsdPackage.AIM__ASD_SPEC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAsdSpec((ASDspec)otherEnd, msgs);
			case AsdPackage.AIM__OUTCOMES:
				return ((InternalEList)getOutcomes()).basicAdd(otherEnd, msgs);
			case AsdPackage.AIM__SUBJECTS:
				return ((InternalEList)getSubjects()).basicAdd(otherEnd, msgs);
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
			case AsdPackage.AIM__ASD_SPEC:
				return basicSetAsdSpec(null, msgs);
			case AsdPackage.AIM__OUTCOMES:
				return ((InternalEList)getOutcomes()).basicRemove(otherEnd, msgs);
			case AsdPackage.AIM__SUBJECTS:
				return ((InternalEList)getSubjects()).basicRemove(otherEnd, msgs);
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
			case AsdPackage.AIM__ASD_SPEC:
				return eInternalContainer().eInverseRemove(this, AsdPackage.AS_DSPEC__OBJECTS, ASDspec.class, msgs);
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
			case AsdPackage.AIM__ASD_SPEC:
				return getAsdSpec();
			case AsdPackage.AIM__OUTCOMES:
				return getOutcomes();
			case AsdPackage.AIM__SUBJECTS:
				return getSubjects();
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
			case AsdPackage.AIM__ASD_SPEC:
				setAsdSpec((ASDspec)newValue);
				return;
			case AsdPackage.AIM__OUTCOMES:
				getOutcomes().clear();
				getOutcomes().addAll((Collection)newValue);
				return;
			case AsdPackage.AIM__SUBJECTS:
				getSubjects().clear();
				getSubjects().addAll((Collection)newValue);
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
			case AsdPackage.AIM__ASD_SPEC:
				setAsdSpec((ASDspec)null);
				return;
			case AsdPackage.AIM__OUTCOMES:
				getOutcomes().clear();
				return;
			case AsdPackage.AIM__SUBJECTS:
				getSubjects().clear();
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
			case AsdPackage.AIM__ASD_SPEC:
				return getAsdSpec() != null;
			case AsdPackage.AIM__OUTCOMES:
				return outcomes != null && !outcomes.isEmpty();
			case AsdPackage.AIM__SUBJECTS:
				return subjects != null && !subjects.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AimImpl
