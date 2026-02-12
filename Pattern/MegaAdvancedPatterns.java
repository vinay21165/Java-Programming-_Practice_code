public class MegaAdvancedPatterns {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("1. Hollow Butterfly");
        hollowButterfly(n);

        System.out.println("\n2. Double Pyramid");
        doublePyramid(n);

        System.out.println("\n3. 0-1 Checkerboard");
        checkerboard(n);

        System.out.println("\n4. Zig-Zag Pattern");
        zigzag(9);

        System.out.println("\n5. Numeric Hourglass");
        hourglass(n);

        System.out.println("\n6. Hollow Diamond Number");
        hollowDiamondNumber(n);

        System.out.println("\n7. Spiral Star (5x5)");
        spiralStar(5);

        System.out.println("\n8. Sandglass Pattern");
        sandglass(n);

        System.out.println("\n9. Cross (X) Pattern");
        cross(n);

        System.out.println("\n10. Number Square");
        numberSquare(n);
    }

    // 1. Hollow Butterfly
    public static void hollowButterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(j == 1 || j == i ? "*" : " ");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j == 1 || j == i ? "*" : " ");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++)
                System.out.print(j == 1 || j == i ? "*" : " ");
            for (int j = 1; j <= 2 * (n - i); j++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j == 1 || j == i ? "*" : " ");
            System.out.println();
        }
    }

    // 2. Double Pyramid
    public static void doublePyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i) + 1; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 3. Checkerboard
    public static void checkerboard(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print((i + j) % 2 + " ");
            System.out.println();
        }
    }

    // 4. Zigzag Pattern
    public static void zigzag(int n) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 4 == 0 || (i == 1 && j % 4 == 2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 5. Numeric Hourglass
    public static void hourglass(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = i - 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }

    // 6. Hollow Diamond Number
    public static void hollowDiamondNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            System.out.print(i);
            for (int j = 1; j <= 2 * i - 3; j++) System.out.print(" ");
            if (i > 1) System.out.print(i);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            System.out.print(i);
            for (int j = 1; j <= 2 * i - 3; j++) System.out.print(" ");
            if (i > 1) System.out.print(i);
            System.out.println();
        }
    }

    // 7. Spiral Star
    public static void spiralStar(int n) {
        char[][] arr = new char[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = ' ';

        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) arr[top][i] = '*';
            top++;

            for (int i = top; i <= bottom; i++) arr[i][right] = '*';
            right--;

            for (int i = right; i >= left; i--) arr[bottom][i] = '*';
            bottom--;

            for (int i = bottom; i >= top; i--) arr[i][left] = '*';
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j]);
            System.out.println();
        }
    }

    // 8. Sandglass
    public static void sandglass(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 9. Cross Pattern
    public static void cross(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 10. Number Square
    public static void numberSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                System.out.print(n - Math.min(Math.min(i - 1, j - 1),
                        Math.min(n - i, n - j)));
            System.out.println();
        }
    }
}

