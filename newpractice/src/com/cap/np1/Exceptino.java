package com.cap.np1;
 class NewException  extends Exception{
	 NewException( String str){
		 super(str);
	 }
 }
public class Exceptino {

	public static void main(String[] args) throws NewException  {
		// TODO Auto-generated method stub
		int b =16;
		if (b%2==0) {
			System.out.println(" eliible to even");
		}
		else {
			
			System.out.println(" eliible to not  vote");
			
		}
		
}
}
