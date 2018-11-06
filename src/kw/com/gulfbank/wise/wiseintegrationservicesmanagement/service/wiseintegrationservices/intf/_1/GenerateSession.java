
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			DownloadDocument request wrapper.
 * 			
 * 
 * <p>Java class for GenerateSession complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateSession">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenerateSessionRequest" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}GenerateSessionRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateSession", propOrder = {
    "generateSessionRequest"
})
public class GenerateSession {

    @XmlElement(name = "GenerateSessionRequest", required = true)
    protected GenerateSessionRequest generateSessionRequest;

    /**
     * Gets the value of the generateSessionRequest property.
     * 
     * @return
     *     possible object is
     *     {@link GenerateSessionRequest }
     *     
     */
    public GenerateSessionRequest getGenerateSessionRequest() {
        return generateSessionRequest;
    }

    /**
     * Sets the value of the generateSessionRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenerateSessionRequest }
     *     
     */
    public void setGenerateSessionRequest(GenerateSessionRequest value) {
        this.generateSessionRequest = value;
    }

}
