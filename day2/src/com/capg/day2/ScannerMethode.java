package com.capg.day2;

import java.util.Scanner;



public class ScannerMethode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter number");
		int num1=sc.nextInt();
		System.out.println(num1);
		
		System.out.println("enter  floatnumber");
		float num2=sc.nextFloat();
		System.out.println(num2);
		
		System.out.println("enter  doubletnumber");
		double num3=sc.nextDouble();
		System.out.println(num3);
		
		System.out.println("enter  string");
		String num4=sc.next();
		System.out.println(num4);
		
		//System.out.println("enter  string");
		//String num5=sc.nextLine();
	//	System.out.println(num5);
		
		
		System.out.println("enter  charecter");
		char num6=sc.next().charAt(2);
		System.out.println(num6);
		

	}

}
