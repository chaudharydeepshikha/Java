package com.company;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5 / 2;

        // width of float = 32 (4 bytes)
        float myFloatValue = 10f / 3;

        //width of double = 64 ( 8 bytes)
        double myDoubleValue = 10d / 3;

        System.out.println("Integer value = " + myIntValue);
        System.out.println("Floating value = " + myFloatValue);
        System.out.println("Double value = " + myDoubleValue);


        // Challenge:
        /* Convert a given number of pounds to kilograms
        *  1. Create a  variable to store the number of pounds
        *  2. Calculate the number of kilograms for the number above  and store in a variable
        *  3. Print out the result
        *  NOTE:  1 pound is equal to 0.45359237 kilograms*/

         double pound = 200d;
         double kilogram = pound * 0.45359237d;
        System.out.println("Result is = " + kilogram);
    }
}
