package com.capg.day5;

public class MyIntyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] arr=new int[5];
int arr1[]=new int[6];
int arr3[]= {1,2,3,4,5,6,7,8};
System.out.println(arr.length);

System.out.println(arr1.length);
System.out.println(arr3.length);

	 arr[0]=1;
	 arr[1]=20;
	 arr[2]=22;
	 arr[3]=23;
	 arr[4]=24;
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}
}
