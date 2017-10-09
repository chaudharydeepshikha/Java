package com.company;

public class Main {

    public static void main(String[] args) {
        int value = 4;
        switch (value){
            case 1:
                System.out.println("The value is " + value + " from 1");
                break;

            case 2:
                System.out.println("The value is " + value + " from 2");
                break;

            case 3: case 4: case 5:
                System.out.println("The value is " + value + " from 3, 4, 5");
                break;

            default:
                System.out.println("The value is " + value + " default");
                break;
        }

        char myChar = 'A';

        switch (myChar){
            case 'A':
                System.out.println("The character found is : " + myChar + " at case 1");
                break;

            case 'B':
                System.out.println("The character found is : " + myChar + " at case 2");
                break;

            case 'C':
                System.out.println("The character found is : " + myChar + " at case 3");
                break;

            case 'D':
                System.out.println("The character found is : " + myChar + " at case 4");
                break;

            case 'E':
                System.out.println("The character found is : " + myChar + " at case 5");
                break;

            default:
                System.out.println("Character not found!");
                break;

        }

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("January");
                break;
            case "February":
                System.out.println("February");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
