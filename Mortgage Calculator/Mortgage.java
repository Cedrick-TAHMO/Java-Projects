import java.security.Principal;
import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final int months = 12;
        final int percentage = 100;
        int principalValue = 0;
        int years = 0;
        Double IntRate = 0.0;

        System.out.print("******This program calculates the Mortgage*****");

        // Principal Value
        while (true) {
            System.out.println("\nPrincipal: ($1k - $1M): ");
            principalValue = input.nextInt();
            if (principalValue >= 1000 && principalValue <= 1000000) {
                break;
            }
            System.out.println("Enter a number between 1,000 and 1,000,000.");
        }

        // Calculating Annual Interest Rate
        while (true) {
            System.out.print("Annual Interest Rate: ");
            IntRate = input.nextDouble();
            if (IntRate >= 1 && IntRate <= 30) {
                IntRate = (IntRate / percentage) / months;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }

        // Calculating the number of Years
        while (true) {

            System.out.print("Period (Years): ");
            years = input.nextInt();
            if (years >= 1 && years <= 30) {
                years = years * months;
                break;
            }

        }

        double top = Math.pow(1 + IntRate, years);
        double bot = Math.pow(1 + IntRate, years) - 1;

        double result = (principalValue * top) / bot;

        String resultFormatted = NumberFormat.getCurrencyInstance().format(result);

        System.out.println("Mortgage: " + resultFormatted);
    }
}
