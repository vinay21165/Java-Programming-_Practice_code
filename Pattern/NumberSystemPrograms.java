public class NumberSystemPrograms {

    public static void main(String[] args) {

        int decimal = 25;
        System.out.println("Decimal to Binary: " + decimalToBinary(decimal));
        System.out.println("Decimal to Octal: " + decimalToOctal(decimal));
        System.out.println("Decimal to Hexadecimal: " + decimalToHex(decimal));

        int binary = 1101;
        System.out.println("Binary to Decimal: " + binaryToDecimal(binary));

        int a = 36, b = 60;
        System.out.println("GCD of " + a + " and " + b + " = " + findGCD(a, b));
    }

    // Q1: Decimal to Binary
    public static String decimalToBinary(int num) {
        if (num == 0) return "0";

        String binary = "";
        while (num > 0) {
            binary = (num % 2) + binary;
            num /= 2;
        }
        return binary;
    }

    // Q2: Decimal to Octal
    public static String decimalToOctal(int num) {
        if (num == 0) return "0";

        String octal = "";
        while (num > 0) {
            octal = (num % 8) + octal;
            num /= 8;
        }
        return octal;
    }

    // Q3: Decimal to Hexadecimal
    public static String decimalToHex(int num) {
        if (num == 0) return "0";

        String hex = "";
        char[] hexChars = {'0','1','2','3','4','5','6','7','8','9',
                           'A','B','C','D','E','F'};

        while (num > 0) {
            hex = hexChars[num % 16] + hex;
            num /= 16;
        }
        return hex;
    }

    // Q4: Binary to Decimal
    public static int binaryToDecimal(int num) {
        int decimal = 0;
        int power = 0;

        while (num > 0) {
            int digit = num % 10;
            decimal += digit * Math.pow(2, power);
            power++;
            num /= 10;
        }
        return decimal;
    }

    // Q5: GCD using Euclid’s Algorithm
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

