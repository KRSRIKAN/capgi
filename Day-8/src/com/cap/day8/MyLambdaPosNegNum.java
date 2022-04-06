package com.cap.day8;
interface Number{
	public void print(int a);
}

public class MyLambdaPosNegNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number p3=(int a)->{
			if(a>0) {
			System.out.println("positive number");
		}
			else {
				System.out.println("negative number");
			}
		};
		p3.print(30);
	}

}
