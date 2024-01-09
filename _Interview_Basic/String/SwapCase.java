import java.util.Scanner;

public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Replace lower-case with upper-case and vice versa
        String swappedString = swapCase(inputString);

        // Displaying the result
        System.out.println("String after swapping cases: " + swappedString);

        scanner.close();
    }

    // Method to replace lower-case with upper-case and vice versa
    private static String swapCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];

            if (Character.isUpperCase(currentChar)) {
                charArray[i] = Character.toLowerCase(currentChar);
            } else if (Character.isLowerCase(currentChar)) {
                charArray[i] = Character.toUpperCase(currentChar);
            }
        }

        return new String(charArray);
    }
}
