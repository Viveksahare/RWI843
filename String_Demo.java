public class String_Demo {
        public static void main(String[] args) {
            // Creating strings
            String str1 = "Hello";
            String str2 = "World";
            String str3 = "  Hello World  ";
            String str4 = "hello";

            // length()
            System.out.println("Length of str1: " + str1.length());

            // charAt()
            System.out.println("Character at index 1 in str1: " + str1.charAt(1));

            // concat()
            String str5 = str1.concat(" ").concat(str2);
            System.out.println("Concatenated string: " + str5);

            // equals() and equalsIgnoreCase()
            System.out.println("str1 equals str4: " + str1.equals(str4));
            System.out.println("str1 equalsIgnoreCase str4: " + str1.equalsIgnoreCase(str4));

            // compareTo() and compareToIgnoreCase()
            System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
            System.out.println("str1 compareToIgnoreCase str4: " + str1.compareToIgnoreCase(str4));

            // substring()
            System.out.println("Substring of str5 from index 6: " + str5.substring(6));
            System.out.println("Substring of str5 from index 6 to 11: " + str5.substring(6, 11));

            // contains()
            System.out.println("str5 contains 'World': " + str5.contains("World"));

            // startsWith() and endsWith()
            System.out.println("str5 starts with 'Hello': " + str5.startsWith("Hello"));
            System.out.println("str5 ends with 'World': " + str5.endsWith("World"));

            // indexOf() and lastIndexOf()
            System.out.println("Index of 'o' in str5: " + str5.indexOf('o'));
            System.out.println("Last index of 'o' in str5: " + str5.lastIndexOf('o'));

            // replace()
            String str6 = str5.replace('o', '0');
            System.out.println("str5 after replacing 'o' with '0': " + str6);

            // toUpperCase() and toLowerCase()
            System.out.println("str1 in uppercase: " + str1.toUpperCase());
            System.out.println("str1 in lowercase: " + str1.toLowerCase());

            // trim()
//            System.out.println("str3 after trim: '" + str3.trim() + "'");

            // split()
//            String[] words = str5.split(" ");
//            System.out.println("Splitting str5 by space:");
//            for (String word : words) {
//                System.out.println(word);
//            }

            // valueOf()
            int num = 100;
            String strNum = String.valueOf(num);
            System.out.println("String value of 100: " + strNum);

            // isEmpty() and isBlank()
            String emptyStr = "";
            String blankStr = "   ";
            System.out.println("emptyStr is empty: " + emptyStr.isEmpty());
            System.out.println("blankStr is blank: " + blankStr.isBlank());
        }
    }


