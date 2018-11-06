
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
 * <p>Java class for DownloadWiseDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadWiseDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DownloadWiseDocumentRequest" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}DownloadWiseDocumentRequest"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadWiseDocument", propOrder = {
    "downloadWiseDocumentRequest"
})
public class DownloadWiseDocument {

    @XmlElement(name = "DownloadWiseDocumentRequest", required = true)
    protected DownloadWiseDocumentRequest downloadWiseDocumentRequest;

    /**
     * Gets the value of the downloadWiseDocumentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DownloadWiseDocumentRequest }
     *     
     */
    public DownloadWiseDocumentRequest getDownloadWiseDocumentRequest() {
        return downloadWiseDocumentRequest;
    }

    /**
     * Sets the value of the downloadWiseDocumentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DownloadWiseDocumentRequest }
     *     
     */
    public void setDownloadWiseDocumentRequest(DownloadWiseDocumentRequest value) {
        this.downloadWiseDocumentRequest = value;
    }

}
