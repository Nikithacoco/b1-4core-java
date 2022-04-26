package com.tns.api;

import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Optional;

public class Example5 {
	@Test
	void display() {
		List<String>values=Arrays.asList("Nikitha","Nikitha","Nikitha","Nikitha","Nikitha","Nikitha");
		Optional<String>var=values.stream().findAny();
		assertTrue(var.isPresent());
		assertThat(var.get(),anyof(is("Nikitha")));
		values.stream().findAny().equals(values);
		System.out.println(values);
	}

	
		

	}

}
