public class TriangularMatrix {
    public static void main(String[] args) {
        // Example square matrix
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Displaying the original matrix
        System.out.println("Original Matrix:");
        displayMatrix(matrix);

        // Displaying the lower triangular matrix
        System.out.println("\nLower Triangular Matrix:");
        displayLowerTriangular(matrix);

        // Displaying the upper triangular matrix
        System.out.println("\nUpper Triangular Matrix:");
        displayUpperTriangular(matrix);
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

    // Method to display the lower triangular matrix
    private static void displayLowerTriangular(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j > i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // Method to display the upper triangular matrix
    private static void displayUpperTriangular(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (j < i) {
                    System.out.print("0 ");
                } else {
                    System.out.print(mat[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
