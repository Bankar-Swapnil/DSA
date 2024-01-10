import java.util.HashMap;
import java.util.Map;

public class MaxMinOccurringCharacter {
    public static void main(String[] args) {
        String inputString = "programming is good for enginnering";

        // Find maximum and minimum occurring characters
        char[] result = findMaxMinOccurringCharacters(inputString);

        // Displaying the result
        System.out.println("Maximum occurring character: " + result[0]);
        System.out.println("Minimum occurring character: " + result[1]);
    }

    // Method to find both maximum and minimum occurring characters in a string
    private static char[] findMaxMinOccurringCharacters(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        char maxChar = '\0'; // Initialize with a default value
        char minChar = '\0'; // Initialize with a default value
        int maxCount = Integer.MIN_VALUE;
        int minCount = Integer.MAX_VALUE;

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            // Update maximum occurring character
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxChar = entry.getKey();
            }

            // Update minimum occurring character
            if (entry.getValue() < minCount) {
                minCount = entry.getValue();
                minChar = entry.getKey();
            }
        }

        return new char[]{maxChar, minChar};
    }
}
