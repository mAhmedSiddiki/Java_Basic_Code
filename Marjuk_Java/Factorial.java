package Marjuk_Java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter no: ");
        int fact = 1,x = input.nextInt();
        
        for(int i = x; i >= 1; i--){
            fact = fact * i;
        }
        System.out.printf("Factorial of %d = %d\n",x,fact);
    }
}