package com.cap.np1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class MyAl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		//a1.clear();
		System.out.println(a1);
		
		System.out.println(a1);
		a1.add(1,25);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		System.out.println(a1.get(2));
		
		System.out.println(a1.remove(2));
		System.out.println(a1);
		System.out.println(a1.contains(20));
		System.out.println(a1.size());
		Iterator<Integer> k=a1.iterator();
		while(k.hasNext()) {
			System.out.println(k.next());
		}
		for(Integer k1:a1) {
			System.out.println(k1);
		}
		
		for(int i=0;i<a1.size();i++) {
			System.out.println(a1.get(i));
		}
		
	}

}
