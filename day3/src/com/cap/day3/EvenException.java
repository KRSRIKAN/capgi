package com.cap.day3;
import java.io.IOException;

import java.util.Scanner;
class EnterEvenException extends Exception{
	EnterEvenException (String msg){
		super(msg);
	}
}

public class EvenException {

	public static void main(String[] args) throws EnterEvenException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int b=sc.nextInt();
		if(b%2==0) {
			System.out.println("given number is  even");
		}
		else {
			throw new EnterEvenException("a even not even number");
			
		}

	}

}
