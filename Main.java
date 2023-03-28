import java.util.Scanner;
import CardDeck.Card;
import CardDeck.Deck;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Print the deck");
            System.out.println("2. Print a card");
            System.out.println("3. Check if two cards are the same");
            System.out.println("4. Compare two cards");
            System.out.println("5. Find a card in the deck");
            System.out.println("6. Deal 5 random cards");
            System.out.println("7. Shuffle the deck");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter the index of the card: ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter the index of the first card: ");
                    int index1 = scanner.nextInt();
                    System.out.print("Enter the index of the second card: ");
                    int index2 = scanner.nextInt();
                    boolean same = deck.sameCard(deck.getCards().get(index1), deck.getCards().get(index2));
                    if (same) {
                        System.out.println("The two cards are the same.");
                    } else {
                        System.out.println("The two cards are different.");
                    }
                    break;
                case 4:
                    System.out.print("Enter the index of the first card: ");
                    int index3 = scanner.nextInt();
                    System.out.print("Enter the index of the second card: ");
                    int index4 = scanner.nextInt();
                    int result = deck.compareCard(deck.getCards().get(index3), deck.getCards().get(index4));
                    if (result > 0) {
                        System.out.println("The first card is greater.");
                    } else if (result < 0) {
                        System.out.println("The second card is greater.");
                    } else {
                        System.out.println("The two cards are equal.");
                    }
                    break;
                case 5:
                    System.out.print("Enter the suit of the card: ");
                    String suit = scanner.next();
                    System.out.print("Enter the rank of the card: ");
                    String rank = scanner.next();
                    int index5 = deck.findCard(new Card(suit, rank));
                    if (index5 == -1) {
                        System.out.println("The card was not found in the deck.");
                    } else {
                        System.out.println("The card was found at index " + index5 + ".");
                    }


                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
