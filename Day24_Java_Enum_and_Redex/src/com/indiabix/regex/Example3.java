package com.indiabix.regex;

import java.util.regex.Pattern;

public class Example3 {

	public static void main(String[] args) {
		String str="I love Mumbai";
		String delimiter="\\s";
		Pattern p=Pattern.compile(delimiter,Pattern.CASE_INSENSITIVE);
		String[] res=p.split(str);
		
		for(String i:res)
		{
			System.out.println(i);
		}
		
		

	}



	}


