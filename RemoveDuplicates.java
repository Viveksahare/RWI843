//To remove duplicate characters from a string

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicates {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Prompt user for the string
            System.out.print("Enter a string to remove duplicates: ");
            String str = scanner.nextLine();

            String result = removeDuplicates(str);

            System.out.println("String after removing duplicates: " + result);

            scanner.close();
        }

        public static String removeDuplicates(String str) {
            Set<Character> seen = new LinkedHashSet<>();
            String result = "";

            for (char c : str.toCharArray()) {
                if (!seen.contains(c)) {
                    seen.add(c);
                    result += c;
                }
            }

            return result;
        }
    }


