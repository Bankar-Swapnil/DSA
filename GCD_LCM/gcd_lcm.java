import java.util.*;

public class gcd_lcm {
    
    public int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
    
    public int lcm(int a,int b){
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {
        gcd_lcm a = new gcd_lcm();
        System.out.println(a.gcd(12,18));
    }
}