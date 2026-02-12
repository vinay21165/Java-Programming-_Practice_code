public class PerfectNumber {
    public static boolean isPerfect(int n) {
        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum == n;
    }

    public static void main(String[] args) {
        int number = 28;
        System.out.println(isPerfect(number) ? "Perfect Number" : "Not Perfect");
        //(Ternary Operator):
     //Ye ek line me hi decision le leta hai:
        // Condition true → "Perfect Number"
        // Condition false → "Not Perfect Number"
    }
}
