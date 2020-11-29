package Marjuk_Java;

import java.util.Scanner;

public class TrangleCircular {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double base,height,c,radius,d;
        System.out.print("😎 Trangle: 😎\nEnter base: ");
        base = input.nextDouble();
        
        System.out.print("Enter height: ");
        height = input.nextDouble();
        
        c = 0.5 * base * height;
        
        System.out.print("Area of trangle = "+c);
        
        System.out.print("\n\n💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕❤💕\n");
        
        System.out.print("\n😎 Circle: 😎\nEnter radius:");
        radius = input.nextDouble();
        
        d = 3.1416 * (radius * radius);
        
        System.out.println("Area of circle = "+d);
    }   
}