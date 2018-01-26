package Chapter7;

import java.util.Scanner;
 
 /**
 * Program to display an array of 10 numbers that has a minimum number to the console
 *
 * @author Finn Neu
 */

public class C7_9 {
  /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  System.out.print("Enter ten numbers:");
  Scanner input = new Scanner(System.in);
  double[] numbers = new double[10];
 
  for (int i = 0; i < numbers.length; i++) {
   numbers[i] = input.nextDouble();
  }
 
  System.out.println("The minimum number is: " + min(numbers));
 }
 /**
  * 
  * @param array the min array
  * @return min(double [] array)
  */
 public static double min(double[] array) {
 
  double min = array[0];
 
  for (int i = 1; i < array.length; i++) {
   if (min > array[i]) {
    min = array[i];
   }
  }
 
  return min;
 
 }
}