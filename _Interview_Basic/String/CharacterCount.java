
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Counting the total number of characters
        int totalCount = countTotalCharacters(inputString);

        // Displaying the result
        System.out.println("Total number of characters in the string: " + totalCount);

        scanner.close();
    }

    // Method to count the total number of characters in a string
    private static int countTotalCharacters(String str) {
        // Using the length() method of the String class
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
