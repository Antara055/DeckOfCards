package com.bridgelab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeckOfCardMain {
    Scanner input=new Scanner(System.in);
    //creating Arraylist
    ArrayList<String> cardCollection = new ArrayList<>();
    /*
    In this I have created String type array of Suits and Ranks to store value.
     */
    public static String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public static String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};

    public void initializeCards() {
        /*
    In this method we calculate the size of cards.
    In this we are printing the size of card.
    In this method we are also printing all the possible combination of card.
    */
        int totalCards = suits.length * ranks.length;
        System.out.println("Total no of card is : " + totalCards);
        for (int i = 0; i < suits.length; i++) {
            for (int j = 0; j < ranks.length; j++) {
                cardCollection.add(suits[i]+ranks[j]); //storing elements into arraylist
            }
        }
        System.out.println("Cards are: "+ cardCollection);
    }

    public void sequence(int player){
        int totalCards = suits.length * ranks.length;
        for (int i=1;i<=player;i++){
            System.out.println("\nPlayer " + i + " getting card->");
            shuffle(cardCollection);
        }
    }

    public static void shuffle(ArrayList<String> cardsDeck){
        System.out.println("shuffling the cards before Distribution");
        ArrayList<String> temp = new ArrayList<String>();
        while (!cardsDeck.isEmpty()) {
            int loc = (int) (Math.random() * cardsDeck.size());
            temp.add(cardsDeck.get(loc));
            cardsDeck.remove(loc);
        }
        cardsDeck = temp;
        System.out.println(cardsDeck);
    }

    public static void main(String[] args) {
        System.out.println("****Welcome to decks of card problem****");
        DeckOfCardMain deckOfCardMain = new DeckOfCardMain();
        deckOfCardMain.initializeCards();
        Players players=new Players();
        int player=players.noOfPlayer();
        deckOfCardMain.sequence(player);
    }
}
