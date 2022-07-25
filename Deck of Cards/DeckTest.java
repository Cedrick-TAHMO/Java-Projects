/* Deck of cards class 
 * Enjoy!! lol
 * 
 * It was one of the codes that provide a fresh and 
 * well nurtured dose of headaches lol.  
 */
public class DeckTest {

    public static void main(String[] args) {

        System.out.println("\n\n*** Unshuffled Deck ***");
        Deck deck = new Deck();

        deck.toString(0, 51);

        System.out.println("\n*** shuffled Deck ***");
        deck.shuffle();
        deck.toString(0, 51);

        System.out.println("\n**** Dealing the first five cards ****");

        for (int i = 0; i < 5; i++) {
            System.out.print(deck.dealCard() + " ");
        }

        System.out.println("\n\n**** Dealing the last card from the deck ****");

        for (int i = 5; i < 51; i++) {
            deck.dealCard();
        }
        deck.toString(51, 51);

        System.out.println("\n\n**** Attempting to deal one more ****");
        for (int i = 52; i < 53; i++) {
            System.out.println(deck.dealCard());
        }

        System.out.println("\n*** Re-shuffled Deck ***");
        deck.shuffle();
        deck.toString(0, 51);

        System.out.println("\n**** Dealing the first five cards ****");
        for (int i = 0; i < 5; i++) {
            System.out.print(deck.dealCard() + " ");
        }
    }
}