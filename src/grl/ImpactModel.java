/**
 */
package grl;

import ca.mcgill.sel.core.COREImpactModel;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Impact Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link grl.ImpactModel#getGrlspec <em>Grlspec</em>}</li>
 *   <li>{@link grl.ImpactModel#getCoreImpactModel <em>Core Impact Model</em>}</li>
 * </ul>
 *
 * @see grl.GrlPackage#getImpactModel()
 * @model
 * @generated
 */
public interface ImpactModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Grlspec</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link grl.GRLspec#getImpactModel <em>Impact Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Grlspec</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grlspec</em>' container reference.
	 * @see #setGrlspec(GRLspec)
	 * @see grl.GrlPackage#getImpactModel_Grlspec()
	 * @see grl.GRLspec#getImpactModel
	 * @model opposite="impactModel" required="true"
	 * @generated
	 */
	GRLspec getGrlspec();

	/**
	 * Sets the value of the '{@link grl.ImpactModel#getGrlspec <em>Grlspec</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grlspec</em>' container reference.
	 * @see #getGrlspec()
	 * @generated
	 */
	void setGrlspec(GRLspec value);

	/**
	 * Returns the value of the '<em><b>Core Impact Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Impact Model</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Impact Model</em>' reference.
	 * @see #setCoreImpactModel(COREImpactModel)
	 * @see grl.GrlPackage#getImpactModel_CoreImpactModel()
	 * @model
	 * @generated
	 */
	COREImpactModel getCoreImpactModel();

	/**
	 * Sets the value of the '{@link grl.ImpactModel#getCoreImpactModel <em>Core Impact Model</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Impact Model</em>' reference.
	 * @see #getCoreImpactModel()
	 * @generated
	 */
	void setCoreImpactModel(COREImpactModel value);

} // ImpactModel
