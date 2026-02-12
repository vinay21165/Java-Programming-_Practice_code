public class ArrayPractice {

    public static void main(String[] args) {

        int[] arr = {10, 25, 30, 45, 12, 8};

        System.out.println("Array Elements:");
        printArray(arr);

        System.out.println("\nSum of Elements: " + findSum(arr));

        System.out.println("Largest Element: " + findMax(arr));

        System.out.print("Reversed Array: ");
        reverseArray(arr);

        countEvenOdd(arr);

        int key = 30;
        searchElement(arr, key);
    }

    // Q1: Find Sum of Elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Q2: Find Largest Element
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Q3: Reverse Array
    public static void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Q4: Count Even and Odd Numbers
    public static void countEvenOdd(int[] arr) {
        int even = 0, odd = 0;

        for (int num : arr) {
            if (num % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);
    }

    // Q5: Linear Search
    public static void searchElement(int[] arr, int key) {
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found.");
        }
    }

    // Utility Method to Print Array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

