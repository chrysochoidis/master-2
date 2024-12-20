package com.example.demo;

public class Person {
	
	private String name;
	private int age;
	private String location;
	
	public  Person(String name, int age, String location){
		this.name = name;
		this.age = age;
		this.location = location;
	}
	
	
	public String getData() {
		return "Hello " + name + " " + age + " " + location;
	}

}