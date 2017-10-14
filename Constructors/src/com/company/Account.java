package com.company;

/**
 * @author Deepshikha chaudhary on 10/14/2017
 */
public class Account {
    private Integer accountNumber;
    private Integer balance;
    private String customerName;
    private String email;
    private Integer phoneNumber;

    public Account() {
        this(789, 50000, "Rahul Singh", "Rahul.Singh@gmail.com", 12345);
        System.out.println("This is empty constructor");
    }

    public Account(Integer accountNumber, Integer balance, String customerName, String email, Integer phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Account number : "+ accountNumber);
        System.out.println("Balance : " + balance);
        System.out.println("Customer name: "+ customerName);
        System.out.println("Email : " + email);
        System.out.println("Phone number "+ phoneNumber);
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean withdraw(Integer amountToWithdraw){
        if(amountToWithdraw > balance){
            return false;
        }
        return true;
    }
    public Integer deposit(Integer amountToDeposit){
        balance = balance + amountToDeposit;
        return balance;
    }
}
