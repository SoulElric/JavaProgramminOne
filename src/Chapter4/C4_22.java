package Chapter4;

import java.util.Scanner;

/**
 * Program to display if a string is a substring of the two strings that were
 * entered to the console
 *
 * @author Finn Neu
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String string1 = input.nextLine();
        System.out.print("Enter string s2: ");
        String string2 = input.nextLine();
        System.out.println(
                string2 + ((string1.contains(string2)) ? " is " : " is not ")
                + "a substring of " + string1);
    }
}
