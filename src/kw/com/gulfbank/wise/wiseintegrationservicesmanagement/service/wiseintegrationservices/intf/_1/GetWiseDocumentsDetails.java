
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			GetWiseInvestmentDetails request wrapper.
 * 			
 * 
 * <p>Java class for GetWiseDocumentsDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWiseDocumentsDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetWiseDocumentsDetailsRequest" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}GetWiseDocumentsDetailsRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWiseDocumentsDetails", propOrder = {
    "getWiseDocumentsDetailsRequest"
})
public class GetWiseDocumentsDetails {

    @XmlElement(name = "GetWiseDocumentsDetailsRequest", required = true)
    protected GetWiseDocumentsDetailsRequest getWiseDocumentsDetailsRequest;

    /**
     * Gets the value of the getWiseDocumentsDetailsRequest property.
     *
     * @return
     *     possible object is
     *     {@link GetWiseDocumentsDetailsRequest }
     *
     */
    public GetWiseDocumentsDetailsRequest getGetWiseDocumentsDetailsRequest() {
        return getWiseDocumentsDetailsRequest;
    }

    /**
     * Sets the value of the getWiseDocumentsDetailsRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link GetWiseDocumentsDetailsRequest }
     *
     */
    public void setGetWiseDocumentsDetailsRequest(GetWiseDocumentsDetailsRequest value) {
        this.getWiseDocumentsDetailsRequest = value;
    }

}
