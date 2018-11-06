package com;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by gulfbank on 25/04/18.
 */
public class TestMain {

    private static String base = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabsdefghijklmnopqrstuvwxyz!@#$%^&&*()";


    private static Random random = new Random();


    public static void main(String []args) throws Exception {

        /*XslUtil xslUtil = new XslUtil();
        long timeNow= xslUtil.getTimeInMill();
        System.out.println(xslUtil.getTimeInMill());
        System.out.println(new Date(timeNow));
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(timeNow));
        System.out.println("Calender - Time in milliseconds : " + calendar.getTimeInMillis());*/



       // String key=    randomString(10);
        String key=    "oslj6nMy";


         String plainText="5316447875478605";
        System.out.println("Plain Text Number  = "+ plainText);
        System.out.println("Random Number  = "+ key);



        //String encrypted_value= AESAlgorithm.encyrpt(plainText,key);
        //System.out.println("Encrypted String  = "+ encrypted_value);

       // System.out.println("Decrypted String  = "+ AESAlgorithm.decrypt("KDhozFovbN69lx93bcA2OsuCWx54OqPVOOJiJ1E9Xgw=",key));





        


    }

    public static String randomString(int length){
        StringBuilder b = new StringBuilder();
        for(int i = 0; i < length; i++){
            b.append(base.charAt(random.nextInt(base.length())));
        }
        return b.toString();
    }


}
