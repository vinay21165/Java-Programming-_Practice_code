public class NumberPrograms2 {

    public static void main(String[] args) {

        int num = 1234;
        System.out.println("Reverse of " + num + " = " + reverseNumber(num));

        int palindromeNum = 121;
        System.out.println(palindromeNum + " is Palindrome? " + isPalindrome(palindromeNum));

        int strongNum = 145;
        System.out.println(strongNum + " is Strong Number? " + isStrong(strongNum));

        System.out.println("\nPrime numbers between 1 to 500:");
        printPrimes(1, 500);

        int primeDigitNum = 23745;
        System.out.println("\nPrime digit count in " + primeDigitNum + " = " + countPrimeDigits(primeDigitNum));

        System.out.println("\nSum of palindrome numbers between 1 to 1000 = " + sumPalindrome(1, 1000));
    }

    // Q1: Reverse a number
    public static int reverseNumber(int num) {
        int reverse = 0;
        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }

    // Q2: Check Palindrome
    public static boolean isPalindrome(int num) {
        return num == reverseNumber(num);
    }

    // Q3: Check Strong Number
    public static boolean isStrong(int num) {
        int original = num;
        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num = num / 10;
        }

        return sum == original;
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Q4: Print Prime Numbers in Range
    public static void printPrimes(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
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

    // Q5: Count Prime Digits
    public static int countPrimeDigits(int num) {
        int count = 0;

        while (num != 0) {
            int digit = num % 10;
            if (digit == 2 || digit == 3 || digit == 5 || digit == 7) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    // Q6: Sum of Palindrome Numbers in Range
    public static int sumPalindrome(int start, int end) {
        int sum = 0;

        for (int i = start; i <= end; i++) {
            if (isPalindrome(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
