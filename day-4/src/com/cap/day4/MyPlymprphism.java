package com.cap.day4;
class SRH{
	public void IPL() {
		System.out.println(" rr will win");
	}
	public void IPL( int a) {
		System.out.println(" mi will win");
	}
	
}
class DecaanCharges extends SRH{
	public void IPL( int a) {
		System.out.println(" srh will win");
	}
		
	
}
public class MyPlymprphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DecaanCharges d1=new DecaanCharges();
		d1.IPL();
		d1.IPL(20);
	}

}
