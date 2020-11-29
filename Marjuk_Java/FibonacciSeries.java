package Marjuk_Java;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many numbers: ");
        int x = input.nextInt();
        
        int first = 0;
        int second = 1;
        int fibo;
        
        System.out.print(first+" "+second);
        
        for (int i = 3; i <= x; i++) {
            fibo = first + second;
            System.out.print(" "+fibo);
            first = second;
            second = fibo;
        }
        System.out.println("");
    }
}