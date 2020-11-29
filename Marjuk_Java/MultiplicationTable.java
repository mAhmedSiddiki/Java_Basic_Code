package Marjuk_Java;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter two no: ");
        int x = input.nextInt();
        int y = input.nextInt();
        
        System.out.print("\n\n");
        for(int j=x;j<=y;j++){
            for(int i = 1;i<=10;i++){
                int a = j*i;
                System.out.println(j+" * "+i+" = "+a);
            }
            System.out.print("\n\n");
        }
    }
}
