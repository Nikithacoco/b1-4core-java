package com.tns.generics;

import java.util.*;


public class Ass {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
	     list.add("Shashank");
		list.add("Suresh");
		String s=list.get(1);
		System.out.println("elements is:"+s);
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
