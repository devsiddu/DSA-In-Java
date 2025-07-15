
import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size Of Array : ");
        int size = sc.nextInt(); 
        int[] numbers = new int[size];

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter Search item : ");
        int x = sc.nextInt();

        for(int i = 0; i<numbers.length; i++){
            if (numbers[i] == x) {
                System.out.println("Search item found int index : "+ i);
            }
        }
    }
}