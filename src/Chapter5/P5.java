package Chapter5;

import java.util.Scanner; 

/**
 * Program to display the total number of votes for yes and no and how many invalid ones you get to the console
 *
 * @author Finn Neu
 */

public class P5 {

    public static void main(String[] args) {
        int y = 0;
        int n = 0;
        int i = 0;

        String str = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Enter your vote.");
            str = input.next().toUpperCase();

            if (str.equals("Y")) {
                y++;
            } else if (str.equals("N")) {
                n++;
            } else if (str.equals("Q")) {
                break;
            } else {
                System.out.println("Invalid");
                i++;
                continue;

            }
        } while (!str.equals("Q"));
        System.out.println("The number of yes votes is " + y);
        System.out.println("The number of no votes is " + n);
        System.out.println("The number od invalid votes is " + i);
        System.out.println("The total number of votes is " + (y + n + i));
    }
}
