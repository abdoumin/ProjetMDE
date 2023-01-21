package com.mde.orderservice.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
public class Cart

	//variables
	@Id
	@GeneratedValue(generator='system-uuid') 
	private Long id;

	private String cartId;


	private String userName;

	@OneToMany(
            mappedBy = "cart",
			cascade = CascadeType.ALL)

	private List<CartItem> cartItems;


	private double totalPrice;


	//constructors
	public Cart(){

	}

	public Cart(

		String cartId,
		String userName,
		List<CartItem> cartItems,
		double totalPrice

	){
	 this.cartId = cartId; 
	 this.userName = userName; 
	 this.cartItems = cartItems; 
	 this.totalPrice = totalPrice; 
	}

		//gets and sets
	public long getld() { 
	return id;
	}

	public String getCartId() {
		return cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}
	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
