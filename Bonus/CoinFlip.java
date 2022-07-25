
/* Code calculates the percentage of heads in a count flip
 * This is done in 1,000 trials
 */
import java.util.Scanner;
import java.util.Random;

public class CoinFlip {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String input;
        int headCount;
        do {
            headCount = 0;
            for (int i = 1; i < 1001; i++) {
                if (rand.nextBoolean())
                    headCount++;
            }
            System.out.println("% heads: " + headCount / 10.0);
            System.out.println("Again? (y/n) ");
            input = scan.nextLine().toLowerCase();

        } while (input.charAt(0) == 'y');

    }

}