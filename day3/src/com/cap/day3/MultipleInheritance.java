package com.cap.day3;
class K{
	int a=10;
	public void printA() {
		System.out.println("printA1");
	}
	
}
class B1 extends K{
	int b=20;
	public void printB() {
		System.out.println("printB");
	}
}

class C1 extends B1{
	int c=30;
	public void printC() {
		System.out.println("printC");
	}
	
}



public class MultipleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C1 c1= new C1();
		c1.printA();
		System.out.println(c1.a);
		c1.printB();
		System.out.println(c1.b);
		c1.printC();
		System.out.println(c1.c);

	}

}
