package Array;

import java.util.Scanner;

public class TringleNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter row: ");
        int x = input.nextInt();

        int[][] a = new int[x][];

        for (int i = 0; i < x; i++) {
            a[i] = new int[i + 1];
        }

        int k = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i + 1; j++) {
                a[i][j] = k;
                k++;
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }
    }
}