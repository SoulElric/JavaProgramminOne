package Chapter3;

import java.util.Scanner;

/**
 * Program to display if a number is in range or out of range from 1 to 100 and
 * to see if it equals an A or a B or a C or a D or a F and to see if a number
 * is equal to the second number or is greater or is less than to the console
 *
 * @author Finn Neu
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double z;
        double a;

        System.out.println("Enter a number from the keyboard.");
        z = input.nextDouble();
        System.out.println("Enter a number from the keyboard again.");
        a = input.nextDouble();

        if (a < z) {
            System.out.println("The first number is less than the second.");
        }
        if (z > a) {
            System.out.println("The first number is greater than the second.");
        }
        if (z == a) {
            System.out.println("The first number is equal to the second.");
        }
        if (z < a) {
            System.out.println("The first number is less than the second.");
        }
        if (z != a) {
            System.out.println("The first number is not equal to the second.");
        }
        if (a == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (z / a < 1) {
            System.out.println("Proper fraction.");
        }
        if (z >= 90) {
            System.out.println("A");
        } else if (z >= 80) {
            System.out.println("B");
        } else if (z >= 70) {
            System.out.println("C");
        } else if (z >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

        if (a >= 1 && a <= 100) {
            System.out.println("That is in range");
        } else {
            System.out.println("That is out of range");
        }
    }
}
