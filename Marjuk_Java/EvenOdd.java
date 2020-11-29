package Marjuk_Java;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int x;
        System.out.print("Enter any integer number: ");
        x = input.nextInt();
        
        if(x%2==0){
            System.out.println("Your number is - Even");
        }
        else{
            System.out.println("Your number is - Odd");        
        }
    }
}
