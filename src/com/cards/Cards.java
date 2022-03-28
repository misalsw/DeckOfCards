package com.cards;

import java.util.ArrayList;

public class Cards {

    public static final Scanner scanner = new Scanner(System.in);
    public ArrayList<String> cardsDeck = new ArrayList<>();

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

    private void toDisplay(ArrayList<String> cardsDeck) {
        System.out.println("\nCards in Deck: ");
        for (String element : cardsDeck) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Cards cards = new Cards();
        cards.deckOfCards();


    }
}

