package com.capg.day2;
 

class Car{
	double speed;
	String brand;
	String colour;
	
	public Car(double speed,String brand,String colour) {
		this.speed=speed;
		this.brand=brand;
		this.colour=colour;
	}
	public void model() {
		System.out.println("speed"+" "+speed);
		System.out.println("brand"+" "+brand);
		System.out.println("colour"+" "+colour);
		
	}
	
	
}

public class CarConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1=new Car(122.2,"audi","black");
		c1.model();

	}

}
