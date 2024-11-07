package com.tns.assignment;


public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        double newBalance = currentBalance() + amount + (amount * INTEREST_RATE);
        setBalance(newBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= currentBalance()) {
            setBalance(currentBalance() - amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    @Override
    public double getBalance() {
        return currentBalance();
    }
}
