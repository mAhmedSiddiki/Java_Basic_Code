package Marjuk_Java;

import java.util.Scanner;

public class UnaryIncrementDecrement {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int result_x,result_y,x = 10,y = -10,z=10,prein,posin,prede,posde;
        
        System.out.println("When, x = 10 ❤ y = -10\n   😊 Unary 😊");
        result_x = +x;
        System.out.println("Unary Plus,x = "+result_x);
        
        result_y = +y;
        System.out.println("Unary Plus,y = "+result_y);
        
        result_x = -x;
        System.out.println("Unary Minus,x = "+result_x);
        
        result_y = -y;
        System.out.println("Unary Minus,y = "+result_y);
        
        
        System.out.println("\n🎃 🎃 🎃 🎃 🎃 🎃 🎃 🎃\n\nWhen, z = 10\n\t😊 Increment 😊"); 
        prein = ++z;
        System.out.printf("Preincrement = %d --- here, z = %d\n",prein,z);
        posin = z++;
        System.out.printf("Postincrement = %d --- here, z = %d\n",posin,z);
        
        prede = --z;
        System.out.printf("\n\t😊 Decrement 😊\nPredecrement = %d --- here, z = %d\n",prein,z);
        posde = z--;
        System.out.printf("Postdecrement = %d --- here, z = %d\n",posin,z);
    }
}