//To reverse a string

import java.util.Scanner;

public class ReverseString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to reverse: ");
            String str = scanner.nextLine();

            String reversedStr = reverseUsingLoop(str);

            System.out.println("Reversed string: " + reversedStr);

            scanner.close();
        }

        public static String reverseUsingLoop(String str) {
            String reversedStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversedStr += str.charAt(i);
            }
            return reversedStr;
        }
    }


