package com.learn.autobytype;

public class PersonByType {
	private String name;
	private AddressByType addressByType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public AddressByType getAddressByType() {
		return addressByType;
	}
	public void setAddressByType(AddressByType addressByType) {
		this.addressByType = addressByType;
	}
	@Override
	public String toString() {
		return "PersonByType [name=" + name + ", addressByType=" + addressByType.getStreet() + "]";
	}
	
}
