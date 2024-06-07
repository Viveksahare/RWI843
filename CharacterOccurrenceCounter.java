//To count the occurrences of a character in a string

import java.util.Scanner;

public class CharacterOccurrenceCounter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String str = scanner.nextLine();

            System.out.print("Enter a character to count its occurrences: ");
            char targetChar = scanner.next().charAt(0);

            int count = countOccurrences(str, targetChar);

            System.out.println("The character '" + targetChar + "' appears " + count + " times in the string \"" + str + "\".");

            scanner.close();
        }

        public static int countOccurrences(String str, char targetChar) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == targetChar) {
                    count++;
                }
            }
            return count;
        }
    }


