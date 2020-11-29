package Array;

import java.util.Scanner;

public class MatrixSum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Row: ");
        int x = input.nextInt();
        System.out.print("Enter Column: ");
        int y = input.nextInt();

        int[][] a = new int[x][y];
        int[][] b = new int[x][y];

        System.out.println("Enter element of A: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("A["+i+"]["+j+"] = ");
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter element of B: ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("B["+i+"]["+j+"] = ");
                b[i][j] = input.nextInt();
            }
        }

        System.out.print("A = ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("\t " + a[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nB = ");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("\t " + b[i][j]);
            }
            System.out.println();
        }
        
        int[][] c = new int[x][y];
        
        System.out.print("\nSum Matrix: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("\t " + c[i][j]);
            }
            System.out.println();
        }
        
        System.out.print("\nSubtract Matrix: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("\t " + c[i][j]);
            }
            System.out.println();
        }
        
        System.out.print("\nMultiple Matrix: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("\t " + c[i][j]);
            }
            System.out.println();
        }
        
        System.out.print("\nDivided Matrix: \n");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                c[i][j] = a[i][j] / b[i][j];
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print("\t " + c[i][j]);
            }
            System.out.println();
        }
    }
}