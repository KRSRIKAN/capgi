package com.cap.np1;
 abstract class p1{
	abstract public void run();
	 
	
}
  class p2 extends p1{
		 public void run() {
			 System.out.println("from p2");
			 
		 }
	
		 
		
	}

public class MyAbs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
p2 obj3 =new p2();
obj3.run();

	}

}
