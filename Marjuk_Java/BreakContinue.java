package Marjuk_Java;

import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        //Break
        System.out.print("❤ Break ❤\nHow many number you print: ");
        int x = input.nextInt();
        
        System.out.print("Break any number: ");
        int y = input.nextInt();
        
        for(int i=1;i<=x;i++){
            if(i==y){
                break;
            }
            System.out.println(i);
        }
        
        //Continue
        System.out.print("❤ Continue ❤\nHow many number you print: ");
        int a = input.nextInt();
        
        System.out.print("Continue any number: ");
        int b = input.nextInt();
        
        for(int i=1;i<=a;i++){
            if(i==b){
                continue;
            }
            System.out.println(i);
        }
    }
}