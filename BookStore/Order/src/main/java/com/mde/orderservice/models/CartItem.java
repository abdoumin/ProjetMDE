package com.mde.orderservice.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
public class CartItem

	//variables
	@Id
	@GeneratedValue(generator='system-uuid') 
	private Long id;

	private String cartItemId;


	private int quantity;


	private double itemPrice;


	private double extendedPrice;


	private String productId;


	private String productName;


	@ManyToOne
	@JoinColumn(name = "cartId")
	private Cart cart;


	//constructors
	public CartItem(){

	}

	public CartItem(

		String cartItemId,
		int quantity,
		double itemPrice,
		double extendedPrice,
		String productId,
		String productName,
		Cart cart

	){
	 this.cartItemId = cartItemId; 
	 this.quantity = quantity; 
	 this.itemPrice = itemPrice; 
	 this.extendedPrice = extendedPrice; 
	 this.productId = productId; 
	 this.productName = productName; 
	 this.cart = cart; 
	}

		//gets and sets
	public long getld() { 
	return id;
	}

	public String getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(String cartItemId) {
		this.cartItemId = cartItemId;
	}
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	public double getExtendedPrice() {
		return extendedPrice;
	}

	public void setExtendedPrice(double extendedPrice) {
		this.extendedPrice = extendedPrice;
	}
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

}
