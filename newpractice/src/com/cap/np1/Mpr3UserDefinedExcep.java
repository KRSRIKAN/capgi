package com.cap.np1;
import java.util.*;
class AgeException extends Exception{
	AgeException(String msg){
		super(msg);
	}
}
public class Mpr3UserDefinedExcep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("enter age");
int age=sc.nextInt();
try {
	checkAge( age);
}
catch (Exception e) {
	System.out.println("enter valid age"+e);
}

/*if(a>18) {
	System.out.println(" valid");
}
else {
	throw new AgeException("not valid");
}
	*/

	}
	public static void checkAge(int age) throws AgeException{
		if(age<18) {
			throw new AgeException("valid");
		}
		else {
			System.out.println("u must valid");
		}
		
	}

}
