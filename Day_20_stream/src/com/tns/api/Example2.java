package com.tns.api;

import java.util.Arrays;
import java.util.List;


public class Example2 {

	public static void main(String[] args) {
		List<Integer>values=Arrays.asList(11,22,33,22,60,25,11);
		values.stream().filter(i->i<30).forEach(i->System.out.println(i));
		values.stream().distinct().forEach(i->System.out.println("Unique values are"+i));
	}

	}


