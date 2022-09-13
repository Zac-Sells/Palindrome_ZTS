import java.util.Stack;
import java.util.Scanner;
public class Application {

	public static void main(String[] args) {
	 	/**
	 	 * Creates a new scanner, the original string, and the stack 
	 	 */
		System.out.print("Enter a string to determine if it is a palindrome or not.");
        Scanner scan =new Scanner(System.in);
        String string1 = scan.nextLine();
        Stack stringConverter = new Stack();
        /**
         * Indexes each character by pushing them onto the stack  
         */
        for (int i = 0; i < string1.length(); i++) {
            stringConverter.push(string1.charAt(i));
        }
        /**
         * Initiates the second string and creates a reverse of the original by popping characters off the stack
         * had difficulty finding a way to create a second string using the entire index of the stack
         */
        String string2 = "";
        while (!stringConverter.isEmpty()) {
            string2 = string2 + stringConverter.pop();
        }
        /**
         * 
         */
        if (string1.equals(string2))
            System.out.println("palindrome.");
        else
            System.out.println("Not a palindrome.");

    }

}