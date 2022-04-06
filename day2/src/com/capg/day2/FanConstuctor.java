package com.capg.day2;

class Fan{
	int blade;
	double cost;
	String colour;
	public Fan(int blade,double cost,String colour) {

		this.blade=blade;
		this.cost=cost;
		this.colour=colour;
		
		
	}
	public void amount() {
		System.out.println("blade"+" "+blade);
		System.out.println("cost"+" "+cost);
		System.out.println("colour"+" "+colour);
	}
}
public class FanConstuctor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Fan f1=new Fan(3,5000,"red");
		f1.amount();
	}

}
