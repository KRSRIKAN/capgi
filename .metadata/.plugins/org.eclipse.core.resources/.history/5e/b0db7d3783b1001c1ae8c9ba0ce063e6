package com.cap.np1;

import java.util.Objects;

class Cinema{
	String name;
	String director;
	int year;
	public Cinema(String name, String director, int year) {
		super();
		this.name = name;
		this.director = director;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Cinema [name=" + name + ", director=" + director + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(director, name, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cinema other = (Cinema) obj;
		return Objects.equals(director, other.director) && Objects.equals(name, other.name) && year == other.year;
	}
	
}

public class MyObjEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cinema c1=new Cinema("bhahubhali","rajmouli",2);
		Cinema c2=new Cinema("bhahubhali","rajmouli",2);
		Cinema c3=new Cinema("salar","prashanth",1);
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}

}
