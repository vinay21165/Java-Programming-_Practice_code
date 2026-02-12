public class TwoDAraay {
    public static void main(String[] args) {

        int a[][] = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        rotate(a);

        // Print rotated matrix
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Rotate 90 degree anticlockwise
    public static void rotate(int a[][]) {

        int n = a.length;

        // Step 1: Transpose (in-place)
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for(int i = 0; i < n; i++) {
            reverseRow(a[i]);
        }
    }

    // Reverse 1D array
    public static void reverseRow(int arr[]) {
        int i = 0;
        int j = arr.length - 1;

        while(i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
