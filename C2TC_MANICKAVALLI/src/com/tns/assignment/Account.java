package com.tns.assignment;

//Abstract Account Class
public abstract class Account {
    private double balance;

    public Account(double initialBalance) {
        this.balance = initialBalance;
        Bank.incrementTotalAccounts();
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract double getBalance();

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    protected double currentBalance() {
        return this.balance;
    }
}




