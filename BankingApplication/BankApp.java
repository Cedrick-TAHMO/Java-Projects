import java.util.Scanner;

/**
 * Main class for running the Bank Application.
 */
public class BankApp {

    public static void main(String[] args) {

        // Create a new bank account for the customer
        BankAccount account = new BankAccount("Ced Loyalist Bank", "CLB003904");

        // Display the menu for interacting with the bank account
        account.showMenu();
    }
}

/**
 * Class representing a Bank Account with basic banking operations.
 */
class BankAccount {

    // Member variables to hold the account details and transactions
    private double balance;
    private double previousTransaction;
    private String customerName;
    private String customerId;

    /**
     * Constructor to initialize a new bank account.
     *
     * @param cname Customer name
     * @param cid   Customer ID
     */
    public BankAccount(String cname, String cid) {
        customerName = cname;
        customerId = cid;
        balance = 0.0;
        previousTransaction = 0.0;
    }

    /**
     * Method to deposit a specific amount to the account.
     *
     * @param amount Amount to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; // Update the balance
            previousTransaction = amount; // Set the previous transaction to the deposited amount
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    /**
     * Method to withdraw a specific amount from the account.
     *
     * @param amount Amount to withdraw
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Update the balance
            previousTransaction = -amount; // Set the previous transaction to the withdrawn amount
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient funds for withdrawal.");
        }
    }

    /**
     * Method to display the details of the previous transaction.
     */
    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.printf("Deposit: %.2f\n", previousTransaction);
        } else if (previousTransaction < 0) {
            System.out.printf("Withdrawal: %.2f\n", Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction has occurred yet.");
        }
    }

    /**
     * Method to display the bank menu and allow the user to perform operations.
     */
    public void showMenu() {

        char option;
        Scanner scanner = new Scanner(System.in);

        // Display user information and available options
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID: " + customerId);
        System.out.println("\n");
        printMenu();

        // Loop to keep showing the menu until the user chooses to exit
        do {
            System.out.println("************************");
            System.out.print("Enter your option: ");
            System.out.println("************************");

            // Read user input for menu option
            option = scanner.next().charAt(0);

            switch (option) {
                case 'A':
                    // Check account balance
                    System.out.println("_________________________");
                    System.out.printf("Account balance: %.2f\n", balance);
                    System.out.println("_________________________");
                    break;

                case 'B':
                    // Make a deposit
                    System.out.println("_________________________");
                    System.out.print("Amount to deposit: ");
                    System.out.println("_________________________");
                    double depositAmount = scanner.nextDouble();
                    deposit(depositAmount);
                    System.out.printf("New account balance: %.2f\n", balance);
                    break;

                case 'C':
                    // Make a withdrawal
                    System.out.println("_________________________");
                    System.out.print("Amount to withdraw: ");
                    System.out.println("_________________________");
                    double withdrawAmount = scanner.nextDouble();
                    withdraw(withdrawAmount);
                    System.out.printf("New account balance: %.2f\n", balance);
                    break;

                case 'D':
                    // Check previous transaction
                    System.out.println("_________________________");
                    getPreviousTransaction();
                    System.out.println("_________________________");
                    break;

                case 'H':
                    // Show menu again
                    printMenu();
                    break;

                case 'E':
                    // Exit the application
                    System.out.println("************************");
                    break;

                default:
                    // Handle invalid option
                    System.out.println("Invalid option! Please enter a valid option.");
                    break;
            }
        } while (option != 'E');

        // Thank the user for using the service
        System.out.println("Thank you for using our services.");
    }

    /**
     * Utility method to print the main menu options.
     */
    private void printMenu() {
        System.out.println("A: Check Account Balance");
        System.out.println("B: Make a Deposit");
        System.out.println("C: Make a Withdrawal");
        System.out.println("D: Check Previous Transaction");
        System.out.println("H: Show Menu");
        System.out.println("E: Exit Application");
    }
}
