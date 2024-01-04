import java.util.*;

public class Fibonacci {
    
    public static void FibonacciSeq(int a){
        int n1=0,n2=1,n3,i,count=a;    
        System.out.print(n1+" "+n2);    
           
        for(i=2;i<count;++i)  
        {    
         n3=n1+n2;    
         System.out.print(" "+n3);    
         n1=n2;    
         n2=n3;    
        }
    }

    public static int fibonaccirec(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonaccirec(n - 1) + fibonaccirec(n - 2);
        }
    }

    public static void main(String[] args) {
        // FibonacciSeq(10);

        System.out.println("Fibonacci Series:");
        int n=10;
        for (int i = 0; i < n; i++) {
            System.out.print(fibonaccirec(i) + " ");
        }
    }
}
