package com.capg.day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

class Student implements Comparable<Student>{
	String  name;
	int phn;
	String occupation;
	public Student(String name, int phn, String occupation) {
		super();
		this.name = name;
		this.phn = phn;
		this.occupation = occupation;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhn() {
		return phn;
	}
	public void setPhn(int phn) {
		this.phn = phn;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phn=" + phn + ", occupation=" + occupation + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, occupation, phn);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && Objects.equals(occupation, other.occupation) && phn == other.phn;
	}
	@Override
	public int compareTo(Student S1) {
		// TODO Auto-generated method stub
		if(this.getPhn()>S1.getPhn()) {
			return 1;
		}
		if(this.getPhn()<S1.getPhn()) {
			return -1;
		}
		else {
		return 0;
		}
	}
	
	
	
}

public class NpLinkStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ArrayList<Student> ls=new ArrayList<Student>();
       Student s1=new Student("srikanth",123,"emp");
       Student s2=new Student("kristam",143,"mp");
       Student s3=new Student("#$$",420,"mla");
       ls.add(s1);
       ls.add(s2);
       ls.add(s3);
    //.....   Collections.sort(ls,new SortById());
      System.out.println(ls);
       System.out.println(s1);
       for(Student e:ls) {
    	   System.out.println(e);
       }
       
	}

}
