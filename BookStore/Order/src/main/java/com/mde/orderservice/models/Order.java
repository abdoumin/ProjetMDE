package com.mde.orderservice.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue; 
import javax.persistence.Id;

@Entity
public class Order

	//variables
	@Id
	@GeneratedValue(generator='system-uuid') 
	private Long id;

	private String orderId;


	private String userName;

	@OneToMany(
            mappedBy = "order",
			cascade = CascadeType.ALL)

	private List<OrderItem> orderItems;


	private double totalItemsPrice;


	private double totalOrderPrice;


	private String paymentMethodId;


	private double taxPrice;


	private double shippingPrice;


	private boolean isPaid;


	private String paymentId;


	private LocalDateTime paymentDate;


	private String paymentReceiptUrl;


	private LocalDateTime deliveredDate;


	private boolean isDelivered;


	//constructors
	public Order(){

	}

	public Order(

		String orderId,
		String userName,
		List<OrderItem> orderItems,
		double totalItemsPrice,
		double totalOrderPrice,
		String paymentMethodId,
		double taxPrice,
		double shippingPrice,
		boolean isPaid,
		String paymentId,
		LocalDateTime paymentDate,
		String paymentReceiptUrl,
		LocalDateTime deliveredDate,
		boolean isDelivered

	){
	 this.orderId = orderId; 
	 this.userName = userName; 
	 this.orderItems = orderItems; 
	 this.totalItemsPrice = totalItemsPrice; 
	 this.totalOrderPrice = totalOrderPrice; 
	 this.paymentMethodId = paymentMethodId; 
	 this.taxPrice = taxPrice; 
	 this.shippingPrice = shippingPrice; 
	 this.isPaid = isPaid; 
	 this.paymentId = paymentId; 
	 this.paymentDate = paymentDate; 
	 this.paymentReceiptUrl = paymentReceiptUrl; 
	 this.deliveredDate = deliveredDate; 
	 this.isDelivered = isDelivered; 
	}

		//gets and sets
	public long getld() { 
	return id;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	public List<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(List<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public double getTotalItemsPrice() {
		return totalItemsPrice;
	}

	public void setTotalItemsPrice(double totalItemsPrice) {
		this.totalItemsPrice = totalItemsPrice;
	}
	public double getTotalOrderPrice() {
		return totalOrderPrice;
	}

	public void setTotalOrderPrice(double totalOrderPrice) {
		this.totalOrderPrice = totalOrderPrice;
	}
	public String getPaymentMethodId() {
		return paymentMethodId;
	}

	public void setPaymentMethodId(String paymentMethodId) {
		this.paymentMethodId = paymentMethodId;
	}
	public double getTaxPrice() {
		return taxPrice;
	}

	public void setTaxPrice(double taxPrice) {
		this.taxPrice = taxPrice;
	}
	public double getShippingPrice() {
		return shippingPrice;
	}

	public void setShippingPrice(double shippingPrice) {
		this.shippingPrice = shippingPrice;
	}
	public boolean getIsPaid() {
		return isPaid;
	}

	public void setIsPaid(boolean isPaid) {
		this.isPaid = isPaid;
	}
	public String getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDateTime paymentDate) {
		this.paymentDate = paymentDate;
	}
	public String getPaymentReceiptUrl() {
		return paymentReceiptUrl;
	}

	public void setPaymentReceiptUrl(String paymentReceiptUrl) {
		this.paymentReceiptUrl = paymentReceiptUrl;
	}
	public LocalDateTime getDeliveredDate() {
		return deliveredDate;
	}

	public void setDeliveredDate(LocalDateTime deliveredDate) {
		this.deliveredDate = deliveredDate;
	}
	public boolean getIsDelivered() {
		return isDelivered;
	}

	public void setIsDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}

}
