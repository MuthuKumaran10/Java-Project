package com.nonprimitives;

public class Strings_Type {
	
	public static void main(String[] args) {
		
		System.out.println("=====Immutable=====");
		
		String s1 = "Greens";
		String s2 = "Greens";
		
		int ref1 = System.identityHashCode(s1);
		System.out.println(ref1);
		
		int ref2 = System.identityHashCode(s2);
		System.out.println(ref2);
		
		String concat = s1.concat(s2);
		System.out.println(concat);
		
		int memory1 = System.identityHashCode(concat);
		System.out.println(memory1);
		
		
		System.out.println("======Mtable=====");
		
		StringBuffer s3 = new StringBuffer("ABC");
		StringBuffer s4 = new StringBuffer("ABC");
		
		int ref3 = System.identityHashCode(s3);
		System.out.println(ref3);
		
		int ref4 = System.identityHashCode(s4);
		System.out.println(ref4);
		
		StringBuffer append = s4.append(s3);
		System.out.println(append);
		
		int memory2 = System.identityHashCode(append);
		System.out.println(memory2);
		
				
	}

}
