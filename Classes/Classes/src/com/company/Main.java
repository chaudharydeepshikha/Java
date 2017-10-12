package com.company;

public class Main {

    public static void main(String[] args) {
	    Car audi = new Car();
	    Car jaguar = new Car();

	    audi.setModel("A4");
        System.out.println("The model is: "+ audi.getModel());
    }
}
