import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(inputString);

        // Displaying the result
        if (isPalindrome) {
            System.out.println("The given string is a palindrome.");
        } else {
            System.out.println("The given string is not a palindrome.");
        }

        scanner.close();
    }

    // Method to check if a string is a palindrome
    private static boolean checkPalindrome(String str) {
        str = str.toLowerCase(); // Convert the string to lowercase for case-insensitive comparison
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters at current positions are not equal, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // If the loop completes without returning false, the string is a palindrome
    }
}
