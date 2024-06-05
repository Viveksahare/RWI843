public class TwoDimensionalArray {
        public static void main(String[] args) {
            // Declare and initialize a two-dimensional array
            int[][] twoDArray = new int[3][3];

            // Fill the array with values
            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[i].length; j++) {
                    twoDArray[i][j] = i * j;
                }
            }

            // Print the array values
            System.out.println("Two-dimensional array values:");
            for (int i = 0; i < twoDArray.length; i++) {
                for (int j = 0; j < twoDArray[i].length; j++) {
                    System.out.println("Element at index [" + i + "][" + j + "]: " + twoDArray[i][j]);
                }
            }
        }
    }

