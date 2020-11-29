package Marjuk_Java;

public class Loop {
    public static void main(String[] args){
        //for loop
        int i;
        System.out.print("❤ For Loop: ❤\n");
        for(i=1;i<=10;i++){
            System.out.printf("%d. Hello\n",i);
        }
        
        //whileloop
        System.out.println("\n❤ While Loop: ❤");
        int j=1;
        while(j<=10){
            System.out.printf("%d. Marjuk\n",j);
            j++;
        }
        
        //do whileloop
        System.out.println("\n❤ Do While Loop: ❤");
        int k=1;
        do{
            System.out.printf("%d. Bangladesh\n",k);
            k++;
        }while(k<=10);
    }
}