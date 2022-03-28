package com.controlstatement;

import java.util.Scanner;

public class Jumping {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number...");
		
		Scanner s = new Scanner(System.in);
		
		int i = s.nextInt();
		
		switch (i) {
		
		case 1:
			
			System.out.println("Value of i = 1");
			
			break;
			
		case 2:
			
			System.out.println("Value of i = 2");
			
			break;
			
		case 3:
			
			System.out.println("Value of i = 3");
	
			break;
	
		case 4:
			
			System.out.println("Value of i = 4");
	
			break;
	
		case 5:
			
			System.out.println("Value of i = 5");
	
			break;
	

		default:
			
			System.out.println("Invalid");
			
			break;
		}
	}

}
