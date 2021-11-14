package com.technoelevate.javabasics.patternprogram;

import java.util.Scanner;

public class Reverse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String str=sc.next();
	System.out.println("the reverse of "+str+" is");
	for(int i=str.length();i>0;--i) {
		System.out.print(str.charAt(i-1));
	}
}
}
