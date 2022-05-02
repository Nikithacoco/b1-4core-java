package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example3 {

	public static void main(String[] args) {
		LocalDateTime determine=LocalDateTime.now();
		DateTimeFormatter df=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		String var=datatime.format(df);
	    System.out.println(var);
	}
	

}
