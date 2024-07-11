package com.learn.autobyconstructor;

public class PersonByConstructor {
	private String name;
	private AddressByConstructor address;
	
	public PersonByConstructor(String name, AddressByConstructor address) {
		this.name = name;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressByConstructor getAddress() {
		return address;
	}
	public void setAddress(AddressByConstructor address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "PersonByConstructor [name=" + name + ", address=" + address.getStreet() + "]";
	}
	
	
	
}
