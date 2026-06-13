package com.example.exceptionhandling;

public class BankAccount {
	private double balance = 5000;;

    public void withdraw(double amount)
            throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available balance: " + balance);
        }

        balance =balance - amount;

        System.out.println("Withdrawal Successful");
        System.out.println("Remaining Balance: " + balance);
    }
}
