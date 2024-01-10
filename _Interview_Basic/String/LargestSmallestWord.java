public class LargestSmallestWord {
    public static void main(String[] args) {
        String inputString = "Java programming is fun and interesting";

        // Find and print the largest and smallest words
        findLargestSmallestWord(inputString);
    }

    // Method to find and print the largest and smallest words in a string
    private static void findLargestSmallestWord(String str) {
        String[] words = str.split("\\s+"); // Split the string into words

        // Initialize variables to store the largest and smallest words
        String smallestWord = words[0];
        String largestWord = words[0];

        // Iterate through the words to find the smallest and largest
        for (String word : words) {
            // Check for smallest word
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
            // Check for largest word
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
        }

        // Display the result
        System.out.println("Smallest word: " + smallestWord);
        System.out.println("Largest word: " + largestWord);
    }
}
