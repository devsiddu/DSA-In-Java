// program to Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

package programs;

import java.util.Scanner;

public class LengthOfStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of strings: ");
        int size = sc.nextInt();

        String [] strings = new String[size];

        int totalLength = 0;
        System.out.println("Enter Strings to array ");
        for(int string=0;string<strings.length; string++){
            strings[string] = sc.next();
            totalLength += strings[string].length();

        }
        System.out.println("The total length of all strings is: " + totalLength);
    }
    
}
