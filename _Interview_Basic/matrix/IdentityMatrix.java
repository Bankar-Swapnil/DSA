public class IdentityMatrix {
    public static void main(String[] args) {
        // Example matrix
        int[][] matrix = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        // Displaying the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Checking if the matrix is an identity matrix
        boolean isIdentity = isIdentityMatrix(matrix);

        // Displaying the result
        if (isIdentity) {
            System.out.println("\nThe matrix is an Identity Matrix.");
        } else {
            System.out.println("\nThe matrix is not an Identity Matrix.");
        }
    }

    // Method to check if a matrix is an identity matrix
    private static boolean isIdentityMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        // An identity matrix must be square (number of rows = number of columns)
        if (rows != cols) {
            return false;
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Diagonal elements must be 1, and non-diagonal elements must be 0
                if ((i == j && mat[i][j] != 1) || (i != j && mat[i][j] != 0)) {
                    return false;
                }
            }
        }

        return true;
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
