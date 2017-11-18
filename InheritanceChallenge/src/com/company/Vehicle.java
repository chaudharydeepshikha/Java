package com.company;

/**
 * @author Deepshikha chaudhary on 11/18/2017
 */
public class Vehicle {

    private String company;
    private String model;
    private int engine;
    private int seatingCapacity;
    private int wheels;

    private int speed;
    private int direction;

    public Vehicle(String company, String model, int engine, int seatingCapacity, int wheels) {
        this.company = company;
        this.model = model;
        this.engine = engine;
        this.seatingCapacity = seatingCapacity;
        this.wheels = wheels;
        this.speed = 0;
        this.direction = 0;
    }

    public void steer(int paramDirection){
        this.direction += paramDirection;
        System.out.println("Vehicle.steer(): Steering with "+ direction);
    }

    public void move(int velocity, int paramDirection){
        direction = paramDirection;
        speed =velocity;
        System.out.println("Vehicle moving with "+ speed + " speed in " + direction + " direction");
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getEngine() {
        return engine;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getWheels() {
        return wheels;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDirection() {
        return direction;
    }

    public void stop(){
        speed = 0;
    }
}
