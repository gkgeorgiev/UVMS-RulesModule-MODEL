
package eu.europa.ec.fisheries.schema.rules.module.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RulesBaseRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RulesBaseRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="method" type="{urn:module.rules.schema.fisheries.ec.europa.eu:v1}RulesModuleMethod"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RulesBaseRequest", propOrder = {
    "method",
    "username"
})
@XmlSeeAlso({
    CountTicketsByMovementsRequest.class,
    CreateAlarmReportRequest.class,
    PingRequest.class,
    GetTicketListByQueryRequest.class,
    CreateCustomRuleRequest.class,
    GetCustomRuleListRequest.class,
    SetFLUXFAReportMessageRequest.class,
    GetTicketListRequest.class,
    CreateTicketRequest.class,
    GetAlarmListByQueryRequest.class,
    GetCustomRuleRequest.class,
    GetTicketsByMovementsRequest.class,
    GetTicketsAndRulesByMovementsRequest.class,
    SetMovementReportRequest.class
})
public abstract class RulesBaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected RulesModuleMethod method;
    @XmlElement(required = true)
    protected String username;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link RulesModuleMethod }
     *     
     */
    public RulesModuleMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link RulesModuleMethod }
     *     
     */
    public void setMethod(RulesModuleMethod value) {
        this.method = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

}
