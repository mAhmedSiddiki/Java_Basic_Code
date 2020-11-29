package Marjuk_Java;

import java.util.Scanner;

public class BitwiseOperator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two numbers:");
        int x = input.nextInt();
        int y = input.nextInt();
        
        int and = x & y;
        int or = x | y;
        int xor = x ^ y;
        
        System.out.printf("Bitwise And: %d\nBitwise Or: %d\nBitwise Xor: %d\n",and,or,xor);
    }
}