package com.cap.day8;
interface Lambda{
	public void p1();
}

interface Sum1{
	public void add(int a,int b);
}

public class MyLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Lambda result=()-> System.out.println("hello java lambda");
result.p1();

Sum1 sum=(int a,int b)->{
	int c=a+b;
	System.out.println(c);
};
	sum.add(10,25);
	}
	

}
