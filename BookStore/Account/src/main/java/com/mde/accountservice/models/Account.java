package com.mde.accountservice.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
public class Account

	//variables
	@Id
	@GeneratedValue(generator='system-uuid') 
	private Long id;

	private String accountId;


	private String username;


	private String password;


	private String firstName;


	private String lastName;


	private String email;


	//constructors
	public Account(){

	}

	public Account(

		String accountId,
		String username,
		String password,
		String firstName,
		String lastName,
		String email

	){
	 this.accountId = accountId; 
	 this.username = username; 
	 this.password = password; 
	 this.firstName = firstName; 
	 this.lastName = lastName; 
	 this.email = email; 
	}

		//gets and sets
	public long getld() { 
	return id;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
