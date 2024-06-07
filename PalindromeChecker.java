//To check if a string is a palindrome

import java.util.Scanner;

public class PalindromeChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to check if it is a palindrome: ");
            String str = scanner.nextLine();

            boolean isPalindrome = checkPalindrome(str);

            if (isPalindrome) {
                System.out.println("The string \"" + str + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + str + "\" is not a palindrome.");
            }

            scanner.close();
        }

        public static boolean checkPalindrome(String str) {
            // Remove spaces and convert to lowercase for a case-insensitive comparison
            str = str.replaceAll("\\s+", "").toLowerCase();

            // Reverse the string
            String reversedStr = new StringBuilder(str).reverse().toString();

            // Compare the original string with the reversed string
            return str.equals(reversedStr);
        }
    }


