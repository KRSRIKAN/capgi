package com.capg.day6;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class MyHahset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<Integer> set=new HashSet<Integer>();
        set.add(95);
        set.add(100);
        set.add(120);
        set.add(144);
        System.out.println(set);
        Iterator<Integer> ss=set.iterator();
        while(ss.hasNext()) {
        	System.out.println(ss.next());
        }
        
    
        LinkedHashSet<Integer> set1=new LinkedHashSet<Integer>();
        set1.add(95);
        set1.add(100);
        set1.add(120);
        set1.add(144);
        System.out.println(set);
        Iterator<Integer> ss1=set1.iterator();
        while(ss1.hasNext()) {
        	System.out.println(ss1.next());
        }
        System.out.println(set1.size());
        System.out.println(set1.remove(1));
        System.out.println(set1.contains(120));
      //  System.out.println(set1.clear());
        Object[] arr=set1.toArray();
        for(Object obj:arr) {
        	System.out.println( obj);
        }
        
	}

}
