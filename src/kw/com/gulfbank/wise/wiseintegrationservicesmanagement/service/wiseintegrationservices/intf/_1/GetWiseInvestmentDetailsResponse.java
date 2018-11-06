
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
 * <p>Java class for GetWiseInvestmentDetailsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWiseInvestmentDetailsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetWiseInvestmentDetailsReply" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}GetWiseInvestmentDetailsReply"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWiseInvestmentDetailsResponse", propOrder = {
    "getWiseInvestmentDetailsReply"
})
public class GetWiseInvestmentDetailsResponse {

    @XmlElement(name = "GetWiseInvestmentDetailsReply", required = true)
    protected GetWiseInvestmentDetailsReply getWiseInvestmentDetailsReply;

    /**
     * Gets the value of the getWiseInvestmentDetailsReply property.
     *
     * @return
     *     possible object is
     *     {@link GetWiseInvestmentDetailsReply }
     *
     */
    public GetWiseInvestmentDetailsReply getGetWiseInvestmentDetailsReply() {
        return getWiseInvestmentDetailsReply;
    }

    /**
     * Sets the value of the getWiseInvestmentDetailsReply property.
     *
     * @param value
     *     allowed object is
     *     {@link GetWiseInvestmentDetailsReply }
     *
     */
    public void setGetWiseInvestmentDetailsReply(GetWiseInvestmentDetailsReply value) {
        this.getWiseInvestmentDetailsReply = value;
    }

}
