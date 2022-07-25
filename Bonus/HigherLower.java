
/* This code is a game that helps ask you to guess a random number
 * that was randomly guessed by the computer
 */
import java.util.Scanner;

public class HigherLower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mysteryNumber, guess;
        int numberofGuesses = 8;
        final int MaxGuesses = 0;
        final int BiggestNumber = 50;
        boolean correctlyGuessed = false;

        mysteryNumber = chooseMysteryNumber(BiggestNumber);

        System.out.println("Guess a random number between 1 and "
                + BiggestNumber);

        System.out.println("You only have 8 guesses!");

        System.out.println("Enter one guess per line: ");

        while (numberofGuesses > MaxGuesses && !correctlyGuessed) {

            guess = input.nextInt();
            numberofGuesses--;

            if (mysteryNumber == guess) {
                correctlyGuessed = true;
            } else if (mysteryNumber < guess) {

                System.out.println("lower");
                System.out.println("Number of guesses left: " + numberofGuesses);

            } else if (mysteryNumber > guess) {
                System.out.println("higher");
                System.out.println("Number of guesses left: " + numberofGuesses);
            }
        }
        if (correctlyGuessed) {
            System.out.println("Yas Queen/King!");
        } else {

            System.out.println("Sorry, you ran out of guesses, suck it up");
            System.out.println("The mystery number was " + mysteryNumber);
        }

    }

    private static int chooseMysteryNumber(int limit) {
        return (int) (1.0 + Math.random() * limit);
    }
}