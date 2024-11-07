package com.tns.assignment;

	// Transaction Class
public class Transaction {
    private final double transactionFee = 2.5;

    public final void performTransaction(Account account, double amount, boolean isDeposit) {
        if (isDeposit) {
            account.deposit(amount - transactionFee);
        } else {
            account.withdraw(amount + transactionFee);
        }
        System.out.println("Transaction completed. New balance: " + account.getBalance());
    }
}
