package com.cap.np1;
class Animal{
	int i=20;
	public void talk() {
		System.out.println("from  animal talk");
	}
}
 class Cat extends Animal{
	int i=30;
	public void talk() {
		System.out.println("from  animal  cat talk");
	}
}

public class MyPol1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c2=new Cat();
		System.out.println(c2.i);	
	//	c1.talk();
		Animal a1=new Cat();
		Cat c1=(Cat)a1;
		a1.talk();
System.out.println(c1.i);
	}

}
