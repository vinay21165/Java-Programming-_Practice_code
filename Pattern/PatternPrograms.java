public class PatternPrograms {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("1. Right-Angled Triangle:");
        rightTriangle(n);

        System.out.println("\n2. Inverted Right-Angled Triangle:");
        invertedTriangle(n);

        System.out.println("\n3. Pyramid Pattern:");
        pyramid(n);

        System.out.println("\n4. Number Triangle:");
        numberTriangle(n);

        System.out.println("\n5. Floyd's Triangle:");
        floydTriangle(n);
    }

    // Q1: Right-Angled Triangle
    public static void rightTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q2: Inverted Right-Angled Triangle
    public static void invertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Q3: Pyramid Pattern
    public static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {

            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // Q4: Number Triangle
    public static void numberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    // Q5: Floyd's Triangle
    public static void floydTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}

