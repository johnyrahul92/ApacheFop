<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xml:lang="afb" version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xmlns:fo="http://www.w3.org/1999/XSL/Format"
	exclude-result-prefixes="fo">

	<xsl:output doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN"
		method="pdf" indent="yes" encoding="utf-8" />
	<xsl:template match="/">
		<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format"
			xmlns:fox="http://xmlgraphics.apache.org/fop/extensions">
			<fo:layout-master-set>
				<fo:simple-page-master master-name="A4">
					<fo:region-body />
				</fo:simple-page-master>
			</fo:layout-master-set>
			<fo:page-sequence master-reference="A4">
				<fo:flow flow-name="xsl-region-body">
					<fo:block-container>
						<fo:block>Hello W3Schools</fo:block>
						<fo:block>
						</fo:block>
					</fo:block-container>
				</fo:flow>
			</fo:page-sequence>

			
			
			  <fox:external-document src="testlowerversion.pdf" />


		</fo:root>
	</xsl:template>
</xsl:stylesheet>


