package com.cg.project.bean;

public class Address 
{
	private String city;
	private String state;
	private int pincode;
	private String country;


	public Address(String city, String state, int pincode, String country) {
		super();
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", pincode=" + pincode + ", country=" + country + "]";
	}

}