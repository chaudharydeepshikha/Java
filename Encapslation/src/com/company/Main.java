package com.company;

public class Main {

    public static void main(String[] args) {
        Player player = new Player("Iron-man",500,"Armour");

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health : "+ player.healthRemaining());

        damage = 20;
        player.loseHealth(damage);
        System.out.println("Remaining health : "+ player.healthRemaining());


        Printer printer = new Printer(50,false);
        System.out.println("Initial page count : "+printer.getNoOfPages());

        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for printer is " + printer.getNoOfPages());

        pagesPrinted = printer.printPages(1);
        System.out.println("Pages printed was "+ pagesPrinted + " new total print count for printer is " + printer.getNoOfPages());
    }
}
