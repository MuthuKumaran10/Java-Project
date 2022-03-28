package com.variablepractice;

public class VariablePractice {
	
	int x = 90;
	
	static int y = 10;
	
	
	public void num1() {
		
		int a = 12;
		
		System.out.println(x);
		
		System.out.println(a);

	}
	
	public static void num2() {
		
		int i = 90;
		
		System.out.println(i);

	}
	
	public static void main(String[] args) {
		
		System.out.println("=======Static method and Static variable======");
		
		num2();
		
		System.out.println(y);
		
		System.out.println("======Normal method and Static variable======");
		
		VariablePractice obj = new VariablePractice();
		
		obj.num1();
		
		System.out.println(obj.x);
		
		
}

}
	
	
