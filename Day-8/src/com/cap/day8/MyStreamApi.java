package com.cap.day8;

import java.util.ArrayList;
import java.util.Collections;

public class MyStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list= new ArrayList<Integer>();
		list.add(25);
		list.add(-5);
		list.add(35);
		list.add(-45);
		list.add(-5);
		list.add(125);
		long count=list.stream().filter(e->e>0).map(num ->num*2).sorted(Collections.reverseOrder()).distinct().count();
		
System.out.println(count);
	}

}
