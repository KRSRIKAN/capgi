package com.cap.day3;
class A{
	int b=10;
	public void printA() {
	System.out.println("print a");
	}
}

public class Inheritance extends A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		a.printA();
		System.out.println(a.b);
		

	}

}
