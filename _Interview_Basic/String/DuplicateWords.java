import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {
    public static void main(String[] args) {
        String inputString = "java is java programming and java is fun";

        // Find and print duplicate words
        System.out.println("Duplicate words in the string:");
        printDuplicateWords(inputString);
    }

    // Method to find and print duplicate words in a string
    private static void printDuplicateWords(String str) {
        String[] words = str.split("\\s+"); // Split the string into words

        Map<String, Integer> wordCountMap = new HashMap<>();

        // Count occurrences of each word
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Print words with occurrences greater than 1
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }
    }
}
