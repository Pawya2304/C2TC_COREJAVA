package com.tns.assignment;
import java.util.Scanner;

public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Choose account type
	        System.out.println("Choose account type: 1 for Savings, 2 for Checking");
	        int choice = scanner.nextInt();

	        // Enter initial balance
	        System.out.print("Enter initial balance: ");
	        double initialBalance = scanner.nextDouble();
	        Account account;

	        // Create account based on user choice
	        if (choice == 1) {
	            account = new SavingsAccount(initialBalance);
	        } else if (choice == 2) {
	            account = new CheckingAccount(initialBalance);
	        } else {
	            System.out.println("Invalid choice. Exiting.");
	            scanner.close();
	            return;
	        }

	        // Display initial total accounts
	        System.out.println("Total accounts: " + Bank.getTotalAccounts());

	        Transaction transaction = new Transaction();
	        boolean continueTransactions = true;

	        // Transaction loop
	        while (continueTransactions) {
	            System.out.println("\nChoose transaction type: 1 for Deposit, 2 for Withdraw, 3 to Exit");
	            int transactionType = scanner.nextInt();

	            if (transactionType == 3) {
	                continueTransactions = false;
	                System.out.println("Exiting transaction system.");
	                break;
	            }

	            // Enter transaction amount
	            System.out.print("Enter transaction amount: ");
	            double amount = scanner.nextDouble();

	            // Perform transaction
	            if (transactionType == 1) {
	                transaction.performTransaction(account, amount, true); // Deposit
	            } else if (transactionType == 2) {
	                transaction.performTransaction(account, amount, false); // Withdraw
	            } else {
	                System.out.println("Invalid transaction type. Try again.");
	            }

	            // Display updated balance
	            System.out.println("Updated Balance: " + account.getBalance());
	        }

	        scanner.close();
	    }
	}


