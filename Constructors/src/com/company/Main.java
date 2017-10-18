package com.company;

public class Main {

    public static void main(String[] args) {

        Account account = new Account();

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

        System.out.println("**********************************************");
        Account newAccount = new Account("Rakesh", "Rakesh.kumar@gmail.com", 123456);
        System.out.println(newAccount.getPhoneNumber() +" name "+ newAccount.getCustomerName());


            System.out.println("**********************************************");
            VipCustomer vipCustomer = new VipCustomer();
            VipCustomer vipCustomer1 = new VipCustomer("Tamanna", 100);
            System.out.println(vipCustomer1.getName());
            System.out.println(vipCustomer1.getEmailAddress());

            VipCustomer vipCustomer2 = new VipCustomer("Riya", 200, "Riya@email.com");
            System.out.println(vipCustomer2.getName());
            System.out.println(vipCustomer2.getEmailAddress());
    }
}
