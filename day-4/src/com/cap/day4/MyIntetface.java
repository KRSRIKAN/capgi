package com.cap.day4;
interface A{
	public void print();
}
interface B{
	public void print();
}
class interfacempl implements A,B{
	public void print() {
		System.out.println("print a");
	}
}

public class MyIntetface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfacempl c=new interfacempl();
		c.print();

	}

}
