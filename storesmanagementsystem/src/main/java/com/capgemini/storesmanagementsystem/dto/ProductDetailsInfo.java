package com.capgemini.storesmanagementsystem.dto;

public class ProductDetailsInfo {
	
	private Integer productId;
	
    private String productName;
	
	private Double price;
	
	private String warranty;
	
	
	private String productBrand;

	private String minStocksPresent;
	
	public ProductDetailsInfo() {
		super();
	}

	
	
	public ProductDetailsInfo(Integer productId, String productName, Double price, String warranty, String minStocksPresent) {
		super();
		this.productId = productId;
		this.productName= productName;
		this.price = price;
		this.warranty = warranty;
		this.minStocksPresent= minStocksPresent;

	}


	
	public Integer getProductId() {
		return productId;
	}



	public void setProductId(Integer productId) {
		this.productId = productId;
	}



	public String getProductName() {
		return productName;
	}



	public void setProductName(String productName) {
		this.productName = productName;
	}



	public Double getPrice() {
		return price;
	}



	public void setPrice(Double price) {
		this.price = price;
	}



	public String getWarranty() {
		return warranty;
	}



	public void setWarranty(String warranty) {
		this.warranty = warranty;
	}



	public String getProductBrand() {
		return productBrand;
	}



	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}



	public String getMinStocksPresent() {
		return minStocksPresent;
	}



	public void setMinStocksPresent(String minStocksPresent) {
		this.minStocksPresent = minStocksPresent;
	}



	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName=" + productName + ", price=" + price + ", warranty="
				+ warranty + ", minStocksPresent=" + minStocksPresent+ "]";
	}



	





	
}
