
package eu.europa.ec.fisheries.schema.rules.source.v1;

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
 *         &lt;element name="method" type="{urn:source.rules.schema.fisheries.ec.europa.eu:v1}RulesDataSourceMethod"/>
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
    "method"
})
@XmlSeeAlso({
    GetRunnableCustomRulesRequest.class,
    PingRequest.class,
    GetTicketListByQueryRequest.class,
    UpdateTicketStatusByQueryRequest.class,
    GetNumberOfOpenAlarmsRequest.class,
    DeleteCustomRuleRequest.class,
    SetAlarmStatusRequest.class,
    GetTicketListRequest.class,
    GetPreviousReportsRequest.class,
    GetNumberOfOpenTicketsRequest.class,
    GetNumberOfAssetsNotSendingRequest.class,
    GetTicketListByMovementsRequest.class,
    GetTicketByAssetAndRuleRequest.class,
    SetTicketStatusRequest.class,
    UpdateCustomRuleRequest.class,
    UpsertPreviousReportRequest.class,
    UpdateCustomRuleSubscriptionRequest.class,
    CreateAlarmReportRequest.class,
    GetAlarmReportByAssetAndRuleRequest.class,
    GetCustomRulesByUserRequest.class,
    GetAlarmRequest.class,
    CreateCustomRuleRequest.class,
    CountTicketListByMovementsRequest.class,
    GetPreviousReportByAssetGuidRequest.class,
    UpdateCustomRuleLastTriggeredRequest.class,
    GetCustomRuleListByQueryRequest.class,
    CreateTicketRequest.class,
    GetAlarmListByQueryRequest.class,
    GetCustomRuleRequest.class,
    GetSanityRulesRequest.class,
    UpdateTicketCountRequest.class,
    GetTicketRequest.class,
    ReprocessAlarmRequest.class,
    GetTicketsAndRulesByMovementsRequest.class
})
public abstract class RulesBaseRequest
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected RulesDataSourceMethod method;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link RulesDataSourceMethod }
     *     
     */
    public RulesDataSourceMethod getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link RulesDataSourceMethod }
     *     
     */
    public void setMethod(RulesDataSourceMethod value) {
        this.method = value;
    }

}
