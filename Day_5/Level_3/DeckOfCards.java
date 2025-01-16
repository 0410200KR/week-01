
import java.util.*;
public class DeckOfCards {

    public static void main(String[] args) {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // Initialize the deck
        String[] deck = initializeDeck(suits, ranks);

        // Shuffle the deck
        shuffleDeck(deck);

        // Define the number of players and cards to distribute
        int numPlayers = 4;
        int cardsPerPlayer = 5;

        // Distribute cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

        // Print the players and their cards
        printPlayersAndCards(players);
    }

    // Method to initialize the deck of cards
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Method to shuffle the deck
    public static void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int randomCardIndex = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[randomCardIndex];
            deck[randomCardIndex] = temp;
        }
    }

    // Method to distribute cards
    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        if (numPlayers * cardsPerPlayer > deck.length) {
            throw new IllegalArgumentException("Not enough cards in the deck to distribute.");
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[cardIndex++];
            }
        }
        return players;
    }

    // Method to print players and their cards
    public static void printPlayersAndCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.print("Player " + (i + 1) + "'s cards: ");
            for (int j = 0; j < players[i].length; j++) {
                System.out.print(players[i][j] + (j < players[i].length - 1 ? ", " : ""));
            }
            System.out.println();
        }
    }
}