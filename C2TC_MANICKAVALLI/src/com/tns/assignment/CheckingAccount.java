package com.tns.assignment;


public class CheckingAccount extends Account {
    private static final double OVERDRAFT_LIMIT = 500;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(currentBalance() + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= currentBalance() + OVERDRAFT_LIMIT) {
            setBalance(currentBalance() - amount);
        } else {
            System.out.println("Overdraft limit exceeded!");
        }
    }

    @Override
    public double getBalance() {
        return currentBalance();
    }
}


