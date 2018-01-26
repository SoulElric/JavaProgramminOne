package Chapter8;

/**
 *Program to display an array that shows how long an employee worked to the console
 * @author fn0911146
 */
public class C8_4 {
 /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int[][] weeklyHours = {{2, 4, 3, 4, 5, 8, 8},
        {7, 3, 4, 3, 3, 4, 4},
        {3, 3, 4, 3, 3, 2, 2},
        {9, 3, 4, 7, 3, 4, 1},
        {3, 5, 4, 3, 6, 3, 8},
        {3, 4, 4, 6, 3, 4, 4},
        {3, 7, 4, 8, 3, 8, 4},
        {6, 3, 5, 9, 2, 7, 9},};
        int[][] totalHours = sumRows(weeklyHours);
        sort(totalHours);
        print(weeklyHours, totalHours);
        
    }

    public static int[][] sumRows(int[][] m) {
        int[][] totals = new int[m.length][2];
        for (int row = 0; row < m.length; row++) {
            totals[row][0] = row;
            totals[row][1] = 0;
            for (int col = 0; col < m[row].length; col++) {
                totals[row][1] += m[row][col];
            }
        }
        return totals;
    }
/**
 * Method to sort the array 
 * @param m the array
 */
    public static void sort(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            int maxCol0 = m[i][0];
            int maxCol1 = m[i][1];
            int maxIndex = i;
            for (int j = i + 1; j < m.length; j++) {
                if (maxCol1 < m[j][1]) {
                    maxCol1 = m[j][1];
                    maxCol0 = m[j][0];
                    maxIndex = j;
                }
            }
            if (i != maxIndex) {
                m[maxIndex][1] = m[i][1];
                m[maxIndex][0] = m[i][0];
                m[i][1] = maxCol1;
                m[i][0] = maxCol0;
            }
        }
    }
/**
 * Method to print out the Employee and the weekly hours they have worked
 * @param m the array 
 * @param totalHours the total number of hours 
 */
    public static void print(int[][] m , int[][] totalHours) {
        System.out.println("Employee     Weekly Hours");
        System.out.println("-------------------------");
        for (int row = 0; row < m.length; row++) {
            System.out.printf("%4d%16d\n", m[row][0], totalHours[row][1]);
        }
    }
}
