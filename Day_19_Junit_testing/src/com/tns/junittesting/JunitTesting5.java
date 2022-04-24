package com.tns.junittesting;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
public class JunitTesting5 
{
	@Test
	void accept()
	{
		System.setProperty("1","Nikitha");
		Assumptions.assumeTrue("Nikitha".equals(System.getProperty("1")));
	}
}
