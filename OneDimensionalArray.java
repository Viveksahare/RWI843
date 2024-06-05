 public class OneDimensionalArray {
        public static void main(String[] args) {
            // Declare and initialize a one-dimensional array
            int[] oneDArray = new int[5];

            // Fill the array with values
            for (int i = 0; i < oneDArray.length; i++) {
                oneDArray[i] = i * 10;
            }

            // Print the array values
            System.out.println("One-dimensional array values:");
            for (int i = 0; i < oneDArray.length; i++) {
                System.out.println("Element at index " + i + ": " + oneDArray[i]);
            }
        }
    }


