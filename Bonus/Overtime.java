
/* This code will calculate wage and including over time */
import java.text.NumberFormat;
import java.util.Scanner;

public class Overtime {
    public static void main(String[] args) {
        final double FULLTIME = 40.0;
        final double OVERTIME_RATE = 0.5;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter wage and hours: ");
            double wage = input.nextDouble();
            double hours = input.nextDouble();

            double pay = wage * hours;
            if (hours > FULLTIME) {
                pay += (hours - FULLTIME) * (wage * OVERTIME_RATE);
            }
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();

            System.out.println("Pay is: "
                    + currencyFormatter.format(pay));
        }

    }

}