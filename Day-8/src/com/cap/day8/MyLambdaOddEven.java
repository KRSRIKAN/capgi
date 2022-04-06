package com.cap.day8;
interface OddEven{
	public void print(int c);
}

public class MyLambdaOddEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OddEven k1=(int c) ->{
			if(c%2==0) {
				System.out.println("even number");
			}
			else {
				System.out.println("odd number");
			}
		};
		k1.print(55);

	}

}
