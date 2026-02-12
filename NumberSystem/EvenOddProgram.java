public class EvenOddProgram {
    // 1. Using Modulus
    public static void checkUsingMod(int n) {
        if (n % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // 2. Without Modulus (Repeated Subtraction)
    public static void checkWithoutMod(int n) {
        while (n > 1) {
            n = n - 2;
        }

        if (n == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    // 3. Using Switch Case
    public static void checkUsingSwitch(int n) {
        switch (n % 2) {
            case 0:
                System.out.println("Even");
                break;
            case 1:
                System.out.println("Odd");
                break;
        }
    }

    // 4. Using Bitwise Operator
    public static void checkUsingBitwise(int n) {
        if ((n & 1) == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
}
