package Marjuk_Java;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Current_Time {
    
    public static void main(String[] args){
        
        LocalTime time = LocalTime.now();
        
        System.out.println("Time: "+time);
        
        DateTimeFormatter format = DateTimeFormatter.ofPattern("hh:mm:ss");
        
        String timee = time.format(format);
        
        System.out.println("Time: "+timee);
    }
    
}