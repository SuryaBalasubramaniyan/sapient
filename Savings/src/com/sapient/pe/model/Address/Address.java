package com.sapient.pe.model.Address;
import java.lang.*;

public class Address {
	public String city;
	public String street;
	public int pincode;
	
	public String toString() {
		return street+" "+" "+city+" "+pincode;
	}
	public Address(String street,String city,int pincode) {
		this.city=city;
		this.street=street;
		this.pincode=pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	
}
