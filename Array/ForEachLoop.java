package Array;

import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many name you input: ");
        int x = input.nextInt();
        
        String[] name;
        name = new String[x];
        
        System.out.println("Please enter "+x+" names: ");
        
        for (int i = 0; i < x; i++) {
            name[i] = input.next();
        }
        
        System.out.println("String name show: ");
        
        for(String y : name){
            System.out.println(y);
        }
    }
}