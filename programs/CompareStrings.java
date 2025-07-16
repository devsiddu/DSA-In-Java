
//program Compare Strings
package programs;

public class CompareStrings {

    public static void main(String[] args) {
        String name1 = "CodeSpire";
        String name2 = "CodeSpire";

        if (name1.equals(name2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // DO NOT USE == to check for string equality
        // Gives correct answer here

        if (name1 == name2) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }

        // Gives incorrect answer here
        if (new String("CodeSpire") == new String("CodeSpire")) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");

        }

    }

}