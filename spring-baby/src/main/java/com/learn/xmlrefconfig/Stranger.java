package com.learn.xmlrefconfig;

public class Stranger {
	private String name;
	private String surname;
	private  Address address;
	
	public Stranger(String name, String surname, Address address) {
		super();
		this.name = name;
		this.surname = surname;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Stranger [name=" + name + ", surname=" + surname + ", address=" + address.toString() + "]";
	}
	
	
}
