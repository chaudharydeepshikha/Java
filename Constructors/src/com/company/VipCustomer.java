package com.company;

/**
 * @author Deepshikha chaudhary on 10/18/2017
 */
public class VipCustomer {

    private String name;
    private Integer creditLimit;
    private String emailAddress;

    public VipCustomer() {
        System.out.println("Default constructor");
    }

    public VipCustomer(String name, Integer creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public VipCustomer(String name, Integer creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public Integer getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
