//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.1.9-03/31/2009 04:14 PM(snajper)-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2009.07.19 at 07:21:12 PM EDT 
//


package seg.jUCMNav.importexport.z151.generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RespRef complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RespRef">
 *   &lt;complexContent>
 *     &lt;extension base="{}PathNode">
 *       &lt;sequence>
 *         &lt;element name="repetitionCount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="hostDemand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="respDef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespRef", propOrder = {
    "repetitionCount",
    "hostDemand",
    "respDef"
})
public class RespRef
    extends PathNode
{

    @XmlElement(required = true)
    protected String repetitionCount;
    @XmlElement(required = true)
    protected String hostDemand;
    @XmlElement(required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object respDef;

    /**
     * Gets the value of the repetitionCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepetitionCount() {
        return repetitionCount;
    }

    /**
     * Sets the value of the repetitionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepetitionCount(String value) {
        this.repetitionCount = value;
    }

    /**
     * Gets the value of the hostDemand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHostDemand() {
        return hostDemand;
    }

    /**
     * Sets the value of the hostDemand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHostDemand(String value) {
        this.hostDemand = value;
    }

    /**
     * Gets the value of the respDef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRespDef() {
        return respDef;
    }

    /**
     * Sets the value of the respDef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRespDef(Object value) {
        this.respDef = value;
    }

}
