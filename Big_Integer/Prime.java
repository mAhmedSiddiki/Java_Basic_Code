package Big_Integer;

import java.math.BigInteger;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args){
		Scanner input = new Scanner(System.in);
                
		BigInteger a  = new BigInteger(input.next());
     
                boolean b = a.isProbablePrime(1);
		
		if(b){
			System.out.println("prime");
		}else{
			System.out.println("not prime");
		}
    }
}
