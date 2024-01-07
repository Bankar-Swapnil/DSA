import java.util.Arrays;
import java.util.Scanner;

// Two Strings are called the anagram if they contain the same characters. However, the order or sequence of the characters can be different.
// str.replaceAll("\\s", "") is used to remove all whitespace characters from the input strings str.


public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Checking if the strings are anagrams
        boolean areAnagrams = checkAnagrams(str1, str2);

        // Displaying the result
        if (areAnagrams) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        scanner.close();
    }

    // Method to check if two strings are anagrams
    private static boolean checkAnagrams(String str1, String str2) {
        // Removing spaces and converting to lowercase for case-insensitive comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if the lengths are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare the sorted char arrays
        return Arrays.equals(charArray1, charArray2);
    }
}
