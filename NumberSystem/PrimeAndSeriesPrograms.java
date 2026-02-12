public class PrimeAndSeriesPrograms {

    public static void main(String[] args) {

        int armNum = 153;
        System.out.println(armNum + " is Armstrong? " + isArmstrong(armNum));

        System.out.println("\nFirst 10 Prime Numbers:");
        printFirstNPrimes(10);

        System.out.println("\n\n5th Prime Number: " + nthPrime(5));

        int num = 10;
        findNextAndPreviousPrime(num);

        System.out.println("\nFirst 10 Fibonacci Numbers:");
        printFibonacci(10);
    }

    // Q1 Armstrong Number
    public static boolean isArmstrong(int num) {
        int original = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }

        return sum == original;
    }

    // Prime Check Method
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // Q2 First N Prime Numbers
    public static void printFirstNPrimes(int n) {
        int count = 0;
        int number = 2;

        while (count < n) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++;
            }
            number++;
        }
    }

    // Q3 nth Prime Number
    public static int nthPrime(int n) {
        int count = 0;
        int number = 2;

        while (true) {
            if (isPrime(number)) {
                count++;
                if (count == n)
                    return number;
            }
            number++;
        }
    }

    // Q4 Next and Previous Prime
    public static void findNextAndPreviousPrime(int num) {

        int prev = num - 1;
        while (prev > 1 && !isPrime(prev)) {
            prev--;
        }

        int next = num + 1;
        while (!isPrime(next)) {
            next++;
        }

        System.out.println("\nPrevious Prime of " + num + " = " + prev);
        System.out.println("Next Prime of " + num + " = " + next);
    }

    // Q5 Fibonacci Series
    public static void printFibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
    
