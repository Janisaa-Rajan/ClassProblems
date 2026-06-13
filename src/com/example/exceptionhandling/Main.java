package com.example.exceptionhandling;

public class Main {

    public static void main(String[] args) throws InsufficientBalanceException{
    	BankAccount account = new BankAccount();

        try {
            account.withdraw(2000);
        }
        catch (InsufficientBalanceException e) {
            System.out.println("Transaction Failed");
            System.out.println(e.getMessage());
        }
    }
}