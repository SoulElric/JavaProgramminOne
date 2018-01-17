package Chapter4;

import java.util.Scanner;

/**
 * Program to display which worker you should hire for the best price to the
 * console
 *
 * @author Finn Neu
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = input.next();
        System.out.println("Please enter how many hours you want to work.");
        int hours = input.nextInt();
        System.out.println("Please enter how much you charge per hour.");
        double hourlyPay = input.nextDouble();

        double onecost = hours * hourlyPay;

        System.out.println("Please enter your name");
        String name2 = input.next();
        System.out.println("Please enter how many hours you want to work.");
        int hours2 = input.nextInt();
        System.out.println("Please enter how much you charge per hour.");
        double hourlyPay2 = input.nextDouble();

        double twocost = hours2 * hourlyPay2;

        if (onecost < twocost) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", name, onecost, hours);
        } else if (onecost > twocost) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", name2, twocost, hours2);

        } else if (onecost == twocost && hours < hours2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", name, onecost, hours);

        } else if (onecost == twocost && hours > hours2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %d hours", name2, twocost, hours2);

        } else if (onecost == twocost && hours == hours2) {
            System.out.printf("The 2 bidders have identical costs with a total cost of %.2f and %d hours", onecost, hours);

        }
    }
}
