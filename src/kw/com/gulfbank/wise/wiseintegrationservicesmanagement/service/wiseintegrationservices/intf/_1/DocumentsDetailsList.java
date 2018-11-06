
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * 
 * 	PortfolioDetailsList  response wrapper.
 * 			
 * 
 * <p>Java class for DocumentsDetailsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentsDetailsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DocumentsDetails" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}DocumentsDetails" maxOccurs="500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentsDetailsList", propOrder = {
    "documentsDetails"
})
public class DocumentsDetailsList {

    @XmlElement(name = "DocumentsDetails")
    protected List<DocumentsDetails> documentsDetails;

    /**
     * Gets the value of the documentsDetails property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentsDetails property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentsDetails().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentsDetails }
     *
     *
     */
    public List<DocumentsDetails> getDocumentsDetails() {
        if (documentsDetails == null) {
            documentsDetails = new ArrayList<DocumentsDetails>();
        }
        return this.documentsDetails;
    }

}
