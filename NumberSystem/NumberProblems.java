public class NumberProblems {
    // 1 Prime Number Check
    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // 2 Sum and Product of Digits
    public static void sumAndProduct(int n) {
        int sum = 0;
        int product = 1;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);
    }

    // 3 Count Digits
    public static int countDigits(int n) {
        int count = 0;

        if (n == 0) return 1;

        while (n > 0) {
            count++;
            n /= 10;
        }

        return count;
    }

    // 4 Spy Number Check
    // Spy Number: Sum of digits == Product of digits
    public static boolean isSpyNumber(int n) {
        int sum = 0;
        int product = 1;
        int temp = n;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        return sum == product;
    }

    // 5 Neon Number Check
    // Neon Number: Sum of digits of square == original number
    public static boolean isNeonNumber(int n) {
        int square = n * n;
        int sum = 0;

        while (square > 0) {
            int digit = square % 10;
            sum += digit;
            square /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {

        int number = 1124;
        int testNeon = 9;

        // Prime Check
        System.out.println("Is Prime: " + isPrime(number));

        // Sum and Product
        sumAndProduct(number);

        // Count Digits
        System.out.println("Digit Count: " + countDigits(number));

        // Spy Number
        System.out.println("Is Spy Number: " + isSpyNumber(number));

        // Neon Number
        System.out.println("Is Neon Number: " + isNeonNumber(testNeon));
    }
}
