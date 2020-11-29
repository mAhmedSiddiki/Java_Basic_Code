package Number_Conversition;

import java.util.*;

public class Number {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        /*
        System.out.print("Binary to Decimal.\nEnter binary number: ");
        String binary = input.next();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: "+decimal);
        
        
        
        System.out.print("Octal to Decimal.\nEnter octal number: ");
        String octal = input.next();
        int decimal1 = Integer.parseInt(octal, 8);
        System.out.println("Decimal: "+decimal1);
        
        
        
        System.out.print("Hexadesimal to Decimal.\nEnter hexadesimal number: ");
        String Hexadesimal = input.next();
        int decimal2 = Integer.parseInt(Hexadesimal, 16);
        System.out.println("Decimal: "+decimal2);
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.print("Decimal to Binary.\nEnter decimal number: ");
        int decimalb = input.nextInt();
        String binaryd = Integer.toBinaryString(decimalb);
        System.out.println("Binary: "+binaryd);
        
        */
        
        System.out.print("Octal to Binary.\nEnter octal number: ");
        int octalb = input.nextInt();
        int[] octalvalues = {0, 1, 10, 11, 100, 101, 110, 111};

        int num = 0, place = 1,rem;
        
        while (octalb != 0)
            {
             rem = octalb % 10;
             num = octalvalues[rem] * place + num;
             octalb = octalb / 10;
             place = place * 1000;
            }
        System.out.println("Binary : " +num);
        
        
       
        
        
        
        
        /*
        
        System.out.print("Decimal to Octal.\nEnter decimal number: ");
        int decimalo = input.nextInt();
        String octald = Integer.toOctalString(decimalo);
        System.out.println("Octal: "+octald);
        
        
        
        
        
        
        
        
        
        
        
        
        
        System.out.print("Decimal to Hexadecimal.\nEnter decimal number: ");
        int decimalh = input.nextInt();
        String Hexadecimald = Integer.toHexString(decimalh);
        System.out.println("Hexadecimal: "+Hexadecimald);
        */
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
