package com.capg.day6;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Iterator;

public class MyArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ls= new ArrayList<Integer>();
		ls.add(405);
		ls.add(20);
		ls.add(30);
		System.out.println(ls);
		Collections.sort(ls);
		Collections.sort(ls,Collections.reverseOrder());
		
		
		
		System.out.println(ls.remove(1));
		System.out.println(ls.contains(20));
		System.out.println(ls.equals(3));
		
		ArrayList<Double> ds= new ArrayList<Double>();
		ds.add(15.0);
		ds.add(20.0);
		ds.add(30.0);
		System.out.println(ds);
		
		
		ArrayList<String> ss= new ArrayList<String>();
		ss.add("srikanth");
		ss.add("kristam");
		ss.add("employee");
		System.out.println(ss);
		System.out.println(ss);
		Collections.sort(ss);
		Collections.sort(ss,Collections.reverseOrder());
		
		
		
		System.out.println(ss.remove(1));
		System.out.println(ss.contains("srikanth"));
		System.out.println(ls.equals("sri"));
		
		

	}

}
