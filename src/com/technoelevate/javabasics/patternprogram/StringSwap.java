package com.technoelevate.javabasics.patternprogram;

import java.util.Scanner;

public class StringSwap {
public static void main(String[] args) {
	String str1,str2,str3;
	
	Scanner sc =new Scanner(System.in);
	System.out.println("enter the name");
	str1=sc.next();
	str2=sc.next();
	
	str3=str1;
	str1=str2;
	str2=str3;
	
	System.out.print(str1+" ");
	System.out.print(str2);
}
}
