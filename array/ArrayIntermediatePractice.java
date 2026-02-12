
import java.util.Arrays;

public class ArrayIntermediatePractice {

    public static void main(String[] args) {

        int[] arr = {10, 45, 30, 99, 45, 30, 10};

        System.out.println("Original Array: " + Arrays.toString(arr));

        System.out.println("Second Largest Element: " + findSecondLargest(arr));

        System.out.println("Array After Removing Duplicates: " +
                Arrays.toString(removeDuplicates(arr)));

        countFrequency(arr);

        System.out.println("Array After Right Rotation: " +
                Arrays.toString(rotateRight(arr)));

        int[] arr2 = {5, 6, 7};
        System.out.println("Merged Array: " +
                Arrays.toString(mergeArrays(arr, arr2)));
    }

    // Q1: Find Second Largest Element
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    // Q2: Remove Duplicates (Without Using Set)
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            for (int j = 0; j < index; j++) {
                if (arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[index++] = arr[i];
            }
        }

        return Arrays.copyOf(temp, index);
    }

    // Q3: Count Frequency of Each Element
    public static void countFrequency(int[] arr) {
        System.out.println("Element Frequency:");

        boolean[] visited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) continue;

            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count + " times");
        }
    }

    // Q4: Rotate Array to Right by One Position
    public static int[] rotateRight(int[] arr) {
        int[] rotated = new int[arr.length];

        rotated[0] = arr[arr.length - 1];

        for (int i = 1; i < arr.length; i++) {
            rotated[i] = arr[i - 1];
        }

        return rotated;
    }

    // Q5: Merge Two Arrays
    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int[] merged = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merged[arr1.length + i] = arr2[i];
        }

        return merged;
    }
}
