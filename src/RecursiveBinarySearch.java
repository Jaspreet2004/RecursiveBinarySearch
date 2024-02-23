public class RecursiveBinarySearch {
    static int binarySearch(int[] arr, int target, int low, int high) {
        // Base case: if low is greater than high, the target is not found
        if (low > high) {
            return -1;
        }

        // Calculate the middle index
        int mid = low + (high - low) / 2;

        // If the middle element is the target, return its index
        if (arr[mid] == target) {
            return mid;
        }
        // If the target is less than the middle element, search the left half
        else if (target < arr[mid]) {
            return binarySearch(arr, target, low, mid - 1);
        }
        // If the target is greater than the middle element, search the right half
        else {
            return binarySearch(arr, target, mid + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        int index = binarySearch(arr, target, 0, arr.length - 1);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
}
