
/* Please google the Nim Game 
 * (Description below)
*/
import java.util.Scanner;

public class NimGame {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("************** Welcome to the game of Nim **************" +
                "\nThe object of the game is to make your opponent take the" +
                "\nlast marble off the table. You get to choose between" +
                "\n1 and 3 marbles when it is your turn.");

        int marbles = 13;

        int user = 0;
        String play;

        do {
            System.out.print("\nThere are " + marbles + " marble(s).");
            System.err.print("How many will you pick up? ");
            user = input.nextInt();
            if (user != 1 && user != 2 && user != 3) {
                System.out.println("Wrong Input!!");
            } else {
                marbles = marbles - user;
            }
            play = input.nextLine();
            if (marbles < 1) {
                System.out.println("\n\nYou lose!!");
                System.out.println("Play again? (y/n) ");
                play = input.nextLine();
                if (play == "n") {
                    System.out.println("Bye!!");
                } else if (play.equals("y")) {
                    marbles = 13;
                } else {

                }

            } else {
                System.out.print("\nThere are " + marbles + " marble(s).");
                int com = (int) (Math.random() * 3) + 1;
                marbles = marbles - com;
                System.out.print("Computer removes " + com);
                if (marbles < 1) {
                    System.out.println("\n\nYou Win!!");
                    System.out.println("Play again? (y/n) ");
                    play = input.nextLine();
                    if (play == "n") {
                        System.out.println("Bye!!");
                    } else if (play.equals("y")) {
                        marbles = 13;
                    } else {

                    }

                }
            }

        } while (marbles > 0);
    }

}
