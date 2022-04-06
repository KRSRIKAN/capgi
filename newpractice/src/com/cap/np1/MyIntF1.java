package com.cap.np1;
interface Ar{
	public void walk();
}
interface Br{
	public void run();
}
  class C2 implements Ar,Br{
	public void walk() {
		System.out.println("from walk");
	}
	public void run() {
		System.out.println("from run");
	}
	
}

public class MyIntF1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C2 v=new C2();
		v.walk();
		v.run();
		

	}

}
