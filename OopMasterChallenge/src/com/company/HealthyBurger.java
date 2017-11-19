package com.company;

/**
 * @author Deepshikha chaudhary on 11/19/2017
 */
public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double helathyExtra1Price;

    private String healthyExtra2Name;
    private double helathyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", "Brown rye", meat, price);
    }

    public void addHealthyAdditon1(String name, double price){
        this.healthyExtra1Name = name;
        this.helathyExtra1Price = price;
    }

    public void addHealthyAdditon2(String name, double price){
        this.healthyExtra2Name = name;
        this.helathyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthyExtra1Name != null){
            hamburgerPrice += this.helathyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.helathyExtra1Price);
        }

        if(this.healthyExtra2Name != null){
            hamburgerPrice += this.helathyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.helathyExtra2Price);
        }
        return hamburgerPrice;
    }
}
