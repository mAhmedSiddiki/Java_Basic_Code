package Marjuk_Java;

import java.util.Random;

public class Random_Number {
    
    public static void main(String[] args){
        
        Random ran = new Random();
        
        int random = ran.nextInt(6) + 5;
        
        System.out.println("Ha Ha Ha: "+random);
        
        
        int random1 = (int) (Math.random() * 13) + 3;
        
        System.out.println("Hi Hi Hi: "+random1);
        
    }
    
}