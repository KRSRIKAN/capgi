package com.capg.day6;

import java.util.ArrayList;
import java.util.Collections;

public class Myarray1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer>ls=new ArrayList<Integer>();
		ls.add(23);
		ls.add(56);
		ls.add(10);
	
		Collections.sort(ls);
		System.out.println(ls);
		
		Collections.sort(ls,Collections.reverseOrder());
		System.out.println(ls);
		System.out.println(ls.remove(0));
		System.out.println(ls.contains(23));
		System.out.println(ls.equals(23));
		
		
		ArrayList<String>ss=new ArrayList<String>();
		ss.add("sri");
		ss.add("kanth");
		ss.add(" k");
	
		Collections.sort(ss);
		System.out.println(ss);
		
		Collections.sort(ss,Collections.reverseOrder());
		System.out.println(ss);

	}

}
