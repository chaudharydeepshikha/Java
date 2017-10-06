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
        if((topScore > secondTopScore) && (topScore <= 100)){
            System.out.println("yay! You've got the high score! ");
        }

        if((topScore > 100) || (secondTopScore < 100)){
            System.out.println("One of the test is true");
        }

        boolean isCar = true;
        boolean wasCar = isCar? true : false;
        if(wasCar){
            System.out.println("isCar is true");
        }

        /*Challenge
        * 1. Create a double variable with the value 20.
        * 2. Create a second variable of the type double with the value 80.
        * 3. Add both numbers up and multiply by 25.
        * 4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40.
        * 5. Write a "if" statement that displays a message "Toatal was over the limit"
        *   if the remainign total (#4) is equal to 20 or less. */

        double firstVariable = 20D;
        double secondVariable = 80D;

        double myTotal = (firstVariable + secondVariable) * 25;
        System.out.println("My total is = " + myTotal);
        
        myTotal = myTotal % 40;
        if(myTotal <= 20){
            System.out.println("Total was over the limit");
        }
    }
}
