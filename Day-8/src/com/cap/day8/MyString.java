package com.cap.day8;

import java.util.Scanner;

interface Str{
	public void m1(String name);
}

public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Str s1=(String name)->{;
		
				
			System.out.println(name.toUpperCase());
		};
s1.m1("srikanth");
	}

}
