package com.learn.autobyconstructor;

public class AddressByConstructor {
	private String street;
	
	public AddressByConstructor(String street) {
		super();
		this.street = street;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "AddressByConstructor [street=" + street + "]";
	}
	
	
}
