package wise;


import kw.com.gulfbank.wise.wiseintegrationservicesmanagement.service.wiseintegrationservices.intf._1.*;

import javax.xml.bind.JAXBElement;
import javax.xml.ws.BindingProvider;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by gulfbank on 04/07/18.
 */
public class WiseMain {

    public static void main(String args[]) throws MalformedURLException, ParseException, Fault_Exception {
        System.out.println("Wise Main");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(simpleDateFormat.parse(simpleDateFormat.format(new Date())));

        WiseIntegrationServices_Service olbWise = new WiseIntegrationServices_Service(new URL("https://testgbonline.e-gulfbank.com/WISE/WiseIntegrationServices.wsdl"));
        olbWise.setHandlerResolver(new JaxWsHandlerResolver());
        WiseIntegrationServices olbIntegrationServices = olbWise.getWiseIntegrationServices();

        BindingProvider provider = (BindingProvider) olbIntegrationServices;
        provider.getRequestContext().put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, "https://testgbonline.e-gulfbank.com/WISE/WiseIntegrationServices");

        GetWiseDocumentsDetailsRequest getWiseDocumentsDetailsRequest = new GetWiseDocumentsDetailsRequest();

       
        getWiseDocumentsDetailsRequest.setCif("70058383");
        getWiseDocumentsDetailsRequest.setPortfolioId("P00000721");




        getWiseDocumentsDetailsRequest.setToDate(simpleDateFormat.format(new Date()));


        getWiseDocumentsDetailsRequest.setFromDate("2017-10-02");
        //getWiseDocumentsDetailsRequest.setFromDate(getFromDate(new Date()));

        GetWiseDocumentsDetailsReply getWiseDocumentsDetailsReply = olbIntegrationServices.getWiseDocumentsDetails(getWiseDocumentsDetailsRequest);

        System.out.println(getWiseDocumentsDetailsReply.getResponseCode());

        JAXBElement<DocumentsDetailsList> docDetailsList = getWiseDocumentsDetailsReply.getDocumentsDetailsList();
        DocumentsDetailsList list = docDetailsList.getValue();
        List<DocumentsDetails> documentsDetailsList = list.getDocumentsDetails();

        for (DocumentsDetails documentsDetails : documentsDetailsList) {

            System.out.println(documentsDetails.getDateIssue());
            System.out.println(documentsDetails.getDocumentType());
            System.out.println();

        }
        
    }

    public static Date getFromDate(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.MONTH,-3);
        return cal.getTime();
    }
}
