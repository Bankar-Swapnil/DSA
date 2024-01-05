

public class RightRotateArray {
    public static void main(String[] args) {
        // Example array
        int[] array = {1, 2, 3, 4, 5};

        // Number of times to right rotate
        int rotateCount = 2;

        // Displaying the original array
        System.out.println("Original Array:");
        displayArray(array);

        // Right rotate the array
        rightRotateArray(array, rotateCount);

        // Displaying the right rotated array
        System.out.println("\nArray after right rotation:");
        displayArray(array);
    }

    // Method to right rotate the array by specified number of times
    private static void rightRotateArray(int[] arr, int rotateCount) {
        int n = arr.length;

        // Perform right rotation
        for (int i = 0; i < rotateCount; i++) {
            int temp = arr[n - 1];
            for (int j = n - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
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
