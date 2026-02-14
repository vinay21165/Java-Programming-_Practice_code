import java.util.*;

public class AdvancedArrayProblems {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 3, 7, 5, 2, 9, 5, 8};

        System.out.println("Second Most Repeated Element: " + secondMostRepeated(arr));

        System.out.println("Elements Appearing Exactly Twice: ");
        printExactlyTwice(arr);

        System.out.println("First Repeating Element: " + firstRepeating(arr));

        int[] uniqueArr = {2, 3, 5, 4, 5, 3, 4};
        System.out.println("Element Appearing Only Once (XOR Logic): " + singleElement(uniqueArr));

        System.out.println("Pairs with Target Sum 10:");
        printPairsWithSum(arr, 10);
    }

    // Q1: Second Most Repeated Element
    public static int secondMostRepeated(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        int firstMax = 0, secondMax = 0;
        int firstElement = -1, secondElement = -1;

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int count = entry.getValue();
            int element = entry.getKey();

            if (count > firstMax) {
                secondMax = firstMax;
                secondElement = firstElement;
                firstMax = count;
                firstElement = element;
            } else if (count > secondMax && count != firstMax) {
                secondMax = count;
                secondElement = element;
            }
        }
        return secondElement;
    }

    // Q2: Elements Appearing Exactly Twice
    public static void printExactlyTwice(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() == 2)
                System.out.println(entry.getKey());
        }
    }

    // Q3: First Repeating Element
    public static int firstRepeating(int[] arr) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }

    // Q4: Element Appearing Only Once (XOR Approach)
    public static int singleElement(int[] arr) {
        int result = 0;
        for (int num : arr)
            result ^= num;
        return result;
    }

    // Q5: Find Pairs with Given Target Sum
    public static void printPairsWithSum(int[] arr, int target) {
        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int complement = target - num;

            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
            }
            seen.add(num);
        }
    }
}