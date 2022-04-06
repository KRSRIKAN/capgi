package com.cap.day4;
class Employee{
	String name;
	int id;
	double height;
	
public Employee(String name, int id, double height) {
		super();
		this.name = name;
		this.id = id;
		this.height = height;
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public double getHeight() {
	return height;
}

public void setHeight(double height) {
	this.height = height;
}

}


public class Student {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("srikanth",12345,5.11);
		System.out.println(e1.getName());
		System.out.println(e1.getId());
		System.out.println(e1.getHeight());
		
		

	}

}
