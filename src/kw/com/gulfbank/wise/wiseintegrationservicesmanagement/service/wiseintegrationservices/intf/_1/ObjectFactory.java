
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DownloadWiseDocument_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "DownloadWiseDocument");
    private final static QName _GetWiseDocumentsDetails_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "GetWiseDocumentsDetails");
    private final static QName _GetWiseInvestmentDetails_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "GetWiseInvestmentDetails");
    private final static QName _GetWiseDocumentsDetailsResponse_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "GetWiseDocumentsDetailsResponse");
    private final static QName _GenerateSessionResponse_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "GenerateSessionResponse");
    private final static QName _DownloadWiseDocumentResponse_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "DownloadWiseDocumentResponse");
    private final static QName _GetWiseInvestmentDetailsResponse_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "GetWiseInvestmentDetailsResponse");
    private final static QName _Fault_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "Fault");
    private final static QName _HeaderDetails_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "HeaderDetails");
    private final static QName _GenerateSession_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "GenerateSession");
    private final static QName _GetWiseDocumentsDetailsReplyDocumentsDetailsList_QNAME = new QName("", "DocumentsDetailsList");
    private final static QName _GetWiseInvestmentDetailsReplyPortfolioDetailsList_QNAME = new QName("", "PortfolioDetailsList");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetWiseInvestmentDetails }
     * 
     */
    public GetWiseInvestmentDetails createGetWiseInvestmentDetails() {
        return new GetWiseInvestmentDetails();
    }

    /**
     * Create an instance of {@link GetWiseDocumentsDetailsResponse }
     *
     */
    public GetWiseDocumentsDetailsResponse createGetWiseDocumentsDetailsResponse() {
        return new GetWiseDocumentsDetailsResponse();
    }

    /**
     * Create an instance of {@link GetWiseDocumentsDetails }
     *
     */
    public GetWiseDocumentsDetails createGetWiseDocumentsDetails() {
        return new GetWiseDocumentsDetails();
    }

    /**
     * Create an instance of {@link DownloadWiseDocument }
     *
     */
    public DownloadWiseDocument createDownloadWiseDocument() {
        return new DownloadWiseDocument();
    }

    /**
     * Create an instance of {@link DownloadWiseDocumentResponse }
     *
     */
    public DownloadWiseDocumentResponse createDownloadWiseDocumentResponse() {
        return new DownloadWiseDocumentResponse();
    }

    /**
     * Create an instance of {@link Fault }
     *
     */
    public Fault createFault() {
        return new Fault();
    }

    /**
     * Create an instance of {@link HeaderDetails }
     *
     */
    public HeaderDetails createHeaderDetails() {
        return new HeaderDetails();
    }

    /**
     * Create an instance of {@link GenerateSession }
     *
     */
    public GenerateSession createGenerateSession() {
        return new GenerateSession();
    }

    /**
     * Create an instance of {@link GetWiseInvestmentDetailsResponse }
     *
     */
    public GetWiseInvestmentDetailsResponse createGetWiseInvestmentDetailsResponse() {
        return new GetWiseInvestmentDetailsResponse();
    }

    /**
     * Create an instance of {@link GenerateSessionResponse }
     *
     */
    public GenerateSessionResponse createGenerateSessionResponse() {
        return new GenerateSessionResponse();
    }

    /**
     * Create an instance of {@link PortfolioDetailsList }
     *
     */
    public PortfolioDetailsList createPortfolioDetailsList() {
        return new PortfolioDetailsList();
    }

    /**
     * Create an instance of {@link DownloadWiseDocumentReply }
     *
     */
    public DownloadWiseDocumentReply createDownloadWiseDocumentReply() {
        return new DownloadWiseDocumentReply();
    }

    /**
     * Create an instance of {@link DocumentsDetailsList }
     *
     */
    public DocumentsDetailsList createDocumentsDetailsList() {
        return new DocumentsDetailsList();
    }

    /**
     * Create an instance of {@link GenerateSessionRequest }
     *
     */
    public GenerateSessionRequest createGenerateSessionRequest() {
        return new GenerateSessionRequest();
    }

    /**
     * Create an instance of {@link GetWiseInvestmentDetailsReply }
     *
     */
    public GetWiseInvestmentDetailsReply createGetWiseInvestmentDetailsReply() {
        return new GetWiseInvestmentDetailsReply();
    }

    /**
     * Create an instance of {@link GetWiseInvestmentDetailsRequest }
     *
     */
    public GetWiseInvestmentDetailsRequest createGetWiseInvestmentDetailsRequest() {
        return new GetWiseInvestmentDetailsRequest();
    }

    /**
     * Create an instance of {@link BusinessException }
     *
     */
    public BusinessException createBusinessException() {
        return new BusinessException();
    }

    /**
     * Create an instance of {@link HeaderDetailsRequest }
     *
     */
    public HeaderDetailsRequest createHeaderDetailsRequest() {
        return new HeaderDetailsRequest();
    }

    /**
     * Create an instance of {@link GenerateSessionReply }
     *
     */
    public GenerateSessionReply createGenerateSessionReply() {
        return new GenerateSessionReply();
    }

    /**
     * Create an instance of {@link GetWiseDocumentsDetailsReply }
     *
     */
    public GetWiseDocumentsDetailsReply createGetWiseDocumentsDetailsReply() {
        return new GetWiseDocumentsDetailsReply();
    }

    /**
     * Create an instance of {@link PortfolioDetails }
     *
     */
    public PortfolioDetails createPortfolioDetails() {
        return new PortfolioDetails();
    }

    /**
     * Create an instance of {@link DownloadWiseDocumentRequest }
     *
     */
    public DownloadWiseDocumentRequest createDownloadWiseDocumentRequest() {
        return new DownloadWiseDocumentRequest();
    }

    /**
     * Create an instance of {@link DocumentsDetails }
     *
     */
    public DocumentsDetails createDocumentsDetails() {
        return new DocumentsDetails();
    }

    /**
     * Create an instance of {@link GetWiseDocumentsDetailsRequest }
     *
     */
    public GetWiseDocumentsDetailsRequest createGetWiseDocumentsDetailsRequest() {
        return new GetWiseDocumentsDetailsRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadWiseDocument }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "DownloadWiseDocument")
    public JAXBElement<DownloadWiseDocument> createDownloadWiseDocument(DownloadWiseDocument value) {
        return new JAXBElement<DownloadWiseDocument>(_DownloadWiseDocument_QNAME, DownloadWiseDocument.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWiseDocumentsDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "GetWiseDocumentsDetails")
    public JAXBElement<GetWiseDocumentsDetails> createGetWiseDocumentsDetails(GetWiseDocumentsDetails value) {
        return new JAXBElement<GetWiseDocumentsDetails>(_GetWiseDocumentsDetails_QNAME, GetWiseDocumentsDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWiseInvestmentDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "GetWiseInvestmentDetails")
    public JAXBElement<GetWiseInvestmentDetails> createGetWiseInvestmentDetails(GetWiseInvestmentDetails value) {
        return new JAXBElement<GetWiseInvestmentDetails>(_GetWiseInvestmentDetails_QNAME, GetWiseInvestmentDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWiseDocumentsDetailsResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "GetWiseDocumentsDetailsResponse")
    public JAXBElement<GetWiseDocumentsDetailsResponse> createGetWiseDocumentsDetailsResponse(GetWiseDocumentsDetailsResponse value) {
        return new JAXBElement<GetWiseDocumentsDetailsResponse>(_GetWiseDocumentsDetailsResponse_QNAME, GetWiseDocumentsDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateSessionResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "GenerateSessionResponse")
    public JAXBElement<GenerateSessionResponse> createGenerateSessionResponse(GenerateSessionResponse value) {
        return new JAXBElement<GenerateSessionResponse>(_GenerateSessionResponse_QNAME, GenerateSessionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DownloadWiseDocumentResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "DownloadWiseDocumentResponse")
    public JAXBElement<DownloadWiseDocumentResponse> createDownloadWiseDocumentResponse(DownloadWiseDocumentResponse value) {
        return new JAXBElement<DownloadWiseDocumentResponse>(_DownloadWiseDocumentResponse_QNAME, DownloadWiseDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetWiseInvestmentDetailsResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "GetWiseInvestmentDetailsResponse")
    public JAXBElement<GetWiseInvestmentDetailsResponse> createGetWiseInvestmentDetailsResponse(GetWiseInvestmentDetailsResponse value) {
        return new JAXBElement<GetWiseInvestmentDetailsResponse>(_GetWiseInvestmentDetailsResponse_QNAME, GetWiseInvestmentDetailsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Fault }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "Fault")
    public JAXBElement<Fault> createFault(Fault value) {
        return new JAXBElement<Fault>(_Fault_QNAME, Fault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HeaderDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "HeaderDetails")
    public JAXBElement<HeaderDetails> createHeaderDetails(HeaderDetails value) {
        return new JAXBElement<HeaderDetails>(_HeaderDetails_QNAME, HeaderDetails.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GenerateSession }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", name = "GenerateSession")
    public JAXBElement<GenerateSession> createGenerateSession(GenerateSession value) {
        return new JAXBElement<GenerateSession>(_GenerateSession_QNAME, GenerateSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocumentsDetailsList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "DocumentsDetailsList", scope = GetWiseDocumentsDetailsReply.class)
    public JAXBElement<DocumentsDetailsList> createGetWiseDocumentsDetailsReplyDocumentsDetailsList(DocumentsDetailsList value) {
        return new JAXBElement<DocumentsDetailsList>(_GetWiseDocumentsDetailsReplyDocumentsDetailsList_QNAME, DocumentsDetailsList.class, GetWiseDocumentsDetailsReply.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PortfolioDetailsList }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "", name = "PortfolioDetailsList", scope = GetWiseInvestmentDetailsReply.class)
    public JAXBElement<PortfolioDetailsList> createGetWiseInvestmentDetailsReplyPortfolioDetailsList(PortfolioDetailsList value) {
        return new JAXBElement<PortfolioDetailsList>(_GetWiseInvestmentDetailsReplyPortfolioDetailsList_QNAME, PortfolioDetailsList.class, GetWiseInvestmentDetailsReply.class, value);
    }

}
