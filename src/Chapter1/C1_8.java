package Chapter1;

import java.util.Scanner;

/**
 * Program to display the area and the perimeter of a circle to the console
 *
 * @author Finn Neu
 */
public class C1_8 {

    public static void main(String args[]) {
        int r;
        double pi = 3.14, area;
        Scanner inputR = new Scanner(System.in);
        System.out.println("Enter the area of the circle");
        r = inputR.nextInt();
        area = pi * r * r;
        System.out.println("The area of the circle is" + area);

        int p;
        Scanner inputP = new Scanner(System.in);
        System.out.println("Enter the perimeter of the circle");
        p = inputP.nextInt();
        area = pi * 2 * r;
        System.out.println("The area of the circle is" + area);

    }
}
