package com.technoelevate.javabasics.exceptionhandling;

public class BankAccount {
	double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public void withdraw(double amount) throws InSufficientBalance {
		if (amount <= balance) {
			System.out.println("succesfull withdraw");
			System.out.println("balance =" + (balance - amount));
		} else {
			throw new InSufficientBalance("The amount exceeds the balance amount");
		}
	}

}
