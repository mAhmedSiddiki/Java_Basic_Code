package Marjuk_Java;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("1. Summation.\n2. Subtruct.\n3. Multiple.\n4. Divided.\n5. Remainder.\n\nEnter choose number:");
        int choose = input.nextInt();
        
        switch(choose){
            case 1: 
                System.out.println("Enter two numbers:");
                int x = input.nextInt();
                int y = input.nextInt();
                
                int sum = x + y;
                System.out.printf("Summation: %d + %d = %d\n",x,y,sum);
                break;
            
            case 2:
                System.out.println("Enter two numbers:");
                int a = input.nextInt();
                int b = input.nextInt();
                
                int sub = a - b;
                System.out.printf("Subtruct: %d - %d = %d\n",a,b,sub);
                break;
            
            case 3:
                System.out.println("Enter two numbers:");
                int c = input.nextInt();
                int d = input.nextInt();
                
                int mul = c * d;
                System.out.printf("Multiple: %d * %d = %d\n",c,d,mul);
                break;
                
            case 4:
                System.out.println("Enter two numbers:");
                int e = input.nextInt();
                int f = input.nextInt();
                
                int div = e / f;
                System.out.printf("Divided: %d / %d = %d\n",e,f,div);
                break;
                
            case 5:
                System.out.println("Enter two numbers:");
                int g = input.nextInt();
                int h = input.nextInt();
                
                int rem = g % h;
                System.out.printf("Remainder: %d ! %d = %d\n",g,h,rem);
                break;
               
            default:
                System.out.println("Wrong input....Please try again....");
        }
    }
}