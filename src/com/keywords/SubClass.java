package com.keywords;

public class SubClass extends Parent {
	
	int i = 89;
	
	public void num2() {

		System.out.println(this.i);
		
		System.out.println(super.a);

	}

	@Override
	public void num1() {
		
		super.num1();
	}
	
	public static void main(String[] args) {
		
		SubClass obj = new SubClass();
		
		obj.num2();
		
		obj.num1();
	}
	

}
