package com.exception;

import java.util.ArrayList;
import java.util.List;

public class IndexOutof_Exception {
	
	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<>();
		
		l.add(10);
		l.add(20);
		l.add("Java");
		l.add("James");
		
		System.out.println(l);
		
		Object object = l.get(5);
		System.out.println(object);
		
	}

}
