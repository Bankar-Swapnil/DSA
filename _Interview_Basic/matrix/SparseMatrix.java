import java.util.Scanner;

// A sparse matrix is a matrix in which most of the elements are zero. 


public class SparseMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int cols = scanner.nextInt();

        // Input matrix elements
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Displaying the original matrix
        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        // Checking if the matrix is sparse
        boolean isSparse = isSparseMatrix(matrix);

        // Displaying the result
        if (isSparse) {
            System.out.println("\nThe matrix is a Sparse Matrix.");
        } else {
            System.out.println("\nThe matrix is not a Sparse Matrix.");
        }

        scanner.close();
    }

    // Method to check if a matrix is a sparse matrix
    private static boolean isSparseMatrix(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int zeroCount = 0;
        int nonZeroCount = 0;

        // Counting the number of zero and non-zero elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        // A matrix is considered sparse if the number of zero elements is greater than non-zero elements
        return zeroCount > nonZeroCount;
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
