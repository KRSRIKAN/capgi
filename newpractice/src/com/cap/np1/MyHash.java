package com.cap.np1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class MyHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> s1=new HashSet<String>();
		s1.add("srikanth");
		s1.add("surya");
		s1.add("prabhas");
		
		System.out.println(s1);
	//	Collections.sort(s1);
		System.out.println(s1.size());
		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.remove(0));
		System.out.println(s1.contains("surya"));
		Iterator<String> set1=s1.iterator();
		while(set1.hasNext()) {
			System.out.println(set1.next());
		}
	
		//System.out.println(s1.clear());
	}

}
