import java.util.*;

public class AdvancedArrayOperations {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};

        System.out.println("Zigzag Merge: " + Arrays.toString(zigzagMerge(arr1, arr2)));
        System.out.println("Sorted Merge: " + Arrays.toString(sortedMerge(arr1, arr2)));

        int[] leaderArr = {16, 17, 4, 3, 5, 2};
        System.out.print("Leaders: ");
        printLeaders(leaderArr);

        int[] freqArr = {1, 2, 2, 3, 3, 3, 4};
        printByFrequency(freqArr);

        int[] zeroArr = {0, 1, 0, 3, 12};
        moveZeroToEnd(zeroArr);
        System.out.println("Zeros to End: " + Arrays.toString(zeroArr));

        moveZeroToStart(zeroArr);
        System.out.println("Zeros to Start: " + Arrays.toString(zeroArr));
    }

    // Q1 Zigzag Merge
    public static int[] zigzagMerge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            result[k++] = a[i++];
            result[k++] = b[j++];
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }

    // Q2 Sorted Merge
    public static int[] sortedMerge(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j])
                result[k++] = a[i++];
            else
                result[k++] = b[j++];
        }

        while (i < a.length) result[k++] = a[i++];
        while (j < b.length) result[k++] = b[j++];

        return result;
    }

    // Q3 Leader Elements
    public static void printLeaders(int[] arr) {
        int maxFromRight = arr[arr.length - 1];
        System.out.print(maxFromRight + " ");

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > maxFromRight) {
                maxFromRight = arr[i];
                System.out.print(maxFromRight + " ");
            }
        }
        System.out.println();
    }

    // Q4 Sort by Frequency Descending
    public static void printByFrequency(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        List<Integer> list = new ArrayList<>(freq.keySet());

        list.sort((a, b) -> freq.get(b) - freq.get(a));

        System.out.println("Descending by Frequency:");
        for (int num : list) {
            for (int i = 0; i < freq.get(num); i++)
                System.out.print(num + " ");
        }
        System.out.println();
    }

    // Q5 Move Zeros to End
    public static void moveZeroToEnd(int[] arr) {
        int index = 0;

        for (int num : arr) {
            if (num != 0)
                arr[index++] = num;
        }

        while (index < arr.length)
            arr[index++] = 0;
    }

    // Q6 Move Zeros to Start
    public static void moveZeroToStart(int[] arr) {
        int index = arr.length - 1;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0)
                arr[index--] = arr[i];
        }

        while (index >= 0)
            arr[index--] = 0;
    }
}

