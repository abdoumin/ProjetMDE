package com.mde.billingservice.models;


import javax.persistence.Embeddable;

@Embeddable
public class Address

	//variables

	private String addressId;


	private String userId;


	private String addressLine1;


	private String addressLine2;


	private String city;


	private String state;


	private String postalCode;


	private String country;


	private String phone;


	//constructors
	public Address(){

	}

	public Address(

		String addressId,
		String userId,
		String addressLine1,
		String addressLine2,
		String city,
		String state,
		String postalCode,
		String country,
		String phone

	){
	 this.addressId = addressId; 
	 this.userId = userId; 
	 this.addressLine1 = addressLine1; 
	 this.addressLine2 = addressLine2; 
	 this.city = city; 
	 this.state = state; 
	 this.postalCode = postalCode; 
	 this.country = country; 
	 this.phone = phone; 
	}

		//gets and sets
	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
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
	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
