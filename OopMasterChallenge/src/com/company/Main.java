package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Basic","Italian","Sausage",10);
        double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerAddition1("Cucumber", 2);
        hamburger.addHamburgerAddition2("Lettuce", 1);
        hamburger.addHamburgerAddition3("Cheese",4);
        System.out.println("Total price of burger : "+ hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 20);
        healthyBurger.addHamburgerAddition1("Tomato", 1);
        healthyBurger.addHealthyAdditon1("Olives", 3);
        System.out.println("Total price of healthy burger : "+ healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        System.out.println("Total price of Deluxe burger : "+ deluxeBurger.itemizeHamburger());
        deluxeBurger.addHamburgerAddition1("jhsh", 2);
    }
}
