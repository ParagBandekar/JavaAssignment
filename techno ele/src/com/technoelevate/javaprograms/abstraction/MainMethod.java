package com.technoelevate.javaprograms.abstraction;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FactoryClass class1 = new FactoryClass();
		System.out.println("select the browser from the given option");
		System.out.println("1.Chrome\n2.Safari\n3.Mozilla\n4.Opera\n");
		System.out.println("please enter your selection choice");
		int n = sc.nextInt();
		switch (n) {
		case 1:
			class1.getBrowser("Chrome").start();
			break;
		case 2:
			class1.getBrowser("Safari").start();
			break;
		case 3:
			class1.getBrowser("Opera").start();
			break;
		case 4:
			class1.getBrowser("Mozilla").start();
			break;
		default:
			System.out.println("Invalid");
		}
	}

}
