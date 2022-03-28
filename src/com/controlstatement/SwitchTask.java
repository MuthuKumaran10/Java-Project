package com.controlstatement;

import java.util.Scanner;

public class SwitchTask {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the number...");
		
		int a = s.nextInt();
				
		switch (a) {
		
		case 1:
			
			System.out.println("Sunday");
			
			System.out.println();
			
			System.out.println("Enter the number...");
			
			int b = s.nextInt();
			
			case 2:
	
			System.out.println("Monday");
	
			System.out.println();
		
			System.out.println("Enter the number...");
	
			int c = s.nextInt();
	
			case 3:
	
			System.out.println("Tuesday");
	
			System.out.println();
	
			System.out.println("Enter the number...");
	
			int d = s.nextInt();
	
			case 4:
	
			System.out.println("Wednesday");
	
			System.out.println();
	
			System.out.println("Enter the number...");
	
			int e = s.nextInt();
	
			case 5:
	
			System.out.println("Thursday");
	
			System.out.println();
	
			System.out.println("Enter the number...");
	
			int f = s.nextInt();
	
			case 6:
	
			System.out.println("Friday");
	
			System.out.println();
	
			System.out.println("Enter the number...");
	
			int g = s.nextInt();
	
			case 7:
	
			System.out.println("Saturday");
	
			System.out.println();
			
			break;

			default:
			
			System.out.println("Not in a week");
			
			break;
		}		
	}

}
