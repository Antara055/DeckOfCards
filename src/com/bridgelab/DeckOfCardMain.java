package com.bridgelab;

import java.util.ArrayList;
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

    public void noOfPlayer(){
        System.out.println("enter the no. of player : ");
        int noOfPlayer=input.nextInt();
        if (noOfPlayer>=2 && noOfPlayer<=4){
            System.out.println(noOfPlayer+"players will play the game");
        }
        else
            System.out.println("min 2 and max 4 players can play the game");
    }
    public static void main(String[] args) {
        System.out.println("****Welcome to decks of card problem****");
        DeckOfCardMain deckOfCardMain = new DeckOfCardMain();
        deckOfCardMain.initializeCards();
        deckOfCardMain.noOfPlayer();
    }
}
