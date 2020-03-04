package com.royjh.javacourse.lesson2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PersonTest {

	@Test 
	public void shouldReturnHelloWorld() {
		
		Person roy = new Person();
		assertEquals("Hello World", roy.helloWorld() );
	}
	
	@Test
	public void shouldReturnHelloRoy() {
			Person person = new Person();
			assertEquals("Hello Roy", person.hello("Roy"));
	}	
}
