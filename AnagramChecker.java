//To check if two strings are anagrams

import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the first string: ");
            String str1 = scanner.nextLine();

            System.out.print("Enter the second string: ");
            String str2 = scanner.nextLine();

            boolean isAnagram = checkAnagram(str1, str2);

            if (isAnagram) {
                System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are anagrams.");
            } else {
                System.out.println("The strings \"" + str1 + "\" and \"" + str2 + "\" are not anagrams.");
            }

            scanner.close();
        }

        public static boolean checkAnagram(String str1, String str2) {
            // Remove all whitespace and convert strings to lowercase
            str1 = str1.replaceAll("\\s+", "").toLowerCase();
            str2 = str2.replaceAll("\\s+", "").toLowerCase();

            // If lengths are not equal, they cannot be anagrams
            if (str1.length() != str2.length()) {
                return false;
            }

            // Convert strings to char arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort the char arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted char arrays
            return Arrays.equals(charArray1, charArray2);
        }
    }


