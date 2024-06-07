//To remove lowercase characters from a string

import java.util.Scanner;

public class RemoveLowercase {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string to remove lowercase characters: ");
            String str = scanner.nextLine();

            String result = removeLowercase(str);

            System.out.println("String after removing lowercase characters: " + result);

            scanner.close();
        }

        public static String removeLowercase(String str) {
            String result = "";

            for (char c : str.toCharArray()) {
                if (!Character.isLowerCase(c)) {
                    result += c;
                }
            }

            return result;
        }
    }


