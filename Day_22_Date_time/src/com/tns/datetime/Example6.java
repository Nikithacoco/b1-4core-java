package com.tns.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
		LocalTime t=LocalTime.now(ZoneId.of("Europe/Istanbul"));
        LocalDateTime df=LocalDateTime.now(ZoneId.of("Egypt"));
	System.out.println(t);
	System.out.println(df);
	for(String s:ZoneId.getAvailableZoneIds())
	{
		System.out.println(s);	
	}
	}

}
