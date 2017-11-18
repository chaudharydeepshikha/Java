package com.company;

/**
 * @author Deepshikha chaudhary on 11/19/2017
 */
public class Printer {

    private int tonerLevel = 80;
    private int noOfPages = 50;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if(tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        }
        this.isDuplex = isDuplex;
        this.noOfPages = 0;
    }

    public int fillUpToner(int quantity){
        if(quantity > 0 && quantity <= 100) {
            if(this.tonerLevel + quantity > 100){
                return -1;
            }
            this.tonerLevel += quantity;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int quantity){
        int pagesToPrint = quantity;
        if(isDuplex){
            this.noOfPages /= 2;
            System.out.println("Printing in duplex mode");
        }
        this.noOfPages += quantity;
        return this.noOfPages;
    }

    public int getNoOfPages() {
        return noOfPages;
    }
}
