package com;





import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class XslUtil {
    private static final DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
  


    public static String trim(String input){
        if(input != null) return input.trim();
        else return "";
    }
    public static String toTimeStamp(String date) {
        return toTimeStampImpl(date, df);
    }

    public static String toTimeStamp(String date, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return toTimeStampImpl(date, dateFormat);
    }

    private static String toTimeStampImpl(String date, DateFormat df) {
        try {
            TimeZone utc = TimeZone.getTimeZone("UTC");
            GregorianCalendar calendar = new GregorianCalendar(utc);
            df.setTimeZone(utc);
            calendar.setTime(df.parse(date));
            return calendar.getTime().getTime() + "";
        } catch (Exception e){
            e.printStackTrace();
            return date;
        }
    }



    public static String getCurrentDay() {
        return new SimpleDateFormat("dd-MM-yyyy hh:mm a").format(new Date());
    }
    
    public static String addOne(String id) {
        return "hi"+id;
    }
    
    public static String splitLoanDescription(String desc,int i) {
    	
    	String[] splited = desc.trim().split("\\s\\s+");    
    	String text="";    	
    	if (splited.length>i) {    		    		
    		text= splited[i];    				
		}	
    	
    	return text;		
    }
    
public static String splitTrial2(String desc) {
        
    	String[] splited = desc.split("\\s\\s+");
		
		System.out.println(splited[1]);
		
		return splited[1];
    }
public static String splitTrial3(String desc) {
    
	String[] splited = desc.split("\\s\\s+");
	
	System.out.println(splited[2]);
	
	return splited[2];
}

    
    


    

   

    public static String formatCreditCard(String number) {
        if (number != null && number.length() == 16) {
            final StringBuilder result = new StringBuilder(number);
            result.replace(4, 12, " **** **** ");
            return result.toString();
        } else {
            return number;
        }
    }

    public  long getTimeInMill(){
        return System.currentTimeMillis();
    }

   

}

