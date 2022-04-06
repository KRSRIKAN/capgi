package com.cap.day3;

public class EmployeeToStrig {
	String name;
	String company;
	double salary;

	public EmployeeToStrig(String name, String company, double salary) {
		super();
		this.name = name;
		this.company = company;
		this.salary = salary;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "EmployeeToStrig [name=" + name + ", company=" + company + ", salary=" + salary + "]";
	}
	


	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		EmployeeToStrig e1=new EmployeeToStrig("srkanth","capgemini",30000);
		
		EmployeeToStrig e2=new EmployeeToStrig("sriram","capgemini",40000);
		EmployeeToStrig e3=new EmployeeToStrig("sai","capgemini",50000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);

	}

}
