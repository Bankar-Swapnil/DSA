import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String inputString = "programming";

        // Find and print duplicate characters
        System.out.println("Duplicate characters in the string:");
        printDuplicateCharacters(inputString);
    }

    // Method to find and print duplicate characters in a string
    private static void printDuplicateCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        // Count occurrences of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        // Print characters with occurrences greater than 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
