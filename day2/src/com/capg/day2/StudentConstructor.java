package com.capg.day2;

 class Employee{
	 
	 int id;
	 String name;
	 long l;
	 public Employee(int id,String name,long l) {
		 this.id=id;
		 this.name=name;
		 this.l=l;
		 
	 }
	 public void result() {
		 System.out.println("id"+id);
		 System.out.println("name"+name);
		 System.out.println("l"+l);
	 }
	
}

public class StudentConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee St=new Employee(1222,"srikanth",7013412798l);
		St.result();

	}

}
