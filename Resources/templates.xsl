<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.1" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" 
    xmlns:fo="http://www.w3.org/1999/XSL/Format" exclude-result-prefixes="fo">
<xsl:template match="/">
    <fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="simpleA4"
					page-height="29.7cm" page-width="21cm" margin-top="2cm"
					margin-bottom="2cm" margin-left="0cm" margin-right="0cm">
					 <fo:region-body margin-top="1cm" margin-bottom="1cm"/>
                <fo:region-before/>
                <fo:region-after/>
					
				</fo:simple-page-master>
				
			</fo:layout-master-set>
			
			<fo:page-sequence master-reference="simpleA4" >
			
			<fo:static-content flow-name="xsl-region-before">
                <fo:block>
                    Message Body
                </fo:block>
            </fo:static-content>
            <fo:static-content flow-name="xsl-region-after">
                    <fo:block-container height="6cm" width="19cm" top="0.01mm" position="absolute" margin-bottom="3cm">
                        <fo:block height="0.3cm" width="24cm" font-size="8pt" font-family="sans-serif" line-height="8pt" space-after.optimum="4pt" background-color="white" color="black" text-align="center" padding-top="1pt">
                            sjdjkdsafdsfclkzl
                        </fo:block>
                        <fo:block margin-left="1cm"  height="0.3cm" width="100%" font-size="8pt" font-family="sans-serif" line-height="8pt" space-after.optimum="8pt" background-color="white" color="black" text-align="center" padding-top="1pt" border-before-color="#f00" border-before-style="solid" border-before-width="1pt">
                            Gulf Bank KSC Commercial registration 8347 Paid up capital KD 304,812,789.800 - PO. Box 3200 Safat - Kuwait Zip Code 13032 - Telephone: +965 22082000 Fax. +965 22446126/22445212 - Complaints Unit: Head Office – Floor 4 - Mubarak Al Kabir Street – Fax. +965 224101.75 Email: complaintsunit@gulfbank.com.kw
                        </fo:block>
                    </fo:block-container>
                </fo:static-content>  

				<fo:flow flow-name="xsl-region-body">
					<fo:block-container>
						<fo:block>
							<fo:external-graphic content-width="8.3in"
								scaling="uniform" src="url(E:\Git\gulfbank-new-phase2\configuration\target\configuration\local\fonts\pdf_header.png)" />
						</fo:block>

						<fo:block>
							<fo:table margin-left="0.5cm" margin-right="0.5cm"
								margin-top="0.7cm">
								<fo:table-body>
									<fo:table-row>
										<fo:table-cell>
											<fo:block color="#ff0000" font-size="12px">Statement for
												Account
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block>Arabic text</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-body>
							</fo:table>
						</fo:block>
						<fo:block>
							<fo:table margin-left="0.5cm" margin-right="0.5cm"
								margin-top="0.7cm">
								<fo:table-column column-width="100mm" border="solid" />
								<fo:table-column column-width="50mm" border="solid" />
								<fo:table-column column-width="50mm" border="solid" />
								<fo:table-body>
									<fo:table-row>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block>
												<fo:external-graphic content-height="100%"
													content-width="1.5in" scaling="uniform"
													src="url(Resources/VisaMAster.PNG)" />
											</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-body>
							</fo:table>
						</fo:block>

						<fo:block margin-left="0.5cm" margin-right="0.5cm"
							margin-top="0.7cm">
							<fo:table table-layout="fixed" height="20cm" border="1pt solid black">
								<fo:table-column column-width="30mm" border="solid" />
								<fo:table-column column-width="40mm" border="solid" />
								<fo:table-column column-width="70mm" border="solid" />
								<fo:table-column column-width="30mm" border="solid" />
								<fo:table-column column-width="30mm" border="solid" />

								<fo:table-header>
									<fo:table-row background-color="#e6eaf2" border="solid">
										<fo:table-cell border-bottom="0.5pt solid black">
											<fo:block padding="10px" font-weight="bold"
												font-size="10px" color="#5d647a">Date</fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="0.5pt solid black"
											border-bottom="0.5pt solid black">
											<fo:block padding="10px" font-weight="bold"
												font-size="10px" color="#5d647a">Reference No.</fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="0.5pt solid black"
											border-bottom="0.5pt solid black">
											<fo:block padding="10px" font-weight="bold"
												margin-left="20mm" font-size="10px" color="#5d647a">Merchant/City
											</fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="0.5pt solid black"
											border-bottom="0.5pt solid black">
											<fo:block padding="10px" font-weight="bold"
												font-size="10px" color="#5d647a">Amount</fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="0.5pt solid black"
											border-bottom="0.5pt solid black">
											<fo:block padding="10px" font-weight="bold"
												font-size="10px" color="#5d647a">KD Amount</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-header>
								<fo:table-body>
								 <xsl:for-each select="employees/employee">
									<fo:table-row>
										<fo:table-cell>
											<fo:block text-decoration="underline">
											<xsl:value-of select="id"/>
											</fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="0.5pt solid black">
											<fo:block> No.</fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="0.5pt solid black">
											<fo:block>Merchant/City</fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="0.5pt solid black">
											<fo:block>Amount</fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="0.5pt solid black">
											<fo:block>KD Amount</fo:block>
										</fo:table-cell>
									</fo:table-row>
									</xsl:for-each>
								</fo:table-body>
							</fo:table>
						</fo:block>
					</fo:block-container>
				</fo:flow>
				
				
			</fo:page-sequence>
			

		</fo:root>
    
  </xsl:template>
 	
</xsl:stylesheet>