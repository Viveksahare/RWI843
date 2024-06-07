//To count the number of lowercase and uppercase characters in a string

import java.util.Scanner;

public class CountCaseCharacters {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to count lowercase and uppercase characters: ");
            String str = scanner.nextLine();

            int[] counts = countLowercaseAndUppercase(str);

            System.out.println("Number of lowercase characters: " + counts[0]);
            System.out.println("Number of uppercase characters: " + counts[1]);

            scanner.close();
        }

        public static int[] countLowercaseAndUppercase(String str) {
            int lowercaseCount = 0;
            int uppercaseCount = 0;

            for (char c : str.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    lowercaseCount++;
                } else if (Character.isUpperCase(c)) {
                    uppercaseCount++;
                }
            }

            return new int[]{lowercaseCount, uppercaseCount};
        }
    }


