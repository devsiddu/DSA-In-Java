package programs;

import java.util.Scanner;

public class ReplaceCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        String result = "";

        for(int i =0 ; i<inputString.length(); i++){
            if (inputString.charAt(i) == 'e') {
                result += 'i';
            }else{
                result+= inputString.charAt(i);
            }
        }
        System.out.println("Modified string: " + result);
    }
    
}
