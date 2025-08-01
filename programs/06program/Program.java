//For a given matrixes of N x M, print its transpose.

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrixes = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrixes[row][col] = sc.nextInt();
            }
        }

        // print transpose matrixes

        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                System.out.print(matrixes[row][col] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
