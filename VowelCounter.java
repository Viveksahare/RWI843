//To count the number of vowels in a string

import java.util.Scanner;

public class VowelCounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to count vowels: ");
            String str = scanner.nextLine();

            int vowelCount = countVowels(str);

            System.out.println("Number of vowels in the string: " + vowelCount);

            scanner.close();
        }

        public static int countVowels(String str) {
            int count = 0;
            str = str.toLowerCase(); // Convert the string to lowercase for case insensitivity

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }

            return count;
        }
    }


