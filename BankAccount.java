package Codsoft;
import java.util.ArrayList;
import java.util.Scanner;

    class BankAccount {
        private String accountHolder;
        private int pin;
        private double balance;
        private ArrayList<String> transactions;

        public BankAccount(String accountHolder, int pin, double initialBalance) {
            this.accountHolder = accountHolder;
            this.pin = pin;
            this.balance = initialBalance;
            this.transactions = new ArrayList<>();
        }

        public boolean verifyPin(int inputPin) {
            return this.pin == inputPin;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                transactions.add("Deposited: ₹" + amount);
                System.out.println("✅ Amount deposited successfully!");
            } else {
                System.out.println("❌ Invalid deposit amount!");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                transactions.add("Withdrawn: ₹" + amount);
                System.out.println("✅ Amount withdrawn successfully!");
            } else {
                System.out.println("❌ Insufficient balance or invalid amount!");
            }
        }

        public void showTransactionHistory() {
            if (transactions.isEmpty()) {
                System.out.println("No transactions yet.");
            } else {
                System.out.println("📜 Transaction History:");
                for (String transaction : transactions) {
                    System.out.println("- " + transaction);
                }
            }
        }
    }


