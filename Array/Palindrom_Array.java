package Array;

import java.util.Scanner;

public class Palindrom_Array {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many number you input: ");
        int i,j,x = input.nextInt();
        
        int[] arr1 = new int[x];
        int[] arr2 = new int[x];
        
        System.out.print("Enter "+x+" number: ");
        
        for (i = 1; i <= x; i++) {
            arr1[i] = input.nextInt();
        }
        
        for (i = 1,j = x; i <= x; i++, j--) {
            arr2[j] = arr1[i];
        }
        
        
        for(i = 1; i <= x; i++){
            System.out.print(" "+arr2[i]);
        }
        
        
    }
}
