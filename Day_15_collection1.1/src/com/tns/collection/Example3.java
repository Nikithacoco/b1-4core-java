package com.tns.collection;

import java.util.LinkedList;

public class Example3 {

	public static void main(String[] args) {
		LinkedList obj =new LinkedList<>();
		obj.add(10);
		obj.add("Shiv");
		obj.add(30.0);
		obj.add(40);
		System.out.println(obj);
		obj.addFirst(5);
		obj.addLast(25);
		
		System.out.println(obj);
		System.out.println(obj.size());
		LinkedList obj1 =new LinkedList<>();
		obj1.add("Shiv");
		obj1.add("Neha");
		obj.addAll(2,obj1);
		
		System.out.println(obj);
	}

}
