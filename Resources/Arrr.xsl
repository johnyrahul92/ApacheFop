<?xml version="1.0" encoding="utf-8"?>
<xsl:stylesheet xml:lang="afb" xmlns:xsl="http://www.w3.org/1999/XSL/Transform" xml:space="default" xmlns:fo="http://www.w3.org/1999/XSL/Format" version="1.0" xmlns:java="http://xml.apache.org/xslt/java" exclude-result-prefixes="java">
    <xsl:output doctype-public="-//W3C//DTD HTML 4.01 Transitional//EN" method="pdf" indent="yes" encoding="utf-8"/>
    
<xsl:template match="/">
<fo:root xmlns:fo="http://www.w3.org/1999/XSL/Format" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:zr="http://www.intersystems.com/zenreports" xmlns:xs="http://www.w3.org/2001/XMLSchema" xmlns:svg="http://www.w3.org/2000/svg">
   <fo:layout-master-set>
      <fo:simple-page-master master-name="main" margin-right="10mm" margin-left="10mm" margin-top="10mm" margin-bottom="10mm" reference-orientation="0" page-width="297mm" page-height="210mm">
         <fo:region-body margin-bottom="11.5mm" margin-top="17.5mm"/>
         <fo:region-before extent="17.5mm" display-align="inherit"/>
         <fo:region-after extent="11.5mm" display-align="after"/>
      </fo:simple-page-master>
   </fo:layout-master-set>
   <fo:page-sequence master-reference="main">
      <fo:title/>
      <fo:static-content flow-name="xsl-region-before">
         <fo:block width="100%">
            <fo:block>
               <fo:table font-family="Arial" font-size="10pt" font-weight="normal" text-align="left" width="100%" table-layout="fixed">
                  <fo:table-column column-width="50%"/>
                  <fo:table-column column-width="50%"/>
                  <fo:table-body>
                     <fo:table-row>
                        <fo:table-cell>
                           <fo:block>
                              <fo:inline>إ​ل​غ​ا​ء​ ​ا​ل​ف​و​ا​ت​ي​ر​ ​ت​ق​ر​ي​ر</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell>
                           <fo:block>
                              <fo:inline>
                                 <fo:block text-align="right">
                                    <fo:external-graphic content-height="12mm" content-width="2cm" src="url(http://mefountest/t69/Trak/app/web/images/TRAK/img_TrakHealthLogo1107.gif)"/>
                                 </fo:block>
                              </fo:inline>
                           </fo:block>
                        </fo:table-cell>
                     </fo:table-row>
                  </fo:table-body>
               </fo:table>
            </fo:block>
            <fo:block line-height="125%" text-align="left">
               <fo:leader leader-length="100%" leader-pattern="rule" rule-thickness="1px"/>
            </fo:block>
         </fo:block>
      </fo:static-content>
      <fo:static-content flow-name="xsl-region-after">
         <fo:block>
            <fo:block line-height="125%" text-align="left">
               <fo:leader leader-length="100%" leader-pattern="rule" rule-thickness="1px"/>
            </fo:block>
            <fo:block>
               <fo:table font-family="Arial" font-size="10pt" font-weight="normal" table-layout="fixed" width="100%">
                  <fo:table-column column-width="proportional-column-width(1)"/>
                  <fo:table-column column-width="proportional-column-width(1)"/>
                  <fo:table-body>
                     <fo:table-row>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" text-align="left">
                           <fo:block>
                              <fo:inline>
                                 <fo:inline font-family="Arial" font-size="10pt" font-weight="normal">
Created on 
</fo:inline>
                                 <fo:inline font-family="Arial" font-size="10pt" font-weight="normal">1​7​ ​F​e​b​ ​2​0​1​0​ ​1​0​:​1​0</fo:inline>
                                 <fo:inline font-family="Arial" font-size="10pt" font-weight="normal">
by
</fo:inline>
                                 <fo:inline font-family="Arial" font-size="10pt" font-weight="normal"/>
                              </fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" text-align="right">
                           <fo:block>
                              <fo:inline>
                                 <fo:inline font-family="Arial" font-size="10pt" font-weight="normal">
