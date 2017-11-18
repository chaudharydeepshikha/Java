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

    }
}
