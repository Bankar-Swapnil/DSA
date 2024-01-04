import java.util.Scanner;

public class reverseNumber {
    // Iterative approach
    public static int reverseIterative(int number) {
        int reversedNumber = 0;

        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return reversedNumber;
    }

    // Recursive approach
    public static int reverseRecursive(int number) {
        return reverseRecursiveHelper(number, 0);
    }

    private static int reverseRecursiveHelper(int remainingNumber, int reversedNumber) {
        if (remainingNumber == 0) {
            return reversedNumber;
        }

        int digit = remainingNumber % 10;
        return reverseRecursiveHelper(remainingNumber / 10, reversedNumber * 10 + digit);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get a number from the user
        System.out.print("Enter a number to reverse: ");
        int inputNumber = scanner.nextInt();

        // Reverse the number using the iterative approach
        int reversedIterative = reverseIterative(inputNumber);

        // Reverse the number using the recursive approach
        int reversedRecursive = reverseRecursive(inputNumber);

        // Print the reversed numbers
        System.out.println("Reversed Number (Iterative): " + reversedIterative);
        System.out.println("Reversed Number (Recursive): " + reversedRecursive);

        scanner.close();
    }
}