Page
</fo:inline>
                                 <fo:inline font-family="Arial" font-size="10pt" font-weight="normal">
                                    <fo:page-number/> of <fo:page-number-citation ref-id="%ZENLastPage"/>
                                 </fo:inline>
                              </fo:inline>
                           </fo:block>
                        </fo:table-cell>
                     </fo:table-row>
                  </fo:table-body>
               </fo:table>
            </fo:block>
         </fo:block>
      </fo:static-content>
      <fo:flow flow-name="xsl-region-body">
         <fo:block>
            <fo:block>
               <fo:block>
                  <fo:table font-family="Arial" font-size="16pt" font-weight="bold" text-align="center" width="100%" table-layout="fixed">
                     <fo:table-column column-width="100%"/>
                     <fo:table-body>
                        <fo:table-row>
                           <fo:table-cell>
                              <fo:block>
                                 <fo:inline>إ​ل​غ​ا​ء​ ​ا​ل​ف​و​ا​ت​ي​ر​ ​ت​ق​ر​ي​ر</fo:inline>
                              </fo:block>
                           </fo:table-cell>
                        </fo:table-row>
                     </fo:table-body>
                  </fo:table>
               </fo:block>
               <fo:block>
                  <fo:table font-family="Arial" font-size="14pt" font-weight="normal" text-align="center" width="100%" keep-with-next="always" table-layout="fixed">
                     <fo:table-column column-width="proportional-column-width(1)"/>
                     <fo:table-body>
                        <fo:table-row>
                           <fo:table-cell>
                              <fo:block>
                                 <fo:inline>
                                    <fo:inline>الحساب</fo:inline>
                                    <fo:inline>G​e​n​e​r​a​l​ ​H​o​s​p​i​t​a​l</fo:inline>
                                 </fo:inline>
                              </fo:block>
                           </fo:table-cell>
                        </fo:table-row>
                     </fo:table-body>
                  </fo:table>
               </fo:block>
               <fo:block>
                  <fo:table font-family="Arial" font-size="14pt" font-weight="normal" text-align="center" width="100%" keep-with-next="always" table-layout="fixed">
                     <fo:table-column column-width="proportional-column-width(1)"/>
                     <fo:table-body>
                        <fo:table-row>
                           <fo:table-cell>
                              <fo:block>
                                 <fo:inline>
                                    <fo:inline>
من
</fo:inline>
                                    <fo:inline>0​1​ ​J​a​n​ ​2​0​0​5</fo:inline>
                                    <fo:inline>
إلى
</fo:inline>
                                    <fo:inline>3​1​ ​D​e​c​ ​2​0​0​9</fo:inline>
                                 </fo:inline>
                              </fo:block>
                           </fo:table-cell>
                        </fo:table-row>
                     </fo:table-body>
                  </fo:table>
               </fo:block>
               <fo:inline/>
               <fo:block line-height="125%" text-align="left">
                  <fo:leader leader-length="100%" leader-pattern="rule" rule-thickness="1px"/>
               </fo:block>
               <fo:block>
                  <fo:leader leader-pattern="space" rule-thickness="1px"/>
               </fo:block>
            </fo:block>
            <fo:block>
               <fo:table keep-with-next="always" table-layout="fixed" width="100%">
                  <fo:table-column column-width="proportional-column-width(1)"/>
                  <fo:table-body>
                     <fo:table-row>
                        <fo:table-cell font-family="Arial" font-size="12pt" font-weight="bold" text-align="left" line-height="2em" display-align="after">
                           <fo:block>
                              <fo:inline>
                                 <fo:inline font-family="Arial" font-size="12pt" font-weight="bold" text-align="left" line-height="2em" display-align="after">
المستشفى :
</fo:inline>
                                 <fo:inline font-family="Arial" font-size="12pt" font-weight="bold" text-align="left" line-height="2em" display-align="after">G​e​n​e​r​a​l​ ​H​o​s​p​i​t​a​l</fo:inline>
                              </fo:inline>
                           </fo:block>
                        </fo:table-cell>
                     </fo:table-row>
                  </fo:table-body>
               </fo:table>
            </fo:block>
            <fo:block line-height="1mm">
               <fo:leader leader-pattern="space" rule-thickness="1px"/>
            </fo:block>
            <fo:block>
               <fo:table font-family="Arial" font-size="10pt" font-weight="bold" text-align="left" keep-with-next="always" table-layout="fixed" width="100%">
                  <fo:table-column column-width="proportional-column-width(1)"/>
                  <fo:table-body>
                     <fo:table-row>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="bold" text-align="left" line-height="1.5em">
                           <fo:block>
                              <fo:inline>
                                 <fo:inline font-family="Arial" font-size="10pt" font-weight="bold" text-align="left" line-height="1.5em">
