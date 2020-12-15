package com.basics.oops;

public class Runner {

	public static void main(String[] args) {

		// How to create an object using constructor

		// NameOfTheClass nameOfTheObject or Reference variable = new NameOfTheClass();

		Student ali = new Student("Ali", 5, 20, "Desplaines");
		System.out.println(ali);

		
		// Create an object then assign values using Getters/Setter
		
		Student naveed = new Student("Naveed1", 0, 0, null);
		
		System.out.println(naveed.getName());

		naveed.setName("Naveed");
		naveed.setAddress("Chicago");
		naveed.setId(123);
		naveed.setAge(25);

		System.out.println(naveed);

		System.out.println(naveed.getName());

	}

}
