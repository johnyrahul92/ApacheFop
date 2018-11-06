
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	GetWiseInvestmentDetails  response wrapper.
 * 			
 * 
 * <p>Java class for GetWiseDocumentsDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWiseDocumentsDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetWiseDocumentsDetailsReply" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}GetWiseDocumentsDetailsReply"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWiseDocumentsDetailsResponse", propOrder = {
    "getWiseDocumentsDetailsReply"
})
public class GetWiseDocumentsDetailsResponse {

    @XmlElement(name = "GetWiseDocumentsDetailsReply", required = true)
    protected GetWiseDocumentsDetailsReply getWiseDocumentsDetailsReply;

    /**
     * Gets the value of the getWiseDocumentsDetailsReply property.
     *
     * @return
     *     possible object is
     *     {@link GetWiseDocumentsDetailsReply }
     *
     */
    public GetWiseDocumentsDetailsReply getGetWiseDocumentsDetailsReply() {
        return getWiseDocumentsDetailsReply;
    }

    /**
     * Sets the value of the getWiseDocumentsDetailsReply property.
     *
     * @param value
     *     allowed object is
     *     {@link GetWiseDocumentsDetailsReply }
     *
     */
    public void setGetWiseDocumentsDetailsReply(GetWiseDocumentsDetailsReply value) {
        this.getWiseDocumentsDetailsReply = value;
    }

}
