package Marjuk_Java;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double c,cels,f,far;
        System.out.print("🌡🌡 Convert Fahrenheit 🌡🌡\nEnter Celsius: ");
        c = input.nextDouble();
        
        far = ((9*c)/5)+32;
        
        System.out.println("Fahrenheit = "+far);
        
        System.out.println("\n🎄 🎄 🎄 🎄 🎄 🎄 🎄 🎄 🎄\n");
        System.out.print("🌡🌡 Convert Celsius 🌡🌡\nEnter Fahrenheit: ");
        f = input.nextDouble();
        
        cels = (5*(f - 32))/9;
        
        System.out.println("Celsius = "+cels);
    }
}