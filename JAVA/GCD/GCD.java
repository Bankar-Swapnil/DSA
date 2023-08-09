import java.util.*;

public class GCD {
    public static void main(String[] args) {
        // int[] array = {4, 6, 8, 10, 12};

        // int lcm = array[0];

        // for (int i = 1; i < array.length; i++) {
        //     lcm = calculateLCM(lcm, array[i]);
        // }

        // System.out.println("LCM of the array elements: " + lcm);

        // int gcd = array[0];

        // for (int i = 1; i < array.length; i++) {
        //     gcd = calculateGCD(gcd, array[i]);
        // }

        // System.out.println("GCD of the array elements: " + gcd);
        // System.out.println(calculateGCD(12,18));
    }

    // Function to calculate the LCM of two numbers using the GCD formula
    public static int calculateLCM(int a, int b) {
        int gcd = calculateGCD(a, b);
        return (a * b) / gcd;
    }

    // Function to calculate the GCD of two numbers using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        // if (b == 0) {
        //     return a;
        // } else {
        //     return calculateGCD(b, a % b);
        // }
    }   
     
}
