package com.capg.day2;

public class EvenFibonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int n=0;
		while(n<100) {
			System.out.println(n);
			a=b;
			b=n;
			n=a+b;
		}

	}

}
