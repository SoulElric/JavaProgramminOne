package Chapter4;

import java.util.Scanner;

/**
 * Program to display how much an employee makes and how much is taken from
 * taxes to the console
 *
 * @author Finn Neu
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee's name: ");

        String name = input.next();
        System.out.print("Enter number of hours worked in a week: ");

        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");

        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");

        double federalTaxRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");

        double stateTaxRate = input.nextDouble();
        double grossPay = hoursWorked * hourlyPayRate;
        double federal = federalTaxRate * grossPay;
        double state = stateTaxRate * grossPay;
        double totalDeduction = federal + state;
        double netPay = grossPay - totalDeduction;

        System.out.printf("\nEmployee Name: %s", name);

        System.out.printf("\nHours Worked: %.2f", hoursWorked);

        System.out.printf("\nPayRate: $%.2f", hourlyPayRate);

        System.out.printf("\nGross Pay: $%.2f", grossPay);

        System.out.printf("\nDeductions:\n   Federal Witholding (%.2f%%): $%.2f\n   State Witholding (%.2f%%): $%.2f\n   Total Deduction: $%.2f", (federalTaxRate * 100), federal, (stateTaxRate * 100), state, totalDeduction);

        System.out.printf("\nNet Pay: $%.2f", netPay);
    }
}
