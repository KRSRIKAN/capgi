package com.cap.np1;

import java.util.ArrayList;
import java.util.Iterator;

class Employee{
	int no;
	String name;
	String movie;
	public Employee(int no, String name, String movie) {
		super();
		this.no = no;
		this.name = name;
		this.movie = movie;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMovie() {
		return movie;
	}
	public void setMovie(String movie) {
		this.movie = movie;
	}
	@Override
	public String toString() {
		return "Employee [no=" + no + ", name=" + name + ", movie=" + movie + "]";
	}
	
	
}

public class MyGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> E=new ArrayList<Employee>();
Employee e1=new Employee(1,"dtyd","253665");
Employee e2=new Employee(2,"yd","2565");
Employee e3=new Employee(3,"dtd","2535");
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		E.add(e1);
		E.add(e2);
		E.add(e3);
		System.out.println(E);
		Iterator<Employee> e4=E.iterator();
		while(e4.hasNext()) {
			System.out.println(e4.next()); 
		}
		

		


	}

}
