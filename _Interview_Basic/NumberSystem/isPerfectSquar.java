import java.util.Scanner;

public class isPerfectSquar {
    public static void main(String[] args) {
        Scanner SC = new Scanner(System.in);
        int a = SC.nextInt();

        int b = (int) Math.sqrt(a);
        
        if(a==(b*b)){
            System.out.println("number is perfect square");
        }else{
            System.out.println("number is not perfect square");
        }
    }
}
