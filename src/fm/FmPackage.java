/**
 */
package fm;

import grl.GrlPackage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fm.FmFactory
 * @model kind="package"
 * @generated
 */
public interface FmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///fm.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FmPackage eINSTANCE = fm.impl.FmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fm.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fm.impl.FeatureDiagramImpl
	 * @see fm.impl.FmPackageImpl#getFeatureDiagram()
	 * @generated
	 */
	int FEATURE_DIAGRAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__NAME = GrlPackage.GRL_GRAPH__NAME;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__FROM_LINKS = GrlPackage.GRL_GRAPH__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__TO_LINKS = GrlPackage.GRL_GRAPH__TO_LINKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__ID = GrlPackage.GRL_GRAPH__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__DESCRIPTION = GrlPackage.GRL_GRAPH__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__METADATA = GrlPackage.GRL_GRAPH__METADATA;

	/**
	 * The feature id for the '<em><b>Inconcern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__INCONCERN = GrlPackage.GRL_GRAPH__INCONCERN;

	/**
	 * The feature id for the '<em><b>Urndefinition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__URNDEFINITION = GrlPackage.GRL_GRAPH__URNDEFINITION;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__NODES = GrlPackage.GRL_GRAPH__NODES;

	/**
	 * The feature id for the '<em><b>Cont Refs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__CONT_REFS = GrlPackage.GRL_GRAPH__CONT_REFS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__CONNECTIONS = GrlPackage.GRL_GRAPH__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Concern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__CONCERN = GrlPackage.GRL_GRAPH__CONCERN;

	/**
	 * The feature id for the '<em><b>Comments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM__COMMENTS = GrlPackage.GRL_GRAPH__COMMENTS;

	/**
	 * The number of structural features of the '<em>Feature Diagram</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_DIAGRAM_FEATURE_COUNT = GrlPackage.GRL_GRAPH_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fm.impl.FeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fm.impl.FeatureImpl
	 * @see fm.impl.FmPackageImpl#getFeature()
	 * @generated
	 */
	int FEATURE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__NAME = GrlPackage.INTENTIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FROM_LINKS = GrlPackage.INTENTIONAL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TO_LINKS = GrlPackage.INTENTIONAL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__ID = GrlPackage.INTENTIONAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DESCRIPTION = GrlPackage.INTENTIONAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__METADATA = GrlPackage.INTENTIONAL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Inconcern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__INCONCERN = GrlPackage.INTENTIONAL_ELEMENT__INCONCERN;

	/**
	 * The feature id for the '<em><b>Links Dest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LINKS_DEST = GrlPackage.INTENTIONAL_ELEMENT__LINKS_DEST;

	/**
	 * The feature id for the '<em><b>Links Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LINKS_SRC = GrlPackage.INTENTIONAL_ELEMENT__LINKS_SRC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__TYPE = GrlPackage.INTENTIONAL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__DECOMPOSITION_TYPE = GrlPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IMPORTANCE = GrlPackage.INTENTIONAL_ELEMENT__IMPORTANCE;

	/**
	 * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__IMPORTANCE_QUANTITATIVE = GrlPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__LINE_COLOR = GrlPackage.INTENTIONAL_ELEMENT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FILL_COLOR = GrlPackage.INTENTIONAL_ELEMENT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__FILLED = GrlPackage.INTENTIONAL_ELEMENT__FILLED;

	/**
	 * The feature id for the '<em><b>Grlspec</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__GRLSPEC = GrlPackage.INTENTIONAL_ELEMENT__GRLSPEC;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__REFS = GrlPackage.INTENTIONAL_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Core Impact Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CORE_IMPACT_NODE = GrlPackage.INTENTIONAL_ELEMENT__CORE_IMPACT_NODE;

	/**
	 * The feature id for the '<em><b>Selectable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__SELECTABLE = GrlPackage.INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Core Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE__CORE_FEATURE = GrlPackage.INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_FEATURE_COUNT = GrlPackage.INTENTIONAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link fm.impl.MandatoryFMLinkImpl <em>Mandatory FM Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fm.impl.MandatoryFMLinkImpl
	 * @see fm.impl.FmPackageImpl#getMandatoryFMLink()
	 * @generated
	 */
	int MANDATORY_FM_LINK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__NAME = GrlPackage.CONTRIBUTION__NAME;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__FROM_LINKS = GrlPackage.CONTRIBUTION__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__TO_LINKS = GrlPackage.CONTRIBUTION__TO_LINKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__ID = GrlPackage.CONTRIBUTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__DESCRIPTION = GrlPackage.CONTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__METADATA = GrlPackage.CONTRIBUTION__METADATA;

	/**
	 * The feature id for the '<em><b>Inconcern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__INCONCERN = GrlPackage.CONTRIBUTION__INCONCERN;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__REFS = GrlPackage.CONTRIBUTION__REFS;

	/**
	 * The feature id for the '<em><b>Grlspec</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__GRLSPEC = GrlPackage.CONTRIBUTION__GRLSPEC;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__DEST = GrlPackage.CONTRIBUTION__DEST;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__SRC = GrlPackage.CONTRIBUTION__SRC;

	/**
	 * The feature id for the '<em><b>Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__CONTRIBUTION = GrlPackage.CONTRIBUTION__CONTRIBUTION;

	/**
	 * The feature id for the '<em><b>Quantitative Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__QUANTITATIVE_CONTRIBUTION = GrlPackage.CONTRIBUTION__QUANTITATIVE_CONTRIBUTION;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__CORRELATION = GrlPackage.CONTRIBUTION__CORRELATION;

	/**
	 * The feature id for the '<em><b>Core Contribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK__CORE_CONTRIBUTION = GrlPackage.CONTRIBUTION__CORE_CONTRIBUTION;

	/**
	 * The number of structural features of the '<em>Mandatory FM Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANDATORY_FM_LINK_FEATURE_COUNT = GrlPackage.CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fm.impl.OptionalFMLinkImpl <em>Optional FM Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fm.impl.OptionalFMLinkImpl
	 * @see fm.impl.FmPackageImpl#getOptionalFMLink()
	 * @generated
	 */
	int OPTIONAL_FM_LINK = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__NAME = GrlPackage.CONTRIBUTION__NAME;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__FROM_LINKS = GrlPackage.CONTRIBUTION__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__TO_LINKS = GrlPackage.CONTRIBUTION__TO_LINKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__ID = GrlPackage.CONTRIBUTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__DESCRIPTION = GrlPackage.CONTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__METADATA = GrlPackage.CONTRIBUTION__METADATA;

	/**
	 * The feature id for the '<em><b>Inconcern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__INCONCERN = GrlPackage.CONTRIBUTION__INCONCERN;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__REFS = GrlPackage.CONTRIBUTION__REFS;

	/**
	 * The feature id for the '<em><b>Grlspec</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__GRLSPEC = GrlPackage.CONTRIBUTION__GRLSPEC;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__DEST = GrlPackage.CONTRIBUTION__DEST;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__SRC = GrlPackage.CONTRIBUTION__SRC;

	/**
	 * The feature id for the '<em><b>Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__CONTRIBUTION = GrlPackage.CONTRIBUTION__CONTRIBUTION;

	/**
	 * The feature id for the '<em><b>Quantitative Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__QUANTITATIVE_CONTRIBUTION = GrlPackage.CONTRIBUTION__QUANTITATIVE_CONTRIBUTION;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__CORRELATION = GrlPackage.CONTRIBUTION__CORRELATION;

	/**
	 * The feature id for the '<em><b>Core Contribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK__CORE_CONTRIBUTION = GrlPackage.CONTRIBUTION__CORE_CONTRIBUTION;

	/**
	 * The number of structural features of the '<em>Optional FM Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONAL_FM_LINK_FEATURE_COUNT = GrlPackage.CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link fm.impl.FeatureModelImpl <em>Feature Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fm.impl.FeatureModelImpl
	 * @see fm.impl.FmPackageImpl#getFeatureModel()
	 * @generated
	 */
	int FEATURE_MODEL = 4;

	/**
	 * The feature id for the '<em><b>Grlspec</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__GRLSPEC = 0;

	/**
	 * The feature id for the '<em><b>Core Feature Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL__CORE_FEATURE_MODEL = 1;

	/**
	 * The number of structural features of the '<em>Feature Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_MODEL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fm.impl.FeatureImpactElementImpl <em>Feature Impact Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fm.impl.FeatureImpactElementImpl
	 * @see fm.impl.FmPackageImpl#getFeatureImpactElement()
	 * @generated
	 */
	int FEATURE_IMPACT_ELEMENT = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__NAME = GrlPackage.INTENTIONAL_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__FROM_LINKS = GrlPackage.INTENTIONAL_ELEMENT__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__TO_LINKS = GrlPackage.INTENTIONAL_ELEMENT__TO_LINKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__ID = GrlPackage.INTENTIONAL_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__DESCRIPTION = GrlPackage.INTENTIONAL_ELEMENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__METADATA = GrlPackage.INTENTIONAL_ELEMENT__METADATA;

	/**
	 * The feature id for the '<em><b>Inconcern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__INCONCERN = GrlPackage.INTENTIONAL_ELEMENT__INCONCERN;

	/**
	 * The feature id for the '<em><b>Links Dest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__LINKS_DEST = GrlPackage.INTENTIONAL_ELEMENT__LINKS_DEST;

	/**
	 * The feature id for the '<em><b>Links Src</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__LINKS_SRC = GrlPackage.INTENTIONAL_ELEMENT__LINKS_SRC;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__TYPE = GrlPackage.INTENTIONAL_ELEMENT__TYPE;

	/**
	 * The feature id for the '<em><b>Decomposition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__DECOMPOSITION_TYPE = GrlPackage.INTENTIONAL_ELEMENT__DECOMPOSITION_TYPE;

	/**
	 * The feature id for the '<em><b>Importance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__IMPORTANCE = GrlPackage.INTENTIONAL_ELEMENT__IMPORTANCE;

	/**
	 * The feature id for the '<em><b>Importance Quantitative</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__IMPORTANCE_QUANTITATIVE = GrlPackage.INTENTIONAL_ELEMENT__IMPORTANCE_QUANTITATIVE;

	/**
	 * The feature id for the '<em><b>Line Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__LINE_COLOR = GrlPackage.INTENTIONAL_ELEMENT__LINE_COLOR;

	/**
	 * The feature id for the '<em><b>Fill Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__FILL_COLOR = GrlPackage.INTENTIONAL_ELEMENT__FILL_COLOR;

	/**
	 * The feature id for the '<em><b>Filled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__FILLED = GrlPackage.INTENTIONAL_ELEMENT__FILLED;

	/**
	 * The feature id for the '<em><b>Grlspec</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__GRLSPEC = GrlPackage.INTENTIONAL_ELEMENT__GRLSPEC;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__REFS = GrlPackage.INTENTIONAL_ELEMENT__REFS;

	/**
	 * The feature id for the '<em><b>Core Impact Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__CORE_IMPACT_NODE = GrlPackage.INTENTIONAL_ELEMENT__CORE_IMPACT_NODE;

	/**
	 * The feature id for the '<em><b>Core Feature Impact Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT__CORE_FEATURE_IMPACT_NODE = GrlPackage.INTENTIONAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature Impact Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FEATURE_IMPACT_ELEMENT_FEATURE_COUNT = GrlPackage.INTENTIONAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fm.impl.ReuseLinkImpl <em>Reuse Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fm.impl.ReuseLinkImpl
	 * @see fm.impl.FmPackageImpl#getReuseLink()
	 * @generated
	 */
	int REUSE_LINK = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__NAME = GrlPackage.CONTRIBUTION__NAME;

	/**
	 * The feature id for the '<em><b>From Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__FROM_LINKS = GrlPackage.CONTRIBUTION__FROM_LINKS;

	/**
	 * The feature id for the '<em><b>To Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__TO_LINKS = GrlPackage.CONTRIBUTION__TO_LINKS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__ID = GrlPackage.CONTRIBUTION__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__DESCRIPTION = GrlPackage.CONTRIBUTION__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Metadata</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__METADATA = GrlPackage.CONTRIBUTION__METADATA;

	/**
	 * The feature id for the '<em><b>Inconcern</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__INCONCERN = GrlPackage.CONTRIBUTION__INCONCERN;

	/**
	 * The feature id for the '<em><b>Refs</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__REFS = GrlPackage.CONTRIBUTION__REFS;

	/**
	 * The feature id for the '<em><b>Grlspec</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__GRLSPEC = GrlPackage.CONTRIBUTION__GRLSPEC;

	/**
	 * The feature id for the '<em><b>Dest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__DEST = GrlPackage.CONTRIBUTION__DEST;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__SRC = GrlPackage.CONTRIBUTION__SRC;

	/**
	 * The feature id for the '<em><b>Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__CONTRIBUTION = GrlPackage.CONTRIBUTION__CONTRIBUTION;

	/**
	 * The feature id for the '<em><b>Quantitative Contribution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__QUANTITATIVE_CONTRIBUTION = GrlPackage.CONTRIBUTION__QUANTITATIVE_CONTRIBUTION;

	/**
	 * The feature id for the '<em><b>Correlation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__CORRELATION = GrlPackage.CONTRIBUTION__CORRELATION;

	/**
	 * The feature id for the '<em><b>Core Contribution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__CORE_CONTRIBUTION = GrlPackage.CONTRIBUTION__CORE_CONTRIBUTION;

	/**
	 * The feature id for the '<em><b>Reuse Link In FM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK__REUSE_LINK_IN_FM = GrlPackage.CONTRIBUTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reuse Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REUSE_LINK_FEATURE_COUNT = GrlPackage.CONTRIBUTION_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link fm.FeatureDiagram <em>Feature Diagram</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Diagram</em>'.
	 * @see fm.FeatureDiagram
	 * @generated
	 */
	EClass getFeatureDiagram();

	/**
	 * Returns the meta object for class '{@link fm.Feature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see fm.Feature
	 * @generated
	 */
	EClass getFeature();

	/**
	 * Returns the meta object for the attribute '{@link fm.Feature#isSelectable <em>Selectable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selectable</em>'.
	 * @see fm.Feature#isSelectable()
	 * @see #getFeature()
	 * @generated
	 */
	EAttribute getFeature_Selectable();

	/**
	 * Returns the meta object for the reference '{@link fm.Feature#getCoreFeature <em>Core Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Feature</em>'.
	 * @see fm.Feature#getCoreFeature()
	 * @see #getFeature()
	 * @generated
	 */
	EReference getFeature_CoreFeature();

	/**
	 * Returns the meta object for class '{@link fm.MandatoryFMLink <em>Mandatory FM Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mandatory FM Link</em>'.
	 * @see fm.MandatoryFMLink
	 * @generated
	 */
	EClass getMandatoryFMLink();

	/**
	 * Returns the meta object for class '{@link fm.OptionalFMLink <em>Optional FM Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optional FM Link</em>'.
	 * @see fm.OptionalFMLink
	 * @generated
	 */
	EClass getOptionalFMLink();

	/**
	 * Returns the meta object for class '{@link fm.FeatureModel <em>Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Model</em>'.
	 * @see fm.FeatureModel
	 * @generated
	 */
	EClass getFeatureModel();

	/**
	 * Returns the meta object for the container reference '{@link fm.FeatureModel#getGrlspec <em>Grlspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grlspec</em>'.
	 * @see fm.FeatureModel#getGrlspec()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_Grlspec();

	/**
	 * Returns the meta object for the reference '{@link fm.FeatureModel#getCoreFeatureModel <em>Core Feature Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Feature Model</em>'.
	 * @see fm.FeatureModel#getCoreFeatureModel()
	 * @see #getFeatureModel()
	 * @generated
	 */
	EReference getFeatureModel_CoreFeatureModel();

	/**
	 * Returns the meta object for class '{@link fm.FeatureImpactElement <em>Feature Impact Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature Impact Element</em>'.
	 * @see fm.FeatureImpactElement
	 * @generated
	 */
	EClass getFeatureImpactElement();

	/**
	 * Returns the meta object for the reference '{@link fm.FeatureImpactElement#getCoreFeatureImpactNode <em>Core Feature Impact Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Core Feature Impact Node</em>'.
	 * @see fm.FeatureImpactElement#getCoreFeatureImpactNode()
	 * @see #getFeatureImpactElement()
	 * @generated
	 */
	EReference getFeatureImpactElement_CoreFeatureImpactNode();

	/**
	 * Returns the meta object for class '{@link fm.ReuseLink <em>Reuse Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reuse Link</em>'.
	 * @see fm.ReuseLink
	 * @generated
	 */
	EClass getReuseLink();

	/**
	 * Returns the meta object for the reference '{@link fm.ReuseLink#getReuseLinkInFM <em>Reuse Link In FM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reuse Link In FM</em>'.
	 * @see fm.ReuseLink#getReuseLinkInFM()
	 * @see #getReuseLink()
	 * @generated
	 */
	EReference getReuseLink_ReuseLinkInFM();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FmFactory getFmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fm.impl.FeatureDiagramImpl <em>Feature Diagram</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fm.impl.FeatureDiagramImpl
		 * @see fm.impl.FmPackageImpl#getFeatureDiagram()
		 * @generated
		 */
		EClass FEATURE_DIAGRAM = eINSTANCE.getFeatureDiagram();

		/**
		 * The meta object literal for the '{@link fm.impl.FeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fm.impl.FeatureImpl
		 * @see fm.impl.FmPackageImpl#getFeature()
		 * @generated
		 */
		EClass FEATURE = eINSTANCE.getFeature();

		/**
		 * The meta object literal for the '<em><b>Selectable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FEATURE__SELECTABLE = eINSTANCE.getFeature_Selectable();

		/**
		 * The meta object literal for the '<em><b>Core Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE__CORE_FEATURE = eINSTANCE.getFeature_CoreFeature();

		/**
		 * The meta object literal for the '{@link fm.impl.MandatoryFMLinkImpl <em>Mandatory FM Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fm.impl.MandatoryFMLinkImpl
		 * @see fm.impl.FmPackageImpl#getMandatoryFMLink()
		 * @generated
		 */
		EClass MANDATORY_FM_LINK = eINSTANCE.getMandatoryFMLink();

		/**
		 * The meta object literal for the '{@link fm.impl.OptionalFMLinkImpl <em>Optional FM Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fm.impl.OptionalFMLinkImpl
		 * @see fm.impl.FmPackageImpl#getOptionalFMLink()
		 * @generated
		 */
		EClass OPTIONAL_FM_LINK = eINSTANCE.getOptionalFMLink();

		/**
		 * The meta object literal for the '{@link fm.impl.FeatureModelImpl <em>Feature Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fm.impl.FeatureModelImpl
		 * @see fm.impl.FmPackageImpl#getFeatureModel()
		 * @generated
		 */
		EClass FEATURE_MODEL = eINSTANCE.getFeatureModel();

		/**
		 * The meta object literal for the '<em><b>Grlspec</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__GRLSPEC = eINSTANCE.getFeatureModel_Grlspec();

		/**
		 * The meta object literal for the '<em><b>Core Feature Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_MODEL__CORE_FEATURE_MODEL = eINSTANCE.getFeatureModel_CoreFeatureModel();

		/**
		 * The meta object literal for the '{@link fm.impl.FeatureImpactElementImpl <em>Feature Impact Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fm.impl.FeatureImpactElementImpl
		 * @see fm.impl.FmPackageImpl#getFeatureImpactElement()
		 * @generated
		 */
		EClass FEATURE_IMPACT_ELEMENT = eINSTANCE.getFeatureImpactElement();

		/**
		 * The meta object literal for the '<em><b>Core Feature Impact Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FEATURE_IMPACT_ELEMENT__CORE_FEATURE_IMPACT_NODE = eINSTANCE.getFeatureImpactElement_CoreFeatureImpactNode();

		/**
		 * The meta object literal for the '{@link fm.impl.ReuseLinkImpl <em>Reuse Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fm.impl.ReuseLinkImpl
		 * @see fm.impl.FmPackageImpl#getReuseLink()
		 * @generated
		 */
		EClass REUSE_LINK = eINSTANCE.getReuseLink();

		/**
		 * The meta object literal for the '<em><b>Reuse Link In FM</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REUSE_LINK__REUSE_LINK_IN_FM = eINSTANCE.getReuseLink_ReuseLinkInFM();

	}

} //FmPackage
