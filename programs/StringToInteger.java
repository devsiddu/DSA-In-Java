//convert String to Integer

package programs;

public class StringToInteger {

    public static void main(String[] args) {
        String numberString = "112233";
        int number = Integer.parseInt(numberString);
        System.out.println("The integer value is: " + number);

        // Note: If the string cannot be parsed as an integer, it will throw a NumberFormatException.
        // Example: Integer.parseInt("abc"); will throw an exception.
    }
}
