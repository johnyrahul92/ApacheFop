
package kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1;

import javax.xml.namespace.QName;
import javax.xml.ws.*;
import java.net.MalformedURLException;
import java.net.URL;


/**
 *
 * 		URL where the service is hosted. (To be updated with test/production server URL)
 *
 *
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 *
 */
@WebServiceClient(name = "WiseIntegrationServices", targetNamespace = "http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", wsdlLocation = "https://testgbonline.e-gulfbank.com/WISE/WiseIntegrationServices.wsdl")
public class WiseIntegrationServices_Service
    extends Service
{

    private final static URL WISEINTEGRATIONSERVICES_WSDL_LOCATION;
    private final static WebServiceException WISEINTEGRATIONSERVICES_EXCEPTION;
    private final static QName WISEINTEGRATIONSERVICES_QNAME = new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "WiseIntegrationServices");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://testgbonline.e-gulfbank.com/WISE/WiseIntegrationServices.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WISEINTEGRATIONSERVICES_WSDL_LOCATION = url;
        WISEINTEGRATIONSERVICES_EXCEPTION = e;
    }

    public WiseIntegrationServices_Service() {
        super(__getWsdlLocation(), WISEINTEGRATIONSERVICES_QNAME);
    }

    public WiseIntegrationServices_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WISEINTEGRATIONSERVICES_QNAME, features);
    }

    public WiseIntegrationServices_Service(URL wsdlLocation) {
        super(wsdlLocation, WISEINTEGRATIONSERVICES_QNAME);
    }

    public WiseIntegrationServices_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WISEINTEGRATIONSERVICES_QNAME, features);
    }

    public WiseIntegrationServices_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WiseIntegrationServices_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns WiseIntegrationServices
     */
    @WebEndpoint(name = "WiseIntegrationServices")
    public WiseIntegrationServices getWiseIntegrationServices() {
        return super.getPort(new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "WiseIntegrationServices"), WiseIntegrationServices.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WiseIntegrationServices
     */
    @WebEndpoint(name = "WiseIntegrationServices")
    public WiseIntegrationServices getWiseIntegrationServices(WebServiceFeature... features) {
        return super.getPort(new QName("http://wise.gulfbank.com.kw/wiseintegrationservicesmanagement/service/wiseintegrationservices/intf/1", "WiseIntegrationServices"), WiseIntegrationServices.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WISEINTEGRATIONSERVICES_EXCEPTION!= null) {
            throw WISEINTEGRATIONSERVICES_EXCEPTION;
        }
        return WISEINTEGRATIONSERVICES_WSDL_LOCATION;
    }

}
