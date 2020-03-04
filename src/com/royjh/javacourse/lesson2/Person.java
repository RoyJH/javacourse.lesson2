package com.royjh.javacourse.lesson2;

import com.royjh.javacourse.lesson3.Name;

public class Person {
	
	private Name personName;
		
		public Person(Name personName) {
			this.personName = personName;
		}

		public Person () {
			/*
			 empty on purpose - default constructor
			 */
		}
	public String helloWorld() {
		return "Hello World";	
	}
	
	public String hello(String name) {
		return ("Hello " + name);
	}

}