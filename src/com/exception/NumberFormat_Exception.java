package com.exception;

public class NumberFormat_Exception {
	
	public static void main(String[] args) {
		
		String s = "1234A";
		String t ="5678";		
		
		String u = s+t;
		System.out.println(u);
		
		int a = Integer.parseInt(s);
		int b = Integer.parseInt(t);
		int c = a+b;
		
		System.out.println(c);
		
	}

}
