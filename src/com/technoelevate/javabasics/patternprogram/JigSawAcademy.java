package com.technoelevate.javabasics.patternprogram;

	import java.util.Scanner;

	public class JigSawAcademy

	{

	    public static void main(String[] args)

	    {

	    Scanner sc = new Scanner(System.in); // to take input

	    System.out.println(Enter number of rows: ");

	    int rows = sc.nextInt();

	    for (int i= rows; i>= 1; i--)

	    {

	    for (int j=rows; j>i;j--)

	    {

	    System.out.print(" ");

	    }

	    for (int k=1;k<=i;k++)

	    {

	    System.out.print("*");

	    }

	    System.out.println(" ");

	    }

	    sc.close();

	    }

	    }
