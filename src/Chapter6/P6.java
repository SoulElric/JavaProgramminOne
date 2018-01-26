package Chapter6;



import java.util.Scanner;

/**
 * Program to display the conversion of how many Euros, Pounds, and Yen the US dollar can buy to the console
 *
 * @author Finn Neu
 */

public class P6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Euros can the US dollar buy?");
        double Euro = input.nextDouble();
        System.out.println("How many Pound Sterling can the US dollar buy?");
        double Pound = input.nextDouble();
        System.out.println("How many Yen can the US dollar buy?");
        double Yen = input.nextDouble();

        String reply = "";
        do {
            System.out.println("How many US dollars do you have?");
            double Dollars = input.nextDouble();
            System.out.print("Enter \"E\" to buy Euros, \"P\" to buy Pounds or \"Y\" to buy Yen: ");
            String currency = input.next().toUpperCase();

            // Chosing a conversion to perform based on the user selection
            switch (currency) {
                case "E":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Euros.\n", Dollars, conversion(Dollars, Euro));
                    break;
                case "P":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Pound Sterlings.\n", Dollars, conversion(Dollars, Pound));
                    break;
                case "Y":
                    System.out.printf("For %.2f dollars, you will be able to buy %.2f Yen.\n", Dollars, conversion(Dollars, Yen));
                    break;
            }

            // Asking the user if they want to perform more conversions
            do {
                System.out.print("Are there more conversions to perform? ");
                reply = input.next();
            } while (!reply.equalsIgnoreCase("yes") && !reply.equalsIgnoreCase("no"));

        } while (reply.equalsIgnoreCase("yes"));
    }

    public static double conversion(double dollars, double currency) {

        if (dollars > 100) {
            return dollars * 0.95 * currency;
        } else {
            return dollars * 0.90 * currency;
        }
    }
}
