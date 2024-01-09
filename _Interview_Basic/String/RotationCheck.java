import java.util.Scanner;


// Enter the first string: hello 
// st1=st1+st1  === hellohello
// Enter the second string: lohel 
// second string is part of st1

public class RotationCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if one string is a rotation of another
        boolean isRotation = checkRotation(str1, str2);

        // Displaying the result
        if (isRotation) {
            System.out.println("The second string is a rotation of the first string.");
        } else {
            System.out.println("The second string is not a rotation of the first string.");
        }

        scanner.close();
    }

    // Method to check if one string is a rotation of another
    private static boolean checkRotation(String str1, String str2) {
        // Check if lengths are equal and not empty
        if (str1.length() != str2.length() || str1.length() == 0) {
            return false;
        }

        // Concatenate the first string with itself and check if the second string is a substring
        String concatenatedStr = str1 + str1;
        return concatenatedStr.contains(str2);
    }
}
