package com.cap.np1;
class A{
	int k=20;
	public A() {
		System.out.println(" from A");
	}
}

class A1 extends A{
	public A1() {
		System.out.println(" from A1");
	}
}
class B extends A1{
	int j=15;
	public B(int j) {
		System.out.println(" from B");
	}
}


public class MyInh1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(5);
		System.out.println(b.j);
		
		
		System.out.println(b.k);
	}

}
