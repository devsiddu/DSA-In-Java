//The substring of a string is a subpart of it.

package programs;

public class SubString {

    public static void main(String[] args) {
        String name = "Tony Stark";
        String subName = name.substring(0, 4); // Extracts "Tony"
        System.out.println("Substring: " + subName);
    }
}