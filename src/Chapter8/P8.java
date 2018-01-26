package Chapter8;

import java.util.*;

/**
 * Program to display the average work week of an employee to the console
 *
 * @author fn0911146
 */
public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double array[][] = new double[4][5];

        String con = "";

        while (!con.equalsIgnoreCase("N")) {
            System.out.println("Enter the ID for the salesman as an A, B, C, or D: ");
            String Ident = input.next();

            while (!Ident.equalsIgnoreCase("A") && !Ident.equalsIgnoreCase("B") && !Ident.equalsIgnoreCase("C") && !Ident.equalsIgnoreCase("D")) {
                System.out.println("Please try again that is the incorrect input: Enter the salesman ID as A, B, C, or D");
                Ident = input.next();
            }

            System.out.println("Enter the day as M, T, W, H, or F: ");
            String day = input.next();

            while (!day.equalsIgnoreCase("M") && !day.equalsIgnoreCase("T") && !day.equalsIgnoreCase("W") && !day.equalsIgnoreCase("H") && !day.equalsIgnoreCase("F")) {
                System.out.println("Try again: Enter the day as M, T, W, H, or F:");
                day = input.next();
            }

            System.out.println("Enter the amount of sale for " + Ident + " on " + day + " :");
            double sale = input.nextDouble();

            array[row(Ident, array)][column(day, array)] = array[row(Ident, array)][column(day, array)] + sale;

            System.out.println("More data? Enter Y to continue and N to stop and exit.");
            con = input.next();

            while (!con.equalsIgnoreCase("Y") && !con.equalsIgnoreCase("N")) {
                System.out.println("Try again: More data? Enter Y for more or N to stop.");
                con = input.next();
            }

        }

        System.out.println("   M     T     W      H      F");
        int number = 65;
        for (int row = 0; row < array.length; row++) {
            System.out.print((char) number++ + "  ");
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + "   ");
            }
            System.out.println();
        }

    }

    /**
     * Method to see if it is A,B,C,D
     *
     * @param iD Identification
     * @param array the array
     * @return row
     */
    public static int row(String iD, double array[][]) {

        int row = 0;

        if (iD.equalsIgnoreCase("A")) {
            row = 0;
            return row;
        } else if (iD.equalsIgnoreCase("B")) {
            row = 1;
            return row;
        } else if (iD.equalsIgnoreCase("C")) {
            row = 2;
            return row;
        } else if (iD.equalsIgnoreCase("D")) {
            row = 3;
            return row;
        }
        return row;

    }

    /**
     * Method to see if it was M,T,W,H,F
     *
     * @param day the day
     * @param array the array
     * @return col
     */
    public static int column(String day, double array[][]) {

        int col = 0;

        if (day.equalsIgnoreCase("M")) {
            col = 0;
            return col;
        } else if (day.equalsIgnoreCase("T")) {
            col = 1;
            return col;
        } else if (day.equalsIgnoreCase("W")) {
            col = 2;
            return col;
        } else if (day.equalsIgnoreCase("H")) {
            col = 3;
            return col;
        } else if (day.equalsIgnoreCase("F")) {
            col = 3;
            return col;
        }

        return col;
    }
}
