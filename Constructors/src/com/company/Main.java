package com.company;

public class Main {

    public static void main(String[] args) {

//        Integer availableAccountBalance = 10000;

        Account account = new Account(123, 20000, "Ram Kumar", "Ram.Kumar@gmail.com", 123456789);

//        account.setBalance(availableAccountBalance);
        System.out.println("Present balance is: "+ account.getBalance());
        Integer moneyToWithdraw = 2000;
        Boolean result = account.withdraw(moneyToWithdraw);
        if(result){
            Integer balanceAfterWithdraw = account.getBalance() -  moneyToWithdraw;
            System.out.println("After withdrawing "+ moneyToWithdraw + " balance is:" + balanceAfterWithdraw);
            account.setBalance(balanceAfterWithdraw);
        } else {
            System.out.println("Your balance is too low!");
        }
        Integer balanceAftereDeposit = account.deposit(3000);
        System.out.println("Balance after depositing is:" + balanceAftereDeposit);
    }
}
