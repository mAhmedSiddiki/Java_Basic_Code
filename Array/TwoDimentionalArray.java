package Array;

import java.util.Scanner;

public class TwoDimentionalArray {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("❤ Welcome Two Dimensional Array ❤\nPlease Enter Row: ");
        int x = input.nextInt();
        System.out.print("Please Enter Column: ");
        int y = input.nextInt();
        
        int[][] number = new int[x][y];
        
        System.out.println("Please enter "+x+" * "+y+" number:");
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                number[i][j] = input.nextInt();
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.println("number["+i+"]["+j+"] = "+number[i][j]);
            }
        }
        
        System.out.print("Array output: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(" "+number[i][j]);
            }
            System.out.println();
        }
    }
}