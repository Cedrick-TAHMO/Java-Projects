
import java.util.Scanner;;

public class CalculatorWithSwitch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        double first = input.nextDouble();

        System.out.println("Enter the second number: ");
        double second = input.nextDouble();

        input.nextLine();
        System.out.println("What operation (add, subtract, multiply, divide)? ");
        String operation = input.nextLine();
        double result;

        switch (operation) {
            case "add":
                result = first + second;
                System.out.println("Result: " + result);
                break;
            case "subtract":
                result = first - second;
                System.out.println("Result: " + result);
                break;
            case "multiply":
                result = first * second;
                System.out.println("Result: " + result);
                break;
            case "divide":
                if (second == 0) {
                    System.out.println("error");
                } else {
                    result = first / second;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Invalid Operation");
                break;
        }
    }
}
