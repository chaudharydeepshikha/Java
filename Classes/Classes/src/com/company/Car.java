package com.company;

/**
 * @author Deepshikha chaudhary on 10/10/2017
 */
public class Car {

    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(model.equalsIgnoreCase("A4") || model.equals("XE")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }
}
