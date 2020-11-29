package Number_Conversition;

import java.util.Scanner;

public class Binary_Decimal_Octal_Hexadesimal {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int x = 1;
        while (x > 0) {
            System.out.println("1. Binary\n2. Decimal\n3. Octal\n4. Hexadesimal");
            System.out.print("Choose your ans...: ");
            int a = input.nextInt();

            switch (a) {
                case 1:
                    
                    System.out.print("❤ Decimal to binary ❤\nEnter decimal number: ");
                    int deci = input.nextInt();
                    
                    String binar = Integer.toBinaryString(deci);
                    System.out.println("Binary = "+binar);
                    
                    
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
                    System.out.print("\n\n❤ Hexadesimal to binary ❤\nEnter hexadesimal number: ");
                    int hexi = input.nextInt();
                    
                    */
                  
                    
                    
                    break;
                case 2:

                    System.out.println("❤ Binary to Decimal ❤");
                    System.out.print("Enter Binary no: ");
                    String binary = input.next();

                    Integer decimal = Integer.parseInt(binary, 2);
                    System.out.println("Decimal = " + decimal);

                    System.out.print("\n\n❤ Octal to Decimal ❤\nEnter octal number: ");
                    String octal = input.next();

                    Integer decimal1 = Integer.parseInt(octal, 8);
                    System.out.println("Decimal = " + decimal1);

                    System.out.print("\n\n❤ Hexadecimal to Decimal ❤\nEnter Hexadecimal number: ");
                    String Hexadecimal = input.next();

                    Integer decimal11 = Integer.parseInt(Hexadecimal, 16);
                    System.out.println("Decimal = " + decimal11);

                    break; 
                case 3:
                    /*
                    System.out.print("❤ Binary to Octal ❤\nEnter binary number: ");
                    int bi = input.nextInt();
                    
                    String octall = Integer.toOctalString(bi);
                    System.out.print("Octal = "+octall);
                    */
                    
                    System.out.print("\n\n❤ Decimal to Octal ❤\nEnter decimal number: ");
                    int dec = input.nextInt();
                    
                    String octalll = Integer.toOctalString(dec);
                    System.out.print("Octal = "+octalll);
                    
                    /*
                    System.out.print("\n\n❤ Hexadesimal to Octal ❤\nEnter hexadecimal number: ");
                    int He = input.nextInt();
                    
                    String octallll = Integer.toOctalString(He);
                    System.out.print("Octal = "+octallll);
                   */
                    break;
                case 4:
                    /*
                    System.out.print("❤ Binary to Hexadesimal ❤\nEnter binary number: ");
                    int binaryyy = input.nextInt();
                    
                    String hexa = Integer.toBinaryString(binaryyy);
                    System.out.print("Hexadesimal = "+hexa);
                    
                    */


                    System.out.print("Decimal to Hexadecimal.\nEnter decimal number: ");
                    int decimalh = input.nextInt();
                    String Hexadecimald = Integer.toHexString(decimalh);
                    System.out.println("Hexadecimal: "+Hexadecimald);
                    
                    
                    
                    break;
                default:
                    System.out.println("Wrong Ans...!! \n\t\tPlease try again....");
            }
            System.out.print("Do you want exit.. 😭 \n1. Yes\n2. No\n");
            int b = input.nextInt();
            if(b == 1){
                x = 0;
            }
            else{
                x = 1;
            }
        }

    }
}
