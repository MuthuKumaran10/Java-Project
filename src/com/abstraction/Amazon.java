package com.abstraction;

public class Amazon extends AbstractClass {

	@Override
	public void password() {
		
		System.out.println("123456");
	}

	@Override
	public void username() {
	
		super.username();
	}
	
	public static void main(String[] args) {
		
		Amazon obj = new Amazon();
		
		obj.username();
		
		obj.password();
		
	}

}
