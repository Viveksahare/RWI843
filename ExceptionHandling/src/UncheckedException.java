public class UncheckedException {
        public static void main(String[] args) {
            try {
                int[] numbers = {1, 2, 3};
                int number = numbers[5]; // This will throw an ArrayIndexOutOfBoundsException
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught an exception: " + e.getMessage());
            }
        }
    }


