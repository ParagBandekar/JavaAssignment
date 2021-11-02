package com.technoelevate.javabasics.exceptionhandling;

public class InSufficientBalance extends Exception {
	String msg;

	public InSufficientBalance(String msg) {
		super();
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}

}
