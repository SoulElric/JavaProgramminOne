package Chapter2;

import java.util.Scanner;

/**
 * Program to display the meal total and the tax and the tip and the grand total
 * to the console
 *
 * @author Finn Neu
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an amount for the meal you ordered (include the drink and dessert in the price).");

        double tax = 0.10;
        double tip = 0.15;
        double meal, drink, dessert;
        meal = input.nextDouble();
        drink = input.nextDouble();
        dessert = input.nextDouble();

        double mealtotal = meal + drink + dessert;
        double mealtax = mealtotal * tax;
        double mealtip = (mealtotal + mealtax) * tip;
        double total = mealtotal + mealtax + mealtip;

        System.out.println("Your meal total is " + mealtotal);
        System.out.println("Your tax is " + mealtax);
        System.out.println("Your tip is " + mealtip);
        System.out.println("Your total is " + total);

    }
}
