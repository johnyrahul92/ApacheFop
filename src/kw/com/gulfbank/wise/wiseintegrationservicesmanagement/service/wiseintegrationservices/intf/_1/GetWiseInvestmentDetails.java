
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
 * <p>Java class for GetWiseInvestmentDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWiseInvestmentDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetWiseInvestmentDetailsRequest" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}GetWiseInvestmentDetailsRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWiseInvestmentDetails", propOrder = {
    "getWiseInvestmentDetailsRequest"
})
public class GetWiseInvestmentDetails {

    @XmlElement(name = "GetWiseInvestmentDetailsRequest", required = true)
    protected GetWiseInvestmentDetailsRequest getWiseInvestmentDetailsRequest;

    /**
     * Gets the value of the getWiseInvestmentDetailsRequest property.
     *
     * @return
     *     possible object is
     *     {@link GetWiseInvestmentDetailsRequest }
     *
     */
    public GetWiseInvestmentDetailsRequest getGetWiseInvestmentDetailsRequest() {
        return getWiseInvestmentDetailsRequest;
    }

    /**
     * Sets the value of the getWiseInvestmentDetailsRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link GetWiseInvestmentDetailsRequest }
     *
     */
    public void setGetWiseInvestmentDetailsRequest(GetWiseInvestmentDetailsRequest value) {
        this.getWiseInvestmentDetailsRequest = value;
    }

}
