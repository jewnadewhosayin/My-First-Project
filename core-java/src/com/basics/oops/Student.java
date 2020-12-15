package com.basics.oops;

public class Student {

	private String name;

	private int id;

	private int age;

	private String Address;

	/// Constructor
	public Student(String name, int id, int age, String address) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
		Address = address;
	}

	// toString

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", age=" + age + ", Address=" + Address + "]";
	}

	// Getters/Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

}
