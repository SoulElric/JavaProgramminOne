package Chapter6;

import java.util.Scanner;

/**
 * Program to display the password a user was prompted to enter to the console
 *
 * @author Finn Neu
 */

public class C6_18 {
  /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create a Scanner
        System.out.print("Enter a password: ");
        String password = input.nextLine();
        System.out.println(
                (isValidPassword(password) ? "Valid " : "Invalid ") + "Password");
    }
/**
 * Method to see if the password a user was prompted to enter to the console was valid
 * @param password the users password
 * @return true or false
 */
    public static boolean isValidPassword(String password) {
        final int LENGTH_OF_VALID_PASSWORD = 8;
        final int MINIMUM_NUMBER_OF_DIGITS = 2;
        boolean validPassword
                = isLengthValid(password, LENGTH_OF_VALID_PASSWORD)
                && isOnlyLettersAndDigits(password)
                && hasNDigits(password, MINIMUM_NUMBER_OF_DIGITS);
        return validPassword;
    }
/**
 * Method to see if the password a user was prompted to enter to the console has the correct length
 * @param password the users password
 * @param validLength the length of the users password
 * @return true or false 
 */
    public static boolean isLengthValid(String password, int validLength) {
        return password.length() >= validLength;
    }
/**
 * Method to see if the password a user was prompted to enter to the console has only letters and digits
 * @param password the users password
 * @return false
 */
    public static boolean isOnlyLettersAndDigits(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!Character.isLetterOrDigit(password.charAt(i))) {
                return false;
            }
        }
        return true;
    }
/**
 * Method to see if the password a user was prompted to enter to the console has the digits required
 * @param password the users password 
 * @param n number of digits in the password
 * @return true
 */
    public static boolean hasNDigits(String password, int n) {
        int numberOfDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numberOfDigits++;
            }
            if (numberOfDigits >= n) {
                return true;
            }
        }
        return false;
    }
}
