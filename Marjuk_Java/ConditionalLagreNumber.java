package Marjuk_Java;

import java.util.Scanner;

public class ConditionalLagreNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("   ❤ Large ❤\nEnter two numbers: ");
        
        int x = input.nextInt();
        int y = input.nextInt();
        
        int large = (x > y) ? x : y;
        System.out.println("Large number: "+large);
        
        System.out.println("\n   ❤ Small ❤\nEnter two numbers:");
        
        int a = input.nextInt();
        int b = input.nextInt();
        
        int small = (a < b) ? a : b;
        System.out.println("Small number: "+small);
    }
}
