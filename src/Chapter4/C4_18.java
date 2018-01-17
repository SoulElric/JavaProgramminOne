package Chapter4;

import java.util.Scanner;

/**
 * Program to display if it is Freshman, Sophomore, Junior, or Senior
 * Mathematics or Computer Science or Information Technology to the console
 *
 * @author Finn Neu
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String str = input.nextLine();
        char m = Character.toUpperCase(str.charAt(0));
        char s = str.charAt(1);
        if ((m != 'M' && m != 'C' && m != 'I') || (s != '1' && s != '2' && s != '3' && s != '4')) {
            System.out.print("Invalid Input ");
            System.exit(0);
        }
        switch (m) {
            case 'M':
                System.out.print("Mathematics ");
                break;
            case 'C':
                System.out.print("Computer Science ");
                break;
            case 'I':
                System.out.print("Information Technology ");
                break;
            default:
                System.out.println("Invalid input");
                System.exit(1);
        }
        switch (s) {
            case '1':
                System.out.println("Freshman");
                break;
            case '2':
                System.out.println("Sophomore");
                break;
            case '3':
                System.out.println("Junior");
                break;
            case '4':
                System.out.println("Senior");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
