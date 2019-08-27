<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text" encoding="UTF-8" media-type="text/plain"/>
    <xsl:template match="/">
        {
        "paymentdetails" : [<xsl:apply-templates select="faml/response/genericftresponsedto"/>]
        }
    </xsl:template>

    <xsl:template match="genericftresponsedto">
        
        <xsl:choose>
            <xsl:when test="countryspecificpaydetails/countryspecificpaymentdetailsdto/country ='United Arab Emirates'">
                <xsl:for-each select="countryspecificpaydetails/countryspecificpaymentdetailsdto">
                    {
                    "code": "<xsl:value-of select="paymentdetails1"/>",
                    "description": "<xsl:value-of select="paymentdetails2"/>"
                    }
                    <xsl:if test="position() != last()">,</xsl:if>
                </xsl:for-each>
            </xsl:when>
            <xsl:otherwise>
                <xsl:for-each select="paymentdetails/datadto">
                    {
                    "code": "<xsl:value-of select="code"/>",
                    "description": "<xsl:value-of select="description"/>"
                    }
                    <xsl:if test="position() != last()">,</xsl:if>
                </xsl:for-each>

            </xsl:otherwise>
        </xsl:choose>





    </xsl:template>


    
</xsl:stylesheet>
