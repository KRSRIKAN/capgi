package com.cap.day4;
class Franchise{
	String name;
	String captain;
	int title;
	public Franchise(String name, String captain, int title) {
		super();
		this.name = name;
		this.captain = captain;
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCaptain() {
		return captain;
	}
	public void setCaptain(String captain) {
		this.captain = captain;
	}
	public int getTitle() {
		return title;
	}
	public void setTitle(int title) {
		this.title = title;
	}
	
}
public class MyEncapsultio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Franchise f1=new Franchise("srh","williamson",2);
		System.out.println(f1.getName());
		System.out.println(f1.getCaptain());
		System.out.println(f1.getTitle());
		

	}

}
