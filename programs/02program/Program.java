//Find the maximum & minimum number in an array of integers. 
//[HINT : Read about Integer.MIN_VALUE & Integer.MAX_VALUE in Java]

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        System.out.print("Enter the size of array :");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        System.out.println("Enter the numbers into arrays ");
        for (int number = 0; number < numbers.length; number++) {
            numbers[number] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number = 0; number < numbers.length; number++) {
            if (numbers[number] > max) {
                max = numbers[number];
            }
            
            if(numbers[number] < min){
                min = numbers[number];
            }
        }

        System.out.println("The Minimum Value in the given Array : " + min);
        System.out.println("The Maximum Value in the given Array : " + max);
    }
}