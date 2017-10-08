package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore("Player-A", 500);
        calculateScore(200);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score){
        System.out.println(playerName +" scored "+ score + " points");
        return score * 1000;
    }

    public static int calculateScore( int score){
        System.out.println("Un-named player scored "+ score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println(" No player, No score");
        return 0;
    }
}
