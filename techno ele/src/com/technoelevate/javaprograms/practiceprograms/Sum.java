package com.technoelevate.javaprograms.practiceprograms;

abstract class Sum {
	public static int sum() {
		System.out.println("method called");
		System.out.println("method called 2");
		return 10;
	}
	
public static void main(String[] args) {
	int result=sum();
	System.out.println(result);
	
}
}
