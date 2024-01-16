public class BinarySearch {
    public static void main(String[] args) {
        // Example sorted array
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        // Element to search for
        int targetElement = 5;

        // Perform binary search
        int result = binarySearch(sortedArray, targetElement);

        // Display the result
        if (result != -1) {
            System.out.println("Element " + targetElement + " found at index " + result);
        } else {
            System.out.println("Element " + targetElement + " not found in the array");
        }
    }

    // Binary search implementation
    private static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if the target is present at the middle
            if (array[mid] == target) {
                return mid;
            }

            // If the target is greater, ignore the left half
            if (array[mid] < target) {
                left = mid + 1;
            }

            // If the target is smaller, ignore the right half
            else {
                right = mid - 1;
            }
        }

        // If we reach here, then the element was not present
        return -1;
    }
}
