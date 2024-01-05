public class MatrixEquality {
    public static void main(String[] args) {
        // Example matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Displaying the original matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Checking if the matrices are equal
        boolean areEqual = areMatricesEqual(matrix1, matrix2);

        // Displaying the result
        if (areEqual) {
            System.out.println("\nThe matrices are equal.");
        } else {
            System.out.println("\nThe matrices are not equal.");
        }
    }

    // Method to check if two matrices are equal
    private static boolean areMatricesEqual(int[][] mat1, int[][] mat2) {
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length) {
            return false; // Matrices have different dimensions
        }

        int rows = mat1.length;
        int cols = mat1[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat1[i][j] != mat2[i][j]) {
                    return false; // Matrices have different elements
                }
            }
        }

        return true; // Matrices are equal
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
