package com.cap.np1;

import java.util.Collections;
import java.util.Stack;

import java.util.Iterator;




public class MyStack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st=new Stack<Integer>();
		st.push(80);
		st.add(25);
		st.add(66);
		 System.out.println(st);
		 System.out.println(st.peek());
		 st.push(55 );
		 System.out.println(st);
		 Collections.sort(st);
		 System.out.println(st);
		 Iterator<Integer> ii=st.iterator();
		 while(ii.hasNext()) {
			 System.out.println(ii.next());
		 }
		 

	}

}
