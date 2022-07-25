import java.util.Random;

public class Deck {

    // Instant variables
    private Card[] deck;
    private static int currentCard;
    final int NoCards = 52;
    private static Random randomNumb = new Random();

    // Constructor
    public Deck() {
        currentCard = 0;
        String[] SUITLETTER = { "Club", "Diamond", "Spade", "Hearts" };
        String[] FACELETTER = { "A", "2", "3", "4",
                "5", "6", "7", "8", "9", "10", "Joker", "Queen", "King" };

        // Initializing the deck variable
        deck = new Card[NoCards];

        int start = 0;
        // Stacking cards in the deck
        for (String suit : SUITLETTER) {
            for (String face : FACELETTER) {
                deck[start] = new Card(face, suit);
                start++;
            }
        }
    }

    // Shuffle method, changes the values of arrays randomly
    public void shuffle() {
        currentCard = 0;
        for (int i = 0; i < deck.length; i++) {
            int second = randomNumb.nextInt(NoCards);

            Card temp = deck[i];
            deck[i] = deck[second];
            deck[second] = temp;
        }
    }

    public Card dealCard() {
        if (currentCard < deck.length) {
            return deck[currentCard++];
        } else {
            System.out.println("Correct - dealCard() returned ");
            return null;
        }
    }

    public String toString(int start, int end) {
        String space = " ";
        for (int i = start; i <= end; i++) {

            System.out.print(deck[i] + "    ");
            if ((i + 1) % 13 == 0) {
                System.out.println();
            }

        }
        return space;

    }

}