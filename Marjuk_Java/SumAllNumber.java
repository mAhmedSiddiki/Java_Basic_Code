package Marjuk_Java;

import java.util.Scanner;

public class SumAllNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
            System.out.print("1. Sum any number\n2. Sum even number\n3. Sum odd number\nEnter choose your no: ");
            int i = input.nextInt();

            switch(i){
                case 1:
                    System.out.print("\n\n❤ Sum any intiger no ❤\nEnter start no: ");
                    int x = input.nextInt();
                    System.out.print("Enter end no: ");
                    int y = input.nextInt();
                    int add=0;

                    for(int j=x;j<=y;j++){
                        add = add+j;
                    }
                    System.out.println("Total = "+add);
                    break;
                
                case 2:
                    System.out.print("\n\n❤ Sum even number ❤\nEnter start no: ");
                    int a = input.nextInt();
                    System.out.print("Enter end no: ");
                    int b = input.nextInt();
                    int addeven=0;

                    for(int k=a;k<=b;k++){
                        if(k%2==0){
                            addeven = addeven+k;
                        }
                    }
                    System.out.println("Total = "+addeven);
                    break;
                    
                case 3:
                    System.out.print("\n\n❤ Sum odd number ❤\nEnter start no: ");
                    int c = input.nextInt();
                    System.out.print("Enter end no: ");
                    int d = input.nextInt();
                    int addodd=0;

                    for(int l=c;l<=d;l++){
                        if(l%2!=0){
                            addodd = addodd+l;
                        }
                    }
                    System.out.println("Total = "+addodd);
                    break;
            }
    }
}