package CardDeck;
public class Card implements Comparable<Card> {
    private String suit;
    private String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Card) {
            Card card = (Card) obj;
            return suit.equals(card.suit) && rank.equals(card.rank);
        }
        return false;
    }

    @Override
    public int compareTo(Card card) {
        if (rank.equals(card.rank)) {
            return suit.compareTo(card.suit);
        }
        return rank.compareTo(card.rank);
    }
}
