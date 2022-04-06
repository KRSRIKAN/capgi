package com.cap.np1;

import java.util.Objects;

class employee{
	int id;
	String name;
	String colour;
	String brand;

	
	public employee(int id, String name, String colour, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
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

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public int hashCode() {
		return Objects.hash(brand, colour, id, name);
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		employee other = (employee) obj;
		return Objects.equals(brand, other.brand) && Objects.equals(colour, other.colour) && id == other.id
				&& Objects.equals(name, other.name);
	}

	
	
	
}

public class ObjEqu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee(12,"srikanth","red","cap");
		employee e2=new employee(12,"srikanth12","red33","capg");
		employee e3=new employee(12,"srikanth","red","gemini");
		System.out.println(e1.equals(e2));

	}

}
