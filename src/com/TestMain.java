package com;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.Random;

/**
 * Created by gulfbank on 25/04/18.
 */
public class TestMain {

    private static String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabsdefghijklmnopqrstuvwxyz!@#$%^&&*()";


    private static Random random = new Random();


    public static void main(String[] args) throws Exception {


        Reader fileReader = new FileReader(new File("Resources//summary.xml"));
        BufferedReader bufReader = new BufferedReader(fileReader);
        StringBuilder sb = new StringBuilder();
        String line = bufReader.readLine();
        while (line != null) {
            sb.append(line).append("\n");
            line = bufReader.readLine();
        }
        String xml2String = sb.toString();
        System.out.println("XML to String using BufferedReader : ");
        //System.out.println(xml2String);


        //StreamSource xmlSource = new StreamSource(new File("Resources//summary.xml"));

        StreamSource xmlSource = new StreamSource(new StringReader(xml2String));

        File xsltFile = new File("Resources//summary_no_pc.xsl");


        TransformerFactory factory = TransformerFactory.newInstance();
        Transformer transformer = factory.newTransformer(new StreamSource(xsltFile));

        StringWriter outWriter = new StringWriter();

        Result res = new StreamResult(outWriter);
        transformer.transform(xmlSource, res);


        StringBuffer sb1 = outWriter.getBuffer();


        System.out.println(sb1.toString());


    }

    public static String randomString(int length) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < length; i++) {
            b.append(base.charAt(random.nextInt(base.length())));
        }
        return b.toString();
    }


}
