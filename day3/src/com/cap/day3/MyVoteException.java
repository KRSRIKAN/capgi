package com.cap.day3;

import java.util.Scanner;
import java.io.IOException;
class NotEligibleException extends Exception {
	NotEligibleException
	(String msg) {
        // it is used to call the constructor of parent class
        super(msg);
    }
}
public class MyVoteException {

	public static void main(String[] args) throws NotEligibleException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("eligble to vote");
		}
		else {
			throw new NotEligibleException("not eligible to vote");
		}
		

	}

}
