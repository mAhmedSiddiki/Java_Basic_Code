package String;

import java.util.Scanner;

public class String_Buffer {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String a = input.next();
        
        StringBuffer sb = new StringBuffer(a);
        
        System.out.println(sb);
        System.out.println("    ❤ String Buffer ❤");
        
        sb.append(" Ahmed");
        sb.append(" Siddiki");
        System.out.println(sb);
        
        sb.reverse();
        System.out.println("Reverse: "+sb);
        
        sb.reverse();
        
        sb.setLength(6);
        System.out.println("Trim: "+sb);
        
        sb.delete(0, 3);
        System.out.println("Delete: "+sb);
        
    }
}