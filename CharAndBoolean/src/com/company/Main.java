package com.company;

public class Main {

    public static void main(String[] args) {
        // width of char = 16 (2 bytes)
        char myChar1 = '\u0926';
        char myChar2 = '\u0940';
        char myChar3 = '\u092A';
        char myChar4 = '\u0936';
        char myChar5 = '\u093F';
        char myChar6 = '\u0959';
        char mychar7 = '\u093E';
        System.out.println("My name is : " + myChar1 + myChar2 + myChar3 + myChar4 + myChar5 + myChar6 + mychar7);

        boolean myBoolean = false;
        boolean isFemale = true;

        // Challenge
        /* 1. Find  the code for the registered symbol  on the same line  as the copyright symbol
        *  2. Create a variable of the type char and assign it the unicode value for the symbol
        *  3. Display it on the screen*/

        char registeredChar = '\u00AE';
        System.out.println("Registerd symbol is = "+ registeredChar);

    }
}
