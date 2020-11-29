package Array;

public class Array {
    public static void main(String[] args){
        
        int[] number;
        number = new int[5];
        
        number[0]=10;
        number[1]=10;
        number[2]=10;
        number[3]=10;
        number[4]=10;
        
        int len = number.length;
        System.out.println("Array size: "+len);
    
        int s = number[0] + number[1] +number[2]+number[3]+number[4];
        System.out.println("Total array sum: "+s);
    }
}
