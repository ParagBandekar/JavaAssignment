package com.technoelevate.javabasics.patternprogram;

import java.util.Scanner;

public class ReverseNo {
public static void main(String[] args) {
	int a=6,b=10;
	Scanner sc=new Scanner(System.in);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("a="+a+" "+"b="+b);
	
	
}
}
