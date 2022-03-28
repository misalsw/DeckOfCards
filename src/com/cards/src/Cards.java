import java.util.ArrayList;
import java.util.Scanner;

public class Cards {

    public static final Scanner scanner = new Scanner(System.in);
    public ArrayList<String> cardsDeck = new ArrayList<>();

    public static void main(String[] args) {

        Cards cards = new Cards();
        cards.deckOfCards();
        cards.noOfPlayers();
    }

    private static void toDisplay(ArrayList<String> cardsDeck) {
        System.out.println("\nCards in Deck: ");
        for (String element : cardsDeck) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static ArrayList<String> toshuffle(ArrayList<String> cardsDeck, int player) {
        System.out.println("Shuffling the cards before Distribution");
        ArrayList<String> temp = new ArrayList<String>();
        while (!cardsDeck.isEmpty()) {
            int loc = (int) (Math.random() * cardsDeck.size());
            temp.add(cardsDeck.get(loc));
            cardsDeck.remove(loc);
        }
        cardsDeck = temp;
        toDisplay(cardsDeck);
        cardDistribution(cardsDeck, player);
        return cardsDeck;

    }

    private static void cardDistribution(ArrayList<String> cardsDeck, int player) {

        for (int i = 0; i < player; i++) {
            System.out.println("\nPlayer " + (i + 1) + " got cards:\n");

            for (int j = 0; j < 9; j++) {
                System.out.println("\t" + cardsDeck.get(i + j * player));
            }
        }
        System.out.println();
    }

    public void deckOfCards() {
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        int numOfCards = suits.length * ranks.length;
        System.out.println("\nNumber of cards in the deck is : " + numOfCards);
        for (int i = 0; i < ranks.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                cardsDeck.add(ranks[i] + "   " + suits[j]);
            }
        }
        toDisplay(cardsDeck);
    }

    public void noOfPlayers() {
        System.out.print("\nEnter number of players : ");
        int player = scanner.nextInt();
        if (player >= 2 && player <= 4) {
            sequenceOfPlay(player);
        } else {
            System.out.println("Please Enter no of players in range 2 to 4");
            noOfPlayers();
        }
        scanner.close();
    }

    public void sequenceOfPlay(int player) {
        System.out.println("\nSequence of cards are below : ");
        toshuffle(cardsDeck, player);
    }

}

