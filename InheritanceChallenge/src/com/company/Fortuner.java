package com.company;

/**
 * @author Deepshikha chaudhary on 11/18/2017
 */
public class Fortuner extends Car {

    private boolean fourByFour;
    private String breakTypeFront;

    public Fortuner(boolean fourByFour, String breakTypeFront) {
        super("Toyota", "Fortuner", 2755, 7, 4, 5, 6, false);
        this.fourByFour = fourByFour;
        this.breakTypeFront = breakTypeFront;
    }

    public void accelerate(int rate){
        int newSpeed = getSpeed() + rate;
        if(newSpeed == 0){
            stop();
            changeGear(1);
        } else if(newSpeed >10 && newSpeed <=10 ){
            changeGear(1);
        } else if(newSpeed > 10 && newSpeed <=20 ){
            changeGear(2);
        } else if(newSpeed > 20 && newSpeed <=30 ){
            changeGear(3);
        } else if(newSpeed > 30 && newSpeed <=40 ){
            changeGear(4);
        } else if(newSpeed > 40 && newSpeed <=50 ){
            changeGear(5);
        } else {
            changeGear(6);
        }

        if(newSpeed > 0){
            changeSpeed(newSpeed, getDirection());
        }
    }
}
