package com.nonprimitives;

public class Array_Concepts {
	
	public static void main(String[] args) {
		
		int a[]=new int[10];
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		a[3]=70; //Duplicate Value
		
		//to get a particular value
				
		System.out.println(a[7]);
		
		int length = a.length;
		
		System.out.println(length);
		
		//to get all values
		
		for (int i = 3; i <= 7; i++) {
			
			System.out.println(a[i]);
			
		}
		
		for (int i : a) {
			
			System.out.println(i);
			
		}
	}

}
