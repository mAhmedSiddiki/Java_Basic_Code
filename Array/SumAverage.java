package Array;

import java.util.Scanner;

public class SumAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("How many number you input: ");
        int x = input.nextInt();

        double[] ara;
        ara = new double[x];

        System.out.println("Please enter " + x + " numbers:");
        for (int i = 0; i < x; i++) {
            ara[i] = input.nextDouble();
        }

        double sum = ara[0] + ara[1] + ara[2] + ara[3] + ara[4];
        System.out.println("Total number: " + sum);

        double y = sum / x;
        System.out.println("Average: " + y);
    }
}