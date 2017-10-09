package com.company;

public class Main {

    public static void main(String[] args) {

        double amount = 10000;
        for(int i =2 ; i< 9 ;i++){
            double result = calculateInterest(amount, i);
            System.out.println("The interst for rate "+ i +" % is : "+ result);
        }

        System.out.println("************************************");

        for(int i = 8 ; i > 1 ;i--){
            double result = calculateInterest(amount, i);
            System.out.println("The interst for rate "+ i +" % is : "+ result);
        }
    }

    public static double calculateInterest(double amount, double rate){
        return (amount *(rate/100));
    }
}
