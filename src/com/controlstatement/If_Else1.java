package com.controlstatement;

import java.util.Scanner;

public class If_Else1 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter your age...");
		
		Scanner s = new Scanner(System.in);
		
		int age = s.nextInt();
		
		if (age >=18) {
			
			System.out.println("You are Eligible to Vote");
			
		} else {
			
			System.out.println("You are not Eligible....");
		}
	}

}
