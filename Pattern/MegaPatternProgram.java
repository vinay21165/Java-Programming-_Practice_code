public class MegaPatternProgram {

    public static void main(String[] args) {

        int n = 5;

        System.out.println("1. Butterfly Pattern");
        butterfly(n);

        System.out.println("\n2. Hollow Diamond");
        hollowDiamond(n);

        System.out.println("\n3. Character Triangle");
        characterTriangle(n);

        System.out.println("\n4. Reverse Character Triangle");
        reverseCharacterTriangle(n);

        System.out.println("\n5. Continuous Number Triangle");
        continuousNumberTriangle(n);

        System.out.println("\n6. Hollow Pyramid");
        hollowPyramid(n);

        System.out.println("\n7. Right Pascal Triangle");
        rightPascal(n);

        System.out.println("\n8. Binary Triangle");
        binaryTriangle(n);

        System.out.println("\n9. Number Diamond");
        numberDiamond(n);

        System.out.println("\n10. Spiral Pattern (4x4)");
        spiral(4);
    }

    // 1. Butterfly Pattern
    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            for (int j = 1; j <= 2 * (n - i); j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 2. Hollow Diamond
    public static void hollowDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 3. Character Triangle
    public static void characterTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (char ch = 'A'; ch < 'A' + i; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    // 4. Reverse Character Triangle
    public static void reverseCharacterTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }

    // 5. Continuous Number Triangle
    public static void continuousNumberTriangle(int n) {
        int num = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++)
                System.out.print(num++ + " ");
            System.out.println();
        }
    }

    // 6. Hollow Pyramid
    public static void hollowPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    // 7. Right Pascal Triangle
    public static void rightPascal(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) System.out.print("*");
            System.out.println();
        }
    }

    // 8. Binary Triangle
    public static void binaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            int num = i % 2;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }
    }

    // 9. Number Diamond
    public static void numberDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = i - 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) System.out.print(" ");
            for (int j = 1; j <= i; j++) System.out.print(j);
            for (int j = i - 1; j >= 1; j--) System.out.print(j);
            System.out.println();
        }
    }

    // 10. Spiral Pattern
    public static void spiral(int n) {
        int[][] arr = new int[n][n];
        int value = 1;
        int top = 0, bottom = n - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                arr[top][i] = value++;
            top++;

            for (int i = top; i <= bottom; i++)
                arr[i][right] = value++;
            right--;

            for (int i = right; i >= left; i--)
                arr[bottom][i] = value++;
            bottom--;

            for (int i = bottom; i >= top; i--)
                arr[i][left] = value++;
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(arr[i][j] + "\t");
            System.out.println();
        }
    }
}
