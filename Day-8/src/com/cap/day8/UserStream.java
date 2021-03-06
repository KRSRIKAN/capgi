package com.cap.day8;

import java.util.ArrayList;
import java.util.Collections;

class  Employee {
	 int id;
	 String name;
	 double salary;
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	 
 }

public class UserStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> lis=new ArrayList<Employee>();
		lis.add(new Employee(1,"srikanth",5000.253));
		lis.add(new Employee(2,"dgdg",50.253));
		lis.add(new Employee(3,"abc",25000.253));
		lis.add(new Employee(4,"def",15000.253));
		lis.add(new Employee(5,"ghi",52000.253));
		lis.stream().forEach(System.out::println);
		lis.stream().filter(e->e.getSalary()>5000).forEach(System.out::println);
	}

}
