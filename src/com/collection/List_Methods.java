package com.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Methods {
	
	public static void main(String[] args) {
		
		List<Object> l = new ArrayList<>();
		System.out.println(l);
		
		l.add(10);
		l.add(20);
		l.add("Java");
		l.add("James");
		l.add('K');
		l.add(10);
		l.add("Java");
		
		System.out.println(l);
		
		int size = l.size();
		System.out.println(size);
		
		Object object = l.get(5);
		System.out.println(object);
		
		l.add(4,98.87); //insert
		System.out.println(l);
		
		l.set(4, 'S'); //replace
		System.out.println(l);
		
		l.remove(4);
		System.out.println(l);
		
		int indexOf = l.indexOf(10);
		System.out.println(indexOf);
		
		int lastIndexOf = l.lastIndexOf(10);
		System.out.println(lastIndexOf);
		
		boolean contains = l.contains(100);
		System.out.println(contains);
		
		//l.clear();
		//System.out.println(l);
		
		List<Object> li= new LinkedList<>();
		
		li.add(10);
		li.add(20);
		li.add("Greens");
		li.add("Python");
		li.add('G');
		
		System.out.println(li);
		
		//l.addAll(li);
		//System.out.println(l);
				
		//l.retainAll(li);
		//System.out.println(l);
		
		li.removeAll(l);
		System.out.println(li);
		
		
	}

}
