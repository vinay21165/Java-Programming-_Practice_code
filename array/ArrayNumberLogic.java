public class ArrayNumberLogic {

    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 11, 121, 145, 153, 370, 10, 22};

        System.out.println("Prime Elements:");
        printPrimeElements(arr);

        System.out.println("\nPalindrome Numbers:");
        printPalindromeNumbers(arr);

        System.out.println("\nSum of Strong Numbers: " + sumOfStrongNumbers(arr));

        System.out.println("Count of Armstrong Numbers: " + countArmstrongNumbers(arr));

        int target = 153;
        int index = searchElement(arr, target);
        if (index != -1)
            System.out.println("Element " + target + " found at index: " + index);
        else
            System.out.println("Element not found.");
    }

    // Q1: Print Prime Elements
    public static void printPrimeElements(int[] arr) {
        for (int num : arr) {
            if (isPrime(num))
                System.out.print(num + " ");
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Q2: Print Palindrome Numbers
    public static void printPalindromeNumbers(int[] arr) {
        for (int num : arr) {
            if (isPalindrome(num))
                System.out.print(num + " ");
        }
    }

    public static boolean isPalindrome(int num) {
        int original = num, reverse = 0;
        while (num > 0) {
            reverse = reverse * 10 + num % 10;
            num /= 10;
        }
        return original == reverse;
    }

    // Q3: Sum of Strong Numbers
    public static int sumOfStrongNumbers(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            if (isStrong(num))
                sum += num;
        }
        return sum;
    }

    public static boolean isStrong(int num) {
        int original = num, sum = 0;
        while (num > 0) {
            sum += factorial(num % 10);
            num /= 10;
        }
        return original == sum;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++)
            fact *= i;
        return fact;
    }

    // Q4: Count Armstrong Numbers
    public static int countArmstrongNumbers(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (isArmstrong(num))
                count++;
        }
        return count;
    }

    public static boolean isArmstrong(int num) {
        int original = num, sum = 0;
        int digits = String.valueOf(num).length();

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return original == sum;
    }

    // Q5: Search Element (Linear Search)
    public static int searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
