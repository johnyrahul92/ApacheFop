package com;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import javax.xml.transform.*;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * Created by gulfbank on 17/04/18.
 */
public class TestRestPost {

    public static void main(String[] args) throws TransformerException {
        System.out.println("Helo");
        String url="https://testgbonline.e-gulfbank.com/T005/internet";
        RestTemplate restTemplate= new RestTemplate();
        MultiValueMap<String, String> map = new LinkedMultiValueMap<String, String>();
        map.add("fldLoginUserId", "DEVRETAIL4");
        map.add("fldlanguage", "eng");
        map.add("fldDeviceId", "01");
        map.add("fldLangId", "eng");
        map.add("fldRequestId", "RRTFC11");
        map.add("fldUserType", "EN1");
        map.add("fldHiddenTxnId", "TFC");

       ResponseEntity<String> response= restTemplate.postForEntity(url,map,String.class);
        System.out.println(response.getBody());
        

        File xsltFile = new File("Resources/olb-login-username.xsl");
       StreamSource xmlSource = new StreamSource(new StringReader(response.getBody()));
        //StreamSource xmlSource = new StreamSource(new File("Resources//Employees.xml"));


        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

        StringWriter outWriter = new StringWriter();
        Result res = new StreamResult(outWriter);


        transformer.transform(xmlSource,res);

        StringBuffer sb = outWriter.getBuffer();                                                 
        String finalstring = sb.toString()  ;

        System.out.println(finalstring)  ;







    }
}
