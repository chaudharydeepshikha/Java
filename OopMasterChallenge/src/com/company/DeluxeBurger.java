package com.company;

/**
 * @author Deepshikha chaudhary on 11/19/2017
 */
public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe","Italian","Sauasge & Bacon", 30);
        super.addHamburgerAddition1("Chips", 5);
        super.addHamburgerAddition2("Drinks", 3);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Addition of item is not allowed in Deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Addition of item is not allowed in Deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Addition of item is not allowed in Deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Addition of item is not allowed in Deluxe burger");
    }
}
