package com.selection;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		
		System.out.println("Enter your Mark...");
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		if (num>= 90) {
			
			System.out.println("Your Grade is A");
			
		}
		
		else if (num >=75) {
			
			System.out.println("Your Grade is B");
			
		}
		
		else if (num>=40) {
			
			System.out.println("Your Grade is C");
			
		}
		
		else {
			
			System.out.println("Your Fail");
		}
	}

}
