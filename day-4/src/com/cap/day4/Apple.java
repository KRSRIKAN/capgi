package com.cap.day4;
interface redmi {
	public void calling();
	public void sendsms();
	
}
class Realme implements redmi{
	public void calling() {
		System.out.println("start sms");
	}
	public void sendsms() {
		System.out.println("start calling");
	}
}

public class Apple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Realme r1=new Realme();
		r1.calling();
		r1.sendsms();

	}

}
