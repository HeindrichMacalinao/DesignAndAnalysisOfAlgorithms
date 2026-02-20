import java.util.Scanner;

public class NumberPattern2DArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];
        int num = 1;

        // Fill the matrix in snake-like column order
        for (int col = 0; col < n; col++) {
            if (col % 2 == 0) {
                // Fill top to bottom
                for (int row = 0; row < n; row++) {
                    matrix[row][col] = num++;
                }
            } else {
                // Fill bottom to top
                for (int row = n - 1; row >= 0; row--) {
                    matrix[row][col] = num++;
                }
            }
        }

        // Print the matrix row by row
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}