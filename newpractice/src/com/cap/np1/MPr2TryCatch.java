package com.cap.np1;
import java .util.*;

public class MPr2TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int x=1;
	do {
			try {	Scanner sc= new Scanner(System.in);
		
		System.out.println("enter first number");
		int n1=sc.nextInt();
		System.out.println("enter first number");
		int n2=sc.nextInt();
		int n3=n1/n2;
		System.out.println(n3);
		x=2;
	}
	catch(Exception e) {
		System.out.println("you cant do it");
	}
	}while(x==1);
	
	}
}
