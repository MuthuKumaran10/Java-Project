package com.constructor;

public class Student {
	
	public Student() {
		
		System.out.println("Default Construstor");
	
	}
	
	public Student(String name) {
		
		System.out.println(name);
		
 	}	

		
	public Student(int age) {
		
		System.out.println(age);
		
	}	
	
	public static void main(String[] args) {
		
		Student obj1 = new Student();
		
		Student obj2 = new Student("Navin");
		
		Student obj3 = new Student(26);
		
	
	}
		
	}

