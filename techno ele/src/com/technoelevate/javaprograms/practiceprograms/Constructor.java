package com.technoelevate.javaprograms.practiceprograms;

public class Constructor {
	public Constructor() {
		// TODO Auto-generated constructor stub
	System.out.println("constructor created");
	}
	public Constructor(int a) {
		System.out.println("constructor 2");
	}
public static void main(String[] args) {
	new Constructor();
	new Constructor(10);
			
}
}
