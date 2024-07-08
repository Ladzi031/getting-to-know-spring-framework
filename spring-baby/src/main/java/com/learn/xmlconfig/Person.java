package com.learn.xmlconfig;

public class Person {
	private Integer id;
	private String name;
	private String surname;
	public Person(Integer id, String name, String surname) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
	}
	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("");
		return builder.append(this.id).append(" "+ this.surname).append(" "+ this.name).toString();
	}
		
}
