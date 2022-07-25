import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Sales2D
 * This code as you number of weeks of date
 * It calculates date for this weeks with randomly generated values
 * 
 */
public class Sales2D {

    public static void main(String[] args) {

        // Scanner method to take info from users
        Scanner input = new Scanner(System.in);

        // The args strategey doesnt really go with VSCode so I deviced this
        System.out.println("How many weeks of data do you wanna see: ");
        int weeks = input.nextInt();

        // Initializing values and arrays
        final int NUMBER_OF_WEEKS = weeks;
        final int NUMBER_OF_SALES = 7;
        String[] day = { "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday", "Sunday" };

        int[][] salesAmount = new int[NUMBER_OF_SALES][NUMBER_OF_WEEKS];

        // Passing the array salesAmount through the tofillArrays
        TofillArrays(salesAmount);

        System.out.println();

        // Initializing Number format to be used to convert the values to currencies
        NumberFormat currencyGuy = NumberFormat.getCurrencyInstance();

        // Display column headings
        System.out.println("Sales        WEEKS");
        System.out.print("Number       ");
        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            System.out.printf("%5d       ", col + 1);
        }
        System.out.println();
        System.out.print("---------  ");
        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            System.out.print("  --------- ");
        }
        System.out.println();

        // Display of sales table
        double contain;
        for (int row = 0; row < NUMBER_OF_SALES; row++) {
            System.out.print(day[row] + ":   ");
            for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
                contain = ((double) salesAmount[row][col]) / 100;
                System.out.print("   " + currencyGuy.format(contain));
            }
            System.out.println();
        }

        // Calculating the average of every week
        int[] total = new int[NUMBER_OF_WEEKS];
        Arrays.fill(total, 0);
        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            for (int row = 0; row < NUMBER_OF_SALES; row++) {
                total[col] += salesAmount[row][col];
            }
        }

        // Display Average
        System.out.println("\n-----------------------------------------------------");
        System.out.print("Average/week: ");

        double hold = 0.0;
        for (int i = 0; i < NUMBER_OF_WEEKS; i++) {
            hold = (double) (total[i] / NUMBER_OF_SALES);
            System.out.print("   " + currencyGuy.format(hold / 100));

        }

        System.out.println();

        // Calculating the Max value
        int[] maxValue = new int[weeks];
        Arrays.fill(maxValue, 0);
        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            for (int row = 0; row < NUMBER_OF_SALES; row++) {
                if (salesAmount[row][col] > maxValue[col]) {
                    maxValue[col] = salesAmount[row][col];
                }
            }
        }

        // Displaying the max values
        System.out.print("\nMaxi Values: ");
        double holdmax;
        for (int i = 0; i < maxValue.length; i++) {
            holdmax = (double) maxValue[i];
            System.out.print("    " + currencyGuy.format(holdmax / 100));
        }

        System.out.println();

        // Calculating the Min value and the day that holds this value
        int[] minValue = new int[weeks];
        Arrays.fill(minValue, 10000000);
        String[] lowDay = new String[NUMBER_OF_WEEKS];
        for (int col = 0; col < NUMBER_OF_WEEKS; col++) {
            for (int row = 0; row < NUMBER_OF_SALES; row++) {
                if (salesAmount[row][col] < minValue[col]) {
                    minValue[col] = salesAmount[row][col];
                    lowDay[col] = day[row];
                }
            }
        }

        // Displaying the min values
        System.out.print("\nMin Values: ");
        double holdmin;
        for (int i = 0; i < maxValue.length; i++) {
            holdmin = (double) minValue[i];
            System.out.print("    " + currencyGuy.format(holdmin / 100)
                    + "(" + lowDay[i] + ")");
        }

        // Calculating Difference between max and min
        int[] diff = new int[weeks];
        Arrays.fill(diff, 0);
        for (int i = 0; i < minValue.length; i++) {
            diff[i] = maxValue[i] - minValue[i];
        }

        System.out.println();
        // Display of difference between max and min
        System.out.print("\nDifference: ");
        double holddiff;
        for (int i = 0; i < maxValue.length; i++) {
            holddiff = (double) diff[i];
            System.out.print("    " + currencyGuy.format(holddiff / 100));
        }

        //
        // System.out.println("\nThe day with the lowest avearage sale per day" +
        // lowDay);
    }

    // Method that generates random numbers and fills them in the 2D array
    public static void TofillArrays(int[][] a) {

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {

                // return (int) ((Math.random() * (max - min)) + min);
                a[row][col] = (int) (Math.random() * (500000 - 100000) + 500000);
            }
        }
    }
}
