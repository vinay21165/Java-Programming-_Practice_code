public class SortingAndSelection {

    public static void main(String[] args) {

        int[] arr = {10, 4, 7, 15, 3, 20, 8};

        System.out.println("Ascending Order:");
        sortAscending(arr.clone());

        System.out.println("\nDescending Order:");
        sortDescending(arr.clone());

        int n = 3;

        System.out.println("\n" + n + "th Largest (with sorting): " + nthLargest(arr.clone(), n));
        System.out.println(n + "th Smallest (with sorting): " + nthSmallest(arr.clone(), n));

        System.out.println(n + "th Largest (without sorting): " + nthLargestWithoutSorting(arr, n));
        System.out.println(n + "th Smallest (without sorting): " + nthSmallestWithoutSorting(arr, n));
    }

    // Q1: Sort Ascending
    public static void sortAscending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }

    // Sort Descending
    public static void sortDescending(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        printArray(arr);
    }

    // Q2: nth Largest (with sorting)
    public static int nthLargest(int[] arr, int n) {
        sortAscending(arr);
        return arr[arr.length - n];
    }

    // Q3: nth Smallest (with sorting)
    public static int nthSmallest(int[] arr, int n) {
        sortAscending(arr);
        return arr[n - 1];
    }

    // Q4: nth Largest Without Sorting
    public static int nthLargestWithoutSorting(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            largest = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > largest)
                    largest = num;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == largest) {
                    arr[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        return largest;
    }

    // Q5: nth Smallest Without Sorting
    public static int nthSmallestWithoutSorting(int[] arr, int n) {
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            smallest = Integer.MAX_VALUE;
            for (int num : arr) {
                if (num < smallest)
                    smallest = num;
            }

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == smallest) {
                    arr[j] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
        return smallest;
    }

    public static void printArray(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");
        System.out.println();
    }
}

