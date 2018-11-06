
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 	DownloadDocument  response wrapper.
 * 			
 * 
 * <p>Java class for GenerateSessionResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenerateSessionResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GenerateSessionReply" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}GenerateSessionReply"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateSessionResponse", propOrder = {
    "generateSessionReply"
})
public class GenerateSessionResponse {

    @XmlElement(name = "GenerateSessionReply", required = true)
    protected GenerateSessionReply generateSessionReply;

    /**
     * Gets the value of the generateSessionReply property.
     *
     * @return
     *     possible object is
     *     {@link GenerateSessionReply }
     *
     */
    public GenerateSessionReply getGenerateSessionReply() {
        return generateSessionReply;
    }

    /**
     * Sets the value of the generateSessionReply property.
     *
     * @param value
     *     allowed object is
     *     {@link GenerateSessionReply }
     *
     */
    public void setGenerateSessionReply(GenerateSessionReply value) {
        this.generateSessionReply = value;
    }

}