مستخدم:
</fo:inline>
                                 <fo:inline font-family="Arial" font-size="10pt" font-weight="bold" text-align="left" line-height="1.5em">M​r​ ​N​ ​L​a​p​p​i​n</fo:inline>
                              </fo:inline>
                           </fo:block>
                        </fo:table-cell>
                     </fo:table-row>
                  </fo:table-body>
               </fo:table>
            </fo:block>
            <fo:block line-height="1mm">
               <fo:leader leader-pattern="space" rule-thickness="1px"/>
            </fo:block>
            <fo:block>
               <fo:table keep-with-next.within-line="auto" keep-with-previous="always" width="100%" table-layout="fixed">
                  <fo:table-column column-width="3%"/>
                  <fo:table-column column-width="10%"/>
                  <fo:table-column column-width="20%"/>
                  <fo:table-column column-width="10%"/>
                  <fo:table-column column-width="10%"/>
                  <fo:table-column column-width="10%"/>
                  <fo:table-column column-width="10%"/>
                  <fo:table-column column-width="10%"/>
                  <fo:table-column column-width="10%"/>
                  <fo:table-column column-width="10%"/>
                  <fo:table-header>
                     <fo:table-row>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>رقم</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>MRN</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>إسم المريض</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>الحلقة:</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>فاتورة#</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>مبلغ الفاتورة</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>تاريخ ملغاة</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>إلغاء العقل</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>هوية المستخدم</fo:block>
                        </fo:table-cell>
                        <fo:table-cell keep-with-next.within-line="auto" font-family="Arial" font-size="10pt" font-weight="bold" wrap-option="wrap" padding-before="2pt" border-after-style="solid" border-after-color="black" border-after-width="1pt">
                           <fo:block>اسم المستخدم</fo:block>
                        </fo:table-cell>
                     </fo:table-row>
                  </fo:table-header>
                  <fo:table-body>
                     <fo:table-row>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>1</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>0​0​0​3​0​0​6​2​7</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>A​B​O​T​T​S​ ​L​a​m​a​ ​ا​ب​و​ت​س​ ​ل​ا​م​ا</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>O​0​0​0​0​0​0​0​3​2​7</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>I​0​0​0​0​0​0​1​0</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>1​0​0​0</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>0​7​/​1​2​/​2​0​0​9</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>B​i​l​l​e​d​ ​i​n​ ​E​r​r​o​r</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>C​G​E​1​A​1</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>M​r​ ​N​ ​L​a​p​p​i​n</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                     </fo:table-row>
                     <fo:table-row>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>2</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>0​0​0​0​0​0​3​4​0</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>L​O​L​W​A​ ​L​a​m​a​ ​ل​و​ل​و​ا​ ​ل​ا​م​ا</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>I​0​0​0​0​0​0​0​2​5​7</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>I​0​0​0​0​0​0​1​2</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>3​0​0​0</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>0​7​/​1​2​/​2​0​0​9</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>B​i​l​l​e​d​ ​i​n​ ​E​r​r​o​r</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>C​G​E​1​A​1</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>M​r​ ​N​ ​L​a​p​p​i​n</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                     </fo:table-row>
                     <fo:table-row>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>3</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>0​0​0​0​0​0​3​4​0</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>L​O​L​W​A​ ​L​a​m​a​ ​ل​و​ل​و​ا​ ​ل​ا​م​ا</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>I​0​0​0​0​0​0​0​2​5​7</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>I​0​0​0​0​0​0​1​1</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>1​0​0​0</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>0​7​/​1​2​/​2​0​0​9</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>B​i​l​l​e​d​ ​i​n​ ​E​r​r​o​r</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>C​G​E​1​A​1</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                        <fo:table-cell font-family="Arial" font-size="10pt" font-weight="normal" display-align="before" padding-before="2pt">
                           <fo:block>
                              <fo:inline>M​r​ ​N​ ​L​a​p​p​i​n</fo:inline>
                           </fo:block>
                        </fo:table-cell>
                     </fo:table-row>
                  </fo:table-body>
               </fo:table>
            </fo:block>
         </fo:block>
         <fo:block id="%ZENLastPage"/>
      </fo:flow>
   </fo:page-sequence>
</fo:root>
	</xsl:template>
</xsl:stylesheet>