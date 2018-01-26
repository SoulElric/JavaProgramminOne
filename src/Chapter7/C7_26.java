package Chapter7;

/**
 *Program to display an array that has two lists to the console
 * @author Finn Neu
 */
 import java.util.*;

public class C7_26 {
 /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter list 1:  ");
        
        int list1[] = new int[input.nextInt()];
        for(int i = 0; i < list1.length; i++){
            list1[i] = input.nextInt();
        }
        
        System.out.print("Enter list 2:  ");
        
        int list2[] = new int[input.nextInt()];
        for(int i = 0; i < list2.length; i++){
            list2[i] = input.nextInt();
        }
        
        if (Arrays.equals(list1, list2)) {
            System.out.println("The two lists are strictly identical");
        }
        else {
            System.out.println("The two lists are not strictly identical"); 
        }
    }        
}