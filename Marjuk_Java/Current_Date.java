package Marjuk_Java;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Current_Date {
    
    public static void main(String[] args){
        
        Date date = new Date();
        
        System.out.println("Date: "+date);
        
        DateFormat datef = new SimpleDateFormat("dd/mm/yyyy");
        
        String datee = datef.format(date);
        
        System.out.println("Date Format: "+datee);
        
    }
    
}
