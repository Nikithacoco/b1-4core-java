package com.tns.api;
import java.util.Arrays;
import java.util.List;
public class Example4 {

	public static void main(String[] args) {
		List<Integer>values=Arrays.asList(11,33,22,5,2);
values.stream().sorted().forEach(i->System.out.println(i));
	}

}
