package Marjuk_Java;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char x;
        
        System.out.println("Vowel ❤ Consonant");
        
        System.out.print("Enter a letter: ");
        x = input.next().charAt(0);
        
        if(x == 'a'||x == 'A'||x == 'e'||x == 'E'||x == 'i'||x == 'I'||x == 'o'||x == 'O'||x == 'u'||x == 'U'){
            System.out.println("😎 Vowel 😎");
        }
        else{
            System.out.println("😎 Consonant 😎");
        }
        
        System.out.println("\nCapital ❤ Small ❤ Number");
        
        System.out.print("Enter a letter: ");
        char y = input.next().charAt(0);
        
        if(y >= 'a' && y <= 'z'){
            System.out.println("💋 Small letter 💋");
        }
        else if(y >= 'A' && y <= 'Z'){
            System.out.println("💋 Capital letter 💋");
        }
        else if(y >= '0' && y <= '9'){
            System.out.println("💋 Number 💋");
        }
        else{
            System.out.print("💋 Special Charrecter 💋");
        }
    }
}