package Array;

import java.util.Scanner;

public class Array_To_Int {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("❤ Array to Int ❤\nHow many numbers you input: ");
        int x = input.nextInt();
        int p = 0;
        
        int[] arr = new int[x];
        
        System.out.print("Enter "+x+" number:\n");
        
        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }
        

        for(int m : arr){
            p = (p * 10) + m;
        }
        
        System.out.println("Int: "+p);
        
    }
    
}
