package Marjuk_Java;

import java.util.Scanner;

public class Series {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many no input: ");
        int sum = 0,n = input.nextInt();
     
        for(int i = 1; i <= n; i++){
            System.out.print(i+" ");
            sum = sum + i;
        }
        System.out.println("\nSum = "+sum);
        
        
        
        
        
        System.out.print("\nHow many no input: ");
        int sume = 0,x = input.nextInt();
     
        for(int i = 5; i <= x; i = i + 2){
            System.out.print(i+" ");
            sume = sume + i;
        }
        System.out.println("\nSum = "+sume);
        
        
        
        
        
        System.out.print("\nHow many no input: ");
        double suma = 0,y = input.nextDouble();
     
        for(double i = 1.5; i <= y; i++){
            System.out.print(i+"  ");
            suma = suma + i;
        }
        System.out.println("\nSum = "+suma);
        
        
        
        
        
        
        System.out.print("\nHow many no input: ");
        int sumb = 0,z = input.nextInt();
     
        for(int i = 1; i <= z; i++){
            System.out.printf("%d^2  ",i);
            sumb = sumb + i*i;
        }
        System.out.println("\nSum = "+sumb);
        
        
        
        
        System.out.print("\nHow many no input: ");
        int sumc = 1,a = input.nextInt();
     
        for(int i = 1; i <= a; i++){
            System.out.printf("%d ",i);
            sumc = sumc * i;
        }
        System.out.println("\nMultiple = "+sumc);
        
        
        
        
        
        System.out.print("\nHow many no input: ");
        int sumd = 1,b = input.nextInt();
     
        for(int i = 1; i <= b; i = i+2){
            System.out.printf("%d ",i);
            sumd = sumd * i;
        }
        System.out.println("\nMultiple = "+sumd);
        
        
        /*
        
        
        
        System.out.print("\nHow many no input: ");
        double sumf = 1,c = input.nextDouble();
     
        for(double i = 1.5; i <= c; i++){
            System.out.print(i+"  ");
            sumf = sumf * i;
        }
        System.out.println("\nMultiple = "+sumf);
        
        
        
        
        
        
        System.out.print("\nHow many no input: ");
        int sumg = 1,g = input.nextInt();
     
        for(int i = 1; i <= g; i++){
            System.out.printf("%d^2  ",i);
            sumg = sumg * i*i;
        }
        System.out.println("\nSum = "+sumg);*/
    }
        
}
