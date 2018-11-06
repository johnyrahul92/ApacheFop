
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Date;


/**
 * <p>Java class for GetWiseDocumentsDetailsRequest complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="GetWiseDocumentsDetailsRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portfolioId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cif" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fromDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="toDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWiseDocumentsDetailsRequest", propOrder = {
    "portfolioId",
    "cif",
    "fromDate",
    "toDate"
})
public class GetWiseDocumentsDetailsRequest {

    @XmlElement(required = true)
    protected String portfolioId;
    @XmlElement(required = true)
    protected String cif;
    @XmlSchemaType(name = "date")
    protected String fromDate;
    @XmlSchemaType(name = "date")
    protected String toDate;

    /**
     * Gets the value of the portfolioId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPortfolioId(String value) {
        this.portfolioId = value;
    }

    /**
     * Gets the value of the cif property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCif() {
        return cif;
    }

    /**
     * Sets the value of the cif property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCif(String value) {
        this.cif = value;
    }

    /**
     * Gets the value of the fromDate property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFromDate() {
        return fromDate;
    }

    /**
     * Sets the value of the fromDate property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFromDate(String value) {
        this.fromDate = value;
    }

    /**
     * Gets the value of the toDate property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public String getToDate() {
        return toDate;
    }

    /**
     * Sets the value of the toDate property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setToDate(String value) {
        this.toDate = value;
    }

}
