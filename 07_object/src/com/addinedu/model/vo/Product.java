package com.addinedu.model.vo;

public class Product {
	private String productId;
	private String productName;
	private String productArea;
	private int price;
	private double tax;
	
	Product(){
		
	}
	public Product(String productId, String productName, String productArea, int price, double tax){
		this.productId = productId;
		this.productName = productName;
		this.productArea = productArea;
		this.price = price;
		this.tax = tax;
	}
	
	public String informaition(){
		return productId +", "+ productName +", "+ productArea +", "+ price +", "+ tax;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductArea(String productArea) {
		this.productArea = productArea;
	}
	public String getProductArea() {
		return productArea;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public double getTax() {
		return tax;
	}
	
	
}
