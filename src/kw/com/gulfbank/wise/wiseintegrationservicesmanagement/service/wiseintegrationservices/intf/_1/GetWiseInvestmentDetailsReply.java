
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;


/**
 * <p>Java class for GetWiseInvestmentDetailsReply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetWiseInvestmentDetailsReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="responseCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalInvestments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalCurrentValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PortfolioDetailsList" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}PortfolioDetailsList" minOccurs="0"/>
 *         &lt;element name="BusinessException" type="{http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1}BusinessException" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetWiseInvestmentDetailsReply", propOrder = {
    "responseCode",
    "totalInvestments",
    "totalCurrentValue",
    "currencyCode",
    "portfolioDetailsList",
    "businessException"
})
public class GetWiseInvestmentDetailsReply {

    @XmlElement(required = true)
    protected String responseCode;
    protected String totalInvestments;
    protected String totalCurrentValue;
    protected String currencyCode;
    @XmlElementRef(name = "PortfolioDetailsList", type = JAXBElement.class, required = false)
    protected JAXBElement<PortfolioDetailsList> portfolioDetailsList;
    @XmlElement(name = "BusinessException")
    protected BusinessException businessException;

    /**
     * Gets the value of the responseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the value of the responseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseCode(String value) {
        this.responseCode = value;
    }

    /**
     * Gets the value of the totalInvestments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalInvestments() {
        return totalInvestments;
    }

    /**
     * Sets the value of the totalInvestments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalInvestments(String value) {
        this.totalInvestments = value;
    }

    /**
     * Gets the value of the totalCurrentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalCurrentValue() {
        return totalCurrentValue;
    }

    /**
     * Sets the value of the totalCurrentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalCurrentValue(String value) {
        this.totalCurrentValue = value;
    }

    /**
     * Gets the value of the currencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Sets the value of the currencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * Gets the value of the portfolioDetailsList property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PortfolioDetailsList }{@code >}
     *     
     */
    public JAXBElement<PortfolioDetailsList> getPortfolioDetailsList() {
        return portfolioDetailsList;
    }

    /**
     * Sets the value of the portfolioDetailsList property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PortfolioDetailsList }{@code >}
     *     
     */
    public void setPortfolioDetailsList(JAXBElement<PortfolioDetailsList> value) {
        this.portfolioDetailsList = value;
    }

    /**
     * Gets the value of the businessException property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessException }
     *     
     */
    public BusinessException getBusinessException() {
        return businessException;
    }

    /**
     * Sets the value of the businessException property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessException }
     *     
     */
    public void setBusinessException(BusinessException value) {
        this.businessException = value;
    }

}
