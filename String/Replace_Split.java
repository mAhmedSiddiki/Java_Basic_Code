package String;

import java.util.Scanner;

public class Replace_Split {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("\t❤ Replace ❤\nEnter a sentance: ");
        String a = input.nextLine();
        System.out.println("Simple = "+a);
        
        System.out.print("Enter change letter: ");
        String c = input.next();
        System.out.print("Enter replace letter: ");
        String d = input.next();
        String b = a.replace(c, d);
        System.out.println("Replaced Sentance: "+b);
        
        
        System.out.print("\n\n\t❤ Split ❤\nEnter A sentance: ");
        String e = input.nextLine();
        
        String[] f = e.split(" ");
        
        for(String x : f){
            System.out.println("=> "+x);
        }
        
        
    }
}
