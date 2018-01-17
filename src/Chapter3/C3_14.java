package Chapter3;

import java.util.Scanner;

/**
 * Program to display a game of heads or tails to the console
 *
 * @author Finn Neu
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coin = (int) (Math.random() * 2);
        System.out.print("Enter a guess 0-head or 1-tail: ");
        int guess = input.nextInt();
        System.out.println(((guess == coin) ? "Correct" : "Incorrect") + " guess.");
    }
}
