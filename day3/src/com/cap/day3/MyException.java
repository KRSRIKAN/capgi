package com.cap.day3;

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10;
		
		int b=0;
		System.out.println(a/b);

		}
			
		
catch(Exception e) {
	System.out.println("exception handled");
}
		finally {
			System.out.println("finally handled");
			System.out.println("main methode end");
			
		}
		System.out.println("final");
	}

}
