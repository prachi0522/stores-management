package com.capgemini.storesmanagementsystem.dto;

public class OrderDetailsInfo {
	private Integer orderId;

	private Integer productId;

	private Integer quantity;

	private String address;
	
	private int userId;
	
	private String userName;
	
	private String password;

	public OrderDetailsInfo() {
		super();
	}
	
	public OrderDetailsInfo(Integer orderId, Integer productId, Integer quantity, String address,
			Integer userId,String userName, String password) {
		super();
		
		this.orderId = orderId;
		this.productId = productId;
		this.quantity = quantity;
		this.address = address;
		this.userId = userId;
		this.userName=userName;
		this.password=password;
	}

	

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getUserId() {
		return userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", productId=" + productId
				+ ", quantity=" + quantity + ", address=" + address + ", userId=" + userId + ",userName=" + userName + ",password= " + password + "]";
	}



}
