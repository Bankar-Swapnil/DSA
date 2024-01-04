import java.util.*;

import java.util.Scanner;

public class PalindromeNumberChecker {
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a palindrome: ");
        int inputNumber = scanner.nextInt();

        if (isPalindrome(inputNumber)) {
            System.out.println(inputNumber + " is a palindrome number.");
        } else {
            System.out.println(inputNumber + " is not a palindrome number.");
        }

        scanner.close();
    }


    // where number or string is not predefined.

    // public static void main(String args[])  
    // {  
    //    String original, reverse = ""; // Objects of String class  
    //    Scanner in = new Scanner(System.in);   
    //    System.out.println("Enter a string/number to check if it is a palindrome");  
    //    original = in.nextLine();   
    //    int length = original.length();   
    //    for ( int i = length - 1; i >= 0; i-- )  
    //       reverse = reverse + original.charAt(i);  
    //    if (original.equals(reverse))  
    //       System.out.println("Entered string/number is a palindrome.");  
    //    else  
    //       System.out.println("Entered string/number isn't a palindrome.");   
    // }  
}
