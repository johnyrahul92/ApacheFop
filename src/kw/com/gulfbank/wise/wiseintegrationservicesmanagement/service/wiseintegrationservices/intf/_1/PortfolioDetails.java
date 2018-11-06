
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PortfolioDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PortfolioDetails">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="portfolioId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portfolioAlias" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalInvestmentAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentValue" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currentCashBalance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="portfolioTimeHorizon" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portfolioRiskTolerance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="portfolioCreatedDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gbAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tradingAccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dividends" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="managementFee" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="remainingYears" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PortfolioDetails", propOrder = {
    "portfolioId",
    "portfolioAlias",
    "totalInvestmentAmount",
    "currentValue",
    "currentCashBalance",
    "portfolioTimeHorizon",
    "portfolioRiskTolerance",
    "portfolioCreatedDate",
    "gbAccountNumber",
    "tradingAccountNumber",
    "dividends",
    "managementFee",
    "currencyCode",
    "remainingYears"
})
public class PortfolioDetails {

    @XmlElement(required = true)
    protected String portfolioId;
    @XmlElement(required = true)
    protected String portfolioAlias;
    @XmlElement(required = true)
    protected String totalInvestmentAmount;
    @XmlElement(required = true)
    protected String currentValue;
    @XmlElement(required = true)
    protected String currentCashBalance;
    protected String portfolioTimeHorizon;
    protected String portfolioRiskTolerance;
    protected String portfolioCreatedDate;
    @XmlElement(required = true)
    protected String gbAccountNumber;
    @XmlElement(required = true)
    protected String tradingAccountNumber;
    protected String dividends;
    @XmlElement(required = true)
    protected String managementFee;
    protected String currencyCode;
    protected String remainingYears;

    /**
     * Gets the value of the portfolioId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * Sets the value of the portfolioId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioId(String value) {
        this.portfolioId = value;
    }

    /**
     * Gets the value of the portfolioAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioAlias() {
        return portfolioAlias;
    }

    /**
     * Sets the value of the portfolioAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioAlias(String value) {
        this.portfolioAlias = value;
    }

    /**
     * Gets the value of the totalInvestmentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalInvestmentAmount() {
        return totalInvestmentAmount;
    }

    /**
     * Sets the value of the totalInvestmentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalInvestmentAmount(String value) {
        this.totalInvestmentAmount = value;
    }

    /**
     * Gets the value of the currentValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentValue() {
        return currentValue;
    }

    /**
     * Sets the value of the currentValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentValue(String value) {
        this.currentValue = value;
    }

    /**
     * Gets the value of the currentCashBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentCashBalance() {
        return currentCashBalance;
    }

    /**
     * Sets the value of the currentCashBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentCashBalance(String value) {
        this.currentCashBalance = value;
    }

    /**
     * Gets the value of the portfolioTimeHorizon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioTimeHorizon() {
        return portfolioTimeHorizon;
    }

    /**
     * Sets the value of the portfolioTimeHorizon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioTimeHorizon(String value) {
        this.portfolioTimeHorizon = value;
    }

    /**
     * Gets the value of the portfolioRiskTolerance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioRiskTolerance() {
        return portfolioRiskTolerance;
    }

    /**
     * Sets the value of the portfolioRiskTolerance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioRiskTolerance(String value) {
        this.portfolioRiskTolerance = value;
    }

    /**
     * Gets the value of the portfolioCreatedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortfolioCreatedDate() {
        return portfolioCreatedDate;
    }

    /**
     * Sets the value of the portfolioCreatedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortfolioCreatedDate(String value) {
        this.portfolioCreatedDate = value;
    }

    /**
     * Gets the value of the gbAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGbAccountNumber() {
        return gbAccountNumber;
    }

    /**
     * Sets the value of the gbAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGbAccountNumber(String value) {
        this.gbAccountNumber = value;
    }

    /**
     * Gets the value of the tradingAccountNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradingAccountNumber() {
        return tradingAccountNumber;
    }

    /**
     * Sets the value of the tradingAccountNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradingAccountNumber(String value) {
        this.tradingAccountNumber = value;
    }

    /**
     * Gets the value of the dividends property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDividends() {
        return dividends;
    }

    /**
     * Sets the value of the dividends property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDividends(String value) {
        this.dividends = value;
    }

    /**
     * Gets the value of the managementFee property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManagementFee() {
        return managementFee;
    }

    /**
     * Sets the value of the managementFee property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManagementFee(String value) {
        this.managementFee = value;
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
     * Gets the value of the remainingYears property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemainingYears() {
        return remainingYears;
    }

    /**
     * Sets the value of the remainingYears property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemainingYears(String value) {
        this.remainingYears = value;
    }

}
