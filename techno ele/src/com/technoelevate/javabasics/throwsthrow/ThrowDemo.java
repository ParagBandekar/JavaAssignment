package com.technoelevate.javabasics.throwsthrow;

import java.io.IOException;

public class ThrowDemo {
	public static void main(String[] args) {
		try {
			throwDemo();
		} catch (IOException e) {
			System.out.println("exception occurde");
		}
		
	}
	private static void throwDemo() throws IOException {
		System.out.println("first method");
		throwDemo1();
	}
	private static void throwDemo1() throws IOException {
System.out.println("second method");		
throwDemo2();
	}
	private static void throwDemo2() throws IOException {
System.out.println("third method");	
throwDemo3();
	}
	private static void throwDemo3() throws IOException {
System.out.println("fourth method");
throw new IOException();
	}
	

}
