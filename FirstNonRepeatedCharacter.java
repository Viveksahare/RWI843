//To find the first non-repeated (unique) character in a string

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedCharacter {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to find the first non-repeated character: ");
            String str = scanner.nextLine();

            char firstNonRepeated = findFirstNonRepeatedCharacter(str);

            if (firstNonRepeated != '\0') {
                System.out.println("First non-repeated character: " + firstNonRepeated);
            } else {
                System.out.println("No non-repeated character found in the string.");
            }

            scanner.close();
        }

        public static char findFirstNonRepeatedCharacter(String str) {
            Map<Character, Integer> charCounts = new LinkedHashMap<>();

            // Count occurrences of each character in the string
            for (char c : str.toCharArray()) {
                charCounts.put(c, charCounts.getOrDefault(c, 0) + 1);
            }

            // Find the first non-repeated character
            for (Map.Entry<Character, Integer> entry : charCounts.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return '\0'; // Return null character if no non-repeated character found
        }
    }


