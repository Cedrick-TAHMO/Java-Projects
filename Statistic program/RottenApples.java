import java.util.Arrays;

import javax.swing.plaf.metal.MetalIconFactory.FolderIcon16;

/**
 * RottenApples
 */
public class RottenApples {

    public static void main(String[] args) {
        /**
         * Create a 2D array of int values (not there are two different
         * ways to create an array)
         * Each row represents a different apple supplier
         * Each colume represents a week in which we receive apples
         * Each value is the number of rotten apples we found from
         * that supplier for that week
         */

        int[][] RottenApples = {
                { 1, 4, 3, 0, 6 },
                { 0, 0, 2, 1, 0 },
                { 17, 18, 14, 12, 15 },
                { 5, 8, 2, 0, 7 } };

        /**
         * Create local constants that make the meaning of the
         * length values more clear.
         */

        final int NUMBER_OF_SUPPLIERS = RottenApples.length;
        final int NUMBER_OF_WEEKS = RottenApples[0].length;

        // Display the array contents with the columns aligned
        System.out.println();

        // Display column headings
        System.out.println("Supplier         *** Weeks ***");
        System.out.print("Number ");

        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            System.out.printf("%5d", col);
        }
        System.out.println();

        System.out.print("------- ");
        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            System.out.print("  ---");
        }
        System.out.println();

        for (int row = 0; row < NUMBER_OF_SUPPLIERS; row++) {
            System.out.printf("%5d)", row);
            for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
                System.out.printf("%5d", RottenApples[row][col]);
            }
            System.out.println();
        }
        System.out.println();

        /**
         * Calculate the average rotten apples per week for
         * each supplier. Begin by creating an array to hold the row
         * sums. We also need an array for the row averages.
         */
        int[] sum = new int[NUMBER_OF_SUPPLIERS];
        Arrays.fill(sum, 0);
        /**
         * fill is a static method in the Arrays class. It's more convenient
         * than writing a loop to initialize the array with all zero values
         */

        double[] average = new double[NUMBER_OF_SUPPLIERS];

        for (int row = 0; row < NUMBER_OF_SUPPLIERS; row++) {
            for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
                sum[row] += RottenApples[row][col];
            }

            average[row] = ((double) sum[row] / NUMBER_OF_WEEKS);
        }

        // Display the averages in two columns
        System.out.println("                Average");
        System.out.println("Supplier        Rotten");
        System.out.println(" Number         Apples");
        System.out.println("========        =======");
        String format = "    [%1d]          %4.1f\n";

        for (int i = 0; i < NUMBER_OF_SUPPLIERS; i++) {
            System.out.printf(format, i, average[i]);
        }

        System.out.println();
    }
}