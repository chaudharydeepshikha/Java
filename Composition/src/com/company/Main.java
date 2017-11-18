package com.company;

public class Main {

    public static void main(String[] args) {

        Motherboard motherboard = new Motherboard("BJ-200","Asus", 4,6,"v2.44");
        Monitor monitor = new Monitor("27inch Beast","Acer",27,new Resolution(2540,1440));
        Case aCase = new Case("220B","Dell", "240",new Dimension(20,20,5));
        PC pc = new PC(motherboard,monitor,aCase);
        pc.powerUp();

        Wall wall1 = new Wall("East");
        Wall wall2 = new Wall("West");
        Wall wall3 = new Wall("North");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(20,"Blue");
        Bed bed = new Bed("King size",4,3,2,1);
        Lamp lamp = new Lamp("Classic", false, 70);

        Room room = new Room("My-Room",wall1,wall2,wall3,wall4,ceiling,bed,lamp);
        room.makeBed();
        bed.make();
        lamp.turnOn();
    }
}
