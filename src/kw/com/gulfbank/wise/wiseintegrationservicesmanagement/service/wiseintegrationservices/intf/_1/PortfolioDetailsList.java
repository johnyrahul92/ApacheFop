
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
 * <p>Java class for PortfolioDetailsList complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioDetailsList">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PortfolioDetails" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}PortfolioDetails" maxOccurs="500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioDetailsList", propOrder = {
    "portfolioDetails"
})
public class PortfolioDetailsList {

    @XmlElement(name = "PortfolioDetails")
    protected List<PortfolioDetails> portfolioDetails;

    /**
     * Gets the value of the portfolioDetails property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the portfolioDetails property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPortfolioDetails().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PortfolioDetails }
     *
     *
     */
    public List<PortfolioDetails> getPortfolioDetails() {
        if (portfolioDetails == null) {
            portfolioDetails = new ArrayList<PortfolioDetails>();
        }
        return this.portfolioDetails;
    }

}
