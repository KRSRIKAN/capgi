package com.cap.day3;
class EnterPositiveNumber extends Exception{
	EnterPositiveNumber(String msg){
		super(msg);
	}
}
class Sum{
	public void add(int a,int b) throws  EnterPositiveNumber {
		if(a>0&&b>0) {
			System.out.println(a+b);
		}
		else {
			throw new EnterPositiveNumber("enter positive numberr");
		}
	}
}

public class MyChain {

	public static void main(String[] args) throws EnterPositiveNumber  {
		// TODO Auto-generated method stub
		Sum s1=new Sum();
				s1.add(10,20);

	}

}
