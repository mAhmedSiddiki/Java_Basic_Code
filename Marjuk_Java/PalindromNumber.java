package Marjuk_Java;

import java.util.Scanner;

public class PalindromNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
    
        System.out.print("Enter any digit: ");
        int rev = 0,x = input.nextInt();
        int s=x;
        while(x!=0){
            int r = x % 10;
            rev = rev * 10 + r;
            x = x / 10;
        }
        if(rev==s){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}