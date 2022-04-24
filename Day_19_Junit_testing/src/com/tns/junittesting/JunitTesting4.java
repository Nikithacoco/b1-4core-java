package com.tns.junittesting;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;

public class JunitTesting4
{

	@AfterAll
	static void display()
	{
		System.out.println("Dileep");
	}
	
	@Test
	void display1()
	{
		System.out.println("Kamal");
	}
}



