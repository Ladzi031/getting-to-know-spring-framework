package com.learn.xmlrefconfig;

public class Address {
	private String street;
	private Integer pobox;
	public Address(String street, Integer pobox) {
		super();
		this.street = street;
		this.pobox = pobox;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", pobox=" + pobox + "]";
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getPobox() {
		return pobox;
	}
	public void setPobox(Integer pobox) {
		this.pobox = pobox;
	}
	
}
