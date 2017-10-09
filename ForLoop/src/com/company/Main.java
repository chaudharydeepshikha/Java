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

        int count =0;
        for(int i = 10; i< 50; i++){
            if(isPrime(i)){
                System.out.println(i);
                count++;
                if(count == 3){
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i = 2; i <= n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amount, double rate){
        return (amount *(rate/100));
    }
}
