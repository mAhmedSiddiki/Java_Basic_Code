package Array;

import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many number you input: ");
        int x = input.nextInt();
        
        int[] ara;
        ara = new int[x];
        
        System.out.println("Please enter "+x+" numbers: ");
        for (int i = 0; i < x; i++) {
            ara[i] = input.nextInt();
        }
        
        int max = ara[0];
        for (int i = 0; i < x; i++) {
            if(max<=ara[i]){
                max=ara[i];
            }
        }
        
        System.out.println("Maximum Number: "+max);
        
        int min = ara[0];
        for (int i = 0; i < x; i++) {
            if(min>=ara[i]){
                min=ara[i];
            }
        }
        System.out.println("Minimum Number: "+min);
    }
}