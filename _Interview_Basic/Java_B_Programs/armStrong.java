import java.util.Scanner;
import java.lang.Math;

public class armStrong {

    public static boolean isArmstrong(int number) {
        if (number < 0) {
            return false;
        }

        int originalNumber = number;
        int numberOfDigits = countDigits(number);
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numberOfDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

    public static int countDigits(int number) {
        int count = 0;

        while (number != 0) {
            number /= 10;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer to check if it's an Armstrong number: ");
        int inputNumber = scanner.nextInt();

        if (isArmstrong(inputNumber)) {
            System.out.println(inputNumber + " is an Armstrong number.");
        } else {
            System.out.println(inputNumber + " is not an Armstrong number.");
        }

        scanner.close();
    }
}