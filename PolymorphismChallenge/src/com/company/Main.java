package com.company;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheel;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheel = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine(){
        System.out.println("Engine status: " + engine);
    }

    public void acclerate(){
        System.out.println("No Acceleration here");
    }

    public void brake(){
        System.out.println("No Brake pressed");
    }
}

class Verna extends Car{
    public Verna(String name, int cylinders) {
        super(name, cylinders);
    }

    public void startEngine(){
        System.out.println("Engine started - Verna");
    }

    public void acclerate(){
        System.out.println("Accleration on! - Verna");
    }

    public void brake(){
        System.out.println("No Brake pressed - Verna");
    }
}

class Fortuner extends Car{
    public Fortuner(String name, int cylinders) {
        super(name, cylinders);
    }

    public void startEngine(){
        System.out.println("Engine started - Fortuner");
    }

    public void acclerate(){
        System.out.println("Accleration on! - Fortuner");
    }

    public void brake(){
        System.out.println("No Brake pressed - Fortuner");
    }
}

class Mazda extends Car{
    public Mazda(String name, int cylinders) {
        super(name, cylinders);
    }

    public void startEngine(){
        System.out.println("Engine started - mazda");
    }

    public void acclerate(){
        System.out.println("Accleration on! - mazda");
    }

    public void brake(){
        System.out.println("No Brake pressed - Mazda");
    }
}

public class Main {

    public static void main(String[] args) {
	  Car car = new Car("Base car", 6);
	  car.startEngine();
	  car.acclerate();
	  car.brake();

	  Verna verna = new Verna("Verna", 4);
	  verna.startEngine();
	  verna.acclerate();
	  verna.brake();

	  Fortuner fortuner = new Fortuner("Fortuner", 4);
	  fortuner.startEngine();
	  fortuner.acclerate();
	  fortuner.brake();

        Mazda mazda = new Mazda("Mazda", 6);
        mazda.startEngine();
        mazda.acclerate();
        mazda.brake();
    }
}
