package com.polymorphism;

public class MethodoverLoading {
	
	public void studentDetails(String name ) {
		
		System.out.println(name);
		
	}
	
	public void studentDetails(String dept, String course, int age) {
		
		System.out.println(dept + " " + course + " " + age);
		
	}
		
	
	public void studentDetails(int m1, int m2, int m3, int m4) {
		
		System.out.println(m1 + " " + m2 + " " + m3 + " " + m4);
		
	}

	
	public static void main(String[] args) {
		
		MethodoverLoading obj = new MethodoverLoading();
		
		obj.studentDetails("Muthu");
		
		obj.studentDetails("CSE", "BE", 20);
		
		obj.studentDetails(98, 99, 95, 92);
		
		
	}

}
