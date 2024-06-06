//finds the second largest element in an array.

public class SecondLargestElement {
        public static void main(String[] args) {
            int[] array = {5, 3, 9, 1, 7, 2, 8};
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : array) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            System.out.println("Second largest element: " + secondLargest);
        }
    }


