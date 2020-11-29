package Marjuk_Java;

import java.util.Scanner;

public class UserInputInt {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        int no;
        String name;
        double amount;
        
        System.out.print("Enter your name: ");
        name = input.nextLine();
        
        System.out.print("Enter your roll no: ");
        no = input.nextInt();
        
        System.out.print("Enter your monthly income: ");
        amount = input.nextDouble();
        
        System.out.print("\n------------------------------");
        System.out.printf("\nName: %s\nRoll: %d\nAmount: %.2f\n",name,no,amount);
        System.out.print("------------------------------\n");
    }    
}