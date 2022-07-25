
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the first number: ");
            double first = input.nextDouble();

            System.out.println("Enter the second number: ");
            double second = input.nextDouble();

            input.nextLine();
            System.out.println("What operation (+, -, *, /)? ");
            String operation = input.nextLine();
            double result;

            if (operation.compareTo("+") == 0) {
                result = first + second;
                System.out.println("Result: " + result);

            } else if (operation.compareTo("-") == 0) {
                result = first - second;
                System.out.println("Result: " + result);

            } else if (operation.compareTo("*") == 0) {
                result = first * second;
                System.out.println("Result: " + result);

            } else if (operation.compareTo("/") == 0) {
                if (second == 0.0) {
                    System.out.println("Error");
                } else {
                    result = first / second;
                    System.out.println("Result: " + result);

                }
            } else {
                System.out.println("Invalid Operation");
            }
        }

    }
}
