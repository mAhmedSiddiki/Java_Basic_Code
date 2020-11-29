package Marjuk_Java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int count = 0,x = input.nextInt();
        
        for(int i = 2;i < x; i++){
            if(x%i==0){
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("❤ Prime number ❤");
        }
        else{
            System.out.println("❤ Not prime number ❤");
        }
    }
}