import java.util.Scanner;

public class NumberPatternZigzag {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int totalCells = n * n;

        for (int i = 0; i < totalCells; i++) {
            // Determine current row and column based on the loop index
            int row = i % n;
            int col = i / n;

            int value;
            if (col % 2 == 0) {
                // Even columns: Standard top-to-bottom calculation
                value = (col * n) + (row + 1);
            } else {
                // Odd columns: Reverse calculation (bottom-to-top)
                value = (col * n) + (n - row);
            }

            // Print the value with tab spacing
            System.out.print(value + "\t");

            // Move to the next line once we reach the end of a row
            if ((i + 1) % n == 0) {
                System.out.println();
            }
        }
    }
}