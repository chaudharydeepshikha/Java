package com.company;

public class Main {

    public static void main(String[] args) {

        int count = 1;
        while(count != 6){
            System.out.println("Count = " + count);
            count++;
        }

        System.out.println("*************************************");
         count = 1;
        do{
            System.out.println("Count = " + count);
            count++;
        } while(count != 6);

        System.out.println("*************************************");
        int countEven = 0;
        int number = 5;
        int finishNumber = 20;
        while(number <= finishNumber){
            if(!isEvenNumber(number)){
                number++;
                continue;
            }
            countEven++;
            System.out.println("Even number " + number);
            number++;
            if(countEven == 5){
                break;
            }
        }
        System.out.println("The count of even numbers are: "+ countEven);

    }

    public static boolean isEvenNumber(int varA){
        if(varA % 2 == 0){
            return true;
        }
        return false;
    }
}
