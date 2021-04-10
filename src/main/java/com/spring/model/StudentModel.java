package com.spring.model;

public class StudentModel {
	private String name;
	private int age;
	
	public StudentModel(String fullname, int age) {
		super();
		this.name = fullname;
		this.age = age;
	}
	public String getFullName() {
		return name;
	}
	
}
