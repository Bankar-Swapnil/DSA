public class MatrixSum {
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

        // Finding the sum of each row
        int[] rowSums = sumOfRows(matrix);

        // Displaying the sum of each row
        System.out.println("\nSum of Each Row:");
        displayArray(rowSums);

        // Finding the sum of each column
        int[] colSums = sumOfColumns(matrix);

        // Displaying the sum of each column
        System.out.println("\nSum of Each Column:");
        displayArray(colSums);
    }

    // Method to find the sum of each row in a matrix
    private static int[] sumOfRows(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] rowSums = new int[rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                rowSums[i] += mat[i][j];
            }
        }

        return rowSums;
    }

    // Method to find the sum of each column in a matrix
    private static int[] sumOfColumns(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] colSums = new int[cols];

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows; i++) {
                colSums[j] += mat[i][j];
            }
        }

        return colSums;
    }

    // Method to display a matrix
    private static void displayMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    // Method to display an array
    private static void displayArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
