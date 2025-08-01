// Program to find a number in a 2D array

import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int rows = sc.nextInt();

        System.out.println("Enter no of columns");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        // input

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                numbers[row][col] = sc.nextInt();
            }
        }
        // find the given number

        System.out.println("Enter the number to find");
        int x = sc.nextInt();

        // output

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (numbers[row][col] == x) {
                    System.out.println("Number found at row " + row + " and column " + col);
                }
            }
            System.out.println();
        }
    }
}