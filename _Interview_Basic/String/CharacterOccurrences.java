import java.util.HashMap;
import java.util.Map;

public class CharacterOccurrences {
    public static void main(String[] args) {
        String inputString = "programming";

        // Find occurrences of each character
        Map<Character, Integer> occurrences = findCharacterOccurrences(inputString);

        // Displaying the result
        System.out.println("Occurrences of each character:");
        for (Map.Entry<Character, Integer> entry : occurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // Method to find occurrences of each character in a string
    private static Map<Character, Integer> findCharacterOccurrences(String str) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}
