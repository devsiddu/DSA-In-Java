//Take an array of names as input from the user and print them on the screen.

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user
        System.out.println("Enter the no of name list : ");
        int size = sc.nextInt();
        
        String names[] = new String[size];

        System.out.println("Enter all Names : ");
        for (int name = 0; name < size; name++) {
            names[name] = sc.next();
        }

        // display entered names
        System.out.println("List of entered names : ");
        for (int name = 0; name < names.length; name++) {
            System.out.println(names[name]);
        }
    }
}
