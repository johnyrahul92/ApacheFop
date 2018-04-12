<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.1"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format"
	exclude-result-prefixes="fo">
	<xsl:template match="employees">
<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
    <fo:layout-master-set>
        <fo:simple-page-master
		margin-right="0.5cm" margin-left="0.5cm" margin-bottom="0.5cm" margin-top="0.75cm"
		page-width="21cm" page-height="29.7cm" master-name="first">
            <fo:region-body></fo:region-body>
        </fo:simple-page-master>
        <fo:simple-page-master
		margin-right="2.5cm" margin-left="2.5cm" margin-bottom="2cm" margin-top="1cm"
		page-width="21cm" page-height="29.7cm" master-name="rest">
            <fo:region-body></fo:region-body>
        </fo:simple-page-master>
		
		<fo:page-sequence-master master-name="psmA">
			<fo:repeatable-page-master-alternatives>
				<fo:conditional-page-master-reference master-name="first"
					page-position="first" />
				<fo:conditional-page-master-reference master-name="rest"
					page-position="rest" />
				<!-- recommended fallback procedure -->
				<fo:conditional-page-master-reference master-name="rest" />
			</fo:repeatable-page-master-alternatives>
		</fo:page-sequence-master>
    </fo:layout-master-set>
    <fo:page-sequence master-name="psmA">
        <fo:flow flow-name="xsl-region-body">
            <fo:block-container height="4cm" width="12cm" top="0cm" left="0cm" position="absolute">
                <fo:block text-align="start" line-height="18pt" font-family="sans-serif" font-weight="bold" font-size="14pt">
					PX7.net
				</fo:block>
                <fo:block text-align="start" line-height="18pt" font-family="sans-serif" font-weight="bold" font-size="14pt">
					44 Liberty St
				</fo:block>
                <fo:block text-align="start" line-height="18pt" font-family="sans-serif" font-weight="bold" font-size="14pt">
					Newburyport, MA 01950
				</fo:block>
                <fo:block text-align="start" line-height="18pt" font-family="sans-serif" font-weight="bold" font-size="14pt">
					978-462-1152	
				</fo:block>
            </fo:block-container>
            <fo:block-container height="1cm" width="6cm" top="0cm" left="14cm" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="22pt" font-family="sans-serif" font-size="23pt">
				   Sales Receipt
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="2.5cm" top="1.2cm" left="14cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="12pt">
				   DATE
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="2.5cm" top="1.7cm" left="14cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="10pt">
					01/01/2000
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="2.5cm" top="1.2cm" left="16.5cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="12pt">
					SALE #
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="2.5cm" top="1.7cm" left="16.5cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="10pt">
					1
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="9cm" top="3cm" left="0cm" padding="2pt" position="absolute">
                <fo:block text-align="start" line-height="15pt" font-family="sans-serif" font-size="12pt">
				    SOLD TO
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="3cm" width="9cm" top="3.5cm" left="0cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="12pt">
                </fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="9cm" top="3cm" left="10cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="12pt">
					SHIP TO
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="3cm" width="9cm" top="3.5cm" left="10cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="12pt">
                </fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="4cm" top="7cm" left="11cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="12pt">
				   PMT METHOD
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="4cm" top="7.5cm" left="11cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="10pt">
					Check
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="4cm" top="7cm" left="15cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="12pt">
					CHECK #
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="0.5cm" width="4cm" top="7.5cm" left="15cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="10pt">
					1234
				</fo:block>
            </fo:block-container>
            <fo:block-container height="17cm" width="19cm" top="8cm" left="0cm" position="absolute">
                <fo:table border-color="yellow" border-style="solid" border-width="1pt" height="17cm">
                    <fo:table-column column-width="2.5cm" border-color="red" border-style="solid" border-width="1pt"/>
                    <fo:table-column column-width="11.5cm" border-color="red" border-style="solid" border-width="1pt"/>
                    <fo:table-column column-width="2.5cm" border-color="red" border-style="solid" border-width="1pt"/>
                    <fo:table-column column-width="2.5cm" border-color="red" border-style="solid" border-width="1pt"/>
                    <fo:table-body font-family="sans-serif" font-weight="normal" font-size="10pt">
                        <fo:table-row line-height="12pt">
                            <fo:table-cell border-width="1pt" border-color="green" border-style="solid" padding="6pt">
                                <fo:block text-align="end">QUANTITY</fo:block>
                            </fo:table-cell>
                            <fo:table-cell border-width="1pt" border-color="red" border-style="solid" padding="4pt">
                                <fo:block text-align="start">DESCRIPTION</fo:block>
                            </fo:table-cell>
                            <fo:table-cell border-width="1pt" border-color="blue" border-style="solid" padding="3pt">
                                <fo:block text-align="center">RATE</fo:block>
                            </fo:table-cell>
                            <fo:table-cell border-width="1pt" border-color="orange" border-style="solid" padding="2pt">
                                <fo:block text-align="center">AMOUNT</fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                        <fo:table-row line-height="12pt">
                            <fo:table-cell padding="2pt">
                                <fo:block text-align="end">1</fo:block>
                            </fo:table-cell>
                            <fo:table-cell padding="2pt">
                                <fo:block text-align="start">Widget</fo:block>
                            </fo:table-cell>
                            <fo:table-cell padding="2pt">
                                <fo:block text-align="end">$22.23</fo:block>
                            </fo:table-cell>
                            <fo:table-cell padding="2pt">
                                <fo:block text-align="end">22.31</fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                        <fo:table-row line-height="12pt">
                            <fo:table-cell padding="2pt">
                                <fo:block text-align="end">3</fo:block>
                            </fo:table-cell>
                            <fo:table-cell padding="2pt">
                                <fo:block text-align="start">Nuts</fo:block>
                            </fo:table-cell>
                            <fo:table-cell padding="2pt">
                                <fo:block text-align="end">$12.00</fo:block>
                            </fo:table-cell>
                            <fo:table-cell padding="2pt">
                                <fo:block text-align="end">36.00</fo:block>
                            </fo:table-cell>
                        </fo:table-row>
                    </fo:table-body>
                </fo:table>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="1cm" width="14cm" top="25cm" left="0cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="12pt">
					Please remit to the above address
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="1cm" width="2.5cm" top="25cm" left="14cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="25pt" font-family="sans-serif" font-size="22pt">
					Total
				</fo:block>
            </fo:block-container>
            <fo:block-container border-color="black" border-style="solid" border-width="1pt" height="1cm" width="2.5cm" top="25cm" left="16.5cm" padding="2pt" position="absolute">
                <fo:block text-align="start" space-after.optimum="3pt" line-height="15pt" font-family="sans-serif" font-size="10pt">
					$3.00
				</fo:block>
            </fo:block-container>
        </fo:flow>
    </fo:page-sequence>
</fo:root>
</xsl:template>


</xsl:stylesheet>