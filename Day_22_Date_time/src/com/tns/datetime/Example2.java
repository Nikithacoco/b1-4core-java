package com.tns.datetime;
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Example2 {

	public static void main(String[] args) 
	{
		String datatime="2022-05-02 22:15";
		DateTimeFormatter df=DateTimeFormatter.ofPattern("DD-MM-yyyy HH:mm");
		LocalDateTime l=LocalDateTime .parse(datetime, df);
	    System.out.println(l);
	}
}
