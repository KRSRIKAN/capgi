package com.cap.np1;

import java.util.Objects;

class Sourc {
	 String name;
	 int age;
	 int rn;
 
 public Sourc( String name,int age,int rn) {
	 this.name=name;
	 this.age=age;
	 this.rn=rn;
	 
 }
 public String getName() {
	 return this.name;
 }
 public void setName( String name) {
	 this.name=name; 
 }
 public int getAge() {
	 return this.age;
 }
 public void setAge( int age) {
	 this.age=age; 
 }
 public int getRn() {
	 return this.rn;
 }
 public void setRn( int rn) {
	 this.rn=rn; 
 }
 public String toString() {
	 return "[name="+name+",age="+age+",rn="+rn+"]";
 }
 public void re() {
	 System.out.println("name"+name);
	 System.out.println(age);
	 System.out.println(rn);
 }
 public boolean equals(Object obj) {
	 if(this==obj) {
		 return true;
	 }
	 if(obj==null) {
		 return false;
	 }
	 if(this.getClass()!=obj.getClass()) {
		 return false;
	 }
	 Sourc other=(Sourc) obj;
	 return Objects.equals(name, other.name)&&age==other.age&&rn==other.rn;
 }
 
 }
public class Mypr1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Sourc s1=new Sourc("srikanth",2,3);
Sourc s2=new Sourc("srik",3,4);
System.out.println(s1.equals(s2));
System.out.println(s1);
s1.re();
s1.setName("srikanth");
s1.setAge(25);
s1.setRn(3);
System.out.println(s1.getName());
System.out.println(s1.getAge());
System.out.println(s1.getRn());
	}

}
