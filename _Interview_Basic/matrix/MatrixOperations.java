public class MatrixOperations {
    public static void main(String[] args) {
        // Example matrices
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Displaying the original matrices
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);

        // Adding the matrices
        int[][] sumMatrix = addMatrices(matrix1, matrix2);

        // Displaying the result of matrix addition
        System.out.println("\nResult Matrix after Addition:");
        displayMatrix(sumMatrix);

        // Subtracting the matrices
        int[][] differenceMatrix = subtractMatrices(matrix1, matrix2);

        // Displaying the result of matrix subtraction
        System.out.println("\nResult Matrix after Subtraction:");
        displayMatrix(differenceMatrix);
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        return resultMatrix;
    }

    // Method to subtract two matrices
    private static int[][] subtractMatrices(int[][] mat1, int[][] mat2) {
        int rows = mat1.length;
        int cols = mat1[0].length;

        int[][] resultMatrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultMatrix[i][j] = mat1[i][j] - mat2[i][j];
            }
        }

        return resultMatrix;
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
