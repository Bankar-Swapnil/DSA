public class MatrixTranspose {
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

        // Finding the transpose of the matrix
        int[][] transposeMatrix = transpose(matrix);

        // Displaying the transpose matrix
        System.out.println("\nTranspose Matrix:");
        displayMatrix(transposeMatrix);
    }

    // Method to find the transpose of a matrix
    private static int[][] transpose(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[][] transposeMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = mat[i][j];
            }
        }

        return transposeMatrix;
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
}
