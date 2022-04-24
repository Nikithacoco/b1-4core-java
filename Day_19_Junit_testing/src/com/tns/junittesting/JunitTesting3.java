package com.tns.junittesting;

import  org.junit.jupiter.api.Disabled;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class JunitTesting3 
{
	@Test
	void print()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}
	@Disabled
	@Test
	void print1()
	{
		int a=1;
		int b=1;
		assertEquals(a,b);
	}

}




