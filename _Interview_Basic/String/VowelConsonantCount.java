import java.util.Scanner;
//consonantsCount = non vowel character count
public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Counting the total number of vowels and consonants
        int[] counts = countVowelConsonant(inputString);

        // Displaying the result
        System.out.println("Total number of vowels: " + counts[0]);
        System.out.println("Total number of consonants: " + counts[1]);

        scanner.close();
    }

    // Method to count the total number of vowels and consonants in a string using regular expressions
    private static int[] countVowelConsonant(String str) {
        int vowelsCount = str.replaceAll("[^aeiouAEIOU]", "").length();
        int consonantsCount = str.replaceAll("[aeiouAEIOU]", "").replaceAll("[^a-zA-Z]", "").length();

        return new int[]{vowelsCount, consonantsCount};
    }
}
