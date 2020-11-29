package String;

public class Primitive_String {
    public static void main(String[] args){
        
        System.out.print("❤ Primitive to String ❤\n");
        int z = 100;
        String a = Integer.toString(z);
        System.out.println("\nInteger to String = "+a);
        
        double b = 100.45;
        String c = Double.toString(b);
        System.out.println("Double to String = "+c);
        
        System.out.print("\n\n❤ String to Primitive ❤\n");
        String d = "100";
        int e = Integer.parseInt(d);
        System.out.println("\nString to Integer = "+e);
        
        String f = "100.34";
        double g = Double.parseDouble(f);
        System.out.println("String to Double = "+g);
        
        String h = "400";
        int i = Integer.valueOf(h);
        System.out.println("String to Integer = "+i);
    }
}