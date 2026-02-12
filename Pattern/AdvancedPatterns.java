public class AdvancedPatterns {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("1. Hollow Square Pattern:");
        hollowSquare(n);

        System.out.println("\n2. Hollow Right-Angled Triangle:");
        hollowTriangle(n);

        System.out.println("\n3. Diamond Pattern:");
        diamond(n);

        System.out.println("\n4. Palindrome Number Pyramid:");
        palindromePyramid(n);
        
        System.out.println("\n5. Pascal's Triangle:");
        pascalTriangle(n);
    }
     // Q1: Hollow Square
    public static void hollowSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    // Q2: Hollow Right-Angled Triangle
    public static void hollowTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == 1 || i == n || j == 1 || j == i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }

    // Q3: Diamond Pattern
    public static void diamond(int n) {

        // Upper Half
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }

        // Lower Half
        for (int i = n - 1; i >= 1; i--) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");

            System.out.println();
        }
    }

    // Q4: Palindrome Number Pyramid
    public static void palindromePyramid(int n) {

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            // Increasing numbers
            for (int j = 1; j <= i; j++)
                System.out.print(j);

            // Decreasing numbers
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j);

            System.out.println();
        }
    }

    // Q5: Pascal's Triangle
    public static void pascalTriangle(int n) {

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++)
                System.out.print(" ");

            int number = 1;

            for (int j = 0; j <= i; j++) {
                System.out.print(number + " ");
                number = number * (i - j) / (j + 1);
            }

            System.out.println();
        }
    }
}

