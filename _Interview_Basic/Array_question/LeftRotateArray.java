

public class LeftRotateArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        // Number of times to left rotate
        int rotateCount = 2;

        // Displaying the original array
        System.out.println("Original Array:");
        displayArray(array);

        // Left rotate the array
        leftRotateArray(array, rotateCount);

        // Displaying the left rotated array
        System.out.println("\nArray after left rotation:");
        displayArray(array);
    }

    // Method to left rotate the array by specified number of times
    private static void leftRotateArray(int[] arr, int rotateCount) {
        int n = arr.length;

        // Perform left rotation
        for (int i = 0; i < rotateCount; i++) {
            int temp = arr[0];
            for (int j = 0; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = temp;
        }
    }

    // Method to display the elements of an array
    private static void displayArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
