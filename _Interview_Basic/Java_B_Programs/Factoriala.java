import java.util.*;

public class Factoriala {
    public static long calculateIterativeFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static long calculateRecursiveFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }

        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateRecursiveFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(calculateIterativeFactorial(5));
    }
}
