package com.company;

public class Main {

    public static void main(String[] args) {

        Motherboard motherboard = new Motherboard("BJ-200","Asus", 4,6,"v2.44");

        Monitor monitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));

        Case aCase = new Case("220B","Dell", "240",new Dimension(20,20,5));

        PC pc = new PC(motherboard,monitor,aCase);
        pc.powerUp();
    }
}
