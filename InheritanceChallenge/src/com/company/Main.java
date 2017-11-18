package com.company;

public class Main {

    public static void main(String[] args) {
	 Fortuner fortuner = new Fortuner(true,"Disc");
	 fortuner.steer(45);
	 fortuner.accelerate(30);
	 fortuner.accelerate(30);
	 fortuner.accelerate(-40);
    }
}

