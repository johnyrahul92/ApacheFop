
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			HeaderDetails request wrapper.
 * 			
 * 
 * <p>Java class for HeaderDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HeaderDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HeaderDetailsRequest" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}HeaderDetailsRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HeaderDetails", propOrder = {
    "headerDetailsRequest"
})
public class HeaderDetails {

    @XmlElement(name = "HeaderDetailsRequest", required = true)
    protected HeaderDetailsRequest headerDetailsRequest;

    /**
     * Gets the value of the headerDetailsRequest property.
     *
     * @return
     *     possible object is
     *     {@link HeaderDetailsRequest }
     *
     */
    public HeaderDetailsRequest getHeaderDetailsRequest() {
        return headerDetailsRequest;
    }

    /**
     * Sets the value of the headerDetailsRequest property.
     *
     * @param value
     *     allowed object is
     *     {@link HeaderDetailsRequest }
     *
     */
    public void setHeaderDetailsRequest(HeaderDetailsRequest value) {
        this.headerDetailsRequest = value;
    }

}
