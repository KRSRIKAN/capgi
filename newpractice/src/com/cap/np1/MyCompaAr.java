package com.cap.np1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

class Srikanth implements Comparable<Srikanth>{
	int id;
	String name;
	String cinema;
	public Srikanth(int id,String name,String cinema) {
		this.id=id;
		this.name=name;
		this.cinema=cinema;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public void setName(String name) {
		this.name=name;
		
	}
	public void setCinema(String Cinema) {
		this.cinema=cinema;
		
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getCinema() {
		return cinema;
	}
	public String toString() {
		return "Srikanth[id="+id+",name="+name+",cinema="+cinema+"]";
		//return this.id=,this.name=,this.cinema=cinema;
	}
	public boolean Equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(getClass()!=obj.getClass()) {
			return false;
		}
		
		Srikanth s1=(Srikanth) obj;
		return Objects.equals(name,s1.name) && id==s1.id && Objects.equals(cinema,s1.cinema);
		
		
	}

	public int compareTo(Srikanth that) {
		return this.id-that.id;
		//return this.getName().compareTo(that.getName());
	}
	
}

public class MyCompaAr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Srikanth> a1=new ArrayList<Srikanth>();
		Srikanth sri=new Srikanth(1,"A","rrr");
		Srikanth sri3=new Srikanth(3,"D","salar");
		
		Srikanth sri1=new Srikanth(2,"C","adhipurush");
		
		System.out.println(sri);
		System.out.println(sri1);
		System.out.println(sri.Equals(sri1));
		a1.add(sri1);
		a1.add(sri3);
		a1.add(sri);
		System.out.println(a1);
	
		Collections.sort(a1);
		System.out.println(a1);
	}	

}
