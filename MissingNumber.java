// finds the missing number in an array of integers from 1 to n

public class MissingNumber {
        public static void main(String[] args) {
            int[] array = {1, 2, 4, 5, 6};
            int n = array.length + 1;
            int sum = (n * (n + 1)) / 2;

            for (int num : array) {
                sum = sum - num;
            }

            System.out.println("Missing number: " + sum);
        }
    }


