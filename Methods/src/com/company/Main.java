package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
	    int score = 8000;
	    int levelCompleted = 5;
	    int bonus = 100;

	    int highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("The final score is: "+ highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver,score,levelCompleted,bonus);
        System.out.println("The final score is: "+ highScore);

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Player-A", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Player-B", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Player-C", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Player-D", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Player-E", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore +=1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String playerName, int postion){
        System.out.println(playerName + " managed to get into position " + postion + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        } else if (score >= 500 && score < 1000){
            return 2;
        } else if(score >= 100 && score < 500){
            return 3;
        } else {
            return 4;
        }
    }
}
