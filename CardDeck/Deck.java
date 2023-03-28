package CardDeck;
import java.util.ArrayList;
import java.util.Collections;


public class Deck {
    private ArrayList<Card> cards;

    // Constructor to create a deck of 52 cards
    public Deck() {
        cards = new ArrayList<Card>();
        createDeck();
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    // Method to create a deck of 52 cards
    private void createDeck() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    // Method to print all the cards in the deck
    public void printDeck() {
        for (Card card : cards) {
            System.out.println(card);
        }
    }

    // Method to print a specific card
    public void printCard(int index) {
        System.out.println(cards.get(index));
    }

    // Method to check if two cards are the same
    public boolean sameCard(Card card1, Card card2) {
        return card1.equals(card2);
    }

    // Method to compare two cards
    public int compareCard(Card card1, Card card2) {
        return card1.compareTo(card2);
    }

    // Method to find a card in the deck
    public int findCard(Card card) {
        return cards.indexOf(card);
    }

    // Method to deal 5 random cards from the deck
    public void dealCard() {
        Collections.shuffle(cards);
        for (int i = 0; i < 5; i++) {
            System.out.println(cards.get(i));
        }
    }

    // Method to shuffle the deck
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }
}
