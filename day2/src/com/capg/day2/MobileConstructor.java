package com.capg.day2;
class 	Cell{
	int phn;
	double cost;
	String colour;
	String model;
	public Cell (int phn,double cost,String colour,String model) {

		this.phn=phn;
		this.cost=cost;
		this.colour=colour;
		this.model=model;
		
		
	}
	public void release() {
		System.out.println("phn"+" "+phn);
		System.out.println("cost"+" "+cost);
		System.out.println("colour"+" "+colour);
		System.out.println("model"+" "+model);
	}
}

public class MobileConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Cell m1=new Cell(701341279,25000,"blue","realme");
m1.release();
	}

}
