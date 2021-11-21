package com.bridgelab;

import java.util.Scanner;

public class Players {
    Scanner input=new Scanner(System.in);
    public int noOfPlayer(){
        System.out.println("enter the no. of player : ");
        int noOfPlayer=input.nextInt();
        if (noOfPlayer>=2 && noOfPlayer<=4){
            System.out.println(noOfPlayer+"players will play the game");
        }
        else
            System.out.println("min 2 and max 4 players can play the game");
        return noOfPlayer;
    }
}
