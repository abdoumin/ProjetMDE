package com.mde.billingservice.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
public class Billing

	//variables
	@Id
	@GeneratedValue(generator='system-uuid') 
	private Long id;

	private String billingId;


	private Address address;


	//constructors
	public Billing(){

	}

	public Billing(

		String billingId,
		Address address

	){
	 this.billingId = billingId; 
	 this.address = address; 
	}

		//gets and sets
	public long getld() { 
	return id;
	}

	public String getBillingId() {
		return billingId;
	}

	public void setBillingId(String billingId) {
		this.billingId = billingId;
	}
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
