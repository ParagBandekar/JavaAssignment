package com.technoelevate.javabasics.stringdemo;

public class StringClassDemo {
	public static void main(String[] args) {
		String string=new String("technoelevate");
		String string1=new String("technoelevate");
		String string2=new String("testyantra");
		System.out.println(string);
		System.out.println(string1);
		System.out.println(string2);
		System.out.println(string.hashCode());
		System.out.println(string1.hashCode());
		System.out.println(string2.hashCode());
		System.out.println(string.equals(string2));
		System.out.println(string.equals(string1));
	}

}
