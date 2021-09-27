package com.spartaglobal.java.lessons;

public class Customer extends Person2 {
    private double accountBalance;

    public Customer(String firstName, String lastName, double accountBalance) {
        super(firstName, lastName);
        this.accountBalance = accountBalance;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}
