package com.capg.day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


	


public class LinkedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ls=new LinkedList<Integer>();
		ls.add(25);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		System.out.println(ls.peekFirst());
		//System.out.prrintln(ls.offerFirst(20));
		Iterator<Integer> it=ls.descendingIterator();
				
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
