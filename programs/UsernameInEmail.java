/* Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example : 
email = “helloWorld123@gmail.com”; username = “helloWorld123”

*/
package programs;

import java.util.Scanner;

public class UsernameInEmail {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email: ");
        String email = sc.nextLine();

        // method 1
        // Using a loop to find the '@' character
        String usernameString = "";
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                break;
            } else {
                usernameString += email.charAt(i);
            }
        }
        System.out.println("Your username is: " + usernameString);

        // method 2
        // Using indexOf and substring methods
        int atIndex = email.indexOf('@');
        String usernameSub = email.substring(0, atIndex);
        System.out.println("Your username is: " + usernameSub);

        // method 3
        // Using split method
        String username = email.split("@")[0];
        System.out.println("Your username is: " + username);
    }
}