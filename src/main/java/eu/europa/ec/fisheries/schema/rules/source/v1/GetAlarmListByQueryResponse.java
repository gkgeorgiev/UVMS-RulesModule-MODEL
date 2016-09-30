
package eu.europa.ec.fisheries.schema.rules.source.v1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import eu.europa.ec.fisheries.schema.rules.alarm.v1.AlarmReportType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="alarms" type="{urn:alarm.rules.schema.fisheries.ec.europa.eu:v1}AlarmReportType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="totalNumberOfPages" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="currentPage" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alarms",
    "totalNumberOfPages",
    "currentPage"
})
@XmlRootElement(name = "GetAlarmListByQueryResponse")
public class GetAlarmListByQueryResponse
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected List<AlarmReportType> alarms;
    protected int totalNumberOfPages;
    protected int currentPage;

    /**
     * Gets the value of the alarms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alarms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlarms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlarmReportType }
     * 
     * 
     */
    public List<AlarmReportType> getAlarms() {
        if (alarms == null) {
            alarms = new ArrayList<AlarmReportType>();
        }
        return this.alarms;
    }

    /**
     * Gets the value of the totalNumberOfPages property.
     * 
     */
    public int getTotalNumberOfPages() {
        return totalNumberOfPages;
    }

    /**
     * Sets the value of the totalNumberOfPages property.
     * 
     */
    public void setTotalNumberOfPages(int value) {
        this.totalNumberOfPages = value;
    }

    /**
     * Gets the value of the currentPage property.
     * 
     */
    public int getCurrentPage() {
        return currentPage;
    }

    /**
     * Sets the value of the currentPage property.
     * 
     */
    public void setCurrentPage(int value) {
        this.currentPage = value;
    }

}
