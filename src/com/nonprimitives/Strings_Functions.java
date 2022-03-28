package com.nonprimitives;

public class Strings_Functions {
	
	public static void main(String[] args) {
		
		String s1= "Welcome to java";
		String s2= "welcome to java";
				
		int length = s1.length();
		System.out.println(length);
		
		boolean equals = s1.equals(s2);
		System.out.println(equals);
		
		boolean equalsIgnoreCase = s1.equalsIgnoreCase(s2);
		System.out.println(equalsIgnoreCase);
		
		String upperCase = s1.toUpperCase();
		System.out.println(upperCase);
		
		String lowerCase = s1.toLowerCase();
		System.out.println(lowerCase);
		
		boolean startsWith = s1.startsWith("wel");
		System.out.println(startsWith);
		
		boolean endsWith = s1.endsWith("A");
		System.out.println(endsWith);
		
		boolean contains = s1.contains("come To");
		System.out.println(contains);
		
		int indexOf = s1.indexOf('e');
		System.out.println(indexOf);
		
		int lastIndexOf = s1.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		char charAt = s1.charAt(9);
		System.out.println(charAt);
		
		String replace = s1.replace(" ", "#");
		System.out.println(replace);
		
		String substring = s1.substring(4, 12);
		System.out.println(substring);
		
	}

}
