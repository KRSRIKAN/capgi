package com.cap.np1;
import java.util.*;
class NumberException extends Exception{
	 NumberException (String msg){
		 super(msg);
	 }
}

public class Mypr3OnliyPositiveUserExce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner ac=new Scanner(System.in);
	//	System.out.println("enter nuber");
	//	int n=ac.nextInt();
		try {
			positive(-20);
		}
		catch(Exception e) {
			System.out.println("enter positive"+e);
		}

	}
	public static void positive(int n)throws NumberException {
		if(n>0) {
			System.out.println("positive number");
		}
		else {
			throw new NumberException("not valid");
		}
	}

}
