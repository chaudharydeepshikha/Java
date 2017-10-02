package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a String";
        System.out.println("My string is : " + myString);
        myString = myString + ", this is second part of string.";
        System.out.println("New my string is : " + myString);
        myString = myString + "\u00A9 2017";
        System.out.println("My string with unicode is :" + myString);

        String numberString = "250.55";
        numberString = numberString + "49.90";
        System.out.println("Number string is :" + numberString);

        String integerString = "10";
        int myInt = 10;
        integerString = integerString + myInt;
        System.out.println("Integer string is: " + integerString);

        double doubleNumber = 250.67;
        integerString = integerString + doubleNumber;
        System.out.println("New integer string is : " + integerString);

        String result = integerString + myInt + doubleNumber;
        System.out.println("Result is :" + result);


    }
}
