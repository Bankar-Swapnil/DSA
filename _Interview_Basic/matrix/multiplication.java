
public class multiplication {
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

        // Multiplying the matrices
        int[][] resultMatrix = multiplyMatrices(matrix1, matrix2);

        // Displaying the result matrix
        System.out.println("\nResult Matrix after Multiplication:");
        displayMatrix(resultMatrix);
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] mat1, int[][] mat2) {
        int rows1 = mat1.length;
        int cols1 = mat1[0].length;
        int cols2 = mat2[0].length;

        int[][] resultMatrix = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    resultMatrix[i][j] += mat1[i][k] * mat2[k][j];
                }
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
