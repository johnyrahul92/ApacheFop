
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GetWiseDocumentsDetailsReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWiseDocumentsDetailsReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalNoOfDocuments" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DocumentsDetailsList" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}DocumentsDetailsList" minOccurs="0"/>
 *         &lt;sequence>
 *           &lt;element name="BusinessException" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}BusinessException" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWiseDocumentsDetailsReply", propOrder = {
    "responseCode",
    "totalNoOfDocuments",
    "documentsDetailsList",
    "businessException"
})
public class GetWiseDocumentsDetailsReply {

    @XmlElement(required = true)
    protected String responseCode;
    @XmlElement(required = true)
    protected String totalNoOfDocuments;
    @XmlElementRef(name = "DocumentsDetailsList", type = JAXBElement.class, required = false)
    protected JAXBElement<DocumentsDetailsList> documentsDetailsList;
    @XmlElement(name = "BusinessException")
    protected BusinessException businessException;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the totalNoOfDocuments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalNoOfDocuments() {
        return totalNoOfDocuments;
    }

    /**
     * Sets the value of the totalNoOfDocuments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalNoOfDocuments(String value) {
        this.totalNoOfDocuments = value;
    }

    /**
     * Gets the value of the documentsDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DocumentsDetailsList }{@code >}
     *     
     */
    public JAXBElement<DocumentsDetailsList> getDocumentsDetailsList() {
        return documentsDetailsList;
    }

    /**
     * Sets the value of the documentsDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DocumentsDetailsList }{@code >}
     *     
     */
    public void setDocumentsDetailsList(JAXBElement<DocumentsDetailsList> value) {
        this.documentsDetailsList = value;
    }

    /**
     * Gets the value of the businessException property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessException }
     *     
     */
    public BusinessException getBusinessException() {
        return businessException;
    }

    /**
     * Sets the value of the businessException property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessException }
     *     
     */
    public void setBusinessException(BusinessException value) {
        this.businessException = value;
    }

}
