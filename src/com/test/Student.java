package com.test;

public class Student {

	@Override
	public String toString() {
		return name + " " + id;
	}

	public Integer id;
	public String name;

	public Student() {
	}

	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
