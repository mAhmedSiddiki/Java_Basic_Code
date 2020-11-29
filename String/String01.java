package String;

import java.util.Scanner;

public class String01 {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        String s1 = "Marjuk Ahmed Siddiki";
        String s2 = new String("Ayatullah All Ahmed Siddiki");
        
        char[] s3 = {'a','b','c','d','e'};
        System.out.println(s3);
        
        System.out.println("Name1 = "+s1);
        System.out.println("Name2 = "+s2);
        
        int len1 = s1.length();
        int len2 = s2.length();
        
        System.out.println("Name1 length = "+len1);
        System.out.println("Name2 length = "+len2);
        
        
   
        
        
        System.out.print("\n❤ Compare String ❤\nEnter 1st name: ");
        String name1 = input.next();
        System.out.print("Enter 2nd name: ");
        String name2 = input.next();
       
        if(name1.equals(name2)){
            System.out.println("   😍 Same 😍");
        }
        else{
            System.out.println("  😭 Not Same 😭");
        }
        
        
        
        
        
        System.out.print("\n❤ In String ❤\nEnter 1st name: ");
        String name3 = input.next();
        System.out.print("Enter 2nd name: ");
        String name4 = input.next();
        
        if(name3.contains(name4)){
            System.out.println("  😍 Same 😍");
        }
        else{
            System.out.println("  😭 Not Same 😭");
        }
        
        
        
        
        
        
        System.out.print("\n❤ Ignore Case ❤\nEnter 1st name: ");
        String name5 = input.next();
        System.out.print("Enter 2nd name: ");
        String name6 = input.next();
        
        if(name5.equalsIgnoreCase(name6)){
            System.out.println("😍 Same 😍");
        }
        else{
            System.out.println("😭 Not Same 😭");
        }
        
        
        
        
        
        System.out.print("\n❤ Find ❤\nEnter a name: ");
        String name7 = input.next();
        System.out.print("Find name: ");
        String name8 = input.next();
        boolean c = name7.contains(name8);
        System.out.println(c);
       
        
        
        
        String f = "";        
        boolean b = f.isEmpty();
        System.out.println("Empty is = "+b);
        
        
        
        
        System.out.print("\n\n❤ Concatenate ❤\nEnter first name: ");
        String first = input.next();
        System.out.print("Enter last name: ");
        String last = input.next();
        
        String g = first.concat(last);
        System.out.println("Full name: "+g);
        
        String up = g.toUpperCase();
        System.out.println("\nUpper name: "+up);
        
        String down = g.toLowerCase();
        System.out.println("Lower name: "+down);




        System.out.print("\n\n❤ Word Start ❤\nEnter a word: ");
        String w = input.next();
        System.out.print("Enter 1st some letter: ");
        String x = input.next();
        
        boolean q = w.startsWith(x);
        System.out.println("Same = "+q);
        

        
        
        System.out.print("\n\n❤ Word End ❤\nEnter a word: ");
        String p = input.next();
        System.out.print("Enter somy any letter: ");
        String e = input.next();
        
        boolean l = p.endsWith(e);
        System.out.println("Same = "+l);
        
        
        

        
        System.out.print("\n\n😃 HA HA HA HA 😃\nEnter a sentance: ");
        String na = input.nextLine();
        System.out.print(na);
        
        System.out.print("\n❤ Cheak Index ❤\nEnter any index: ");
        int in = input.nextInt();
        char ind = na.charAt(in);
        System.out.println(in+" no index is = "+ind);
        
        System.out.print("\n❤ ASCII Value❤\nEnter any index: ");
        int inde = input.nextInt();
        int s = na.codePointAt(inde);
        System.out.println(inde+" no index's ASCII value is: "+s);
        
        System.out.print("\n❤ Position cheak ❤\nEnter letter: ");
        String a = input.next();
        int d = na.indexOf(a);
        System.out.println(a+" has "+d+" no index");
        
        System.out.print("\n❤ Last position cheak ❤\nEnter letter: ");
        String i = input.next();
        int r = na.lastIndexOf(i);
        System.out.println(b+" has "+r+" no index");
        
        
        
        
        System.out.print("\n\n❤ Speace Remove ❤\nEnter a sentence: ");
        String aa = input.nextLine();
        String aaa = aa.trim();
        System.out.println("Remove Speace= "+aaa);
    }
}