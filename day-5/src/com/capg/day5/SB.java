package com.capg.day5;

public class SB {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		String s="srikanth";
		String s1=new String("srikanth");
		String s3="srikanth";
		String s4=" kristam";
		if(s.equalsIgnoreCase(s1)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
			
		}
		String one="s";
		String two="s";
		String three="r";
		System.out.println(one.compareTo(two));
		
		System.out.println(one.compareTo(three));
		System.out.println(s1.charAt(2));
		System.out.println(s1.concat(s4));
		System.out.println(s.replace("s", "S"));
		System.out.println(s.subSequence(0, 3));
		
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		String s5="Srikanth Kristam";
		System.out.println(s5.trim());
		System.out.println(s5);
		
	}

}
