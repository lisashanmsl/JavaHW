public class Card {
    private String face;
    private String suit;

    public Card() {
        this.face = " ";
        this.suit = " ";
    }

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

    public String toString() {// 改寫toString
        return face + " of " + suit;
    }
}
