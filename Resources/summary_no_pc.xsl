<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="text" encoding="UTF-8" media-type="text/plain"/>
    <xsl:variable name="i" select="1"/>
    <xsl:template match="/">
        {
        "totalcasaamount": "<xsl:value-of select="faml/response/totalpositionresponsedto/totalcasaamount"/>",
        "totaltdamount": "<xsl:value-of select="faml/response/totalpositionresponsedto/totaltdamount"/>",
        "totalcreditamt": "<xsl:value-of select="faml/response/totalpositionresponsedto/udffields/udfdto[udfname='totalcreditamt']/udfvalue"/>",

        "list":
        [
        <xsl:for-each select="faml/response/totalpositionresponsedto/custaccounts/customeraccountdto/accounts/accountnodto">

            <xsl:if test="status != 'Closed'">
                <xsl:choose>
                    <xsl:when test="(udffields/udfdto[udfname='cardIdentifier']/udfvalue!='PREPAID' and accttype='CC') or (accttype!='CC')">

                        <xsl:if test="position() != 1">,</xsl:if>
                        {

                        <xsl:variable name="i" select="$i + 1"/> <!-- add 1 each time -->
                        "test": "<xsl:value-of select="$i"/>",

                        "displayName": "<xsl:value-of select="accountdisplayname"/>",
                        "fldsrcacctno": "<xsl:value-of select="nbraccount"/>",
                        "fldcurrency": "<xsl:value-of select="ccydesc"/>",
                        "currentBalance":"<xsl:value-of select="balance"/>",
                        "accountBalance": "<xsl:value-of select="availablebalance"/>",
                        "accountStatus": "<xsl:value-of select="status"/>",
                        "fldBranch": "<xsl:value-of select="nbrbranch"/>",
                        "fldaccttype": "<xsl:value-of select="accttype"/>",
                        "fldcustid": "<xsl:value-of select="idcustomer"/>",
                        "fldproductcode": "<xsl:value-of select="productname"/>",
                        "productcode": "<xsl:value-of select="productcode"/>",
                        "isAldanah": <xsl:choose><xsl:when test="productcode = '01010011'">true</xsl:when><xsl:otherwise>false</xsl:otherwise></xsl:choose>,
                        "unclearFunds": "<xsl:value-of select="unclearfunds"/>",
                        "fldacctno": "<xsl:value-of select="nbraccount"/>~<xsl:value-of select="accttype"/>~<xsl:value-of select="nbrbranch"/>~<xsl:value-of select="idcustomer"/>~<xsl:value-of select="ccydesc"/>",
                        <xsl:if test="accttype='CC'">
                            "cardType":"<xsl:value-of select="udffields/udfdto[udfname='cardType']/udfvalue"/>",
                            "cardIdentifier":"<xsl:value-of select="udffields/udfdto[udfname='cardIdentifier']/udfvalue"/>",
                            "nameHolder":"<xsl:value-of select="udffields/udfdto[udfname='cardholdername']/udfvalue"/>",
                            "expiryDate":"<xsl:value-of select="udffields/udfdto[udfname='cardexpirydate']/udfvalue"/>",
                        </xsl:if>
                        "ibanno": "<xsl:value-of select="ibanno"/>",
                        "nambranch" : "<xsl:value-of select="nambranch"/>"
                        }
                    </xsl:when>
                </xsl:choose>
            </xsl:if>
        </xsl:for-each>
        ]}
    </xsl:template>
</xsl:stylesheet>
