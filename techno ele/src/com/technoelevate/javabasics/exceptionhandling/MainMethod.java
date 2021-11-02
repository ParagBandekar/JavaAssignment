package com.technoelevate.javabasics.exceptionhandling;

public class MainMethod {
	public static void main(String[] args) throws InSufficientBalance {
		BankAccount bankAccount=new BankAccount(5000);
		bankAccount.withdraw(4000);
	}

}
