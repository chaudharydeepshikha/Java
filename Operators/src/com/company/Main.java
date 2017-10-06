package com.company;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result -1;
        System.out.println(previousResult + " - 1 = "+ result );

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = "+ result );

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = "+ result );

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = "+ result );

        result++;
        System.out.println("Result after increment = "+ result);

        result--;
        System.out.println("Result after decrement = "+ result);

        result += 2;
        System.out.println("Latest result is = "+ result);

        result -=2;
        System.out.println("Latest result is = "+ result);

        result *= 10;
        System.out.println("Latest result is = "+ result);

        result /= 5;
        System.out.println("Latest result is = "+ result);

        boolean isAlien = false;
        if(!isAlien){
            System.out.println("No, it's not an alien! ");
        }

        int topScore = 100;
        int secondTopScore = 80;
        if(topScore > secondTopScore && topScore <= 100){
            System.out.println("yay! You've got the high score! ");
        }
    }
}
