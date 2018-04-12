<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xml:lang="afb" version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format"
	exclude-result-prefixes="fo">

	<xsl:output doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN"
		method="pdf" indent="yes" encoding="utf-8" />
	<xsl:template match="/">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format"
			xmlns:util="com.gulfbank.olb.integration.commons.XslUtil" xml:lang="ar">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="page"
					page-height="29.7cm" page-width="21cm">
					<fo:region-body font-size="8pt" font-family="sans-serif"
						margin-top="3cm" margin-bottom="5cm" margin-left="1cm"
						margin-right="1cm" />
					<fo:region-before extent="3cm" />
					<fo:region-after extent="4cm" />
				</fo:simple-page-master>
				<fo:simple-page-master master-name="lastPage"
					page-height="29.7cm" page-width="21cm">
					<fo:region-body font-size="8pt" font-family="sans-serif"
						margin-top="3cm" margin-bottom="5cm" margin-left="1cm"
						margin-right="1cm" />
					<fo:region-before extent="3cm" />
					<fo:region-after extent="4cm" />
				</fo:simple-page-master>
				<fo:page-sequence-master master-name="all">
					<fo:repeatable-page-master-alternatives>
						<fo:conditional-page-master-reference
							master-reference="page" page-position="first" />
						<fo:conditional-page-master-reference
							master-reference="lastPage" page-position="last" />
					</fo:repeatable-page-master-alternatives>
				</fo:page-sequence-master>
			</fo:layout-master-set>

			<fo:page-sequence master-reference="page"
				initial-page-number="1">

				<fo:static-content flow-name="xsl-region-before">
					<fo:block-container margin-top="3cm" height="0.5cm"
						width="19cm" top="0.01mm" position="absolute">
						<fo:block margin-top="0.75cm">
							<fo:external-graphic content-width="21cm"
								scaling="uniform" src="url(Resources/headerGBK.PNG)" />
						</fo:block>
					</fo:block-container>
				</fo:static-content>
				<fo:static-content flow-name="xsl-region-after">
					<fo:block-container margin-top="1.25cm" height="0.5cm"
						width="19cm" top="0.01mm" position="absolute">
						<fo:block>
							<fo:external-graphic content-width="21cm"
								scaling="uniform" src="url(Resources/footer.PNG)" />
						</fo:block>
					</fo:block-container>
				</fo:static-content>
				<fo:flow flow-name="xsl-region-body">
					<fo:block-container>

						<fo:block margin-bottom="10px">
							<fo:table>
								<fo:table-column column-width="50mm" />
								<fo:table-column column-width="20mm" />
								<fo:table-column column-width="35mm" />
								<fo:table-column column-width="35mm" />
								<fo:table-column column-width="35mm" />
								<fo:table-body>
									<fo:table-row>

										<fo:table-cell>
											<fo:block color="#CD2429" font-size="12px">
												Statement for
												Account
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block color="#CD2429" font-size="12px">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr" font-size="12pt" font-family="Arial">
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-body>
							</fo:table>
						</fo:block>

						<fo:block>
							<fo:table>

								<fo:table-column column-width="50mm" />
								<fo:table-column column-width="20mm" />
								<fo:table-column column-width="35mm" />
								<fo:table-column column-width="35mm" />
								<fo:table-column column-width="35mm" />


								<fo:table-body>






									<!-- Card Number -->
									<fo:table-row>
										<fo:table-cell>
											<fo:block color="#04417A" font-size="10px">
												Card Number:
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block color="#04417A" font-size="10px">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">:
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>
									</fo:table-row>


									Credit Limit
									<fo:table-row>
										<fo:table-cell>
											<fo:block color="#04417A" font-size="10px">
												Credit Limit:
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block color="#04417A" font-size="10px">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">:
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell number-rows-spanned="3">
											<fo:block>
												<fo:external-graphic content-height="100%"
													content-width="1.5in" scaling="uniform"
													src="url(Resources/VisaMAster.PNG)" />
											</fo:block>
										</fo:table-cell>
									</fo:table-row>

									Client code no
									<fo:table-row>
										<fo:table-cell>
											<fo:block color="#04417A" font-size="10px">
												Client code no.:
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block color="#04417A" font-size="10px">

												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">:
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>

									</fo:table-row>

									Statement date
									<fo:table-row>
										<fo:table-cell border-right="1pt solid  red">
											<fo:block color="#04417A" font-size="10px">
												Statement date:
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block color="#04417A" font-size="10px">

												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">:
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>

									</fo:table-row>


								</fo:table-body>
							</fo:table>
						</fo:block>







						<!-- StatementTable -->
						<fo:block margin-top="0.7cm">
							<fo:table>
								<fo:table-column column-width="30mm"
									border="0.5pt solid #04417a" />
								<fo:table-column column-width="40mm"
									border="0.5pt solid #04417a" />
								<fo:table-column column-width="50mm"
									border="0.5pt solid #04417a" />
								<fo:table-column column-width="30mm"
									border="0.5pt solid #04417a" />
								<fo:table-column column-width="30mm"
									border="0.5pt solid #04417a" />

								<fo:table-header>
									<fo:table-row background-color="#e6eaf2"
										border="0.5pt solid #04417a">
										<fo:table-cell text-align="center" padding="8px">
											<fo:block font-size="8px" color="#04417a">Date
											</fo:block>

											<fo:block line-height="2mm" font-size="8px" color="#04417a">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>
										<fo:table-cell text-align="center" padding="8px">

											<fo:block font-size="8px" color="#04417a">
												Reference No.
											</fo:block>

											<fo:block font-size="8px" color="#04417a">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">
													التاريخ
												</fo:bidi-override>

											</fo:block>
										</fo:table-cell>

										<fo:table-cell text-align="center" padding="8px">

											<fo:block font-size="8px" color="#04417a">Merchant/City
											</fo:block>

											<fo:block font-size="8px" color="#04417a">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">
													التاريخ
												</fo:bidi-override>
											</fo:block>

										</fo:table-cell>

										<fo:table-cell text-align="center" padding="8px">
											<fo:block font-size="8px" color="#04417a">Amount
											</fo:block>
											<fo:block font-size="8px" color="#04417a">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>

										<fo:table-cell text-align="center" padding="8px">
											<fo:block font-size="8px" color="#04417a">KD Amount
											</fo:block>
											<fo:block font-size="8px" color="#04417a">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-header>
								<fo:table-body>
									<xsl:for-each select="employees/employee">
										<fo:table-row border="0.5pt solid #04417a">
											<fo:table-cell text-align="center">
												<fo:block font-size="8pt" font-family="sans-serif"
													font-style="normal" vertical-align="middle">
													<xsl:value-of select="id" />
												</fo:block>
											</fo:table-cell>
											<fo:table-cell text-align="center">
												<fo:block font-size="8pt" font-family="sans-serif"
													font-style="normal" vertical-align="middle"> No.</fo:block>
											</fo:table-cell>
											<fo:table-cell text-align="center">
												<fo:block font-size="8pt" font-family="sans-serif"
													font-style="normal" vertical-align="middle">Merchant/City</fo:block>
											</fo:table-cell>
											<fo:table-cell text-align="center">
												<fo:block font-size="8pt" font-family="sans-serif"
													font-style="normal" vertical-align="middle">Amount</fo:block>
											</fo:table-cell>
											<fo:table-cell text-align="center">
												<fo:block font-size="8pt" font-family="sans-serif"
													font-style="normal" vertical-align="middle">KD Amount</fo:block>
											</fo:table-cell>
										</fo:table-row>
									</xsl:for-each>

									<fo:table-row background-color="#e6eaf2"
										border="0.5pt solid #04417a">
										<fo:table-cell border-right="1pt solid  #e6eaf2">
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell border-right="1pt solid  #e6eaf2">
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell border-right="1pt solid  #e6eaf2">
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell text-align="center">
											<fo:block font-size="8px" color="#04417a">Total
											</fo:block>
											<fo:block font-size="8px" color="#04417a">
												<fo:bidi-override unicode-bidi="embed"
													direction="ltr">
													التاريخ
												</fo:bidi-override>
											</fo:block>
										</fo:table-cell>
									</fo:table-row>

									<fo:table-row>
										<fo:table-cell border-left="1pt solid  white"
											border-bottom="1pt solid  white">
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="1pt solid  white"
											border-bottom="1pt solid  white">
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="1pt solid  white"
											border-bottom="1pt solid  white">
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell border-left="1pt solid  white"
											border-bottom="1pt solid  white">
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell text-align="center">
											<fo:block font-size="8px" color="#04417a">12484 KD</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-body>
							</fo:table>
						</fo:block>

						<!-- dotted line -->
						<fo:block margin-top="10px">
							<fo:table>
								<fo:table-column column-width="180mm" />
								<fo:table-body>
									<fo:table-row>
										<fo:table-cell border-bottom="dotted">
											<fo:block>

											</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-body>
							</fo:table>
						</fo:block>

						<fo:block margin-top="15px" margin-right="10mm">

							<fo:table  border="0.5pt solid #04417a" background-color="#e6eaf2">
								<fo:table-column column-width="50mm" />
								<fo:table-column column-width="30mm" />
								<fo:table-column column-width="20mm" />
								<fo:table-column column-width="30mm" />
								<fo:table-column column-width="50mm" />
								<fo:table-body>
									<fo:table-row>
										<fo:table-cell text-align="left">
											<fo:block>Payment Order</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block></fo:block>
										</fo:table-cell>
										<fo:table-cell text-align="right">
											<fo:block>Arabic</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-body>
							</fo:table>
						</fo:block>
						<fo:block></fo:block>

						<fo:block>
							<fo:table>
								<fo:table-column column-width="100mm" />
								<fo:table-column column-width="100mm" />
								<fo:table-body>
									<fo:table-row>
										<fo:table-cell>
											<fo:block>

												<!-- list start -->
												<fo:list-block>
													<!-- list item -->
													<fo:list-item>
														<!-- insert a bullet -->
														<fo:list-item-label end-indent="label-end()">
															<fo:block>
																<fo:inline font-size="15pt" font-family="Arial">
																	&#x2022; </fo:inline>
															</fo:block>
														</fo:list-item-label>
														<!-- list text -->
														<fo:list-item-body start-indent="body-start()">
															<fo:block>
																<fo:block>
																	Haijsa
																	<fo:inline font-weight="bold"> Rahul</fo:inline>
																	kjdnkjaj
																</fo:block>
															</fo:block>
														</fo:list-item-body>
													</fo:list-item>
													[other list items...]
													<fo:list-item>
														<!-- insert a bullet -->
														<fo:list-item-label end-indent="label-end()">
															<fo:block>
																<fo:inline font-size="15pt" font-family="Arial">
																	&#x2022; </fo:inline>
															</fo:block>
														</fo:list-item-label>
														<!-- list text -->
														<fo:list-item-body start-indent="body-start()">
															<fo:block>
																<fo:block>
																	Haijsa
																	<fo:inline font-weight="bold"> Rahul</fo:inline>
																	kjdnkjaj
																</fo:block>
															</fo:block>
														</fo:list-item-body>
													</fo:list-item>
												</fo:list-block>
												<!-- end list -->
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block writing-mode="rl-tb" language="ar">
												<!-- list start -->
												<fo:list-block>
													<!-- list item -->
													<fo:list-item>
														<!-- insert a bullet -->
														<fo:list-item-label end-indent="label-end()">
															<fo:block>
																<fo:inline font-size="15pt" font-family="Arial">
																	&#x2022; </fo:inline>
															</fo:block>
														</fo:list-item-label>
														<!-- list text -->
														<fo:list-item-body start-indent="body-start()">
															<fo:block>
																<fo:block>
																	Haijsa
																	<fo:inline font-weight="bold"> Rahul</fo:inline>
																	kjdnkjaj
																</fo:block>
															</fo:block>
														</fo:list-item-body>
													</fo:list-item>
													[other list items...]
													<fo:list-item>
														<!-- insert a bullet -->
														<fo:list-item-label end-indent="label-end()">
															<fo:block>
																<fo:inline font-size="15pt" font-family="Arial">
																	&#x2022; </fo:inline>
															</fo:block>
														</fo:list-item-label>
														<!-- list text -->
														<fo:list-item-body start-indent="body-start()">
															<fo:block>
																<fo:block>
																	Haijsa
																	<fo:inline font-weight="bold"> Rahul</fo:inline>
																	kjdnkjaj
																</fo:block>
															</fo:block>
														</fo:list-item-body>
													</fo:list-item>
												</fo:list-block>
												<!-- end list -->
											</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-body>
							</fo:table>
						</fo:block>
					</fo:block-container>

					<fo:block-container writing-mode="rl-tb"
						language="ar">
						<fo:block>

							<fo:table>
								<fo:table-column column-width="100mm" />
								<fo:table-column column-width="100mm" />
								<fo:table-body>
									<fo:table-row>
										<fo:table-cell>
											<fo:block>

												<!-- list start -->
												<fo:list-block>
													<!-- list item -->
													<fo:list-item>
														<!-- insert a bullet -->
														<fo:list-item-label end-indent="label-end()">
															<fo:block>
																<fo:inline font-size="15pt" font-family="Arial">
																	&#x2022; </fo:inline>
															</fo:block>
														</fo:list-item-label>
														<!-- list text -->
														<fo:list-item-body start-indent="body-start()">
															<fo:block>
																<fo:block>
																	Haijsa
																	<fo:inline font-weight="bold"> Rahul</fo:inline>
																	kjdnkjaj
																</fo:block>
															</fo:block>
														</fo:list-item-body>
													</fo:list-item>
													[other list items...]
													<fo:list-item>
														<!-- insert a bullet -->
														<fo:list-item-label end-indent="label-end()">
															<fo:block>
																<fo:inline font-size="15pt" font-family="Arial">
																	&#x2022; </fo:inline>
															</fo:block>
														</fo:list-item-label>
														<!-- list text -->
														<fo:list-item-body start-indent="body-start()">
															<fo:block>
																<fo:block>
																	Haijsa
																	<fo:inline font-weight="bold"> Rahul</fo:inline>
																	kjdnkjaj
																</fo:block>
															</fo:block>
														</fo:list-item-body>
													</fo:list-item>
												</fo:list-block>
												<!-- end list -->
											</fo:block>
										</fo:table-cell>
										<fo:table-cell>
											<fo:block>
												<!-- list start -->
												<fo:list-block>
													<!-- list item -->
													<fo:list-item>
														<!-- insert a bullet -->
														<fo:list-item-label end-indent="label-end()">
															<fo:block>
																<fo:inline font-size="15pt" font-family="Arial">
																	&#x2022; </fo:inline>
															</fo:block>
														</fo:list-item-label>
														<!-- list text -->
														<fo:list-item-body start-indent="body-start()">
															<fo:block>
																<fo:block>
																	Haijsa
																	<fo:inline font-weight="bold"> Rahul</fo:inline>
																	kjdnkjaj
																</fo:block>
															</fo:block>
														</fo:list-item-body>
													</fo:list-item>
													[other list items...]
													<fo:list-item>
														<!-- insert a bullet -->
														<fo:list-item-label end-indent="label-end()">
															<fo:block>
																<fo:inline font-size="15pt" font-family="Arial">
																	&#x2022; </fo:inline>
															</fo:block>
														</fo:list-item-label>
														<!-- list text -->
														<fo:list-item-body start-indent="body-start()">
															<fo:block>
																<fo:block>
																	Haijsa
																	<fo:inline font-weight="bold"> Rahul</fo:inline>
																	kjdnkjaj
																</fo:block>
															</fo:block>
														</fo:list-item-body>
													</fo:list-item>
												</fo:list-block>
												<!-- end list -->
											</fo:block>
										</fo:table-cell>
									</fo:table-row>
								</fo:table-body>
							</fo:table>
						</fo:block>


					</fo:block-container>
				</fo:flow>
			</fo:page-sequence>


			<fo:page-sequence master-reference="lastPage">
				<fo:static-content flow-name="xsl-region-before">
					<fo:block-container margin-top="3cm" height="0.5cm"
						width="19cm" top="0.01mm" position="absolute">
						<fo:block margin-top="0.75cm">
							<fo:external-graphic content-width="21cm"
								scaling="uniform" src="url(Resources/headerGBK.PNG)" />
						</fo:block>
					</fo:block-container>
				</fo:static-content>
				<fo:static-content flow-name="xsl-region-after">
					<fo:block-container margin-top="1.25cm" height="0.5cm"
						width="19cm" top="0.01mm" position="absolute">
						<fo:block>
							<fo:external-graphic content-width="21cm"
								scaling="uniform" src="url(Resources/footer.PNG)" />
						</fo:block>
					</fo:block-container>
				</fo:static-content>
				<fo:flow flow-name="xsl-region-body">
					<fo:block-container>
						<fo:block>
							<fo:external-graphic content-width="18cm"
								scaling="uniform" src="url(Resources/cc/cctemp1.PNG)" />
						</fo:block>
						<fo:block>
							<fo:external-graphic content-width="18cm"
								scaling="uniform" src="url(Resources/cc/cctemp2.PNG)" />
						</fo:block>
						<fo:block>
							<fo:external-graphic content-width="18cm"
								scaling="uniform" src="url(Resources/cc/cctemp3.PNG)" />
						</fo:block>


					</fo:block-container>
				</fo:flow>
			</fo:page-sequence>


		</fo:root>
	</xsl:template>
</xsl:stylesheet>


