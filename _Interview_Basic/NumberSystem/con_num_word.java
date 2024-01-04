import java.util.Scanner;

public class con_num_word {

    private static final String[] units = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] teens = {"", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] tens = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero";
        }

        return convertToWordsHelper(number).trim();
    }

    private static String convertToWordsHelper(int number) {
        if (number < 10) {
            return units[number];
        } else if (number < 20) {
            return teens[number - 10];
        } else if (number < 100) {
            return tens[number / 10] + " " + convertToWordsHelper(number % 10);
        } else if (number < 1000) {
            return units[number / 100] + " Hundred " + convertToWordsHelper(number % 100);
        } else if (number < 1000000) {
            return convertToWordsHelper(number / 1000) + " Thousand " + convertToWordsHelper(number % 1000);
        } else if (number < 1000000000) {
            return convertToWordsHelper(number / 1000000) + " Million " + convertToWordsHelper(number % 1000000);
        } else {
            return "Number out of range";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Get a number from the user
        System.out.print("Enter a number to convert to words: ");
        int inputNumber = scanner.nextInt();

        // Convert the number to words
        String words = convertToWords(inputNumber);

        // Print the result
        System.out.println("Number in words: " + words);

        scanner.close();
    }
}
