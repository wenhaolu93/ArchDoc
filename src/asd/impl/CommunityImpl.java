/**
 */
package asd.impl;

import asd.ASDspec;
import asd.AsdPackage;
import asd.Community;
import asd.DivisionOfLabour;
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
 * An implementation of the model object '<em><b>Community</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link asd.impl.CommunityImpl#getPerforms <em>Performs</em>}</li>
 *   <li>{@link asd.impl.CommunityImpl#getAsdSpec <em>Asd Spec</em>}</li>
 *   <li>{@link asd.impl.CommunityImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommunityImpl extends MediatedElementImpl implements Community {
	/**
	 * The cached value of the '{@link #getPerforms() <em>Performs</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPerforms()
	 * @generated
	 * @ordered
	 */
	protected EList performs;

	/**
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected EList subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommunityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return AsdPackage.Literals.COMMUNITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getPerforms() {
		if (performs == null) {
			performs = new EObjectWithInverseResolvingEList.ManyInverse(DivisionOfLabour.class, this, AsdPackage.COMMUNITY__PERFORMS, AsdPackage.DIVISION_OF_LABOUR__PERFORMED_BY);
		}
		return performs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ASDspec getAsdSpec() {
		if (eContainerFeatureID() != AsdPackage.COMMUNITY__ASD_SPEC) return null;
		return (ASDspec)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsdSpec(ASDspec newAsdSpec, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newAsdSpec, AsdPackage.COMMUNITY__ASD_SPEC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsdSpec(ASDspec newAsdSpec) {
		if (newAsdSpec != eInternalContainer() || (eContainerFeatureID() != AsdPackage.COMMUNITY__ASD_SPEC && newAsdSpec != null)) {
			if (EcoreUtil.isAncestor(this, newAsdSpec))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newAsdSpec != null)
				msgs = ((InternalEObject)newAsdSpec).eInverseAdd(this, AsdPackage.AS_DSPEC__COMMUNITIES, ASDspec.class, msgs);
			msgs = basicSetAsdSpec(newAsdSpec, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AsdPackage.COMMUNITY__ASD_SPEC, newAsdSpec, newAsdSpec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubject() {
		if (subject == null) {
			subject = new EObjectWithInverseResolvingEList(Subject.class, this, AsdPackage.COMMUNITY__SUBJECT, AsdPackage.SUBJECT__MEMBER_OF);
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AsdPackage.COMMUNITY__PERFORMS:
				return ((InternalEList)getPerforms()).basicAdd(otherEnd, msgs);
			case AsdPackage.COMMUNITY__ASD_SPEC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetAsdSpec((ASDspec)otherEnd, msgs);
			case AsdPackage.COMMUNITY__SUBJECT:
				return ((InternalEList)getSubject()).basicAdd(otherEnd, msgs);
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
			case AsdPackage.COMMUNITY__PERFORMS:
				return ((InternalEList)getPerforms()).basicRemove(otherEnd, msgs);
			case AsdPackage.COMMUNITY__ASD_SPEC:
				return basicSetAsdSpec(null, msgs);
			case AsdPackage.COMMUNITY__SUBJECT:
				return ((InternalEList)getSubject()).basicRemove(otherEnd, msgs);
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
			case AsdPackage.COMMUNITY__ASD_SPEC:
				return eInternalContainer().eInverseRemove(this, AsdPackage.AS_DSPEC__COMMUNITIES, ASDspec.class, msgs);
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
			case AsdPackage.COMMUNITY__PERFORMS:
				return getPerforms();
			case AsdPackage.COMMUNITY__ASD_SPEC:
				return getAsdSpec();
			case AsdPackage.COMMUNITY__SUBJECT:
				return getSubject();
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
			case AsdPackage.COMMUNITY__PERFORMS:
				getPerforms().clear();
				getPerforms().addAll((Collection)newValue);
				return;
			case AsdPackage.COMMUNITY__ASD_SPEC:
				setAsdSpec((ASDspec)newValue);
				return;
			case AsdPackage.COMMUNITY__SUBJECT:
				getSubject().clear();
				getSubject().addAll((Collection)newValue);
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
			case AsdPackage.COMMUNITY__PERFORMS:
				getPerforms().clear();
				return;
			case AsdPackage.COMMUNITY__ASD_SPEC:
				setAsdSpec((ASDspec)null);
				return;
			case AsdPackage.COMMUNITY__SUBJECT:
				getSubject().clear();
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
			case AsdPackage.COMMUNITY__PERFORMS:
				return performs != null && !performs.isEmpty();
			case AsdPackage.COMMUNITY__ASD_SPEC:
				return getAsdSpec() != null;
			case AsdPackage.COMMUNITY__SUBJECT:
				return subject != null && !subject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CommunityImpl
