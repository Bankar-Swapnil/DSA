public class GCDLCM {
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        return gcd(b,a%b);
    }
    
    public static int lcd(int a,int b){
        return (a*b)/gcd(a,b);
    }

    public static void main(String[] args) {
        
        System.out.println(gcd(12, 18));
        System.out.println(lcd(12, 18));
    }
}
