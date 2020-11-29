package Marjuk_Java;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any digit: ");
        int sum = 0,x = input.nextInt();
        int s = x;
        while(x!=0){
            int r = x % 10;
            sum = sum + (r * r * r);
            x = x / 10;
        }
        if(s == sum){
            System.out.println("Armstrong Number: "+sum);
        }
        else{
            System.out.println("Not Armstrong Number: "+sum);
        }
    }
}