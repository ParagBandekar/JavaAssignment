package com.technoelevate.javabasics.patternprogram;

import java.util.Scanner;

public class ReverseString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String a=sc.next();
	System.out.println("the reverse of "+ a + " is");
	for(int i=a.length();i>0;--i) {
		System.out.print(a.charAt(i-1));
	}
}
}