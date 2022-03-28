package com.scannertask;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);;
			
			System.out.println("Enter Your Supermarket Name:- ");
			
			String name = sc.nextLine();
			
			System.out.println("Your Supermarket Name is:- " + name);
			
			System.out.println("Enter Your product:- ");
			
			String Product = sc.next();
			
			System.out.println("Your Product is :- " + Product);
			
			sc.nextLine();
			
			System.out.println("Enter Your Quantity:- ");
			
			int Quantity = sc.nextInt();
			
			System.out.println("Your Quantity is :- " + Quantity);
			
			System.out.println("Your Price is:- " );
			
			Float Price = sc.nextFloat();
			
			System.out.println("Your Price is:- " + Price);
			
			System.out.println("Enter your Product Row is:- ");
			
			char row = sc.next().charAt(0);
			
			System.out.println("Your Product Row is:- " + row);
		}
		
	}
