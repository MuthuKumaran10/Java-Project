package com.polymorphism;

public class Student1 extends College {

	@Override
	public void studentName(String name) {
		
		super.studentName(name);
	}

	@Override
	public void studentDetails(String course, String dept, int age) {
		
		super.studentDetails(course, dept, age);
	}

	@Override
	public void studentMarks(int tenthm, int twelthm) {
		
		super.studentMarks(tenthm, twelthm);
	}

	
	public static void main(String[] args) {
		
		Student1 obj = new Student1();
		
		obj.studentName("Navin");
		
		obj.studentDetails("BE", "CSE", 20);
		
		obj.studentMarks(450, 1100);
	}
}
