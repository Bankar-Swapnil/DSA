public class FrequencyOfOddEven {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Displaying the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Finding the frequency of odd and even numbers
        int oddFrequency = 0;
        int evenFrequency = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element % 2 == 0) {
                    evenFrequency++;
                } else {
                    oddFrequency++;
                }
            }
        }

        // Displaying the frequency of odd and even numbers
        System.out.println("\nFrequency of Odd Numbers: " + oddFrequency);
        System.out.println("Frequency of Even Numbers: " + evenFrequency);
    }

    // Method to display the elements of a matrix
    private static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
