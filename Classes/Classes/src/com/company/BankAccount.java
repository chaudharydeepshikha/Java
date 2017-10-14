package com.company;

/**
 * @author Deepshikha chaudhary on 10/14/2017
 */
public class BankAccount {

    private Integer accountNumber;
    private Integer balance;
    private String customerName;
    private String email;
    private Integer phoneNumber;

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
