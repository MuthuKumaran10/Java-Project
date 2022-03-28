package com.selection;

public class Continue1 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=25; i++) {
			
			if ((i==11)|| (i==21)) {
				
				continue;
			}
			
			System.out.println(i);
			
		}
	}

}
