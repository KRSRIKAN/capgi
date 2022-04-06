package com.cap.day4;

interface A{
	public void result();
}
interface B{
	public void result();
}
class Srikanth implements A,B{
	public void result() {
		System.out.println("kristam srikanth");
	}
}

public class MyInterfaceSri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Srikanth s=new Srikanth();
s.result();
	}

}
