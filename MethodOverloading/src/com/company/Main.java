package com.company;

public class Main {

    public static void main(String[] args) {

        calculateScore("Player-A", 500);
        calculateScore(200);
        calculateScore();

        calFeetAndInchesToCentimeter(7,1);

       calFeetAndInchesToCentimeter(157);
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

    public static double calFeetAndInchesToCentimeter(double feet, double inches){
        if(feet >=0 && (inches >= 0 && inches <=12)){
            double feetToInches = feet * 12;
            double centimeters = (feetToInches + inches) *  2.54;
            System.out.println(feet + " ft & "+ inches + " inches = "+ centimeters +" cms");
            return centimeters;
        } else {
            System.out.println("Invalid data entered!");
            return -1;
        }
    }
    public static double calFeetAndInchesToCentimeter(double inches){
        if(inches >=0 ){
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + "inches" );
            return calFeetAndInchesToCentimeter(feet, remainingInches);
        } else {
            System.out.println("Invalid data entered!");
            return -1;
        }
    }
}
