
public class Card {

    private String face;
    private String suit;

    public Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {

        return face + suit;
    }
}