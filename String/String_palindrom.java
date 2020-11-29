package String;

import java.util.Scanner;

public class String_palindrom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("❤ Palindrom ❤\nEnter a word: ");
        String a = input.next();
        
        StringBuffer sb = new StringBuffer(a);
        
        String b = sb.reverse().toString();
        
        
        if(a.equals(b)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Not Palindrom");
        }
    }
}
