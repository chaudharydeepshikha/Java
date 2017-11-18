package com.company;

/**
 * @author Deepshikha chaudhary on 11/18/2017
 */
public class Car extends Vehicle {

    private int door;
    private int gears;
    private boolean isManual;

    private int currentGear;

    public Car(String company, String model, int engine, int seatingCapacity, int wheels, int door, int gears, boolean isManual) {
        super(company, model, engine, seatingCapacity, wheels);
        this.door = door;
        this.gears = gears;
        this.isManual = isManual;
        this.currentGear = 1;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("Car.changeGear(): Changed to: "+ this.currentGear + " gear");
    }

    public void changeSpeed(int speed, int direction){
        System.out.println("Car.changeSpeed called: Speed " + speed + " direction " + direction);
        move(speed, direction);
    }
}
