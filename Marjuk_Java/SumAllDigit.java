package Marjuk_Java;

import java.util.Scanner;

public class SumAllDigit {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any digit: ");
        int sum = 0,x = input.nextInt();
        
        while(x!=0){
            int r = x%10;
            sum = sum + r;
            x = x / 10;
        }
        System.out.println("Sum all digit: "+sum);
    }
}
