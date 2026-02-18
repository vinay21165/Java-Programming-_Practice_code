import java.util.Arrays;

public class AdvancedArrayManipulation {

    public static void main(String[] args) {

        int[] arr = {2, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Original Array: " + Arrays.toString(arr));

        reverseArray(arr.clone());

        rotateLeft(arr.clone(), 2);

        printAllSubarrays(arr);

        System.out.println("Is Array Sorted? " + isSorted(arr));

        System.out.println("Maximum Subarray Sum: " + maxSubArraySum(arr));
    }

    // Q1: Reverse Array (Two Pointer)
    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    // Q2: Rotate Left by n times
    public static void rotateLeft(int[] arr, int n) {
        int len = arr.length;
        n = n % len;

        int[] rotated = new int[len];

        for (int i = 0; i < len; i++) {
            rotated[i] = arr[(i + n) % len];
        }

        System.out.println("Left Rotated Array: " + Arrays.toString(rotated));
    }

    // Q3: Print All Subarrays
    public static void printAllSubarrays(int[] arr) {
        System.out.println("All Subarrays:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }
    }

    // Q4: Check if Array is Sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    // Q5: Maximum Subarray Sum (Kadane’s Algorithm)
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}

