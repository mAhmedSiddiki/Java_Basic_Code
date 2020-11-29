package Marjuk_Java;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int no1,no2,sum,sub,mult,rem;
        double div;
        
        System.out.print("Enter two numbers =>\n1st no: ");
        no1 = input.nextInt();
        System.out.print("2nd no: ");
        no2 = input.nextInt();
        
        sum = no1 + no2;
        sub = no1 - no2;
        mult = no1 * no2;
        div = (double)no1 / no2;
        rem = no1 % no2;
        
        System.out.print("\nSymple Calculator:");
        System.out.print("\n------------------------------");
        System.out.printf("\nSum = %d\nSub = %d\nMult = %d\nDiv = %f\nRemainder = %d\n",sum,sub,mult,div,rem);
        System.out.print("------------------------------\n");
        
        
        System.out.println("\nAssingment Operator:");
        System.out.print("------------------------------");
        
        no1 += no2; //no1 = no1+no2
        System.out.println("\nSum = "+no1);
        
        no1 -= no2; //no1 = no1-no2
        System.out.println("Sub = "+no1);
        
        no1 *= no2; //no1 = no1*no2
        System.out.println("Mult = "+no1);
        
        no1 /= no2; //no1 = no1/no2
        System.out.println("Div = "+no1);
        
        no1 %= no2; //no1 = no1%no2
        System.out.println("Remainder = "+no1);
        System.out.print("------------------------------\n");
    }   
}