package com.abstraction;

public class Daughter implements Mother, Father {

	@Override
	public void bike() {

		System.out.println("Vespa");
		
	}

	@Override
	public void watch() {
		
		System.out.println("Titan");
		
	}

	@Override
	public void ring() {

		System.out.println("Diamond Ring");
		
	}

	@Override
	public void chain() {

		System.out.println("Gold Chain");
		
	}
	
	
	public static void main(String[] args) {
		
		Daughter obj = new Daughter();
		
		obj.bike();
		
		obj.watch();
		
		obj.ring();
		
		obj.chain();
}

}
