package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("How many number you input: ");
        int x = input.nextInt();
        
        int[] arr = new int[x];
        
        for (int i = 0; i < x; i++) {
            arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.print("Ascending: ");
        for (int i = 0; i < x; i++) {
            System.out.print(" "+arr[i]);
        }
        
        System.out.print("\nDescending: ");
        for (int i = x-1; i >= 0; i--) {
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        
        
        System.out.print("\n\n❤ Name Sorting ❤\nHow many names you input: ");
        int y = input.nextInt();
        
        String[] name = new String[y];
        
        for (int i = 0; i < x; i++) {
            name[i] = input.next();
        }
        
        Arrays.sort(name);
        
        System.out.print("Ascending: ");
        for (int i = 0; i < x; i++) {
            System.out.print("  "+name[i]);
        }
        
        System.out.print("\nDescending: ");
        for (int i = x-1; i >= 0; i--) {
            System.out.print("  "+name[i]);
        }
        System.out.println();
    }
}