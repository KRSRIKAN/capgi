package com.cap.day4;
abstract class NewResult{
	public void run () {
		System.out.println(" now run");
		
	}
	public void walk () {
		System.out.println(" now walk");
		
	}
	
}
class B1 extends NewResult {
	public void run () {
		System.out.println(" now run fast");
		
	}
	public void walk () {
		System.out.println(" now walk fast");
		
	}
	
}


public class MyAbstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 a=new B1();
		a.run();
		a.walk();

	}

}
