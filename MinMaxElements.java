//finds both the smallest and largest elements in an array.

public class MinMaxElements {
        public static void main(String[] args) {
            int[] array = {5, 3, 9, 1, 7, 2, 8};
            int min = array[0];
            int max = array[0];

            for (int num : array) {
                if (num < min) {
                    min = num;
                }
                if (num > max) {
                    max = num;
                }
            }

            System.out.println("Smallest element: " + min);
            System.out.println("Largest element: " + max);
        }
    }


