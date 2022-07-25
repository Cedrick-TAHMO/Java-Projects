import java.util.Arrays;
import java.util.Scanner;

/**
 * InnerEnumRottenApples
 */
public class EnumRottenApples {

    // Notice this is defined outside the main method
    public enum Supplier {
        MIKES, ACME, HARVEYS, EDS_UPICK
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many weeks of information do you wanna see: ");
        int weeks = input.nextInt();

        final int NUMBER_OF_WEEKS = weeks;
        final int NUMBER_OF_SUPPLIERS = Supplier.values().length;

        int[][] RottenApples = new int[NUMBER_OF_SUPPLIERS][NUMBER_OF_WEEKS];
        fill2DArray(RottenApples);

        System.out.println();

        System.out.println(" Supplier           *** Weeks ***");
        System.out.print("   Name   ");

        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            System.out.printf("%5d", col);
        }
        System.out.println();
        System.out.print("---------- ");
        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            System.out.print("  ---");
        }
        System.out.println();

        for (Supplier s : Supplier.values()) {
            System.out.printf("%9s ", s);
            for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
                System.out.printf("%5d", RottenApples[s.ordinal()][col]);
            }
            System.out.println();
        }
        System.out.println();

        // Calculating the Average
        int[] sum = new int[NUMBER_OF_SUPPLIERS];
        Arrays.fill(sum, 0);
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
        System.out.println("  Name          Apples");
        System.out.println("--------        -------");
        String format = "%9s          %4.1f\n";

        for (Supplier s : Supplier.values()) {
            System.out.printf(format, s, average[s.ordinal()]);
        }
        System.out.println();

    }

    public static void fill2DArray(int[][] a) {
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                a[row][col] = (int) (Math.random() * 16);
            }
        }
    }
}