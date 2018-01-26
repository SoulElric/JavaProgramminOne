package Chapter5;
import java.util.Scanner;

/**
 * Program to display the string the user is asked to enter in reverse to the console
 *
 * @author Finn Neu
 */
public class C5_46 {
      /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
	   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        String reverse = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse += string.charAt(i);
        }
        System.out.println("The reversed string is " + reverse);
    }
}
