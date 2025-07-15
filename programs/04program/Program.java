//Take an array of numbers as input and check if it is an array sorted in ascending order.

//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
//     {3, 4, 6, 2} is not sorted in ascending order.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The size of array");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the number to array: ");

        for (int number = 0; number < numbers.length; number++) {
            numbers[number] = sc.nextInt();
        }

        // condition to check if it is sorted or not
        Boolean isSorted = true;
        // ex : 3, 4, 6, 2
        for (int number = 0; number < numbers.length -1; number++) {
            if (numbers[number] > numbers[number + 1]) {
                isSorted = false;
            }
        }
        if (isSorted) {
            System.out.println("The Array is sorted in ascending order.");
        } else {
            System.out.println("The Array is not sorted in ascending order.");
        }
    }
}
