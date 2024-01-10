
// Program to print smallest and biggest possible palindrome word in a given string

public class PalindromeWords {
    public static void main(String[] args) {
        String inputString = "level madam hello radar racecar programming";

        // Find and print the smallest and biggest palindrome words
        findSmallestBiggestPalindromes(inputString);
    }

    // Method to check if a word is a palindrome
    private static boolean isPalindrome(String word) {
        int length = word.length();
        for (int i = 0; i < length / 2; i++) {
            if (word.charAt(i) != word.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Method to find and print the smallest and biggest palindrome words in a string
    private static void findSmallestBiggestPalindromes(String str) {
        String[] words = str.split("\\s+"); // Split the string into words

        String smallestPalindrome = null;
        String biggestPalindrome = null;

        for (String word : words) {
            if (isPalindrome(word)) {
                // Check for smallest palindrome
                if (smallestPalindrome == null || word.length() < smallestPalindrome.length()) {
                    smallestPalindrome = word;
                }
                // Check for biggest palindrome
                if (biggestPalindrome == null || word.length() > biggestPalindrome.length()) {
                    biggestPalindrome = word;
                }
            }
        }

        // Display the result
        System.out.println("Smallest palindrome word: " + smallestPalindrome);
        System.out.println("Biggest palindrome word: " + biggestPalindrome);
    }
}
