package com.cap.np1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class MyLL1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> s1=new LinkedList<String>();
		s1.add("srikanth");
		s1.add("sr");
		s1.add("srika");
		s1.add("srikan");
		//s1.clear();
		s1.set(0,"kristam");
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.contains("kristam"));
		Collections.sort(s1);
		System.out.println(s1);
		Iterator< String> i1=s1.iterator();
		while(i1.hasNext()) {
			System.out.println(i1.next());
		}
		for(String ss:s1) {
			System.out.println(ss);
		}
		for(int i=0;i<s1.size();i++) {
			System.out.println(s1.get(i));
		}



	}

}
