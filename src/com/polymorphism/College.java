package com.polymorphism;

public class College {
	
public void studentName(String name ) {
		
		System.out.println(name);
		
	}
	
	public void studentDetails(String course, String dept, int age) {
		
		System.out.println(course + " " + dept + " " + age);
		
	}
		
	
	public void studentMarks(int tenthm, int twelthm) {
		
		System.out.println(tenthm+ " " + twelthm);
		
	}

	
	public static void main(String[] args) {
		
		College obj = new College();
		
		obj.studentName("Muthu");
		
		obj.studentDetails("BE", "CSE", 20);
		
		obj.studentMarks(250, 600);

}
	
}	
