
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
 * <p>Java class for DownloadWiseDocumentResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DownloadWiseDocumentResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DownloadWiseDocumentReply" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}DownloadWiseDocumentReply"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DownloadWiseDocumentResponse", propOrder = {
    "downloadWiseDocumentReply"
})
public class DownloadWiseDocumentResponse {

    @XmlElement(name = "DownloadWiseDocumentReply", required = true)
    protected DownloadWiseDocumentReply downloadWiseDocumentReply;

    /**
     * Gets the value of the downloadWiseDocumentReply property.
     *
     * @return
     *     possible object is
     *     {@link DownloadWiseDocumentReply }
     *
     */
    public DownloadWiseDocumentReply getDownloadWiseDocumentReply() {
        return downloadWiseDocumentReply;
    }

    /**
     * Sets the value of the downloadWiseDocumentReply property.
     *
     * @param value
     *     allowed object is
     *     {@link DownloadWiseDocumentReply }
     *
     */
    public void setDownloadWiseDocumentReply(DownloadWiseDocumentReply value) {
        this.downloadWiseDocumentReply = value;
    }

}
